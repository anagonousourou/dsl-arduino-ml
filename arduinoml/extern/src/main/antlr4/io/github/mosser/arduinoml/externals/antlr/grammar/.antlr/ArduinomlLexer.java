// Generated from /home/anagonou/Documents/si5/dsl/dsl-arduino-ml/projects/extern/wrapper/src/main/antlr4/io/github/mosser/arduinoml/externals/antlr/grammar/Arduinoml.g4 by ANTLR 4.8
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ArduinomlLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, DURATION_UNIT=15, IDENTIFIER=16, 
		SIGNAL=17, INTEGER=18, NEWLINE=19, WS=20, COMMENT=21;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "T__10", "T__11", "T__12", "T__13", "DURATION_UNIT", "IDENTIFIER", 
			"SIGNAL", "INTEGER", "DIGITS", "LOWERCASE", "UPPERCASE", "NEWLINE", "WS", 
			"COMMENT"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'application'", "'sensor'", "'actuator'", "':'", "'{'", "'}'", 
			"'<='", "'after'", "'=>'", "'is'", "'and'", "'are'", "'or'", "'->'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, "DURATION_UNIT", "IDENTIFIER", "SIGNAL", "INTEGER", 
			"NEWLINE", "WS", "COMMENT"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
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


	public ArduinomlLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Arduinoml.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\27\u00c4\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3"+
		"\7\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\13\3\13\3\13\3\f"+
		"\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\17\3\17\3\17\3\20\3\20\3"+
		"\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3"+
		"\20\3\20\3\20\3\20\3\20\3\20\3\20\5\20\u008a\n\20\3\21\3\21\3\21\3\21"+
		"\6\21\u0090\n\21\r\21\16\21\u0091\3\22\3\22\3\22\3\22\3\22\3\22\3\22\5"+
		"\22\u009b\n\22\3\23\3\23\7\23\u009f\n\23\f\23\16\23\u00a2\13\23\3\24\3"+
		"\24\3\25\3\25\3\26\3\26\3\27\5\27\u00ab\n\27\3\27\3\27\6\27\u00af\n\27"+
		"\r\27\16\27\u00b0\3\27\3\27\3\30\6\30\u00b6\n\30\r\30\16\30\u00b7\3\30"+
		"\3\30\3\31\3\31\7\31\u00be\n\31\f\31\16\31\u00c1\13\31\3\31\3\31\2\2\32"+
		"\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20"+
		"\37\21!\22#\23%\24\'\2)\2+\2-\25/\26\61\27\3\2\b\3\2\63;\3\2\62;\3\2c"+
		"|\3\2C\\\4\2\13\13\"\"\4\2\f\f\17\17\2\u00cb\2\3\3\2\2\2\2\5\3\2\2\2\2"+
		"\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2"+
		"\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2"+
		"\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2-\3\2\2\2"+
		"\2/\3\2\2\2\2\61\3\2\2\2\3\63\3\2\2\2\5?\3\2\2\2\7F\3\2\2\2\tO\3\2\2\2"+
		"\13Q\3\2\2\2\rS\3\2\2\2\17U\3\2\2\2\21X\3\2\2\2\23^\3\2\2\2\25a\3\2\2"+
		"\2\27d\3\2\2\2\31h\3\2\2\2\33l\3\2\2\2\35o\3\2\2\2\37\u0089\3\2\2\2!\u008b"+
		"\3\2\2\2#\u009a\3\2\2\2%\u009c\3\2\2\2\'\u00a3\3\2\2\2)\u00a5\3\2\2\2"+
		"+\u00a7\3\2\2\2-\u00ae\3\2\2\2/\u00b5\3\2\2\2\61\u00bb\3\2\2\2\63\64\7"+
		"c\2\2\64\65\7r\2\2\65\66\7r\2\2\66\67\7n\2\2\678\7k\2\289\7e\2\29:\7c"+
		"\2\2:;\7v\2\2;<\7k\2\2<=\7q\2\2=>\7p\2\2>\4\3\2\2\2?@\7u\2\2@A\7g\2\2"+
		"AB\7p\2\2BC\7u\2\2CD\7q\2\2DE\7t\2\2E\6\3\2\2\2FG\7c\2\2GH\7e\2\2HI\7"+
		"v\2\2IJ\7w\2\2JK\7c\2\2KL\7v\2\2LM\7q\2\2MN\7t\2\2N\b\3\2\2\2OP\7<\2\2"+
		"P\n\3\2\2\2QR\7}\2\2R\f\3\2\2\2ST\7\177\2\2T\16\3\2\2\2UV\7>\2\2VW\7?"+
		"\2\2W\20\3\2\2\2XY\7c\2\2YZ\7h\2\2Z[\7v\2\2[\\\7g\2\2\\]\7t\2\2]\22\3"+
		"\2\2\2^_\7?\2\2_`\7@\2\2`\24\3\2\2\2ab\7k\2\2bc\7u\2\2c\26\3\2\2\2de\7"+
		"c\2\2ef\7p\2\2fg\7f\2\2g\30\3\2\2\2hi\7c\2\2ij\7t\2\2jk\7g\2\2k\32\3\2"+
		"\2\2lm\7q\2\2mn\7t\2\2n\34\3\2\2\2op\7/\2\2pq\7@\2\2q\36\3\2\2\2rs\7o"+
		"\2\2st\7k\2\2tu\7n\2\2uv\7n\2\2vw\7k\2\2wx\7u\2\2xy\7g\2\2yz\7e\2\2z{"+
		"\7q\2\2{|\7p\2\2|}\7f\2\2}\u008a\7u\2\2~\177\7o\2\2\177\u0080\7k\2\2\u0080"+
		"\u0081\7n\2\2\u0081\u0082\7n\2\2\u0082\u0083\7k\2\2\u0083\u0084\7u\2\2"+
		"\u0084\u0085\7g\2\2\u0085\u0086\7e\2\2\u0086\u0087\7q\2\2\u0087\u0088"+
		"\7p\2\2\u0088\u008a\7f\2\2\u0089r\3\2\2\2\u0089~\3\2\2\2\u008a \3\2\2"+
		"\2\u008b\u008f\5)\25\2\u008c\u0090\5)\25\2\u008d\u0090\5+\26\2\u008e\u0090"+
		"\5\'\24\2\u008f\u008c\3\2\2\2\u008f\u008d\3\2\2\2\u008f\u008e\3\2\2\2"+
		"\u0090\u0091\3\2\2\2\u0091\u008f\3\2\2\2\u0091\u0092\3\2\2\2\u0092\"\3"+
		"\2\2\2\u0093\u0094\7J\2\2\u0094\u0095\7K\2\2\u0095\u0096\7I\2\2\u0096"+
		"\u009b\7J\2\2\u0097\u0098\7N\2\2\u0098\u0099\7Q\2\2\u0099\u009b\7Y\2\2"+
		"\u009a\u0093\3\2\2\2\u009a\u0097\3\2\2\2\u009b$\3\2\2\2\u009c\u00a0\t"+
		"\2\2\2\u009d\u009f\t\3\2\2\u009e\u009d\3\2\2\2\u009f\u00a2\3\2\2\2\u00a0"+
		"\u009e\3\2\2\2\u00a0\u00a1\3\2\2\2\u00a1&\3\2\2\2\u00a2\u00a0\3\2\2\2"+
		"\u00a3\u00a4\t\3\2\2\u00a4(\3\2\2\2\u00a5\u00a6\t\4\2\2\u00a6*\3\2\2\2"+
		"\u00a7\u00a8\t\5\2\2\u00a8,\3\2\2\2\u00a9\u00ab\7\17\2\2\u00aa\u00a9\3"+
		"\2\2\2\u00aa\u00ab\3\2\2\2\u00ab\u00ac\3\2\2\2\u00ac\u00af\7\f\2\2\u00ad"+
		"\u00af\7\17\2\2\u00ae\u00aa\3\2\2\2\u00ae\u00ad\3\2\2\2\u00af\u00b0\3"+
		"\2\2\2\u00b0\u00ae\3\2\2\2\u00b0\u00b1\3\2\2\2\u00b1\u00b2\3\2\2\2\u00b2"+
		"\u00b3\b\27\2\2\u00b3.\3\2\2\2\u00b4\u00b6\t\6\2\2\u00b5\u00b4\3\2\2\2"+
		"\u00b6\u00b7\3\2\2\2\u00b7\u00b5\3\2\2\2\u00b7\u00b8\3\2\2\2\u00b8\u00b9"+
		"\3\2\2\2\u00b9\u00ba\b\30\2\2\u00ba\60\3\2\2\2\u00bb\u00bf\7%\2\2\u00bc"+
		"\u00be\n\7\2\2\u00bd\u00bc\3\2\2\2\u00be\u00c1\3\2\2\2\u00bf\u00bd\3\2"+
		"\2\2\u00bf\u00c0\3\2\2\2\u00c0\u00c2\3\2\2\2\u00c1\u00bf\3\2\2\2\u00c2"+
		"\u00c3\b\31\2\2\u00c3\62\3\2\2\2\r\2\u0089\u008f\u0091\u009a\u00a0\u00aa"+
		"\u00ae\u00b0\u00b7\u00bf\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}