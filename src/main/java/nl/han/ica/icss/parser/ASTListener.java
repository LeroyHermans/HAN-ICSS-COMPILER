package nl.han.ica.icss.parser;

import java.util.Stack;

import nl.han.ica.icss.ast.*;

/**
 * This class extracts the ICSS Abstract Syntax Tree from the Antlr Parse tree.
 */
public class ASTListener extends ICSSBaseListener {

    //Accumulator attributes:
    private AST ast;
    private Stack<ASTNode> currentContainer; //This is a hint...

    public ASTListener() {
        ast = new AST();
        currentContainer = new Stack<>();
    }

    @Override
    public void enterStylesheet(ICSSParser.StylesheetContext ctx) {
        ast.root = new Stylesheet();
    }

    @Override
    public void enterStylerule(ICSSParser.StyleruleContext ctx) {
        Stylerule styleRule = new Stylerule();
        currentContainer.push(styleRule);
    }

    @Override
    public void exitStylerule(ICSSParser.StyleruleContext ctx) {
        ast.root.addChild(currentContainer.pop());
    }

    @Override
    public void enterClassselector(ICSSParser.ClassselectorContext ctx) {
        currentContainer.peek().addChild(new ClassSelector(ctx.getText()));
    }

    @Override
    public void enterIdselector(ICSSParser.IdselectorContext ctx) {
        currentContainer.peek().addChild(new IdSelector(ctx.getText()));
    }

    @Override
    public void enterElementselector(ICSSParser.ElementselectorContext ctx) {
        currentContainer.peek().addChild(new TagSelector(ctx.getText()));
    }

    @Override
    public void enterDeclaration(ICSSParser.DeclarationContext ctx) {
        currentContainer.push(new Declaration());
    }

    @Override
    public void exitDeclaration(ICSSParser.DeclarationContext ctx) {
        Declaration declaration = (Declaration) currentContainer.pop();
        currentContainer.peek().addChild(declaration);
    }

    @Override
    public void enterAttribute(ICSSParser.AttributeContext ctx) {
        Declaration declaration = (Declaration) currentContainer.pop();
        declaration.property = ctx.getText();
        currentContainer.push(declaration);
    }

    @Override
    public void enterConstantassignment(ICSSParser.ConstantassignmentContext ctx) {
        ConstantDefinition def = new ConstantDefinition();
        currentContainer.push(def);
    }

    @Override
    public void exitConstantassignment(ICSSParser.ConstantassignmentContext ctx) {
        ast.root.addChild(currentContainer.pop());
    }

    @Override
    public void enterConstantreference(ICSSParser.ConstantreferenceContext ctx) {
        currentContainer.peek().addChild(new ConstantReference(ctx.getText()));
    }

    @Override
    public void enterPixelliteral(ICSSParser.PixelliteralContext ctx) {
        currentContainer.peek().addChild(new PixelLiteral(ctx.getText()));
    }

    @Override
    public void enterColorliteral(ICSSParser.ColorliteralContext ctx) {
        currentContainer.peek().addChild(new ColorLiteral(ctx.getText()));
    }

    @Override
    public void enterPercentageliteral(ICSSParser.PercentageliteralContext ctx) {
        currentContainer.peek().addChild(new PercentageLiteral(ctx.getText()));
    }

    @Override
    public void enterScalarliteral(ICSSParser.ScalarliteralContext ctx) {
        ScalarLiteral scalar = new ScalarLiteral(ctx.getText());
        currentContainer.peek().addChild(scalar);
    }

    @Override
    public void enterSum(ICSSParser.SumContext ctx) {
        AddOperation operation = new AddOperation();
        currentContainer.push(operation);
    }

    @Override
    public void exitSum(ICSSParser.SumContext ctx) {
        AddOperation operation = (AddOperation) currentContainer.pop();
        currentContainer.peek().addChild(operation);
    }

    @Override
    public void enterSubtraction(ICSSParser.SubtractionContext ctx) {
        currentContainer.push(new SubtractOperation());
    }

    @Override
    public void exitSubtraction(ICSSParser.SubtractionContext ctx) {
        SubtractOperation operation = (SubtractOperation) currentContainer.pop();
        currentContainer.peek().addChild(operation);
    }

    @Override
    public void enterMultiply(ICSSParser.MultiplyContext ctx) {
        currentContainer.push(new MultiplyOperation());
    }

    @Override
    public void exitMultiply(ICSSParser.MultiplyContext ctx) {
        MultiplyOperation multiplyOperation = (MultiplyOperation) currentContainer.pop();
        currentContainer.peek().addChild(multiplyOperation);
    }

    @Override
    public void enterSwitchrule(ICSSParser.SwitchruleContext ctx) {
        currentContainer.push(new Switchrule());
    }

    @Override
    public void exitSwitchrule(ICSSParser.SwitchruleContext ctx) {
        ast.root.addChild(currentContainer.pop());
    }

    @Override
    public void enterSwitchcase(ICSSParser.SwitchcaseContext ctx) {
        currentContainer.push(new SwitchValueCase());
    }

    @Override
    public void exitSwitchcase(ICSSParser.SwitchcaseContext ctx) {
        SwitchValueCase switchValueCase = (SwitchValueCase) currentContainer.pop();
        currentContainer.peek().addChild(switchValueCase);
    }

    @Override
    public void enterDefaultswitchcase(ICSSParser.DefaultswitchcaseContext ctx) {
        currentContainer.push(new SwitchDefaultCase());
    }

    @Override
    public void exitDefaultswitchcase(ICSSParser.DefaultswitchcaseContext ctx) {
        SwitchDefaultCase switchDefaultCase = (SwitchDefaultCase) currentContainer.pop();
        currentContainer.peek().addChild(switchDefaultCase);
    }

    public AST getAST() {
        return ast;
    }
}
