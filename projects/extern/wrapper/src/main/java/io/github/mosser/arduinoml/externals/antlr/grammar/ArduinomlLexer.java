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
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, PORT_NUMBER=15, IDENTIFIER=16, 
		SIGNAL=17, DURATION_UNIT=18, INTEGER=19, NEWLINE=20, WS=21, COMMENT=22;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
		"T__9", "T__10", "T__11", "T__12", "T__13", "PORT_NUMBER", "IDENTIFIER", 
		"SIGNAL", "DURATION_UNIT", "INTEGER", "LOWERCASE", "UPPERCASE", "NEWLINE", 
		"WS", "COMMENT"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'application'", "'sensor'", "'actuator'", "':'", "'{'", "'}'", 
		"'<='", "'or'", "'and'", "'after'", "'milliseconds'", "'=>'", "'is'", 
		"'->'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, "PORT_NUMBER", "IDENTIFIER", "SIGNAL", "DURATION_UNIT", 
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\30\u00d1\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3"+
		"\7\3\b\3\b\3\b\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3"+
		"\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3"+
		"\16\3\16\3\16\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\5\20\u0081\n\20"+
		"\3\21\3\21\3\21\6\21\u0086\n\21\r\21\16\21\u0087\3\22\3\22\3\22\3\22\3"+
		"\22\3\22\3\22\5\22\u0091\n\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\5\23\u00aa\n\23\3\24\3\24\7\24\u00ae\n\24\f\24\16\24\u00b1\13\24"+
		"\3\25\3\25\3\26\3\26\3\27\5\27\u00b8\n\27\3\27\3\27\6\27\u00bc\n\27\r"+
		"\27\16\27\u00bd\3\27\3\27\3\30\6\30\u00c3\n\30\r\30\16\30\u00c4\3\30\3"+
		"\30\3\31\3\31\7\31\u00cb\n\31\f\31\16\31\u00ce\13\31\3\31\3\31\2\2\32"+
		"\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20"+
		"\37\21!\22#\23%\24\'\25)\2+\2-\26/\27\61\30\3\2\b\3\2\63;\3\2\62;\3\2"+
		"c|\3\2C\\\4\2\13\13\"\"\4\2\f\f\17\17\2\u00da\2\3\3\2\2\2\2\5\3\2\2\2"+
		"\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3"+
		"\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2"+
		"\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2"+
		"\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\3\63\3\2\2\2\5?\3\2\2\2\7F\3\2"+
		"\2\2\tO\3\2\2\2\13Q\3\2\2\2\rS\3\2\2\2\17U\3\2\2\2\21X\3\2\2\2\23[\3\2"+
		"\2\2\25_\3\2\2\2\27e\3\2\2\2\31r\3\2\2\2\33u\3\2\2\2\35x\3\2\2\2\37\u0080"+
		"\3\2\2\2!\u0082\3\2\2\2#\u0090\3\2\2\2%\u00a9\3\2\2\2\'\u00ab\3\2\2\2"+
		")\u00b2\3\2\2\2+\u00b4\3\2\2\2-\u00bb\3\2\2\2/\u00c2\3\2\2\2\61\u00c8"+
		"\3\2\2\2\63\64\7c\2\2\64\65\7r\2\2\65\66\7r\2\2\66\67\7n\2\2\678\7k\2"+
		"\289\7e\2\29:\7c\2\2:;\7v\2\2;<\7k\2\2<=\7q\2\2=>\7p\2\2>\4\3\2\2\2?@"+
		"\7u\2\2@A\7g\2\2AB\7p\2\2BC\7u\2\2CD\7q\2\2DE\7t\2\2E\6\3\2\2\2FG\7c\2"+
		"\2GH\7e\2\2HI\7v\2\2IJ\7w\2\2JK\7c\2\2KL\7v\2\2LM\7q\2\2MN\7t\2\2N\b\3"+
		"\2\2\2OP\7<\2\2P\n\3\2\2\2QR\7}\2\2R\f\3\2\2\2ST\7\177\2\2T\16\3\2\2\2"+
		"UV\7>\2\2VW\7?\2\2W\20\3\2\2\2XY\7q\2\2YZ\7t\2\2Z\22\3\2\2\2[\\\7c\2\2"+
		"\\]\7p\2\2]^\7f\2\2^\24\3\2\2\2_`\7c\2\2`a\7h\2\2ab\7v\2\2bc\7g\2\2cd"+
		"\7t\2\2d\26\3\2\2\2ef\7o\2\2fg\7k\2\2gh\7n\2\2hi\7n\2\2ij\7k\2\2jk\7u"+
		"\2\2kl\7g\2\2lm\7e\2\2mn\7q\2\2no\7p\2\2op\7f\2\2pq\7u\2\2q\30\3\2\2\2"+
		"rs\7?\2\2st\7@\2\2t\32\3\2\2\2uv\7k\2\2vw\7u\2\2w\34\3\2\2\2xy\7/\2\2"+
		"yz\7@\2\2z\36\3\2\2\2{\u0081\t\2\2\2|}\7\63\2\2}\u0081\7\63\2\2~\177\7"+
		"\63\2\2\177\u0081\7\64\2\2\u0080{\3\2\2\2\u0080|\3\2\2\2\u0080~\3\2\2"+
		"\2\u0081 \3\2\2\2\u0082\u0085\5)\25\2\u0083\u0086\5)\25\2\u0084\u0086"+
		"\5+\26\2\u0085\u0083\3\2\2\2\u0085\u0084\3\2\2\2\u0086\u0087\3\2\2\2\u0087"+
		"\u0085\3\2\2\2\u0087\u0088\3\2\2\2\u0088\"\3\2\2\2\u0089\u008a\7J\2\2"+
		"\u008a\u008b\7K\2\2\u008b\u008c\7I\2\2\u008c\u0091\7J\2\2\u008d\u008e"+
		"\7N\2\2\u008e\u008f\7Q\2\2\u008f\u0091\7Y\2\2\u0090\u0089\3\2\2\2\u0090"+
		"\u008d\3\2\2\2\u0091$\3\2\2\2\u0092\u0093\7o\2\2\u0093\u0094\7k\2\2\u0094"+
		"\u0095\7n\2\2\u0095\u0096\7n\2\2\u0096\u0097\7k\2\2\u0097\u0098\7u\2\2"+
		"\u0098\u0099\7g\2\2\u0099\u009a\7e\2\2\u009a\u009b\7q\2\2\u009b\u009c"+
		"\7p\2\2\u009c\u009d\7f\2\2\u009d\u00aa\7u\2\2\u009e\u009f\7o\2\2\u009f"+
		"\u00a0\7k\2\2\u00a0\u00a1\7n\2\2\u00a1\u00a2\7n\2\2\u00a2\u00a3\7k\2\2"+
		"\u00a3\u00a4\7u\2\2\u00a4\u00a5\7g\2\2\u00a5\u00a6\7e\2\2\u00a6\u00a7"+
		"\7q\2\2\u00a7\u00a8\7p\2\2\u00a8\u00aa\7f\2\2\u00a9\u0092\3\2\2\2\u00a9"+
		"\u009e\3\2\2\2\u00aa&\3\2\2\2\u00ab\u00af\t\2\2\2\u00ac\u00ae\t\3\2\2"+
		"\u00ad\u00ac\3\2\2\2\u00ae\u00b1\3\2\2\2\u00af\u00ad\3\2\2\2\u00af\u00b0"+
		"\3\2\2\2\u00b0(\3\2\2\2\u00b1\u00af\3\2\2\2\u00b2\u00b3\t\4\2\2\u00b3"+
		"*\3\2\2\2\u00b4\u00b5\t\5\2\2\u00b5,\3\2\2\2\u00b6\u00b8\7\17\2\2\u00b7"+
		"\u00b6\3\2\2\2\u00b7\u00b8\3\2\2\2\u00b8\u00b9\3\2\2\2\u00b9\u00bc\7\f"+
		"\2\2\u00ba\u00bc\7\17\2\2\u00bb\u00b7\3\2\2\2\u00bb\u00ba\3\2\2\2\u00bc"+
		"\u00bd\3\2\2\2\u00bd\u00bb\3\2\2\2\u00bd\u00be\3\2\2\2\u00be\u00bf\3\2"+
		"\2\2\u00bf\u00c0\b\27\2\2\u00c0.\3\2\2\2\u00c1\u00c3\t\6\2\2\u00c2\u00c1"+
		"\3\2\2\2\u00c3\u00c4\3\2\2\2\u00c4\u00c2\3\2\2\2\u00c4\u00c5\3\2\2\2\u00c5"+
		"\u00c6\3\2\2\2\u00c6\u00c7\b\30\2\2\u00c7\60\3\2\2\2\u00c8\u00cc\7%\2"+
		"\2\u00c9\u00cb\n\7\2\2\u00ca\u00c9\3\2\2\2\u00cb\u00ce\3\2\2\2\u00cc\u00ca"+
		"\3\2\2\2\u00cc\u00cd\3\2\2\2\u00cd\u00cf\3\2\2\2\u00ce\u00cc\3\2\2\2\u00cf"+
		"\u00d0\b\31\2\2\u00d0\62\3\2\2\2\16\2\u0080\u0085\u0087\u0090\u00a9\u00af"+
		"\u00b7\u00bb\u00bd\u00c4\u00cc\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}