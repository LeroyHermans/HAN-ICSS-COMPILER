// Generated from nl\han\ica\icss\parser\ICSS.g4 by ANTLR 4.7
package nl.han.ica.icss.parser;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ICSSParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		WHITESPACE=1, STYLERULE_OPEN=2, STYLERULE_CLOSE=3, ENDLINE=4, COLOR_ATT=5, 
		BG_COL_ATT=6, WIDTH_ATT=7, HEIGTH_ATT=8, ATTRIBUTE_SEPARATOR=9, COLOR_LITERAL=10, 
		PIXEL_LITERAL=11, PERCENTAGE_LITERAL=12, SCALAR_LITERAL=13, SWITCH_KEYWORD=14, 
		SWITCH_OPEN=15, SWITCH_CLOSE=16, CASE_KEYWORD=17, DEFAULT_KEYWORD=18, 
		CONSTANT_DECLARATOR=19, CONSTANT_NAME=20, CONSTANT_ASSIGNMENT_SEPERATOR=21, 
		SELECTOR_ID=22, SELECTOR_CLASS=23, SELECTOR_ELEMENT=24, ADD_OPP=25, SUBSTRACT_OPP=26, 
		MULTIPLY_OPP=27, NUMBER=28, LETTER=29;
	public static final int
		RULE_stylesheet = 0, RULE_stylesheetpart = 1, RULE_stylerule = 2, RULE_selector = 3, 
		RULE_declarationpart = 4, RULE_declaration = 5, RULE_attribute = 6, RULE_value = 7, 
		RULE_sum = 8, RULE_subtraction = 9, RULE_multiply = 10, RULE_realvalue = 11, 
		RULE_literal = 12, RULE_constantassignment = 13, RULE_constantreference = 14, 
		RULE_switchrule = 15, RULE_switchvaluecase = 16;
	public static final String[] ruleNames = {
		"stylesheet", "stylesheetpart", "stylerule", "selector", "declarationpart", 
		"declaration", "attribute", "value", "sum", "subtraction", "multiply", 
		"realvalue", "literal", "constantassignment", "constantreference", "switchrule", 
		"switchvaluecase"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, "'{'", "'}'", "';'", "'color'", "'background-color'", "'width'", 
		"'height'", "':'", null, null, null, null, "'switch'", "'('", "')'", "'case'", 
		"'default'", "'let'", null, "'is'", null, null, null, "'+'", "'-'", "'*'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "WHITESPACE", "STYLERULE_OPEN", "STYLERULE_CLOSE", "ENDLINE", "COLOR_ATT", 
		"BG_COL_ATT", "WIDTH_ATT", "HEIGTH_ATT", "ATTRIBUTE_SEPARATOR", "COLOR_LITERAL", 
		"PIXEL_LITERAL", "PERCENTAGE_LITERAL", "SCALAR_LITERAL", "SWITCH_KEYWORD", 
		"SWITCH_OPEN", "SWITCH_CLOSE", "CASE_KEYWORD", "DEFAULT_KEYWORD", "CONSTANT_DECLARATOR", 
		"CONSTANT_NAME", "CONSTANT_ASSIGNMENT_SEPERATOR", "SELECTOR_ID", "SELECTOR_CLASS", 
		"SELECTOR_ELEMENT", "ADD_OPP", "SUBSTRACT_OPP", "MULTIPLY_OPP", "NUMBER", 
		"LETTER"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "ICSS.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public ICSSParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class StylesheetContext extends ParserRuleContext {
		public List<StylesheetpartContext> stylesheetpart() {
			return getRuleContexts(StylesheetpartContext.class);
		}
		public StylesheetpartContext stylesheetpart(int i) {
			return getRuleContext(StylesheetpartContext.class,i);
		}
		public StylesheetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stylesheet; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ICSSListener ) ((ICSSListener)listener).enterStylesheet(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ICSSListener ) ((ICSSListener)listener).exitStylesheet(this);
		}
	}

	public final StylesheetContext stylesheet() throws RecognitionException {
		StylesheetContext _localctx = new StylesheetContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_stylesheet);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(37);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CONSTANT_DECLARATOR) | (1L << SELECTOR_ID) | (1L << SELECTOR_CLASS) | (1L << SELECTOR_ELEMENT))) != 0)) {
				{
				{
				setState(34);
				stylesheetpart();
				}
				}
				setState(39);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StylesheetpartContext extends ParserRuleContext {
		public StyleruleContext stylerule() {
			return getRuleContext(StyleruleContext.class,0);
		}
		public ConstantassignmentContext constantassignment() {
			return getRuleContext(ConstantassignmentContext.class,0);
		}
		public SwitchruleContext switchrule() {
			return getRuleContext(SwitchruleContext.class,0);
		}
		public StylesheetpartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stylesheetpart; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ICSSListener ) ((ICSSListener)listener).enterStylesheetpart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ICSSListener ) ((ICSSListener)listener).exitStylesheetpart(this);
		}
	}

	public final StylesheetpartContext stylesheetpart() throws RecognitionException {
		StylesheetpartContext _localctx = new StylesheetpartContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_stylesheetpart);
		try {
			setState(43);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(40);
				stylerule();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(41);
				constantassignment();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(42);
				switchrule();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StyleruleContext extends ParserRuleContext {
		public SelectorContext selector() {
			return getRuleContext(SelectorContext.class,0);
		}
		public TerminalNode STYLERULE_OPEN() { return getToken(ICSSParser.STYLERULE_OPEN, 0); }
		public TerminalNode STYLERULE_CLOSE() { return getToken(ICSSParser.STYLERULE_CLOSE, 0); }
		public List<DeclarationpartContext> declarationpart() {
			return getRuleContexts(DeclarationpartContext.class);
		}
		public DeclarationpartContext declarationpart(int i) {
			return getRuleContext(DeclarationpartContext.class,i);
		}
		public StyleruleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stylerule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ICSSListener ) ((ICSSListener)listener).enterStylerule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ICSSListener ) ((ICSSListener)listener).exitStylerule(this);
		}
	}

	public final StyleruleContext stylerule() throws RecognitionException {
		StyleruleContext _localctx = new StyleruleContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_stylerule);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(45);
			selector();
			setState(46);
			match(STYLERULE_OPEN);
			setState(50);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << COLOR_ATT) | (1L << BG_COL_ATT) | (1L << WIDTH_ATT) | (1L << HEIGTH_ATT))) != 0)) {
				{
				{
				setState(47);
				declarationpart();
				}
				}
				setState(52);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(53);
			match(STYLERULE_CLOSE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SelectorContext extends ParserRuleContext {
		public SelectorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selector; }
	 
		public SelectorContext() { }
		public void copyFrom(SelectorContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ClassselectorContext extends SelectorContext {
		public TerminalNode SELECTOR_CLASS() { return getToken(ICSSParser.SELECTOR_CLASS, 0); }
		public ClassselectorContext(SelectorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ICSSListener ) ((ICSSListener)listener).enterClassselector(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ICSSListener ) ((ICSSListener)listener).exitClassselector(this);
		}
	}
	public static class ElementselectorContext extends SelectorContext {
		public TerminalNode SELECTOR_ELEMENT() { return getToken(ICSSParser.SELECTOR_ELEMENT, 0); }
		public ElementselectorContext(SelectorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ICSSListener ) ((ICSSListener)listener).enterElementselector(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ICSSListener ) ((ICSSListener)listener).exitElementselector(this);
		}
	}
	public static class IdselectorContext extends SelectorContext {
		public TerminalNode SELECTOR_ID() { return getToken(ICSSParser.SELECTOR_ID, 0); }
		public IdselectorContext(SelectorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ICSSListener ) ((ICSSListener)listener).enterIdselector(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ICSSListener ) ((ICSSListener)listener).exitIdselector(this);
		}
	}

	public final SelectorContext selector() throws RecognitionException {
		SelectorContext _localctx = new SelectorContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_selector);
		try {
			setState(58);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SELECTOR_ELEMENT:
				_localctx = new ElementselectorContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(55);
				match(SELECTOR_ELEMENT);
				}
				break;
			case SELECTOR_ID:
				_localctx = new IdselectorContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(56);
				match(SELECTOR_ID);
				}
				break;
			case SELECTOR_CLASS:
				_localctx = new ClassselectorContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(57);
				match(SELECTOR_CLASS);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeclarationpartContext extends ParserRuleContext {
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public DeclarationpartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declarationpart; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ICSSListener ) ((ICSSListener)listener).enterDeclarationpart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ICSSListener ) ((ICSSListener)listener).exitDeclarationpart(this);
		}
	}

	public final DeclarationpartContext declarationpart() throws RecognitionException {
		DeclarationpartContext _localctx = new DeclarationpartContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_declarationpart);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(60);
			declaration();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeclarationContext extends ParserRuleContext {
		public AttributeContext attribute() {
			return getRuleContext(AttributeContext.class,0);
		}
		public TerminalNode ATTRIBUTE_SEPARATOR() { return getToken(ICSSParser.ATTRIBUTE_SEPARATOR, 0); }
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public TerminalNode ENDLINE() { return getToken(ICSSParser.ENDLINE, 0); }
		public DeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ICSSListener ) ((ICSSListener)listener).enterDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ICSSListener ) ((ICSSListener)listener).exitDeclaration(this);
		}
	}

	public final DeclarationContext declaration() throws RecognitionException {
		DeclarationContext _localctx = new DeclarationContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(62);
			attribute();
			setState(63);
			match(ATTRIBUTE_SEPARATOR);
			setState(64);
			value();
			setState(65);
			match(ENDLINE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AttributeContext extends ParserRuleContext {
		public TerminalNode COLOR_ATT() { return getToken(ICSSParser.COLOR_ATT, 0); }
		public TerminalNode BG_COL_ATT() { return getToken(ICSSParser.BG_COL_ATT, 0); }
		public TerminalNode WIDTH_ATT() { return getToken(ICSSParser.WIDTH_ATT, 0); }
		public TerminalNode HEIGTH_ATT() { return getToken(ICSSParser.HEIGTH_ATT, 0); }
		public AttributeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attribute; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ICSSListener ) ((ICSSListener)listener).enterAttribute(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ICSSListener ) ((ICSSListener)listener).exitAttribute(this);
		}
	}

	public final AttributeContext attribute() throws RecognitionException {
		AttributeContext _localctx = new AttributeContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_attribute);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(67);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << COLOR_ATT) | (1L << BG_COL_ATT) | (1L << WIDTH_ATT) | (1L << HEIGTH_ATT))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ValueContext extends ParserRuleContext {
		public RealvalueContext realvalue() {
			return getRuleContext(RealvalueContext.class,0);
		}
		public SumContext sum() {
			return getRuleContext(SumContext.class,0);
		}
		public ValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ICSSListener ) ((ICSSListener)listener).enterValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ICSSListener ) ((ICSSListener)listener).exitValue(this);
		}
	}

	public final ValueContext value() throws RecognitionException {
		ValueContext _localctx = new ValueContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_value);
		try {
			setState(71);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(69);
				realvalue();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(70);
				sum();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SumContext extends ParserRuleContext {
		public List<RealvalueContext> realvalue() {
			return getRuleContexts(RealvalueContext.class);
		}
		public RealvalueContext realvalue(int i) {
			return getRuleContext(RealvalueContext.class,i);
		}
		public TerminalNode ADD_OPP() { return getToken(ICSSParser.ADD_OPP, 0); }
		public SumContext sum() {
			return getRuleContext(SumContext.class,0);
		}
		public SubtractionContext subtraction() {
			return getRuleContext(SubtractionContext.class,0);
		}
		public MultiplyContext multiply() {
			return getRuleContext(MultiplyContext.class,0);
		}
		public SumContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sum; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ICSSListener ) ((ICSSListener)listener).enterSum(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ICSSListener ) ((ICSSListener)listener).exitSum(this);
		}
	}

	public final SumContext sum() throws RecognitionException {
		SumContext _localctx = new SumContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_sum);
		try {
			setState(84);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(73);
				realvalue();
				setState(74);
				match(ADD_OPP);
				setState(75);
				realvalue();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(77);
				realvalue();
				setState(78);
				match(ADD_OPP);
				setState(82);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
				case 1:
					{
					setState(79);
					sum();
					}
					break;
				case 2:
					{
					setState(80);
					subtraction();
					}
					break;
				case 3:
					{
					setState(81);
					multiply();
					}
					break;
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SubtractionContext extends ParserRuleContext {
		public List<RealvalueContext> realvalue() {
			return getRuleContexts(RealvalueContext.class);
		}
		public RealvalueContext realvalue(int i) {
			return getRuleContext(RealvalueContext.class,i);
		}
		public TerminalNode SUBSTRACT_OPP() { return getToken(ICSSParser.SUBSTRACT_OPP, 0); }
		public SumContext sum() {
			return getRuleContext(SumContext.class,0);
		}
		public SubtractionContext subtraction() {
			return getRuleContext(SubtractionContext.class,0);
		}
		public MultiplyContext multiply() {
			return getRuleContext(MultiplyContext.class,0);
		}
		public SubtractionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subtraction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ICSSListener ) ((ICSSListener)listener).enterSubtraction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ICSSListener ) ((ICSSListener)listener).exitSubtraction(this);
		}
	}

	public final SubtractionContext subtraction() throws RecognitionException {
		SubtractionContext _localctx = new SubtractionContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_subtraction);
		try {
			setState(97);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(86);
				realvalue();
				setState(87);
				match(SUBSTRACT_OPP);
				setState(88);
				realvalue();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(90);
				realvalue();
				setState(91);
				match(SUBSTRACT_OPP);
				setState(95);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
				case 1:
					{
					setState(92);
					sum();
					}
					break;
				case 2:
					{
					setState(93);
					subtraction();
					}
					break;
				case 3:
					{
					setState(94);
					multiply();
					}
					break;
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MultiplyContext extends ParserRuleContext {
		public List<RealvalueContext> realvalue() {
			return getRuleContexts(RealvalueContext.class);
		}
		public RealvalueContext realvalue(int i) {
			return getRuleContext(RealvalueContext.class,i);
		}
		public TerminalNode MULTIPLY_OPP() { return getToken(ICSSParser.MULTIPLY_OPP, 0); }
		public SumContext sum() {
			return getRuleContext(SumContext.class,0);
		}
		public SubtractionContext subtraction() {
			return getRuleContext(SubtractionContext.class,0);
		}
		public MultiplyContext multiply() {
			return getRuleContext(MultiplyContext.class,0);
		}
		public MultiplyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiply; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ICSSListener ) ((ICSSListener)listener).enterMultiply(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ICSSListener ) ((ICSSListener)listener).exitMultiply(this);
		}
	}

	public final MultiplyContext multiply() throws RecognitionException {
		MultiplyContext _localctx = new MultiplyContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_multiply);
		try {
			setState(110);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(99);
				realvalue();
				setState(100);
				match(MULTIPLY_OPP);
				setState(101);
				realvalue();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(103);
				realvalue();
				setState(104);
				match(MULTIPLY_OPP);
				setState(108);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
				case 1:
					{
					setState(105);
					sum();
					}
					break;
				case 2:
					{
					setState(106);
					subtraction();
					}
					break;
				case 3:
					{
					setState(107);
					multiply();
					}
					break;
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RealvalueContext extends ParserRuleContext {
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public ConstantreferenceContext constantreference() {
			return getRuleContext(ConstantreferenceContext.class,0);
		}
		public RealvalueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_realvalue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ICSSListener ) ((ICSSListener)listener).enterRealvalue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ICSSListener ) ((ICSSListener)listener).exitRealvalue(this);
		}
	}

	public final RealvalueContext realvalue() throws RecognitionException {
		RealvalueContext _localctx = new RealvalueContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_realvalue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(114);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case COLOR_LITERAL:
			case PIXEL_LITERAL:
			case PERCENTAGE_LITERAL:
			case SCALAR_LITERAL:
				{
				setState(112);
				literal();
				}
				break;
			case CONSTANT_NAME:
				{
				setState(113);
				constantreference();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LiteralContext extends ParserRuleContext {
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
	 
		public LiteralContext() { }
		public void copyFrom(LiteralContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ScalarliteralContext extends LiteralContext {
		public TerminalNode SCALAR_LITERAL() { return getToken(ICSSParser.SCALAR_LITERAL, 0); }
		public ScalarliteralContext(LiteralContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ICSSListener ) ((ICSSListener)listener).enterScalarliteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ICSSListener ) ((ICSSListener)listener).exitScalarliteral(this);
		}
	}
	public static class ColorliteralContext extends LiteralContext {
		public TerminalNode COLOR_LITERAL() { return getToken(ICSSParser.COLOR_LITERAL, 0); }
		public ColorliteralContext(LiteralContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ICSSListener ) ((ICSSListener)listener).enterColorliteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ICSSListener ) ((ICSSListener)listener).exitColorliteral(this);
		}
	}
	public static class PercentageliteralContext extends LiteralContext {
		public TerminalNode PERCENTAGE_LITERAL() { return getToken(ICSSParser.PERCENTAGE_LITERAL, 0); }
		public PercentageliteralContext(LiteralContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ICSSListener ) ((ICSSListener)listener).enterPercentageliteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ICSSListener ) ((ICSSListener)listener).exitPercentageliteral(this);
		}
	}
	public static class PixelliteralContext extends LiteralContext {
		public TerminalNode PIXEL_LITERAL() { return getToken(ICSSParser.PIXEL_LITERAL, 0); }
		public PixelliteralContext(LiteralContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ICSSListener ) ((ICSSListener)listener).enterPixelliteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ICSSListener ) ((ICSSListener)listener).exitPixelliteral(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_literal);
		try {
			setState(120);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case COLOR_LITERAL:
				_localctx = new ColorliteralContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(116);
				match(COLOR_LITERAL);
				}
				break;
			case PIXEL_LITERAL:
				_localctx = new PixelliteralContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(117);
				match(PIXEL_LITERAL);
				}
				break;
			case PERCENTAGE_LITERAL:
				_localctx = new PercentageliteralContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(118);
				match(PERCENTAGE_LITERAL);
				}
				break;
			case SCALAR_LITERAL:
				_localctx = new ScalarliteralContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(119);
				match(SCALAR_LITERAL);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConstantassignmentContext extends ParserRuleContext {
		public TerminalNode CONSTANT_DECLARATOR() { return getToken(ICSSParser.CONSTANT_DECLARATOR, 0); }
		public ConstantreferenceContext constantreference() {
			return getRuleContext(ConstantreferenceContext.class,0);
		}
		public TerminalNode CONSTANT_ASSIGNMENT_SEPERATOR() { return getToken(ICSSParser.CONSTANT_ASSIGNMENT_SEPERATOR, 0); }
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public TerminalNode ENDLINE() { return getToken(ICSSParser.ENDLINE, 0); }
		public ConstantassignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constantassignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ICSSListener ) ((ICSSListener)listener).enterConstantassignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ICSSListener ) ((ICSSListener)listener).exitConstantassignment(this);
		}
	}

	public final ConstantassignmentContext constantassignment() throws RecognitionException {
		ConstantassignmentContext _localctx = new ConstantassignmentContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_constantassignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(122);
			match(CONSTANT_DECLARATOR);
			setState(123);
			constantreference();
			setState(124);
			match(CONSTANT_ASSIGNMENT_SEPERATOR);
			setState(125);
			value();
			setState(126);
			match(ENDLINE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConstantreferenceContext extends ParserRuleContext {
		public TerminalNode CONSTANT_NAME() { return getToken(ICSSParser.CONSTANT_NAME, 0); }
		public ConstantreferenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constantreference; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ICSSListener ) ((ICSSListener)listener).enterConstantreference(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ICSSListener ) ((ICSSListener)listener).exitConstantreference(this);
		}
	}

	public final ConstantreferenceContext constantreference() throws RecognitionException {
		ConstantreferenceContext _localctx = new ConstantreferenceContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_constantreference);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(128);
			match(CONSTANT_NAME);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SwitchruleContext extends ParserRuleContext {
		public SelectorContext selector() {
			return getRuleContext(SelectorContext.class,0);
		}
		public TerminalNode SWITCH_KEYWORD() { return getToken(ICSSParser.SWITCH_KEYWORD, 0); }
		public RealvalueContext realvalue() {
			return getRuleContext(RealvalueContext.class,0);
		}
		public List<SwitchvaluecaseContext> switchvaluecase() {
			return getRuleContexts(SwitchvaluecaseContext.class);
		}
		public SwitchvaluecaseContext switchvaluecase(int i) {
			return getRuleContext(SwitchvaluecaseContext.class,i);
		}
		public SwitchruleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switchrule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ICSSListener ) ((ICSSListener)listener).enterSwitchrule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ICSSListener ) ((ICSSListener)listener).exitSwitchrule(this);
		}
	}

	public final SwitchruleContext switchrule() throws RecognitionException {
		SwitchruleContext _localctx = new SwitchruleContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_switchrule);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(130);
			selector();
			setState(131);
			match(SWITCH_KEYWORD);
			setState(132);
			realvalue();
			setState(136);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CASE_KEYWORD || _la==DEFAULT_KEYWORD) {
				{
				{
				setState(133);
				switchvaluecase();
				}
				}
				setState(138);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SwitchvaluecaseContext extends ParserRuleContext {
		public SwitchvaluecaseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switchvaluecase; }
	 
		public SwitchvaluecaseContext() { }
		public void copyFrom(SwitchvaluecaseContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class DefaultswitchcaseContext extends SwitchvaluecaseContext {
		public TerminalNode DEFAULT_KEYWORD() { return getToken(ICSSParser.DEFAULT_KEYWORD, 0); }
		public TerminalNode STYLERULE_OPEN() { return getToken(ICSSParser.STYLERULE_OPEN, 0); }
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public TerminalNode STYLERULE_CLOSE() { return getToken(ICSSParser.STYLERULE_CLOSE, 0); }
		public DefaultswitchcaseContext(SwitchvaluecaseContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ICSSListener ) ((ICSSListener)listener).enterDefaultswitchcase(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ICSSListener ) ((ICSSListener)listener).exitDefaultswitchcase(this);
		}
	}
	public static class SwitchcaseContext extends SwitchvaluecaseContext {
		public TerminalNode CASE_KEYWORD() { return getToken(ICSSParser.CASE_KEYWORD, 0); }
		public RealvalueContext realvalue() {
			return getRuleContext(RealvalueContext.class,0);
		}
		public TerminalNode STYLERULE_OPEN() { return getToken(ICSSParser.STYLERULE_OPEN, 0); }
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public TerminalNode STYLERULE_CLOSE() { return getToken(ICSSParser.STYLERULE_CLOSE, 0); }
		public SwitchcaseContext(SwitchvaluecaseContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ICSSListener ) ((ICSSListener)listener).enterSwitchcase(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ICSSListener ) ((ICSSListener)listener).exitSwitchcase(this);
		}
	}

	public final SwitchvaluecaseContext switchvaluecase() throws RecognitionException {
		SwitchvaluecaseContext _localctx = new SwitchvaluecaseContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_switchvaluecase);
		try {
			setState(150);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CASE_KEYWORD:
				_localctx = new SwitchcaseContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(139);
				match(CASE_KEYWORD);
				setState(140);
				realvalue();
				setState(141);
				match(STYLERULE_OPEN);
				setState(142);
				declaration();
				setState(143);
				match(STYLERULE_CLOSE);
				}
				break;
			case DEFAULT_KEYWORD:
				_localctx = new DefaultswitchcaseContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(145);
				match(DEFAULT_KEYWORD);
				setState(146);
				match(STYLERULE_OPEN);
				setState(147);
				declaration();
				setState(148);
				match(STYLERULE_CLOSE);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\37\u009b\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\3\2\7\2&\n\2\f\2\16\2)\13\2\3\3\3\3\3\3\5\3.\n\3\3\4\3\4\3\4\7\4\63\n"+
		"\4\f\4\16\4\66\13\4\3\4\3\4\3\5\3\5\3\5\5\5=\n\5\3\6\3\6\3\7\3\7\3\7\3"+
		"\7\3\7\3\b\3\b\3\t\3\t\5\tJ\n\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5"+
		"\nU\n\n\5\nW\n\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\5\13b\n"+
		"\13\5\13d\n\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\fo\n\f\5\fq\n\f\3"+
		"\r\3\r\5\ru\n\r\3\16\3\16\3\16\3\16\5\16{\n\16\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\20\3\20\3\21\3\21\3\21\3\21\7\21\u0089\n\21\f\21\16\21\u008c\13"+
		"\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\5\22\u0099"+
		"\n\22\3\22\2\2\23\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"\2\3\3\2\7"+
		"\n\2\u009f\2\'\3\2\2\2\4-\3\2\2\2\6/\3\2\2\2\b<\3\2\2\2\n>\3\2\2\2\f@"+
		"\3\2\2\2\16E\3\2\2\2\20I\3\2\2\2\22V\3\2\2\2\24c\3\2\2\2\26p\3\2\2\2\30"+
		"t\3\2\2\2\32z\3\2\2\2\34|\3\2\2\2\36\u0082\3\2\2\2 \u0084\3\2\2\2\"\u0098"+
		"\3\2\2\2$&\5\4\3\2%$\3\2\2\2&)\3\2\2\2\'%\3\2\2\2\'(\3\2\2\2(\3\3\2\2"+
		"\2)\'\3\2\2\2*.\5\6\4\2+.\5\34\17\2,.\5 \21\2-*\3\2\2\2-+\3\2\2\2-,\3"+
		"\2\2\2.\5\3\2\2\2/\60\5\b\5\2\60\64\7\4\2\2\61\63\5\n\6\2\62\61\3\2\2"+
		"\2\63\66\3\2\2\2\64\62\3\2\2\2\64\65\3\2\2\2\65\67\3\2\2\2\66\64\3\2\2"+
		"\2\678\7\5\2\28\7\3\2\2\29=\7\32\2\2:=\7\30\2\2;=\7\31\2\2<9\3\2\2\2<"+
		":\3\2\2\2<;\3\2\2\2=\t\3\2\2\2>?\5\f\7\2?\13\3\2\2\2@A\5\16\b\2AB\7\13"+
		"\2\2BC\5\20\t\2CD\7\6\2\2D\r\3\2\2\2EF\t\2\2\2F\17\3\2\2\2GJ\5\30\r\2"+
		"HJ\5\22\n\2IG\3\2\2\2IH\3\2\2\2J\21\3\2\2\2KL\5\30\r\2LM\7\33\2\2MN\5"+
		"\30\r\2NW\3\2\2\2OP\5\30\r\2PT\7\33\2\2QU\5\22\n\2RU\5\24\13\2SU\5\26"+
		"\f\2TQ\3\2\2\2TR\3\2\2\2TS\3\2\2\2UW\3\2\2\2VK\3\2\2\2VO\3\2\2\2W\23\3"+
		"\2\2\2XY\5\30\r\2YZ\7\34\2\2Z[\5\30\r\2[d\3\2\2\2\\]\5\30\r\2]a\7\34\2"+
		"\2^b\5\22\n\2_b\5\24\13\2`b\5\26\f\2a^\3\2\2\2a_\3\2\2\2a`\3\2\2\2bd\3"+
		"\2\2\2cX\3\2\2\2c\\\3\2\2\2d\25\3\2\2\2ef\5\30\r\2fg\7\35\2\2gh\5\30\r"+
		"\2hq\3\2\2\2ij\5\30\r\2jn\7\35\2\2ko\5\22\n\2lo\5\24\13\2mo\5\26\f\2n"+
		"k\3\2\2\2nl\3\2\2\2nm\3\2\2\2oq\3\2\2\2pe\3\2\2\2pi\3\2\2\2q\27\3\2\2"+
		"\2ru\5\32\16\2su\5\36\20\2tr\3\2\2\2ts\3\2\2\2u\31\3\2\2\2v{\7\f\2\2w"+
		"{\7\r\2\2x{\7\16\2\2y{\7\17\2\2zv\3\2\2\2zw\3\2\2\2zx\3\2\2\2zy\3\2\2"+
		"\2{\33\3\2\2\2|}\7\25\2\2}~\5\36\20\2~\177\7\27\2\2\177\u0080\5\20\t\2"+
		"\u0080\u0081\7\6\2\2\u0081\35\3\2\2\2\u0082\u0083\7\26\2\2\u0083\37\3"+
		"\2\2\2\u0084\u0085\5\b\5\2\u0085\u0086\7\20\2\2\u0086\u008a\5\30\r\2\u0087"+
		"\u0089\5\"\22\2\u0088\u0087\3\2\2\2\u0089\u008c\3\2\2\2\u008a\u0088\3"+
		"\2\2\2\u008a\u008b\3\2\2\2\u008b!\3\2\2\2\u008c\u008a\3\2\2\2\u008d\u008e"+
		"\7\23\2\2\u008e\u008f\5\30\r\2\u008f\u0090\7\4\2\2\u0090\u0091\5\f\7\2"+
		"\u0091\u0092\7\5\2\2\u0092\u0099\3\2\2\2\u0093\u0094\7\24\2\2\u0094\u0095"+
		"\7\4\2\2\u0095\u0096\5\f\7\2\u0096\u0097\7\5\2\2\u0097\u0099\3\2\2\2\u0098"+
		"\u008d\3\2\2\2\u0098\u0093\3\2\2\2\u0099#\3\2\2\2\21\'-\64<ITVacnptz\u008a"+
		"\u0098";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}