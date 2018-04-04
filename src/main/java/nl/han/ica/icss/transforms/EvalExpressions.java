package nl.han.ica.icss.transforms;

import jdk.nashorn.internal.runtime.regexp.joni.constants.OPCode;
import nl.han.ica.icss.ast.*;

import java.nio.file.OpenOption;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;

public class EvalExpressions implements Transform {

    private HashMap<String, ConstantDefinition> symboltable; //Another hint...

    @Override
    public void apply(AST ast) {
        symboltable = ast.symboltable;
        apply(ast.root.getChildren());
    }

    private void apply(List<ASTNode> nodes) {
        for (ASTNode node : nodes) {
            if (node instanceof Declaration) {
                Declaration declaration = (Declaration) node;

                if (declaration.expression instanceof ConstantReference) {
                    declaration.expression = symboltable.get(((ConstantReference) declaration.expression).name).expression;
                }

                if (declaration.expression instanceof Operation) {
                    Operation operation = (Operation) declaration.expression;
                    if (operation.lhs instanceof ConstantReference) {
                        operation.lhs = symboltable.get(((ConstantReference) operation.lhs).name).expression;
                    }
                    if (operation.rhs instanceof ConstantReference) {
                        operation.rhs = symboltable.get(((ConstantReference) operation.rhs).name).expression;
                    }

                    declaration.expression = executeCalculation(operation);
                }
            }
            if (node.getChildren() != null) {
                apply(node.getChildren());
            }
        }
    }

    private Literal executeCalculation(Operation operation) {
        Expression lhs = operation.lhs;
        Expression rhs = operation.rhs;

        if (rhs instanceof Operation) {
            rhs = executeCalculation((Operation) rhs);
        }

        if (lhs instanceof PixelLiteral && rhs instanceof PixelLiteral) {
            if (operation instanceof AddOperation) {
                return new PixelLiteral(((PixelLiteral) lhs).value + ((PixelLiteral) rhs).value);
            } else if (operation instanceof SubtractOperation) {
                return new PixelLiteral(((PixelLiteral) lhs).value - ((PixelLiteral) rhs).value);
            } else if (operation instanceof MultiplyOperation) {
                return new PixelLiteral(((PixelLiteral) lhs).value * ((PixelLiteral) rhs).value);
            }
        } else if (lhs instanceof PercentageLiteral && rhs instanceof PercentageLiteral) {
            if (operation instanceof AddOperation) {
                return new PercentageLiteral(((PercentageLiteral) lhs).value + ((PercentageLiteral) rhs).value);
            } else if (operation instanceof SubtractOperation) {
                return new PercentageLiteral(((PercentageLiteral) lhs).value - ((PercentageLiteral) rhs).value);
            } else if (operation instanceof MultiplyOperation) {
                return new PercentageLiteral(((PercentageLiteral) lhs).value * ((PercentageLiteral) rhs).value);
            }
        } else if (lhs instanceof ScalarLiteral && rhs instanceof PixelLiteral) {
            if (operation instanceof AddOperation) {
                return new PixelLiteral(((ScalarLiteral) lhs).value + ((PixelLiteral) rhs).value);
            } else if (operation instanceof SubtractOperation) {
                return new PixelLiteral(((ScalarLiteral) lhs).value - ((PixelLiteral) rhs).value);
            } else if (operation instanceof MultiplyOperation) {
                return new PixelLiteral(((ScalarLiteral) lhs).value * ((PixelLiteral) rhs).value);
            }
        } else if (lhs instanceof ScalarLiteral && rhs instanceof PercentageLiteral) {
            if (operation instanceof AddOperation) {
                return new PercentageLiteral(((ScalarLiteral) lhs).value + ((PercentageLiteral) rhs).value);
            } else if (operation instanceof SubtractOperation) {
                return new PercentageLiteral(((ScalarLiteral) lhs).value - ((PercentageLiteral) rhs).value);
            } else if (operation instanceof MultiplyOperation) {
                return new PercentageLiteral(((ScalarLiteral) lhs).value * ((PercentageLiteral) rhs).value);
            }
        }
        return null;
    }
}
