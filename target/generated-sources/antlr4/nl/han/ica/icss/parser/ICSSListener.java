// Generated from nl\han\ica\icss\parser\ICSS.g4 by ANTLR 4.7
package nl.han.ica.icss.parser;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ICSSParser}.
 */
public interface ICSSListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ICSSParser#stylesheet}.
	 * @param ctx the parse tree
	 */
	void enterStylesheet(ICSSParser.StylesheetContext ctx);
	/**
	 * Exit a parse tree produced by {@link ICSSParser#stylesheet}.
	 * @param ctx the parse tree
	 */
	void exitStylesheet(ICSSParser.StylesheetContext ctx);
	/**
	 * Enter a parse tree produced by {@link ICSSParser#stylesheetpart}.
	 * @param ctx the parse tree
	 */
	void enterStylesheetpart(ICSSParser.StylesheetpartContext ctx);
	/**
	 * Exit a parse tree produced by {@link ICSSParser#stylesheetpart}.
	 * @param ctx the parse tree
	 */
	void exitStylesheetpart(ICSSParser.StylesheetpartContext ctx);
	/**
	 * Enter a parse tree produced by {@link ICSSParser#stylerule}.
	 * @param ctx the parse tree
	 */
	void enterStylerule(ICSSParser.StyleruleContext ctx);
	/**
	 * Exit a parse tree produced by {@link ICSSParser#stylerule}.
	 * @param ctx the parse tree
	 */
	void exitStylerule(ICSSParser.StyleruleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code elementselector}
	 * labeled alternative in {@link ICSSParser#selector}.
	 * @param ctx the parse tree
	 */
	void enterElementselector(ICSSParser.ElementselectorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code elementselector}
	 * labeled alternative in {@link ICSSParser#selector}.
	 * @param ctx the parse tree
	 */
	void exitElementselector(ICSSParser.ElementselectorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code idselector}
	 * labeled alternative in {@link ICSSParser#selector}.
	 * @param ctx the parse tree
	 */
	void enterIdselector(ICSSParser.IdselectorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code idselector}
	 * labeled alternative in {@link ICSSParser#selector}.
	 * @param ctx the parse tree
	 */
	void exitIdselector(ICSSParser.IdselectorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code classselector}
	 * labeled alternative in {@link ICSSParser#selector}.
	 * @param ctx the parse tree
	 */
	void enterClassselector(ICSSParser.ClassselectorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code classselector}
	 * labeled alternative in {@link ICSSParser#selector}.
	 * @param ctx the parse tree
	 */
	void exitClassselector(ICSSParser.ClassselectorContext ctx);
	/**
	 * Enter a parse tree produced by {@link ICSSParser#declarationpart}.
	 * @param ctx the parse tree
	 */
	void enterDeclarationpart(ICSSParser.DeclarationpartContext ctx);
	/**
	 * Exit a parse tree produced by {@link ICSSParser#declarationpart}.
	 * @param ctx the parse tree
	 */
	void exitDeclarationpart(ICSSParser.DeclarationpartContext ctx);
	/**
	 * Enter a parse tree produced by {@link ICSSParser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterDeclaration(ICSSParser.DeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ICSSParser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitDeclaration(ICSSParser.DeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link ICSSParser#attribute}.
	 * @param ctx the parse tree
	 */
	void enterAttribute(ICSSParser.AttributeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ICSSParser#attribute}.
	 * @param ctx the parse tree
	 */
	void exitAttribute(ICSSParser.AttributeContext ctx);
	/**
	 * Enter a parse tree produced by {@link ICSSParser#value}.
	 * @param ctx the parse tree
	 */
	void enterValue(ICSSParser.ValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link ICSSParser#value}.
	 * @param ctx the parse tree
	 */
	void exitValue(ICSSParser.ValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link ICSSParser#sum}.
	 * @param ctx the parse tree
	 */
	void enterSum(ICSSParser.SumContext ctx);
	/**
	 * Exit a parse tree produced by {@link ICSSParser#sum}.
	 * @param ctx the parse tree
	 */
	void exitSum(ICSSParser.SumContext ctx);
	/**
	 * Enter a parse tree produced by {@link ICSSParser#subtraction}.
	 * @param ctx the parse tree
	 */
	void enterSubtraction(ICSSParser.SubtractionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ICSSParser#subtraction}.
	 * @param ctx the parse tree
	 */
	void exitSubtraction(ICSSParser.SubtractionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ICSSParser#multiply}.
	 * @param ctx the parse tree
	 */
	void enterMultiply(ICSSParser.MultiplyContext ctx);
	/**
	 * Exit a parse tree produced by {@link ICSSParser#multiply}.
	 * @param ctx the parse tree
	 */
	void exitMultiply(ICSSParser.MultiplyContext ctx);
	/**
	 * Enter a parse tree produced by {@link ICSSParser#realvalue}.
	 * @param ctx the parse tree
	 */
	void enterRealvalue(ICSSParser.RealvalueContext ctx);
	/**
	 * Exit a parse tree produced by {@link ICSSParser#realvalue}.
	 * @param ctx the parse tree
	 */
	void exitRealvalue(ICSSParser.RealvalueContext ctx);
	/**
	 * Enter a parse tree produced by the {@code colorliteral}
	 * labeled alternative in {@link ICSSParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterColorliteral(ICSSParser.ColorliteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code colorliteral}
	 * labeled alternative in {@link ICSSParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitColorliteral(ICSSParser.ColorliteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code pixelliteral}
	 * labeled alternative in {@link ICSSParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterPixelliteral(ICSSParser.PixelliteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code pixelliteral}
	 * labeled alternative in {@link ICSSParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitPixelliteral(ICSSParser.PixelliteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code percentageliteral}
	 * labeled alternative in {@link ICSSParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterPercentageliteral(ICSSParser.PercentageliteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code percentageliteral}
	 * labeled alternative in {@link ICSSParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitPercentageliteral(ICSSParser.PercentageliteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code scalarliteral}
	 * labeled alternative in {@link ICSSParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterScalarliteral(ICSSParser.ScalarliteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code scalarliteral}
	 * labeled alternative in {@link ICSSParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitScalarliteral(ICSSParser.ScalarliteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link ICSSParser#constantassignment}.
	 * @param ctx the parse tree
	 */
	void enterConstantassignment(ICSSParser.ConstantassignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link ICSSParser#constantassignment}.
	 * @param ctx the parse tree
	 */
	void exitConstantassignment(ICSSParser.ConstantassignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link ICSSParser#constantreference}.
	 * @param ctx the parse tree
	 */
	void enterConstantreference(ICSSParser.ConstantreferenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link ICSSParser#constantreference}.
	 * @param ctx the parse tree
	 */
	void exitConstantreference(ICSSParser.ConstantreferenceContext ctx);
	/**
	 * Enter a parse tree produced by {@link ICSSParser#switchrule}.
	 * @param ctx the parse tree
	 */
	void enterSwitchrule(ICSSParser.SwitchruleContext ctx);
	/**
	 * Exit a parse tree produced by {@link ICSSParser#switchrule}.
	 * @param ctx the parse tree
	 */
	void exitSwitchrule(ICSSParser.SwitchruleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code switchcase}
	 * labeled alternative in {@link ICSSParser#switchvaluecase}.
	 * @param ctx the parse tree
	 */
	void enterSwitchcase(ICSSParser.SwitchcaseContext ctx);
	/**
	 * Exit a parse tree produced by the {@code switchcase}
	 * labeled alternative in {@link ICSSParser#switchvaluecase}.
	 * @param ctx the parse tree
	 */
	void exitSwitchcase(ICSSParser.SwitchcaseContext ctx);
	/**
	 * Enter a parse tree produced by the {@code defaultswitchcase}
	 * labeled alternative in {@link ICSSParser#switchvaluecase}.
	 * @param ctx the parse tree
	 */
	void enterDefaultswitchcase(ICSSParser.DefaultswitchcaseContext ctx);
	/**
	 * Exit a parse tree produced by the {@code defaultswitchcase}
	 * labeled alternative in {@link ICSSParser#switchvaluecase}.
	 * @param ctx the parse tree
	 */
	void exitDefaultswitchcase(ICSSParser.DefaultswitchcaseContext ctx);
}