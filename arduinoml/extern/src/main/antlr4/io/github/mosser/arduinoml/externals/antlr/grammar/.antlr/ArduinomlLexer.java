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
		DURATION_UNIT=18, IDENTIFIER=19, SIGNAL=20, INTEGER=21, STRING=22, NEWLINE=23, 
		WS=24, COMMENT=25;
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
			"DURATION_UNIT", "IDENTIFIER", "SIGNAL", "INTEGER", "STRING", "DIGITS", 
			"LOWERCASE", "SPECIAL", "UPPERCASE", "NEWLINE", "WS", "COMMENT", "EscapeSequence", 
			"HexDigits", "HexDigit"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'application'", "'sensor'", "'actuator'", "'exception'", "':'", 
			"'printer'", "'{'", "'}'", "'<='", "'handle'", "'=>'", "'after'", "'and'", 
			"'are'", "'or'", "'is'", "'->'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, "DURATION_UNIT", "IDENTIFIER", "SIGNAL", 
			"INTEGER", "STRING", "NEWLINE", "WS", "COMMENT"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\33\u0123\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3"+
		"\t\3\t\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\r"+
		"\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\20\3\20"+
		"\3\20\3\21\3\21\3\21\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\5\23\u00b3\n\23\3\24\3\24\3\24\3\24\6\24\u00b9\n\24\r\24\16"+
		"\24\u00ba\3\25\3\25\3\25\3\25\3\25\3\25\3\25\5\25\u00c4\n\25\3\26\3\26"+
		"\7\26\u00c8\n\26\f\26\16\26\u00cb\13\26\3\27\3\27\3\27\7\27\u00d0\n\27"+
		"\f\27\16\27\u00d3\13\27\3\27\3\27\3\30\3\30\3\31\3\31\3\32\3\32\3\32\3"+
		"\32\6\32\u00df\n\32\r\32\16\32\u00e0\3\33\3\33\3\34\5\34\u00e6\n\34\3"+
		"\34\3\34\6\34\u00ea\n\34\r\34\16\34\u00eb\3\34\3\34\3\35\6\35\u00f1\n"+
		"\35\r\35\16\35\u00f2\3\35\3\35\3\36\3\36\7\36\u00f9\n\36\f\36\16\36\u00fc"+
		"\13\36\3\36\3\36\3\37\3\37\3\37\3\37\5\37\u0104\n\37\3\37\5\37\u0107\n"+
		"\37\3\37\3\37\3\37\6\37\u010c\n\37\r\37\16\37\u010d\3\37\3\37\3\37\3\37"+
		"\3\37\5\37\u0115\n\37\3 \3 \3 \7 \u011a\n \f \16 \u011d\13 \3 \5 \u0120"+
		"\n \3!\3!\2\2\"\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31"+
		"\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\2\61\2\63\2\65\2\67"+
		"\319\32;\33=\2?\2A\2\3\2\16\3\2\63;\3\2\62;\6\2\f\f\17\17$$^^\3\2c|\5"+
		"\2//BBaa\3\2C\\\4\2\13\13\"\"\4\2\f\f\17\17\n\2$$))^^ddhhppttvv\3\2\62"+
		"\65\3\2\629\5\2\62;CHch\2\u0134\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2"+
		"\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2"+
		"\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2"+
		"\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2"+
		"\2+\3\2\2\2\2-\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\3C\3\2\2\2\5"+
		"O\3\2\2\2\7V\3\2\2\2\t_\3\2\2\2\13i\3\2\2\2\rk\3\2\2\2\17s\3\2\2\2\21"+
		"u\3\2\2\2\23w\3\2\2\2\25z\3\2\2\2\27\u0081\3\2\2\2\31\u0084\3\2\2\2\33"+
		"\u008a\3\2\2\2\35\u008e\3\2\2\2\37\u0092\3\2\2\2!\u0095\3\2\2\2#\u0098"+
		"\3\2\2\2%\u00b2\3\2\2\2\'\u00b4\3\2\2\2)\u00c3\3\2\2\2+\u00c5\3\2\2\2"+
		"-\u00cc\3\2\2\2/\u00d6\3\2\2\2\61\u00d8\3\2\2\2\63\u00de\3\2\2\2\65\u00e2"+
		"\3\2\2\2\67\u00e9\3\2\2\29\u00f0\3\2\2\2;\u00f6\3\2\2\2=\u0114\3\2\2\2"+
		"?\u0116\3\2\2\2A\u0121\3\2\2\2CD\7c\2\2DE\7r\2\2EF\7r\2\2FG\7n\2\2GH\7"+
		"k\2\2HI\7e\2\2IJ\7c\2\2JK\7v\2\2KL\7k\2\2LM\7q\2\2MN\7p\2\2N\4\3\2\2\2"+
		"OP\7u\2\2PQ\7g\2\2QR\7p\2\2RS\7u\2\2ST\7q\2\2TU\7t\2\2U\6\3\2\2\2VW\7"+
		"c\2\2WX\7e\2\2XY\7v\2\2YZ\7w\2\2Z[\7c\2\2[\\\7v\2\2\\]\7q\2\2]^\7t\2\2"+
		"^\b\3\2\2\2_`\7g\2\2`a\7z\2\2ab\7e\2\2bc\7g\2\2cd\7r\2\2de\7v\2\2ef\7"+
		"k\2\2fg\7q\2\2gh\7p\2\2h\n\3\2\2\2ij\7<\2\2j\f\3\2\2\2kl\7r\2\2lm\7t\2"+
		"\2mn\7k\2\2no\7p\2\2op\7v\2\2pq\7g\2\2qr\7t\2\2r\16\3\2\2\2st\7}\2\2t"+
		"\20\3\2\2\2uv\7\177\2\2v\22\3\2\2\2wx\7>\2\2xy\7?\2\2y\24\3\2\2\2z{\7"+
		"j\2\2{|\7c\2\2|}\7p\2\2}~\7f\2\2~\177\7n\2\2\177\u0080\7g\2\2\u0080\26"+
		"\3\2\2\2\u0081\u0082\7?\2\2\u0082\u0083\7@\2\2\u0083\30\3\2\2\2\u0084"+
		"\u0085\7c\2\2\u0085\u0086\7h\2\2\u0086\u0087\7v\2\2\u0087\u0088\7g\2\2"+
		"\u0088\u0089\7t\2\2\u0089\32\3\2\2\2\u008a\u008b\7c\2\2\u008b\u008c\7"+
		"p\2\2\u008c\u008d\7f\2\2\u008d\34\3\2\2\2\u008e\u008f\7c\2\2\u008f\u0090"+
		"\7t\2\2\u0090\u0091\7g\2\2\u0091\36\3\2\2\2\u0092\u0093\7q\2\2\u0093\u0094"+
		"\7t\2\2\u0094 \3\2\2\2\u0095\u0096\7k\2\2\u0096\u0097\7u\2\2\u0097\"\3"+
		"\2\2\2\u0098\u0099\7/\2\2\u0099\u009a\7@\2\2\u009a$\3\2\2\2\u009b\u009c"+
		"\7o\2\2\u009c\u009d\7k\2\2\u009d\u009e\7n\2\2\u009e\u009f\7n\2\2\u009f"+
		"\u00a0\7k\2\2\u00a0\u00a1\7u\2\2\u00a1\u00a2\7g\2\2\u00a2\u00a3\7e\2\2"+
		"\u00a3\u00a4\7q\2\2\u00a4\u00a5\7p\2\2\u00a5\u00a6\7f\2\2\u00a6\u00b3"+
		"\7u\2\2\u00a7\u00a8\7o\2\2\u00a8\u00a9\7k\2\2\u00a9\u00aa\7n\2\2\u00aa"+
		"\u00ab\7n\2\2\u00ab\u00ac\7k\2\2\u00ac\u00ad\7u\2\2\u00ad\u00ae\7g\2\2"+
		"\u00ae\u00af\7e\2\2\u00af\u00b0\7q\2\2\u00b0\u00b1\7p\2\2\u00b1\u00b3"+
		"\7f\2\2\u00b2\u009b\3\2\2\2\u00b2\u00a7\3\2\2\2\u00b3&\3\2\2\2\u00b4\u00b8"+
		"\5\61\31\2\u00b5\u00b9\5\61\31\2\u00b6\u00b9\5\65\33\2\u00b7\u00b9\5/"+
		"\30\2\u00b8\u00b5\3\2\2\2\u00b8\u00b6\3\2\2\2\u00b8\u00b7\3\2\2\2\u00b9"+
		"\u00ba\3\2\2\2\u00ba\u00b8\3\2\2\2\u00ba\u00bb\3\2\2\2\u00bb(\3\2\2\2"+
		"\u00bc\u00bd\7J\2\2\u00bd\u00be\7K\2\2\u00be\u00bf\7I\2\2\u00bf\u00c4"+
		"\7J\2\2\u00c0\u00c1\7N\2\2\u00c1\u00c2\7Q\2\2\u00c2\u00c4\7Y\2\2\u00c3"+
		"\u00bc\3\2\2\2\u00c3\u00c0\3\2\2\2\u00c4*\3\2\2\2\u00c5\u00c9\t\2\2\2"+
		"\u00c6\u00c8\t\3\2\2\u00c7\u00c6\3\2\2\2\u00c8\u00cb\3\2\2\2\u00c9\u00c7"+
		"\3\2\2\2\u00c9\u00ca\3\2\2\2\u00ca,\3\2\2\2\u00cb\u00c9\3\2\2\2\u00cc"+
		"\u00d1\7$\2\2\u00cd\u00d0\n\4\2\2\u00ce\u00d0\5=\37\2\u00cf\u00cd\3\2"+
		"\2\2\u00cf\u00ce\3\2\2\2\u00d0\u00d3\3\2\2\2\u00d1\u00cf\3\2\2\2\u00d1"+
		"\u00d2\3\2\2\2\u00d2\u00d4\3\2\2\2\u00d3\u00d1\3\2\2\2\u00d4\u00d5\7$"+
		"\2\2\u00d5.\3\2\2\2\u00d6\u00d7\t\3\2\2\u00d7\60\3\2\2\2\u00d8\u00d9\t"+
		"\5\2\2\u00d9\62\3\2\2\2\u00da\u00df\5\67\34\2\u00db\u00df\59\35\2\u00dc"+
		"\u00df\5;\36\2\u00dd\u00df\t\6\2\2\u00de\u00da\3\2\2\2\u00de\u00db\3\2"+
		"\2\2\u00de\u00dc\3\2\2\2\u00de\u00dd\3\2\2\2\u00df\u00e0\3\2\2\2\u00e0"+
		"\u00de\3\2\2\2\u00e0\u00e1\3\2\2\2\u00e1\64\3\2\2\2\u00e2\u00e3\t\7\2"+
		"\2\u00e3\66\3\2\2\2\u00e4\u00e6\7\17\2\2\u00e5\u00e4\3\2\2\2\u00e5\u00e6"+
		"\3\2\2\2\u00e6\u00e7\3\2\2\2\u00e7\u00ea\7\f\2\2\u00e8\u00ea\7\17\2\2"+
		"\u00e9\u00e5\3\2\2\2\u00e9\u00e8\3\2\2\2\u00ea\u00eb\3\2\2\2\u00eb\u00e9"+
		"\3\2\2\2\u00eb\u00ec\3\2\2\2\u00ec\u00ed\3\2\2\2\u00ed\u00ee\b\34\2\2"+
		"\u00ee8\3\2\2\2\u00ef\u00f1\t\b\2\2\u00f0\u00ef\3\2\2\2\u00f1\u00f2\3"+
		"\2\2\2\u00f2\u00f0\3\2\2\2\u00f2\u00f3\3\2\2\2\u00f3\u00f4\3\2\2\2\u00f4"+
		"\u00f5\b\35\2\2\u00f5:\3\2\2\2\u00f6\u00fa\7%\2\2\u00f7\u00f9\n\t\2\2"+
		"\u00f8\u00f7\3\2\2\2\u00f9\u00fc\3\2\2\2\u00fa\u00f8\3\2\2\2\u00fa\u00fb"+
		"\3\2\2\2\u00fb\u00fd\3\2\2\2\u00fc\u00fa\3\2\2\2\u00fd\u00fe\b\36\2\2"+
		"\u00fe<\3\2\2\2\u00ff\u0100\7^\2\2\u0100\u0115\t\n\2\2\u0101\u0106\7^"+
		"\2\2\u0102\u0104\t\13\2\2\u0103\u0102\3\2\2\2\u0103\u0104\3\2\2\2\u0104"+
		"\u0105\3\2\2\2\u0105\u0107\t\f\2\2\u0106\u0103\3\2\2\2\u0106\u0107\3\2"+
		"\2\2\u0107\u0108\3\2\2\2\u0108\u0115\t\f\2\2\u0109\u010b\7^\2\2\u010a"+
		"\u010c\7w\2\2\u010b\u010a\3\2\2\2\u010c\u010d\3\2\2\2\u010d\u010b\3\2"+
		"\2\2\u010d\u010e\3\2\2\2\u010e\u010f\3\2\2\2\u010f\u0110\5A!\2\u0110\u0111"+
		"\5A!\2\u0111\u0112\5A!\2\u0112\u0113\5A!\2\u0113\u0115\3\2\2\2\u0114\u00ff"+
		"\3\2\2\2\u0114\u0101\3\2\2\2\u0114\u0109\3\2\2\2\u0115>\3\2\2\2\u0116"+
		"\u011f\5A!\2\u0117\u011a\5A!\2\u0118\u011a\7a\2\2\u0119\u0117\3\2\2\2"+
		"\u0119\u0118\3\2\2\2\u011a\u011d\3\2\2\2\u011b\u0119\3\2\2\2\u011b\u011c"+
		"\3\2\2\2\u011c\u011e\3\2\2\2\u011d\u011b\3\2\2\2\u011e\u0120\5A!\2\u011f"+
		"\u011b\3\2\2\2\u011f\u0120\3\2\2\2\u0120@\3\2\2\2\u0121\u0122\t\r\2\2"+
		"\u0122B\3\2\2\2\30\2\u00b2\u00b8\u00ba\u00c3\u00c9\u00cf\u00d1\u00de\u00e0"+
		"\u00e5\u00e9\u00eb\u00f2\u00fa\u0103\u0106\u010d\u0114\u0119\u011b\u011f"+
		"\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}