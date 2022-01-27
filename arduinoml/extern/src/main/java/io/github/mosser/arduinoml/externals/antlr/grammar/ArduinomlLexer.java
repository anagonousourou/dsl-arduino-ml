// Generated from io/github/mosser/arduinoml/externals/antlr/grammar/Arduinoml.g4 by ANTLR 4.7
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
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, DURATION_UNIT=17, 
		IDENTIFIER=18, SIGNAL=19, INTEGER=20, NEWLINE=21, WS=22, COMMENT=23;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
		"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "T__15", "DURATION_UNIT", 
		"IDENTIFIER", "SIGNAL", "INTEGER", "DIGITS", "LOWERCASE", "UPPERCASE", 
		"NEWLINE", "WS", "COMMENT"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'application'", "'sensor'", "'actuator'", "'exception'", "':'", 
		"'{'", "'}'", "'<='", "'handle'", "'=>'", "'after'", "'and'", "'are'", 
		"'or'", "'is'", "'->'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, "DURATION_UNIT", "IDENTIFIER", "SIGNAL", 
		"INTEGER", "NEWLINE", "WS", "COMMENT"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\31\u00d9\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2"+
		"\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t"+
		"\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3"+
		"\f\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\20\3\20\3\20\3"+
		"\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3"+
		"\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\5\22\u009f"+
		"\n\22\3\23\3\23\3\23\3\23\6\23\u00a5\n\23\r\23\16\23\u00a6\3\24\3\24\3"+
		"\24\3\24\3\24\3\24\3\24\5\24\u00b0\n\24\3\25\3\25\7\25\u00b4\n\25\f\25"+
		"\16\25\u00b7\13\25\3\26\3\26\3\27\3\27\3\30\3\30\3\31\5\31\u00c0\n\31"+
		"\3\31\3\31\6\31\u00c4\n\31\r\31\16\31\u00c5\3\31\3\31\3\32\6\32\u00cb"+
		"\n\32\r\32\16\32\u00cc\3\32\3\32\3\33\3\33\7\33\u00d3\n\33\f\33\16\33"+
		"\u00d6\13\33\3\33\3\33\2\2\34\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13"+
		"\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\2-\2/\2\61\27"+
		"\63\30\65\31\3\2\b\3\2\63;\3\2\62;\3\2c|\3\2C\\\4\2\13\13\"\"\4\2\f\f"+
		"\17\17\2\u00e0\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3"+
		"\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2"+
		"\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3"+
		"\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2\61\3\2\2\2\2\63"+
		"\3\2\2\2\2\65\3\2\2\2\3\67\3\2\2\2\5C\3\2\2\2\7J\3\2\2\2\tS\3\2\2\2\13"+
		"]\3\2\2\2\r_\3\2\2\2\17a\3\2\2\2\21c\3\2\2\2\23f\3\2\2\2\25m\3\2\2\2\27"+
		"p\3\2\2\2\31v\3\2\2\2\33z\3\2\2\2\35~\3\2\2\2\37\u0081\3\2\2\2!\u0084"+
		"\3\2\2\2#\u009e\3\2\2\2%\u00a0\3\2\2\2\'\u00af\3\2\2\2)\u00b1\3\2\2\2"+
		"+\u00b8\3\2\2\2-\u00ba\3\2\2\2/\u00bc\3\2\2\2\61\u00c3\3\2\2\2\63\u00ca"+
		"\3\2\2\2\65\u00d0\3\2\2\2\678\7c\2\289\7r\2\29:\7r\2\2:;\7n\2\2;<\7k\2"+
		"\2<=\7e\2\2=>\7c\2\2>?\7v\2\2?@\7k\2\2@A\7q\2\2AB\7p\2\2B\4\3\2\2\2CD"+
		"\7u\2\2DE\7g\2\2EF\7p\2\2FG\7u\2\2GH\7q\2\2HI\7t\2\2I\6\3\2\2\2JK\7c\2"+
		"\2KL\7e\2\2LM\7v\2\2MN\7w\2\2NO\7c\2\2OP\7v\2\2PQ\7q\2\2QR\7t\2\2R\b\3"+
		"\2\2\2ST\7g\2\2TU\7z\2\2UV\7e\2\2VW\7g\2\2WX\7r\2\2XY\7v\2\2YZ\7k\2\2"+
		"Z[\7q\2\2[\\\7p\2\2\\\n\3\2\2\2]^\7<\2\2^\f\3\2\2\2_`\7}\2\2`\16\3\2\2"+
		"\2ab\7\177\2\2b\20\3\2\2\2cd\7>\2\2de\7?\2\2e\22\3\2\2\2fg\7j\2\2gh\7"+
		"c\2\2hi\7p\2\2ij\7f\2\2jk\7n\2\2kl\7g\2\2l\24\3\2\2\2mn\7?\2\2no\7@\2"+
		"\2o\26\3\2\2\2pq\7c\2\2qr\7h\2\2rs\7v\2\2st\7g\2\2tu\7t\2\2u\30\3\2\2"+
		"\2vw\7c\2\2wx\7p\2\2xy\7f\2\2y\32\3\2\2\2z{\7c\2\2{|\7t\2\2|}\7g\2\2}"+
		"\34\3\2\2\2~\177\7q\2\2\177\u0080\7t\2\2\u0080\36\3\2\2\2\u0081\u0082"+
		"\7k\2\2\u0082\u0083\7u\2\2\u0083 \3\2\2\2\u0084\u0085\7/\2\2\u0085\u0086"+
		"\7@\2\2\u0086\"\3\2\2\2\u0087\u0088\7o\2\2\u0088\u0089\7k\2\2\u0089\u008a"+
		"\7n\2\2\u008a\u008b\7n\2\2\u008b\u008c\7k\2\2\u008c\u008d\7u\2\2\u008d"+
		"\u008e\7g\2\2\u008e\u008f\7e\2\2\u008f\u0090\7q\2\2\u0090\u0091\7p\2\2"+
		"\u0091\u0092\7f\2\2\u0092\u009f\7u\2\2\u0093\u0094\7o\2\2\u0094\u0095"+
		"\7k\2\2\u0095\u0096\7n\2\2\u0096\u0097\7n\2\2\u0097\u0098\7k\2\2\u0098"+
		"\u0099\7u\2\2\u0099\u009a\7g\2\2\u009a\u009b\7e\2\2\u009b\u009c\7q\2\2"+
		"\u009c\u009d\7p\2\2\u009d\u009f\7f\2\2\u009e\u0087\3\2\2\2\u009e\u0093"+
		"\3\2\2\2\u009f$\3\2\2\2\u00a0\u00a4\5-\27\2\u00a1\u00a5\5-\27\2\u00a2"+
		"\u00a5\5/\30\2\u00a3\u00a5\5+\26\2\u00a4\u00a1\3\2\2\2\u00a4\u00a2\3\2"+
		"\2\2\u00a4\u00a3\3\2\2\2\u00a5\u00a6\3\2\2\2\u00a6\u00a4\3\2\2\2\u00a6"+
		"\u00a7\3\2\2\2\u00a7&\3\2\2\2\u00a8\u00a9\7J\2\2\u00a9\u00aa\7K\2\2\u00aa"+
		"\u00ab\7I\2\2\u00ab\u00b0\7J\2\2\u00ac\u00ad\7N\2\2\u00ad\u00ae\7Q\2\2"+
		"\u00ae\u00b0\7Y\2\2\u00af\u00a8\3\2\2\2\u00af\u00ac\3\2\2\2\u00b0(\3\2"+
		"\2\2\u00b1\u00b5\t\2\2\2\u00b2\u00b4\t\3\2\2\u00b3\u00b2\3\2\2\2\u00b4"+
		"\u00b7\3\2\2\2\u00b5\u00b3\3\2\2\2\u00b5\u00b6\3\2\2\2\u00b6*\3\2\2\2"+
		"\u00b7\u00b5\3\2\2\2\u00b8\u00b9\t\3\2\2\u00b9,\3\2\2\2\u00ba\u00bb\t"+
		"\4\2\2\u00bb.\3\2\2\2\u00bc\u00bd\t\5\2\2\u00bd\60\3\2\2\2\u00be\u00c0"+
		"\7\17\2\2\u00bf\u00be\3\2\2\2\u00bf\u00c0\3\2\2\2\u00c0\u00c1\3\2\2\2"+
		"\u00c1\u00c4\7\f\2\2\u00c2\u00c4\7\17\2\2\u00c3\u00bf\3\2\2\2\u00c3\u00c2"+
		"\3\2\2\2\u00c4\u00c5\3\2\2\2\u00c5\u00c3\3\2\2\2\u00c5\u00c6\3\2\2\2\u00c6"+
		"\u00c7\3\2\2\2\u00c7\u00c8\b\31\2\2\u00c8\62\3\2\2\2\u00c9\u00cb\t\6\2"+
		"\2\u00ca\u00c9\3\2\2\2\u00cb\u00cc\3\2\2\2\u00cc\u00ca\3\2\2\2\u00cc\u00cd"+
		"\3\2\2\2\u00cd\u00ce\3\2\2\2\u00ce\u00cf\b\32\2\2\u00cf\64\3\2\2\2\u00d0"+
		"\u00d4\7%\2\2\u00d1\u00d3\n\7\2\2\u00d2\u00d1\3\2\2\2\u00d3\u00d6\3\2"+
		"\2\2\u00d4\u00d2\3\2\2\2\u00d4\u00d5\3\2\2\2\u00d5\u00d7\3\2\2\2\u00d6"+
		"\u00d4\3\2\2\2\u00d7\u00d8\b\33\2\2\u00d8\66\3\2\2\2\r\2\u009e\u00a4\u00a6"+
		"\u00af\u00b5\u00bf\u00c3\u00c5\u00cc\u00d4\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}