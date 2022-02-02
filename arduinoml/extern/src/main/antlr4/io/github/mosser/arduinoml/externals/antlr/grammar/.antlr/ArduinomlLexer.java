// Generated from /home/anagonou/Documents/si5/dsl/dsl-arduino-ml/arduinoml/extern/src/main/antlr4/io/github/mosser/arduinoml/externals/antlr/grammar/Arduinoml.g4 by ANTLR 4.8
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
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, DURATION_UNIT=19, IDENTIFIER=20, SIGNAL=21, INTEGER=22, STRING=23, 
		NEWLINE=24, WS=25, COMMENT=26;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "T__15", "T__16", 
			"T__17", "DURATION_UNIT", "IDENTIFIER", "SIGNAL", "INTEGER", "STRING", 
			"DIGITS", "LOWERCASE", "SPECIAL", "UPPERCASE", "NEWLINE", "WS", "COMMENT", 
			"EscapeSequence", "HexDigits", "HexDigit"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'application'", "'sensor'", "'actuator'", "'exception'", "':'", 
			"'printer'", "'{'", "'}'", "'<='", "','", "'handle'", "'=>'", "'after'", 
			"'and'", "'are'", "'or'", "'is'", "'->'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, "DURATION_UNIT", "IDENTIFIER", 
			"SIGNAL", "INTEGER", "STRING", "NEWLINE", "WS", "COMMENT"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\34\u0127\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3"+
		"\b\3\b\3\t\3\t\3\n\3\n\3\n\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3"+
		"\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\20\3\20\3\20"+
		"\3\20\3\21\3\21\3\21\3\22\3\22\3\22\3\23\3\23\3\23\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\5\24\u00b7\n\24\3\25\3\25\3\25\3\25\6\25\u00bd"+
		"\n\25\r\25\16\25\u00be\3\26\3\26\3\26\3\26\3\26\3\26\3\26\5\26\u00c8\n"+
		"\26\3\27\3\27\7\27\u00cc\n\27\f\27\16\27\u00cf\13\27\3\30\3\30\3\30\7"+
		"\30\u00d4\n\30\f\30\16\30\u00d7\13\30\3\30\3\30\3\31\3\31\3\32\3\32\3"+
		"\33\3\33\3\33\3\33\6\33\u00e3\n\33\r\33\16\33\u00e4\3\34\3\34\3\35\5\35"+
		"\u00ea\n\35\3\35\3\35\6\35\u00ee\n\35\r\35\16\35\u00ef\3\35\3\35\3\36"+
		"\6\36\u00f5\n\36\r\36\16\36\u00f6\3\36\3\36\3\37\3\37\7\37\u00fd\n\37"+
		"\f\37\16\37\u0100\13\37\3\37\3\37\3 \3 \3 \3 \5 \u0108\n \3 \5 \u010b"+
		"\n \3 \3 \3 \6 \u0110\n \r \16 \u0111\3 \3 \3 \3 \3 \5 \u0119\n \3!\3"+
		"!\3!\7!\u011e\n!\f!\16!\u0121\13!\3!\5!\u0124\n!\3\"\3\"\2\2#\3\3\5\4"+
		"\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22"+
		"#\23%\24\'\25)\26+\27-\30/\31\61\2\63\2\65\2\67\29\32;\33=\34?\2A\2C\2"+
		"\3\2\16\3\2\63;\3\2\62;\6\2\f\f\17\17$$^^\3\2c|\5\2//BBaa\3\2C\\\4\2\13"+
		"\13\"\"\4\2\f\f\17\17\n\2$$))^^ddhhppttvv\3\2\62\65\3\2\629\5\2\62;CH"+
		"ch\2\u0138\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2"+
		"\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27"+
		"\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2"+
		"\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2"+
		"\2/\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\3E\3\2\2\2\5Q\3\2\2\2\7X"+
		"\3\2\2\2\ta\3\2\2\2\13k\3\2\2\2\rm\3\2\2\2\17u\3\2\2\2\21w\3\2\2\2\23"+
		"y\3\2\2\2\25|\3\2\2\2\27~\3\2\2\2\31\u0085\3\2\2\2\33\u0088\3\2\2\2\35"+
		"\u008e\3\2\2\2\37\u0092\3\2\2\2!\u0096\3\2\2\2#\u0099\3\2\2\2%\u009c\3"+
		"\2\2\2\'\u00b6\3\2\2\2)\u00b8\3\2\2\2+\u00c7\3\2\2\2-\u00c9\3\2\2\2/\u00d0"+
		"\3\2\2\2\61\u00da\3\2\2\2\63\u00dc\3\2\2\2\65\u00e2\3\2\2\2\67\u00e6\3"+
		"\2\2\29\u00ed\3\2\2\2;\u00f4\3\2\2\2=\u00fa\3\2\2\2?\u0118\3\2\2\2A\u011a"+
		"\3\2\2\2C\u0125\3\2\2\2EF\7c\2\2FG\7r\2\2GH\7r\2\2HI\7n\2\2IJ\7k\2\2J"+
		"K\7e\2\2KL\7c\2\2LM\7v\2\2MN\7k\2\2NO\7q\2\2OP\7p\2\2P\4\3\2\2\2QR\7u"+
		"\2\2RS\7g\2\2ST\7p\2\2TU\7u\2\2UV\7q\2\2VW\7t\2\2W\6\3\2\2\2XY\7c\2\2"+
		"YZ\7e\2\2Z[\7v\2\2[\\\7w\2\2\\]\7c\2\2]^\7v\2\2^_\7q\2\2_`\7t\2\2`\b\3"+
		"\2\2\2ab\7g\2\2bc\7z\2\2cd\7e\2\2de\7g\2\2ef\7r\2\2fg\7v\2\2gh\7k\2\2"+
		"hi\7q\2\2ij\7p\2\2j\n\3\2\2\2kl\7<\2\2l\f\3\2\2\2mn\7r\2\2no\7t\2\2op"+
		"\7k\2\2pq\7p\2\2qr\7v\2\2rs\7g\2\2st\7t\2\2t\16\3\2\2\2uv\7}\2\2v\20\3"+
		"\2\2\2wx\7\177\2\2x\22\3\2\2\2yz\7>\2\2z{\7?\2\2{\24\3\2\2\2|}\7.\2\2"+
		"}\26\3\2\2\2~\177\7j\2\2\177\u0080\7c\2\2\u0080\u0081\7p\2\2\u0081\u0082"+
		"\7f\2\2\u0082\u0083\7n\2\2\u0083\u0084\7g\2\2\u0084\30\3\2\2\2\u0085\u0086"+
		"\7?\2\2\u0086\u0087\7@\2\2\u0087\32\3\2\2\2\u0088\u0089\7c\2\2\u0089\u008a"+
		"\7h\2\2\u008a\u008b\7v\2\2\u008b\u008c\7g\2\2\u008c\u008d\7t\2\2\u008d"+
		"\34\3\2\2\2\u008e\u008f\7c\2\2\u008f\u0090\7p\2\2\u0090\u0091\7f\2\2\u0091"+
		"\36\3\2\2\2\u0092\u0093\7c\2\2\u0093\u0094\7t\2\2\u0094\u0095\7g\2\2\u0095"+
		" \3\2\2\2\u0096\u0097\7q\2\2\u0097\u0098\7t\2\2\u0098\"\3\2\2\2\u0099"+
		"\u009a\7k\2\2\u009a\u009b\7u\2\2\u009b$\3\2\2\2\u009c\u009d\7/\2\2\u009d"+
		"\u009e\7@\2\2\u009e&\3\2\2\2\u009f\u00a0\7o\2\2\u00a0\u00a1\7k\2\2\u00a1"+
		"\u00a2\7n\2\2\u00a2\u00a3\7n\2\2\u00a3\u00a4\7k\2\2\u00a4\u00a5\7u\2\2"+
		"\u00a5\u00a6\7g\2\2\u00a6\u00a7\7e\2\2\u00a7\u00a8\7q\2\2\u00a8\u00a9"+
		"\7p\2\2\u00a9\u00aa\7f\2\2\u00aa\u00b7\7u\2\2\u00ab\u00ac\7o\2\2\u00ac"+
		"\u00ad\7k\2\2\u00ad\u00ae\7n\2\2\u00ae\u00af\7n\2\2\u00af\u00b0\7k\2\2"+
		"\u00b0\u00b1\7u\2\2\u00b1\u00b2\7g\2\2\u00b2\u00b3\7e\2\2\u00b3\u00b4"+
		"\7q\2\2\u00b4\u00b5\7p\2\2\u00b5\u00b7\7f\2\2\u00b6\u009f\3\2\2\2\u00b6"+
		"\u00ab\3\2\2\2\u00b7(\3\2\2\2\u00b8\u00bc\5\63\32\2\u00b9\u00bd\5\63\32"+
		"\2\u00ba\u00bd\5\67\34\2\u00bb\u00bd\5\61\31\2\u00bc\u00b9\3\2\2\2\u00bc"+
		"\u00ba\3\2\2\2\u00bc\u00bb\3\2\2\2\u00bd\u00be\3\2\2\2\u00be\u00bc\3\2"+
		"\2\2\u00be\u00bf\3\2\2\2\u00bf*\3\2\2\2\u00c0\u00c1\7J\2\2\u00c1\u00c2"+
		"\7K\2\2\u00c2\u00c3\7I\2\2\u00c3\u00c8\7J\2\2\u00c4\u00c5\7N\2\2\u00c5"+
		"\u00c6\7Q\2\2\u00c6\u00c8\7Y\2\2\u00c7\u00c0\3\2\2\2\u00c7\u00c4\3\2\2"+
		"\2\u00c8,\3\2\2\2\u00c9\u00cd\t\2\2\2\u00ca\u00cc\t\3\2\2\u00cb\u00ca"+
		"\3\2\2\2\u00cc\u00cf\3\2\2\2\u00cd\u00cb\3\2\2\2\u00cd\u00ce\3\2\2\2\u00ce"+
		".\3\2\2\2\u00cf\u00cd\3\2\2\2\u00d0\u00d5\7$\2\2\u00d1\u00d4\n\4\2\2\u00d2"+
		"\u00d4\5? \2\u00d3\u00d1\3\2\2\2\u00d3\u00d2\3\2\2\2\u00d4\u00d7\3\2\2"+
		"\2\u00d5\u00d3\3\2\2\2\u00d5\u00d6\3\2\2\2\u00d6\u00d8\3\2\2\2\u00d7\u00d5"+
		"\3\2\2\2\u00d8\u00d9\7$\2\2\u00d9\60\3\2\2\2\u00da\u00db\t\3\2\2\u00db"+
		"\62\3\2\2\2\u00dc\u00dd\t\5\2\2\u00dd\64\3\2\2\2\u00de\u00e3\59\35\2\u00df"+
		"\u00e3\5;\36\2\u00e0\u00e3\5=\37\2\u00e1\u00e3\t\6\2\2\u00e2\u00de\3\2"+
		"\2\2\u00e2\u00df\3\2\2\2\u00e2\u00e0\3\2\2\2\u00e2\u00e1\3\2\2\2\u00e3"+
		"\u00e4\3\2\2\2\u00e4\u00e2\3\2\2\2\u00e4\u00e5\3\2\2\2\u00e5\66\3\2\2"+
		"\2\u00e6\u00e7\t\7\2\2\u00e78\3\2\2\2\u00e8\u00ea\7\17\2\2\u00e9\u00e8"+
		"\3\2\2\2\u00e9\u00ea\3\2\2\2\u00ea\u00eb\3\2\2\2\u00eb\u00ee\7\f\2\2\u00ec"+
		"\u00ee\7\17\2\2\u00ed\u00e9\3\2\2\2\u00ed\u00ec\3\2\2\2\u00ee\u00ef\3"+
		"\2\2\2\u00ef\u00ed\3\2\2\2\u00ef\u00f0\3\2\2\2\u00f0\u00f1\3\2\2\2\u00f1"+
		"\u00f2\b\35\2\2\u00f2:\3\2\2\2\u00f3\u00f5\t\b\2\2\u00f4\u00f3\3\2\2\2"+
		"\u00f5\u00f6\3\2\2\2\u00f6\u00f4\3\2\2\2\u00f6\u00f7\3\2\2\2\u00f7\u00f8"+
		"\3\2\2\2\u00f8\u00f9\b\36\2\2\u00f9<\3\2\2\2\u00fa\u00fe\7%\2\2\u00fb"+
		"\u00fd\n\t\2\2\u00fc\u00fb\3\2\2\2\u00fd\u0100\3\2\2\2\u00fe\u00fc\3\2"+
		"\2\2\u00fe\u00ff\3\2\2\2\u00ff\u0101\3\2\2\2\u0100\u00fe\3\2\2\2\u0101"+
		"\u0102\b\37\2\2\u0102>\3\2\2\2\u0103\u0104\7^\2\2\u0104\u0119\t\n\2\2"+
		"\u0105\u010a\7^\2\2\u0106\u0108\t\13\2\2\u0107\u0106\3\2\2\2\u0107\u0108"+
		"\3\2\2\2\u0108\u0109\3\2\2\2\u0109\u010b\t\f\2\2\u010a\u0107\3\2\2\2\u010a"+
		"\u010b\3\2\2\2\u010b\u010c\3\2\2\2\u010c\u0119\t\f\2\2\u010d\u010f\7^"+
		"\2\2\u010e\u0110\7w\2\2\u010f\u010e\3\2\2\2\u0110\u0111\3\2\2\2\u0111"+
		"\u010f\3\2\2\2\u0111\u0112\3\2\2\2\u0112\u0113\3\2\2\2\u0113\u0114\5C"+
		"\"\2\u0114\u0115\5C\"\2\u0115\u0116\5C\"\2\u0116\u0117\5C\"\2\u0117\u0119"+
		"\3\2\2\2\u0118\u0103\3\2\2\2\u0118\u0105\3\2\2\2\u0118\u010d\3\2\2\2\u0119"+
		"@\3\2\2\2\u011a\u0123\5C\"\2\u011b\u011e\5C\"\2\u011c\u011e\7a\2\2\u011d"+
		"\u011b\3\2\2\2\u011d\u011c\3\2\2\2\u011e\u0121\3\2\2\2\u011f\u011d\3\2"+
		"\2\2\u011f\u0120\3\2\2\2\u0120\u0122\3\2\2\2\u0121\u011f\3\2\2\2\u0122"+
		"\u0124\5C\"\2\u0123\u011f\3\2\2\2\u0123\u0124\3\2\2\2\u0124B\3\2\2\2\u0125"+
		"\u0126\t\r\2\2\u0126D\3\2\2\2\30\2\u00b6\u00bc\u00be\u00c7\u00cd\u00d3"+
		"\u00d5\u00e2\u00e4\u00e9\u00ed\u00ef\u00f6\u00fe\u0107\u010a\u0111\u0118"+
		"\u011d\u011f\u0123\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}