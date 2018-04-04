package nl.han.ica.icss.checker;

import java.security.spec.ECParameterSpec;
import java.util.HashMap;
import java.util.List;

import nl.han.ica.icss.ast.*;

public class Checker {

    private HashMap<String, ConstantDefinition> symboltable;

    public void check(AST ast) {
        //Clear symbol table
        symboltable = new HashMap<>();

        checkNodes(ast.root.getChildren());

        //Save the symbol table.
        ast.symboltable = symboltable;

        //Save the verdict
        if (ast.getErrors().isEmpty()) {
            ast.checked = true;
        }
    }

    private void checkNodes(List<ASTNode> astNodes) {
        for (ASTNode astNode : astNodes) {
            checkNode(astNode);
            if (astNode.getChildren() != null) {
                checkNodes(astNode.getChildren());
            }
        }
    }

    private void checkNode(ASTNode astNode) {
        if (astNode instanceof ConstantDefinition) {
            String key = ((ConstantDefinition) astNode).name.name;
            if (symboltable.containsKey(key)) {
                astNode.setError("Duplicate constant definition.");
            } else {
                symboltable.put(key, (ConstantDefinition) astNode);
            }
        }
        if (astNode instanceof Operation) {
            Operation operation = (Operation) astNode;

            // check if color is used in calculation.
            if (operation.rhs instanceof ColorLiteral || operation.lhs instanceof ColorLiteral) {
                astNode.setError("Color can't be used in operation.");
            }

            // if the opration is multiplication, check if a scalar is used.
            // 12px * 12px is not valid, 12 * 12px is valid.
            if (operation instanceof MultiplyOperation) {
                if (!(operation.lhs instanceof ScalarLiteral) && !(operation.rhs instanceof ScalarLiteral)) {
                    System.out.println(operation.lhs.getClass() + " " + operation.rhs.getClass());
                    astNode.setError("Multiply needs a scalar literal.");
                }
            }

            // if operation is add or substract check if the values on both sides are of equal type.
            if (operation instanceof AddOperation || operation instanceof SubtractOperation) {
                if (operation.lhs instanceof PixelLiteral && operation.rhs instanceof PercentageLiteral ||
                        operation.lhs instanceof PercentageLiteral && operation.rhs instanceof PixelLiteral) {
                    astNode.setError("Can only add or substract values of the same type.");
                }
                // If the right hand side of the operation is a multiply check if the expression is still valid.
                if (operation.rhs instanceof MultiplyOperation) {
                    Expression reference;
                    if (operation.lhs instanceof ConstantReference) {
                        reference = symboltable.get(((ConstantReference) operation.lhs).name).expression;
                        if (reference.getClass() != ((MultiplyOperation) operation.rhs).rhs.getClass() &&
                                reference.getClass() != ((MultiplyOperation) operation.rhs).lhs.getClass()) {
                            astNode.setError("Can only add or substract values of the same type.");
                        }
                    } else {
                        if (operation.lhs.getClass() != ((MultiplyOperation) operation.rhs).rhs.getClass() &&
                                operation.lhs.getClass() != ((MultiplyOperation) operation.rhs).lhs.getClass()) {
                            astNode.setError("Can only add or substract values of the same type.");
                        }
                    }

                }
            }
        }
        if (astNode instanceof Declaration) {
            String property = ((Declaration) astNode).property;
            Expression foundLiteral = null;
            // Check if the expression is a constant reference.
            if (((Declaration) astNode).expression instanceof ConstantReference) {

                //get the constant reference from the declaration.
                Expression constantReference = ((Declaration) astNode).expression;

                // save the name of the constant reference.
                String key = ((ConstantReference) constantReference).name;

                // check if the constant reference is known, else ass and error to the node.
                // if the constant if found save it to the found literal.
                if (!symboltable.containsKey(key)) {
                    astNode.setError("Constant undefined.");
                } else {
                    foundLiteral = symboltable.get(key).expression;
                }
            }

            // if the declaration property is color or background color, check the rules.
            if (property.equals("color") || property.equals("background-color")) {
                if (!(((Declaration) astNode).expression instanceof ColorLiteral) && !(foundLiteral instanceof ColorLiteral)) {
                    astNode.setError("Color tag needs color value.");
                }
            }

            // if the declaration property is width or height, check the rules.
            if (property.equals("width") || property.equals("height")) {
                if (((Declaration) astNode).expression instanceof ColorLiteral || foundLiteral instanceof ColorLiteral) {
                    astNode.setError("width and height cannot contain color values.");
                }
            }
        }

        if(astNode instanceof Switchrule){
            Expression constantReference = ((Switchrule)astNode).match;
            Expression matchcase = symboltable.get(((ConstantReference) constantReference).name).expression;

            for(SwitchValueCase switchValueCase : ((Switchrule)astNode).valueCases){
                if(switchValueCase.value.getClass() != matchcase.getClass()){
                    astNode.setError("Switch value case matching value not of same type as switch value");
                }
            }
        }
    }
}
