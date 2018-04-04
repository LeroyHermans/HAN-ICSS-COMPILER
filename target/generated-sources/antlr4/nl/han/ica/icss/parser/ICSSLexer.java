// Generated from nl\han\ica\icss\parser\ICSS.g4 by ANTLR 4.7
package nl.han.ica.icss.parser;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ICSSLexer extends Lexer {
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
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"WHITESPACE", "STYLERULE_OPEN", "STYLERULE_CLOSE", "ENDLINE", "COLOR_ATT", 
		"BG_COL_ATT", "WIDTH_ATT", "HEIGTH_ATT", "ATTRIBUTE_SEPARATOR", "COLOR_LITERAL", 
		"PIXEL_LITERAL", "PERCENTAGE_LITERAL", "SCALAR_LITERAL", "SWITCH_KEYWORD", 
		"SWITCH_OPEN", "SWITCH_CLOSE", "CASE_KEYWORD", "DEFAULT_KEYWORD", "CONSTANT_DECLARATOR", 
		"CONSTANT_NAME", "CONSTANT_ASSIGNMENT_SEPERATOR", "SELECTOR_ID", "SELECTOR_CLASS", 
		"SELECTOR_ELEMENT", "ADD_OPP", "SUBSTRACT_OPP", "MULTIPLY_OPP", "NUMBER", 
		"LETTER"
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


	public ICSSLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "ICSS.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\37\u00d8\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\3\2\6\2?\n\2\r"+
		"\2\16\2@\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\13\3\13\3\13\3"+
		"\13\3\13\3\13\3\13\3\13\3\f\6\fz\n\f\r\f\16\f{\3\f\3\f\3\f\3\r\6\r\u0082"+
		"\n\r\r\r\16\r\u0083\3\r\3\r\3\16\7\16\u0089\n\16\f\16\16\16\u008c\13\16"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\22"+
		"\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24"+
		"\3\25\3\25\3\25\6\25\u00ad\n\25\r\25\16\25\u00ae\3\25\5\25\u00b2\n\25"+
		"\3\25\3\25\7\25\u00b6\n\25\f\25\16\25\u00b9\13\25\3\26\3\26\3\26\3\27"+
		"\3\27\6\27\u00c0\n\27\r\27\16\27\u00c1\3\30\3\30\6\30\u00c6\n\30\r\30"+
		"\16\30\u00c7\3\31\6\31\u00cb\n\31\r\31\16\31\u00cc\3\32\3\32\3\33\3\33"+
		"\3\34\3\34\3\35\3\35\3\36\3\36\2\2\37\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21"+
		"\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30"+
		"/\31\61\32\63\33\65\34\67\359\36;\37\3\2\b\5\2\13\f\17\17\"\"\5\2\62;"+
		"CHch\3\2\62;\4\2//aa\4\2\62;c|\4\2C\\c|\2\u00e3\2\3\3\2\2\2\2\5\3\2\2"+
		"\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21"+
		"\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2"+
		"\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3"+
		"\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3"+
		"\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\3>\3\2\2\2\5D\3"+
		"\2\2\2\7F\3\2\2\2\tH\3\2\2\2\13J\3\2\2\2\rP\3\2\2\2\17a\3\2\2\2\21g\3"+
		"\2\2\2\23n\3\2\2\2\25p\3\2\2\2\27y\3\2\2\2\31\u0081\3\2\2\2\33\u008a\3"+
		"\2\2\2\35\u008d\3\2\2\2\37\u0094\3\2\2\2!\u0096\3\2\2\2#\u0098\3\2\2\2"+
		"%\u009d\3\2\2\2\'\u00a5\3\2\2\2)\u00a9\3\2\2\2+\u00ba\3\2\2\2-\u00bd\3"+
		"\2\2\2/\u00c3\3\2\2\2\61\u00ca\3\2\2\2\63\u00ce\3\2\2\2\65\u00d0\3\2\2"+
		"\2\67\u00d2\3\2\2\29\u00d4\3\2\2\2;\u00d6\3\2\2\2=?\t\2\2\2>=\3\2\2\2"+
		"?@\3\2\2\2@>\3\2\2\2@A\3\2\2\2AB\3\2\2\2BC\b\2\2\2C\4\3\2\2\2DE\7}\2\2"+
		"E\6\3\2\2\2FG\7\177\2\2G\b\3\2\2\2HI\7=\2\2I\n\3\2\2\2JK\7e\2\2KL\7q\2"+
		"\2LM\7n\2\2MN\7q\2\2NO\7t\2\2O\f\3\2\2\2PQ\7d\2\2QR\7c\2\2RS\7e\2\2ST"+
		"\7m\2\2TU\7i\2\2UV\7t\2\2VW\7q\2\2WX\7w\2\2XY\7p\2\2YZ\7f\2\2Z[\7/\2\2"+
		"[\\\7e\2\2\\]\7q\2\2]^\7n\2\2^_\7q\2\2_`\7t\2\2`\16\3\2\2\2ab\7y\2\2b"+
		"c\7k\2\2cd\7f\2\2de\7v\2\2ef\7j\2\2f\20\3\2\2\2gh\7j\2\2hi\7g\2\2ij\7"+
		"k\2\2jk\7i\2\2kl\7j\2\2lm\7v\2\2m\22\3\2\2\2no\7<\2\2o\24\3\2\2\2pq\7"+
		"%\2\2qr\t\3\2\2rs\t\3\2\2st\t\3\2\2tu\t\3\2\2uv\t\3\2\2vw\t\3\2\2w\26"+
		"\3\2\2\2xz\t\4\2\2yx\3\2\2\2z{\3\2\2\2{y\3\2\2\2{|\3\2\2\2|}\3\2\2\2}"+
		"~\7r\2\2~\177\7z\2\2\177\30\3\2\2\2\u0080\u0082\t\4\2\2\u0081\u0080\3"+
		"\2\2\2\u0082\u0083\3\2\2\2\u0083\u0081\3\2\2\2\u0083\u0084\3\2\2\2\u0084"+
		"\u0085\3\2\2\2\u0085\u0086\7\'\2\2\u0086\32\3\2\2\2\u0087\u0089\t\4\2"+
		"\2\u0088\u0087\3\2\2\2\u0089\u008c\3\2\2\2\u008a\u0088\3\2\2\2\u008a\u008b"+
		"\3\2\2\2\u008b\34\3\2\2\2\u008c\u008a\3\2\2\2\u008d\u008e\7u\2\2\u008e"+
		"\u008f\7y\2\2\u008f\u0090\7k\2\2\u0090\u0091\7v\2\2\u0091\u0092\7e\2\2"+
		"\u0092\u0093\7j\2\2\u0093\36\3\2\2\2\u0094\u0095\7*\2\2\u0095 \3\2\2\2"+
		"\u0096\u0097\7+\2\2\u0097\"\3\2\2\2\u0098\u0099\7e\2\2\u0099\u009a\7c"+
		"\2\2\u009a\u009b\7u\2\2\u009b\u009c\7g\2\2\u009c$\3\2\2\2\u009d\u009e"+
		"\7f\2\2\u009e\u009f\7g\2\2\u009f\u00a0\7h\2\2\u00a0\u00a1\7c\2\2\u00a1"+
		"\u00a2\7w\2\2\u00a2\u00a3\7n\2\2\u00a3\u00a4\7v\2\2\u00a4&\3\2\2\2\u00a5"+
		"\u00a6\7n\2\2\u00a6\u00a7\7g\2\2\u00a7\u00a8\7v\2\2\u00a8(\3\2\2\2\u00a9"+
		"\u00ac\7&\2\2\u00aa\u00ad\59\35\2\u00ab\u00ad\5;\36\2\u00ac\u00aa\3\2"+
		"\2\2\u00ac\u00ab\3\2\2\2\u00ad\u00ae\3\2\2\2\u00ae\u00ac\3\2\2\2\u00ae"+
		"\u00af\3\2\2\2\u00af\u00b1\3\2\2\2\u00b0\u00b2\t\5\2\2\u00b1\u00b0\3\2"+
		"\2\2\u00b1\u00b2\3\2\2\2\u00b2\u00b7\3\2\2\2\u00b3\u00b6\59\35\2\u00b4"+
		"\u00b6\5;\36\2\u00b5\u00b3\3\2\2\2\u00b5\u00b4\3\2\2\2\u00b6\u00b9\3\2"+
		"\2\2\u00b7\u00b5\3\2\2\2\u00b7\u00b8\3\2\2\2\u00b8*\3\2\2\2\u00b9\u00b7"+
		"\3\2\2\2\u00ba\u00bb\7k\2\2\u00bb\u00bc\7u\2\2\u00bc,\3\2\2\2\u00bd\u00bf"+
		"\7%\2\2\u00be\u00c0\t\6\2\2\u00bf\u00be\3\2\2\2\u00c0\u00c1\3\2\2\2\u00c1"+
		"\u00bf\3\2\2\2\u00c1\u00c2\3\2\2\2\u00c2.\3\2\2\2\u00c3\u00c5\7\60\2\2"+
		"\u00c4\u00c6\t\6\2\2\u00c5\u00c4\3\2\2\2\u00c6\u00c7\3\2\2\2\u00c7\u00c5"+
		"\3\2\2\2\u00c7\u00c8\3\2\2\2\u00c8\60\3\2\2\2\u00c9\u00cb\t\6\2\2\u00ca"+
		"\u00c9\3\2\2\2\u00cb\u00cc\3\2\2\2\u00cc\u00ca\3\2\2\2\u00cc\u00cd\3\2"+
		"\2\2\u00cd\62\3\2\2\2\u00ce\u00cf\7-\2\2\u00cf\64\3\2\2\2\u00d0\u00d1"+
		"\7/\2\2\u00d1\66\3\2\2\2\u00d2\u00d3\7,\2\2\u00d38\3\2\2\2\u00d4\u00d5"+
		"\t\4\2\2\u00d5:\3\2\2\2\u00d6\u00d7\t\7\2\2\u00d7<\3\2\2\2\17\2@{\u0083"+
		"\u008a\u00ac\u00ae\u00b1\u00b5\u00b7\u00c1\u00c7\u00cc\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}