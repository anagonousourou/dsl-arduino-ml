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
		T__9=10, T__10=11, PORT_NUMBER=12, IDENTIFIER=13, SIGNAL=14, DURATION_UNIT=15, 
		INTEGER=16, NEWLINE=17, WS=18, COMMENT=19;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "T__10", "PORT_NUMBER", "IDENTIFIER", "SIGNAL", "DURATION_UNIT", 
			"INTEGER", "LOWERCASE", "UPPERCASE", "NEWLINE", "WS", "COMMENT"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'application'", "'sensor'", "'actuator'", "':'", "'{'", "'}'", 
			"'<='", "'after'", "'=>'", "'is'", "'->'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			"PORT_NUMBER", "IDENTIFIER", "SIGNAL", "DURATION_UNIT", "INTEGER", "NEWLINE", 
			"WS", "COMMENT"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\25\u00b7\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\3\2\3\2\3\2\3\2\3\2\3\2"+
		"\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\b\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\n\3\n\3\n\3\13\3\13\3\13\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\5"+
		"\rg\n\r\3\16\3\16\3\16\6\16l\n\16\r\16\16\16m\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\5\17w\n\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\5\20"+
		"\u0090\n\20\3\21\3\21\7\21\u0094\n\21\f\21\16\21\u0097\13\21\3\22\3\22"+
		"\3\23\3\23\3\24\5\24\u009e\n\24\3\24\3\24\6\24\u00a2\n\24\r\24\16\24\u00a3"+
		"\3\24\3\24\3\25\6\25\u00a9\n\25\r\25\16\25\u00aa\3\25\3\25\3\26\3\26\7"+
		"\26\u00b1\n\26\f\26\16\26\u00b4\13\26\3\26\3\26\2\2\27\3\3\5\4\7\5\t\6"+
		"\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\2%\2"+
		"\'\23)\24+\25\3\2\b\3\2\63;\3\2\62;\3\2c|\3\2C\\\4\2\13\13\"\"\4\2\f\f"+
		"\17\17\2\u00c0\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3"+
		"\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2"+
		"\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3"+
		"\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\3-\3\2\2\2\59\3\2\2\2\7@\3\2"+
		"\2\2\tI\3\2\2\2\13K\3\2\2\2\rM\3\2\2\2\17O\3\2\2\2\21R\3\2\2\2\23X\3\2"+
		"\2\2\25[\3\2\2\2\27^\3\2\2\2\31f\3\2\2\2\33h\3\2\2\2\35v\3\2\2\2\37\u008f"+
		"\3\2\2\2!\u0091\3\2\2\2#\u0098\3\2\2\2%\u009a\3\2\2\2\'\u00a1\3\2\2\2"+
		")\u00a8\3\2\2\2+\u00ae\3\2\2\2-.\7c\2\2./\7r\2\2/\60\7r\2\2\60\61\7n\2"+
		"\2\61\62\7k\2\2\62\63\7e\2\2\63\64\7c\2\2\64\65\7v\2\2\65\66\7k\2\2\66"+
		"\67\7q\2\2\678\7p\2\28\4\3\2\2\29:\7u\2\2:;\7g\2\2;<\7p\2\2<=\7u\2\2="+
		">\7q\2\2>?\7t\2\2?\6\3\2\2\2@A\7c\2\2AB\7e\2\2BC\7v\2\2CD\7w\2\2DE\7c"+
		"\2\2EF\7v\2\2FG\7q\2\2GH\7t\2\2H\b\3\2\2\2IJ\7<\2\2J\n\3\2\2\2KL\7}\2"+
		"\2L\f\3\2\2\2MN\7\177\2\2N\16\3\2\2\2OP\7>\2\2PQ\7?\2\2Q\20\3\2\2\2RS"+
		"\7c\2\2ST\7h\2\2TU\7v\2\2UV\7g\2\2VW\7t\2\2W\22\3\2\2\2XY\7?\2\2YZ\7@"+
		"\2\2Z\24\3\2\2\2[\\\7k\2\2\\]\7u\2\2]\26\3\2\2\2^_\7/\2\2_`\7@\2\2`\30"+
		"\3\2\2\2ag\t\2\2\2bc\7\63\2\2cg\7\63\2\2de\7\63\2\2eg\7\64\2\2fa\3\2\2"+
		"\2fb\3\2\2\2fd\3\2\2\2g\32\3\2\2\2hk\5#\22\2il\5#\22\2jl\5%\23\2ki\3\2"+
		"\2\2kj\3\2\2\2lm\3\2\2\2mk\3\2\2\2mn\3\2\2\2n\34\3\2\2\2op\7J\2\2pq\7"+
		"K\2\2qr\7I\2\2rw\7J\2\2st\7N\2\2tu\7Q\2\2uw\7Y\2\2vo\3\2\2\2vs\3\2\2\2"+
		"w\36\3\2\2\2xy\7o\2\2yz\7k\2\2z{\7n\2\2{|\7n\2\2|}\7k\2\2}~\7u\2\2~\177"+
		"\7g\2\2\177\u0080\7e\2\2\u0080\u0081\7q\2\2\u0081\u0082\7p\2\2\u0082\u0083"+
		"\7f\2\2\u0083\u0090\7u\2\2\u0084\u0085\7o\2\2\u0085\u0086\7k\2\2\u0086"+
		"\u0087\7n\2\2\u0087\u0088\7n\2\2\u0088\u0089\7k\2\2\u0089\u008a\7u\2\2"+
		"\u008a\u008b\7g\2\2\u008b\u008c\7e\2\2\u008c\u008d\7q\2\2\u008d\u008e"+
		"\7p\2\2\u008e\u0090\7f\2\2\u008fx\3\2\2\2\u008f\u0084\3\2\2\2\u0090 \3"+
		"\2\2\2\u0091\u0095\t\2\2\2\u0092\u0094\t\3\2\2\u0093\u0092\3\2\2\2\u0094"+
		"\u0097\3\2\2\2\u0095\u0093\3\2\2\2\u0095\u0096\3\2\2\2\u0096\"\3\2\2\2"+
		"\u0097\u0095\3\2\2\2\u0098\u0099\t\4\2\2\u0099$\3\2\2\2\u009a\u009b\t"+
		"\5\2\2\u009b&\3\2\2\2\u009c\u009e\7\17\2\2\u009d\u009c\3\2\2\2\u009d\u009e"+
		"\3\2\2\2\u009e\u009f\3\2\2\2\u009f\u00a2\7\f\2\2\u00a0\u00a2\7\17\2\2"+
		"\u00a1\u009d\3\2\2\2\u00a1\u00a0\3\2\2\2\u00a2\u00a3\3\2\2\2\u00a3\u00a1"+
		"\3\2\2\2\u00a3\u00a4\3\2\2\2\u00a4\u00a5\3\2\2\2\u00a5\u00a6\b\24\2\2"+
		"\u00a6(\3\2\2\2\u00a7\u00a9\t\6\2\2\u00a8\u00a7\3\2\2\2\u00a9\u00aa\3"+
		"\2\2\2\u00aa\u00a8\3\2\2\2\u00aa\u00ab\3\2\2\2\u00ab\u00ac\3\2\2\2\u00ac"+
		"\u00ad\b\25\2\2\u00ad*\3\2\2\2\u00ae\u00b2\7%\2\2\u00af\u00b1\n\7\2\2"+
		"\u00b0\u00af\3\2\2\2\u00b1\u00b4\3\2\2\2\u00b2\u00b0\3\2\2\2\u00b2\u00b3"+
		"\3\2\2\2\u00b3\u00b5\3\2\2\2\u00b4\u00b2\3\2\2\2\u00b5\u00b6\b\26\2\2"+
		"\u00b6,\3\2\2\2\16\2fkmv\u008f\u0095\u009d\u00a1\u00a3\u00aa\u00b2\3\b"+
		"\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}