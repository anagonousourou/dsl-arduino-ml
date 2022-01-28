// Generated from io\github\mosser\arduinoml\externals\antlr\grammar\Arduinoml.g4 by ANTLR 4.7
package io.github.mosser.arduinoml.externals.antlr.grammar;
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
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, DURATION_UNIT=16, 
		IDENTIFIER=17, SIGNAL=18, INTEGER=19, STRING=20, NEWLINE=21, WS=22, COMMENT=23;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
		"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "DURATION_UNIT", 
		"IDENTIFIER", "SIGNAL", "INTEGER", "STRING", "DIGITS", "LOWERCASE", "SPECIAL", 
		"UPPERCASE", "NEWLINE", "WS", "COMMENT", "EscapeSequence", "HexDigits", 
		"HexDigit"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'application'", "'sensor'", "'actuator'", "'printer'", "':'", "'{'", 
		"'}'", "'<='", "'after'", "'=>'", "'is'", "'and'", "'are'", "'or'", "'->'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, "DURATION_UNIT", "IDENTIFIER", "SIGNAL", "INTEGER", 
		"STRING", "NEWLINE", "WS", "COMMENT"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\31\u010e\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\3\2"+
		"\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13"+
		"\3\13\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3"+
		"\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3"+
		"\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\5\21\u009e"+
		"\n\21\3\22\3\22\3\22\3\22\6\22\u00a4\n\22\r\22\16\22\u00a5\3\23\3\23\3"+
		"\23\3\23\3\23\3\23\3\23\5\23\u00af\n\23\3\24\3\24\7\24\u00b3\n\24\f\24"+
		"\16\24\u00b6\13\24\3\25\3\25\3\25\7\25\u00bb\n\25\f\25\16\25\u00be\13"+
		"\25\3\25\3\25\3\26\3\26\3\27\3\27\3\30\3\30\3\30\3\30\6\30\u00ca\n\30"+
		"\r\30\16\30\u00cb\3\31\3\31\3\32\5\32\u00d1\n\32\3\32\3\32\6\32\u00d5"+
		"\n\32\r\32\16\32\u00d6\3\32\3\32\3\33\6\33\u00dc\n\33\r\33\16\33\u00dd"+
		"\3\33\3\33\3\34\3\34\7\34\u00e4\n\34\f\34\16\34\u00e7\13\34\3\34\3\34"+
		"\3\35\3\35\3\35\3\35\5\35\u00ef\n\35\3\35\5\35\u00f2\n\35\3\35\3\35\3"+
		"\35\6\35\u00f7\n\35\r\35\16\35\u00f8\3\35\3\35\3\35\3\35\3\35\5\35\u0100"+
		"\n\35\3\36\3\36\3\36\7\36\u0105\n\36\f\36\16\36\u0108\13\36\3\36\5\36"+
		"\u010b\n\36\3\37\3\37\2\2 \3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25"+
		"\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\2-\2/\2\61\2\63"+
		"\27\65\30\67\319\2;\2=\2\3\2\16\3\2\63;\3\2\62;\6\2\f\f\17\17$$^^\3\2"+
		"c|\5\2//BBaa\3\2C\\\4\2\13\13\"\"\4\2\f\f\17\17\n\2$$))^^ddhhppttvv\3"+
		"\2\62\65\3\2\629\5\2\62;CHch\2\u011f\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2"+
		"\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23"+
		"\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2"+
		"\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2"+
		"\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\3?\3\2\2\2\5K\3\2\2\2\7R\3"+
		"\2\2\2\t[\3\2\2\2\13c\3\2\2\2\re\3\2\2\2\17g\3\2\2\2\21i\3\2\2\2\23l\3"+
		"\2\2\2\25r\3\2\2\2\27u\3\2\2\2\31x\3\2\2\2\33|\3\2\2\2\35\u0080\3\2\2"+
		"\2\37\u0083\3\2\2\2!\u009d\3\2\2\2#\u009f\3\2\2\2%\u00ae\3\2\2\2\'\u00b0"+
		"\3\2\2\2)\u00b7\3\2\2\2+\u00c1\3\2\2\2-\u00c3\3\2\2\2/\u00c9\3\2\2\2\61"+
		"\u00cd\3\2\2\2\63\u00d4\3\2\2\2\65\u00db\3\2\2\2\67\u00e1\3\2\2\29\u00ff"+
		"\3\2\2\2;\u0101\3\2\2\2=\u010c\3\2\2\2?@\7c\2\2@A\7r\2\2AB\7r\2\2BC\7"+
		"n\2\2CD\7k\2\2DE\7e\2\2EF\7c\2\2FG\7v\2\2GH\7k\2\2HI\7q\2\2IJ\7p\2\2J"+
		"\4\3\2\2\2KL\7u\2\2LM\7g\2\2MN\7p\2\2NO\7u\2\2OP\7q\2\2PQ\7t\2\2Q\6\3"+
		"\2\2\2RS\7c\2\2ST\7e\2\2TU\7v\2\2UV\7w\2\2VW\7c\2\2WX\7v\2\2XY\7q\2\2"+
		"YZ\7t\2\2Z\b\3\2\2\2[\\\7r\2\2\\]\7t\2\2]^\7k\2\2^_\7p\2\2_`\7v\2\2`a"+
		"\7g\2\2ab\7t\2\2b\n\3\2\2\2cd\7<\2\2d\f\3\2\2\2ef\7}\2\2f\16\3\2\2\2g"+
		"h\7\177\2\2h\20\3\2\2\2ij\7>\2\2jk\7?\2\2k\22\3\2\2\2lm\7c\2\2mn\7h\2"+
		"\2no\7v\2\2op\7g\2\2pq\7t\2\2q\24\3\2\2\2rs\7?\2\2st\7@\2\2t\26\3\2\2"+
		"\2uv\7k\2\2vw\7u\2\2w\30\3\2\2\2xy\7c\2\2yz\7p\2\2z{\7f\2\2{\32\3\2\2"+
		"\2|}\7c\2\2}~\7t\2\2~\177\7g\2\2\177\34\3\2\2\2\u0080\u0081\7q\2\2\u0081"+
		"\u0082\7t\2\2\u0082\36\3\2\2\2\u0083\u0084\7/\2\2\u0084\u0085\7@\2\2\u0085"+
		" \3\2\2\2\u0086\u0087\7o\2\2\u0087\u0088\7k\2\2\u0088\u0089\7n\2\2\u0089"+
		"\u008a\7n\2\2\u008a\u008b\7k\2\2\u008b\u008c\7u\2\2\u008c\u008d\7g\2\2"+
		"\u008d\u008e\7e\2\2\u008e\u008f\7q\2\2\u008f\u0090\7p\2\2\u0090\u0091"+
		"\7f\2\2\u0091\u009e\7u\2\2\u0092\u0093\7o\2\2\u0093\u0094\7k\2\2\u0094"+
		"\u0095\7n\2\2\u0095\u0096\7n\2\2\u0096\u0097\7k\2\2\u0097\u0098\7u\2\2"+
		"\u0098\u0099\7g\2\2\u0099\u009a\7e\2\2\u009a\u009b\7q\2\2\u009b\u009c"+
		"\7p\2\2\u009c\u009e\7f\2\2\u009d\u0086\3\2\2\2\u009d\u0092\3\2\2\2\u009e"+
		"\"\3\2\2\2\u009f\u00a3\5-\27\2\u00a0\u00a4\5-\27\2\u00a1\u00a4\5\61\31"+
		"\2\u00a2\u00a4\5+\26\2\u00a3\u00a0\3\2\2\2\u00a3\u00a1\3\2\2\2\u00a3\u00a2"+
		"\3\2\2\2\u00a4\u00a5\3\2\2\2\u00a5\u00a3\3\2\2\2\u00a5\u00a6\3\2\2\2\u00a6"+
		"$\3\2\2\2\u00a7\u00a8\7J\2\2\u00a8\u00a9\7K\2\2\u00a9\u00aa\7I\2\2\u00aa"+
		"\u00af\7J\2\2\u00ab\u00ac\7N\2\2\u00ac\u00ad\7Q\2\2\u00ad\u00af\7Y\2\2"+
		"\u00ae\u00a7\3\2\2\2\u00ae\u00ab\3\2\2\2\u00af&\3\2\2\2\u00b0\u00b4\t"+
		"\2\2\2\u00b1\u00b3\t\3\2\2\u00b2\u00b1\3\2\2\2\u00b3\u00b6\3\2\2\2\u00b4"+
		"\u00b2\3\2\2\2\u00b4\u00b5\3\2\2\2\u00b5(\3\2\2\2\u00b6\u00b4\3\2\2\2"+
		"\u00b7\u00bc\7$\2\2\u00b8\u00bb\n\4\2\2\u00b9\u00bb\59\35\2\u00ba\u00b8"+
		"\3\2\2\2\u00ba\u00b9\3\2\2\2\u00bb\u00be\3\2\2\2\u00bc\u00ba\3\2\2\2\u00bc"+
		"\u00bd\3\2\2\2\u00bd\u00bf\3\2\2\2\u00be\u00bc\3\2\2\2\u00bf\u00c0\7$"+
		"\2\2\u00c0*\3\2\2\2\u00c1\u00c2\t\3\2\2\u00c2,\3\2\2\2\u00c3\u00c4\t\5"+
		"\2\2\u00c4.\3\2\2\2\u00c5\u00ca\5\63\32\2\u00c6\u00ca\5\65\33\2\u00c7"+
		"\u00ca\5\67\34\2\u00c8\u00ca\t\6\2\2\u00c9\u00c5\3\2\2\2\u00c9\u00c6\3"+
		"\2\2\2\u00c9\u00c7\3\2\2\2\u00c9\u00c8\3\2\2\2\u00ca\u00cb\3\2\2\2\u00cb"+
		"\u00c9\3\2\2\2\u00cb\u00cc\3\2\2\2\u00cc\60\3\2\2\2\u00cd\u00ce\t\7\2"+
		"\2\u00ce\62\3\2\2\2\u00cf\u00d1\7\17\2\2\u00d0\u00cf\3\2\2\2\u00d0\u00d1"+
		"\3\2\2\2\u00d1\u00d2\3\2\2\2\u00d2\u00d5\7\f\2\2\u00d3\u00d5\7\17\2\2"+
		"\u00d4\u00d0\3\2\2\2\u00d4\u00d3\3\2\2\2\u00d5\u00d6\3\2\2\2\u00d6\u00d4"+
		"\3\2\2\2\u00d6\u00d7\3\2\2\2\u00d7\u00d8\3\2\2\2\u00d8\u00d9\b\32\2\2"+
		"\u00d9\64\3\2\2\2\u00da\u00dc\t\b\2\2\u00db\u00da\3\2\2\2\u00dc\u00dd"+
		"\3\2\2\2\u00dd\u00db\3\2\2\2\u00dd\u00de\3\2\2\2\u00de\u00df\3\2\2\2\u00df"+
		"\u00e0\b\33\2\2\u00e0\66\3\2\2\2\u00e1\u00e5\7%\2\2\u00e2\u00e4\n\t\2"+
		"\2\u00e3\u00e2\3\2\2\2\u00e4\u00e7\3\2\2\2\u00e5\u00e3\3\2\2\2\u00e5\u00e6"+
		"\3\2\2\2\u00e6\u00e8\3\2\2\2\u00e7\u00e5\3\2\2\2\u00e8\u00e9\b\34\2\2"+
		"\u00e98\3\2\2\2\u00ea\u00eb\7^\2\2\u00eb\u0100\t\n\2\2\u00ec\u00f1\7^"+
		"\2\2\u00ed\u00ef\t\13\2\2\u00ee\u00ed\3\2\2\2\u00ee\u00ef\3\2\2\2\u00ef"+
		"\u00f0\3\2\2\2\u00f0\u00f2\t\f\2\2\u00f1\u00ee\3\2\2\2\u00f1\u00f2\3\2"+
		"\2\2\u00f2\u00f3\3\2\2\2\u00f3\u0100\t\f\2\2\u00f4\u00f6\7^\2\2\u00f5"+
		"\u00f7\7w\2\2\u00f6\u00f5\3\2\2\2\u00f7\u00f8\3\2\2\2\u00f8\u00f6\3\2"+
		"\2\2\u00f8\u00f9\3\2\2\2\u00f9\u00fa\3\2\2\2\u00fa\u00fb\5=\37\2\u00fb"+
		"\u00fc\5=\37\2\u00fc\u00fd\5=\37\2\u00fd\u00fe\5=\37\2\u00fe\u0100\3\2"+
		"\2\2\u00ff\u00ea\3\2\2\2\u00ff\u00ec\3\2\2\2\u00ff\u00f4\3\2\2\2\u0100"+
		":\3\2\2\2\u0101\u010a\5=\37\2\u0102\u0105\5=\37\2\u0103\u0105\7a\2\2\u0104"+
		"\u0102\3\2\2\2\u0104\u0103\3\2\2\2\u0105\u0108\3\2\2\2\u0106\u0104\3\2"+
		"\2\2\u0106\u0107\3\2\2\2\u0107\u0109\3\2\2\2\u0108\u0106\3\2\2\2\u0109"+
		"\u010b\5=\37\2\u010a\u0106\3\2\2\2\u010a\u010b\3\2\2\2\u010b<\3\2\2\2"+
		"\u010c\u010d\t\r\2\2\u010d>\3\2\2\2\30\2\u009d\u00a3\u00a5\u00ae\u00b4"+
		"\u00ba\u00bc\u00c9\u00cb\u00d0\u00d4\u00d6\u00dd\u00e5\u00ee\u00f1\u00f8"+
		"\u00ff\u0104\u0106\u010a\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}