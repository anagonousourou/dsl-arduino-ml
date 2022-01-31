// Generated from /home/anagonou/Documents/si5/dsl/dsl-arduino-ml/arduinoml/extern/src/main/antlr4/io/github/mosser/arduinoml/externals/antlr/grammar/Arduinoml.g4 by ANTLR 4.8
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ArduinomlParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, DURATION_UNIT=19, IDENTIFIER=20, SIGNAL=21, INTEGER=22, STRING=23, 
		NEWLINE=24, WS=25, COMMENT=26;
	public static final int
		RULE_root = 0, RULE_declaration = 1, RULE_bricks = 2, RULE_sensor = 3, 
		RULE_actuator = 4, RULE_exceptionDeclaration = 5, RULE_printer = 6, RULE_location = 7, 
		RULE_states = 8, RULE_state = 9, RULE_print = 10, RULE_printable = 11, 
		RULE_literalString = 12, RULE_brickToPrint = 13, RULE_action = 14, RULE_exceptionTransition = 15, 
		RULE_transition = 16, RULE_temporalTransition = 17, RULE_condition = 18, 
		RULE_andCondition = 19, RULE_orCondition = 20, RULE_uniqCondition = 21, 
		RULE_conditionTransition = 22, RULE_initial = 23;
	private static String[] makeRuleNames() {
		return new String[] {
			"root", "declaration", "bricks", "sensor", "actuator", "exceptionDeclaration", 
			"printer", "location", "states", "state", "print", "printable", "literalString", 
			"brickToPrint", "action", "exceptionTransition", "transition", "temporalTransition", 
			"condition", "andCondition", "orCondition", "uniqCondition", "conditionTransition", 
			"initial"
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

	@Override
	public String getGrammarFileName() { return "Arduinoml.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public ArduinomlParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class RootContext extends ParserRuleContext {
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public BricksContext bricks() {
			return getRuleContext(BricksContext.class,0);
		}
		public StatesContext states() {
			return getRuleContext(StatesContext.class,0);
		}
		public TerminalNode EOF() { return getToken(ArduinomlParser.EOF, 0); }
		public RootContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_root; }
	}

	public final RootContext root() throws RecognitionException {
		RootContext _localctx = new RootContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_root);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(48);
			declaration();
			setState(49);
			bricks();
			setState(50);
			states();
			setState(51);
			match(EOF);
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
		public Token name;
		public TerminalNode IDENTIFIER() { return getToken(ArduinomlParser.IDENTIFIER, 0); }
		public DeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration; }
	}

	public final DeclarationContext declaration() throws RecognitionException {
		DeclarationContext _localctx = new DeclarationContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(53);
			match(T__0);
			setState(54);
			((DeclarationContext)_localctx).name = match(IDENTIFIER);
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

	public static class BricksContext extends ParserRuleContext {
		public List<SensorContext> sensor() {
			return getRuleContexts(SensorContext.class);
		}
		public SensorContext sensor(int i) {
			return getRuleContext(SensorContext.class,i);
		}
		public List<ActuatorContext> actuator() {
			return getRuleContexts(ActuatorContext.class);
		}
		public ActuatorContext actuator(int i) {
			return getRuleContext(ActuatorContext.class,i);
		}
		public List<PrinterContext> printer() {
			return getRuleContexts(PrinterContext.class);
		}
		public PrinterContext printer(int i) {
			return getRuleContext(PrinterContext.class,i);
		}
		public List<ExceptionDeclarationContext> exceptionDeclaration() {
			return getRuleContexts(ExceptionDeclarationContext.class);
		}
		public ExceptionDeclarationContext exceptionDeclaration(int i) {
			return getRuleContext(ExceptionDeclarationContext.class,i);
		}
		public BricksContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bricks; }
	}

	public final BricksContext bricks() throws RecognitionException {
		BricksContext _localctx = new BricksContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_bricks);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(60); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(60);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__1:
					{
					setState(56);
					sensor();
					}
					break;
				case T__2:
					{
					setState(57);
					actuator();
					}
					break;
				case T__5:
					{
					setState(58);
					printer();
					}
					break;
				case T__3:
					{
					setState(59);
					exceptionDeclaration();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(62); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__5))) != 0) );
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

	public static class SensorContext extends ParserRuleContext {
		public LocationContext location() {
			return getRuleContext(LocationContext.class,0);
		}
		public SensorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sensor; }
	}

	public final SensorContext sensor() throws RecognitionException {
		SensorContext _localctx = new SensorContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_sensor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(64);
			match(T__1);
			setState(65);
			location();
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

	public static class ActuatorContext extends ParserRuleContext {
		public LocationContext location() {
			return getRuleContext(LocationContext.class,0);
		}
		public ActuatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_actuator; }
	}

	public final ActuatorContext actuator() throws RecognitionException {
		ActuatorContext _localctx = new ActuatorContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_actuator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(67);
			match(T__2);
			setState(68);
			location();
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

	public static class ExceptionDeclarationContext extends ParserRuleContext {
		public Token name;
		public Token code;
		public TerminalNode IDENTIFIER() { return getToken(ArduinomlParser.IDENTIFIER, 0); }
		public TerminalNode INTEGER() { return getToken(ArduinomlParser.INTEGER, 0); }
		public ExceptionDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exceptionDeclaration; }
	}

	public final ExceptionDeclarationContext exceptionDeclaration() throws RecognitionException {
		ExceptionDeclarationContext _localctx = new ExceptionDeclarationContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_exceptionDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(70);
			match(T__3);
			setState(71);
			((ExceptionDeclarationContext)_localctx).name = match(IDENTIFIER);
			setState(72);
			match(T__4);
			setState(73);
			((ExceptionDeclarationContext)_localctx).code = match(INTEGER);
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

	public static class PrinterContext extends ParserRuleContext {
		public Token id;
		public TerminalNode IDENTIFIER() { return getToken(ArduinomlParser.IDENTIFIER, 0); }
		public PrinterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_printer; }
	}

	public final PrinterContext printer() throws RecognitionException {
		PrinterContext _localctx = new PrinterContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_printer);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(75);
			match(T__5);
			setState(76);
			((PrinterContext)_localctx).id = match(IDENTIFIER);
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

	public static class LocationContext extends ParserRuleContext {
		public Token id;
		public Token port;
		public TerminalNode IDENTIFIER() { return getToken(ArduinomlParser.IDENTIFIER, 0); }
		public TerminalNode INTEGER() { return getToken(ArduinomlParser.INTEGER, 0); }
		public LocationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_location; }
	}

	public final LocationContext location() throws RecognitionException {
		LocationContext _localctx = new LocationContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_location);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(78);
			((LocationContext)_localctx).id = match(IDENTIFIER);
			setState(79);
			match(T__4);
			setState(80);
			((LocationContext)_localctx).port = match(INTEGER);
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

	public static class StatesContext extends ParserRuleContext {
		public List<StateContext> state() {
			return getRuleContexts(StateContext.class);
		}
		public StateContext state(int i) {
			return getRuleContext(StateContext.class,i);
		}
		public StatesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_states; }
	}

	public final StatesContext states() throws RecognitionException {
		StatesContext _localctx = new StatesContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_states);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(83); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(82);
				state();
				}
				}
				setState(85); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__17 || _la==IDENTIFIER );
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

	public static class StateContext extends ParserRuleContext {
		public Token name;
		public TerminalNode IDENTIFIER() { return getToken(ArduinomlParser.IDENTIFIER, 0); }
		public InitialContext initial() {
			return getRuleContext(InitialContext.class,0);
		}
		public List<ActionContext> action() {
			return getRuleContexts(ActionContext.class);
		}
		public ActionContext action(int i) {
			return getRuleContext(ActionContext.class,i);
		}
		public List<PrintContext> print() {
			return getRuleContexts(PrintContext.class);
		}
		public PrintContext print(int i) {
			return getRuleContext(PrintContext.class,i);
		}
		public List<ExceptionTransitionContext> exceptionTransition() {
			return getRuleContexts(ExceptionTransitionContext.class);
		}
		public ExceptionTransitionContext exceptionTransition(int i) {
			return getRuleContext(ExceptionTransitionContext.class,i);
		}
		public List<TransitionContext> transition() {
			return getRuleContexts(TransitionContext.class);
		}
		public TransitionContext transition(int i) {
			return getRuleContext(TransitionContext.class,i);
		}
		public StateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_state; }
	}

	public final StateContext state() throws RecognitionException {
		StateContext _localctx = new StateContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_state);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(88);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__17) {
				{
				setState(87);
				initial();
				}
			}

			setState(90);
			((StateContext)_localctx).name = match(IDENTIFIER);
			setState(91);
			match(T__6);
			setState(96);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(94);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
					case 1:
						{
						setState(92);
						action();
						}
						break;
					case 2:
						{
						setState(93);
						print();
						}
						break;
					}
					} 
				}
				setState(98);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			}
			setState(102);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__10) {
				{
				{
				setState(99);
				exceptionTransition();
				}
				}
				setState(104);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(106); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(105);
				transition();
				}
				}
				setState(108); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__12 || _la==IDENTIFIER );
			setState(110);
			match(T__7);
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

	public static class PrintContext extends ParserRuleContext {
		public Token receiver;
		public TerminalNode IDENTIFIER() { return getToken(ArduinomlParser.IDENTIFIER, 0); }
		public LiteralStringContext literalString() {
			return getRuleContext(LiteralStringContext.class,0);
		}
		public BrickToPrintContext brickToPrint() {
			return getRuleContext(BrickToPrintContext.class,0);
		}
		public List<PrintableContext> printable() {
			return getRuleContexts(PrintableContext.class);
		}
		public PrintableContext printable(int i) {
			return getRuleContext(PrintableContext.class,i);
		}
		public PrintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_print; }
	}

	public final PrintContext print() throws RecognitionException {
		PrintContext _localctx = new PrintContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_print);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(112);
			((PrintContext)_localctx).receiver = match(IDENTIFIER);
			setState(113);
			match(T__8);
			setState(116);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STRING:
				{
				setState(114);
				literalString();
				}
				break;
			case IDENTIFIER:
				{
				setState(115);
				brickToPrint();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(122);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__9) {
				{
				{
				setState(118);
				match(T__9);
				setState(119);
				printable();
				}
				}
				setState(124);
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

	public static class PrintableContext extends ParserRuleContext {
		public LiteralStringContext literalString() {
			return getRuleContext(LiteralStringContext.class,0);
		}
		public BrickToPrintContext brickToPrint() {
			return getRuleContext(BrickToPrintContext.class,0);
		}
		public PrintableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_printable; }
	}

	public final PrintableContext printable() throws RecognitionException {
		PrintableContext _localctx = new PrintableContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_printable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(127);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STRING:
				{
				setState(125);
				literalString();
				}
				break;
			case IDENTIFIER:
				{
				setState(126);
				brickToPrint();
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

	public static class LiteralStringContext extends ParserRuleContext {
		public Token value;
		public TerminalNode STRING() { return getToken(ArduinomlParser.STRING, 0); }
		public LiteralStringContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literalString; }
	}

	public final LiteralStringContext literalString() throws RecognitionException {
		LiteralStringContext _localctx = new LiteralStringContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_literalString);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(129);
			((LiteralStringContext)_localctx).value = match(STRING);
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

	public static class BrickToPrintContext extends ParserRuleContext {
		public Token value;
		public TerminalNode IDENTIFIER() { return getToken(ArduinomlParser.IDENTIFIER, 0); }
		public BrickToPrintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_brickToPrint; }
	}

	public final BrickToPrintContext brickToPrint() throws RecognitionException {
		BrickToPrintContext _localctx = new BrickToPrintContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_brickToPrint);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(131);
			((BrickToPrintContext)_localctx).value = match(IDENTIFIER);
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

	public static class ActionContext extends ParserRuleContext {
		public Token receiver;
		public Token value;
		public TerminalNode IDENTIFIER() { return getToken(ArduinomlParser.IDENTIFIER, 0); }
		public TerminalNode SIGNAL() { return getToken(ArduinomlParser.SIGNAL, 0); }
		public ActionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_action; }
	}

	public final ActionContext action() throws RecognitionException {
		ActionContext _localctx = new ActionContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_action);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(133);
			((ActionContext)_localctx).receiver = match(IDENTIFIER);
			setState(134);
			match(T__8);
			setState(135);
			((ActionContext)_localctx).value = match(SIGNAL);
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

	public static class ExceptionTransitionContext extends ParserRuleContext {
		public Token next;
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(ArduinomlParser.IDENTIFIER, 0); }
		public ExceptionTransitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exceptionTransition; }
	}

	public final ExceptionTransitionContext exceptionTransition() throws RecognitionException {
		ExceptionTransitionContext _localctx = new ExceptionTransitionContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_exceptionTransition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(137);
			match(T__10);
			setState(138);
			condition();
			setState(139);
			match(T__11);
			setState(140);
			((ExceptionTransitionContext)_localctx).next = match(IDENTIFIER);
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

	public static class TransitionContext extends ParserRuleContext {
		public ConditionTransitionContext conditionTransition() {
			return getRuleContext(ConditionTransitionContext.class,0);
		}
		public TemporalTransitionContext temporalTransition() {
			return getRuleContext(TemporalTransitionContext.class,0);
		}
		public TransitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_transition; }
	}

	public final TransitionContext transition() throws RecognitionException {
		TransitionContext _localctx = new TransitionContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_transition);
		try {
			setState(144);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(142);
				conditionTransition();
				}
				break;
			case T__12:
				enterOuterAlt(_localctx, 2);
				{
				setState(143);
				temporalTransition();
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

	public static class TemporalTransitionContext extends ParserRuleContext {
		public Token duration;
		public Token next;
		public TerminalNode DURATION_UNIT() { return getToken(ArduinomlParser.DURATION_UNIT, 0); }
		public TerminalNode INTEGER() { return getToken(ArduinomlParser.INTEGER, 0); }
		public TerminalNode IDENTIFIER() { return getToken(ArduinomlParser.IDENTIFIER, 0); }
		public TemporalTransitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_temporalTransition; }
	}

	public final TemporalTransitionContext temporalTransition() throws RecognitionException {
		TemporalTransitionContext _localctx = new TemporalTransitionContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_temporalTransition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(146);
			match(T__12);
			setState(147);
			((TemporalTransitionContext)_localctx).duration = match(INTEGER);
			setState(148);
			match(DURATION_UNIT);
			setState(149);
			match(T__11);
			setState(150);
			((TemporalTransitionContext)_localctx).next = match(IDENTIFIER);
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

	public static class ConditionContext extends ParserRuleContext {
		public UniqConditionContext uniqCondition() {
			return getRuleContext(UniqConditionContext.class,0);
		}
		public AndConditionContext andCondition() {
			return getRuleContext(AndConditionContext.class,0);
		}
		public OrConditionContext orCondition() {
			return getRuleContext(OrConditionContext.class,0);
		}
		public ConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition; }
	}

	public final ConditionContext condition() throws RecognitionException {
		ConditionContext _localctx = new ConditionContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_condition);
		try {
			setState(155);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(152);
				uniqCondition();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(153);
				andCondition();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(154);
				orCondition();
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

	public static class AndConditionContext extends ParserRuleContext {
		public Token trigger1;
		public Token trigger2;
		public Token value;
		public List<TerminalNode> IDENTIFIER() { return getTokens(ArduinomlParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(ArduinomlParser.IDENTIFIER, i);
		}
		public TerminalNode SIGNAL() { return getToken(ArduinomlParser.SIGNAL, 0); }
		public AndConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_andCondition; }
	}

	public final AndConditionContext andCondition() throws RecognitionException {
		AndConditionContext _localctx = new AndConditionContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_andCondition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(157);
			((AndConditionContext)_localctx).trigger1 = match(IDENTIFIER);
			setState(158);
			match(T__13);
			setState(159);
			((AndConditionContext)_localctx).trigger2 = match(IDENTIFIER);
			setState(160);
			match(T__14);
			setState(161);
			((AndConditionContext)_localctx).value = match(SIGNAL);
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

	public static class OrConditionContext extends ParserRuleContext {
		public Token trigger1;
		public Token trigger2;
		public Token value;
		public List<TerminalNode> IDENTIFIER() { return getTokens(ArduinomlParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(ArduinomlParser.IDENTIFIER, i);
		}
		public TerminalNode SIGNAL() { return getToken(ArduinomlParser.SIGNAL, 0); }
		public OrConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_orCondition; }
	}

	public final OrConditionContext orCondition() throws RecognitionException {
		OrConditionContext _localctx = new OrConditionContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_orCondition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(163);
			((OrConditionContext)_localctx).trigger1 = match(IDENTIFIER);
			setState(164);
			match(T__15);
			setState(165);
			((OrConditionContext)_localctx).trigger2 = match(IDENTIFIER);
			setState(166);
			match(T__16);
			setState(167);
			((OrConditionContext)_localctx).value = match(SIGNAL);
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

	public static class UniqConditionContext extends ParserRuleContext {
		public Token trigger;
		public Token value;
		public TerminalNode IDENTIFIER() { return getToken(ArduinomlParser.IDENTIFIER, 0); }
		public TerminalNode SIGNAL() { return getToken(ArduinomlParser.SIGNAL, 0); }
		public UniqConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_uniqCondition; }
	}

	public final UniqConditionContext uniqCondition() throws RecognitionException {
		UniqConditionContext _localctx = new UniqConditionContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_uniqCondition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(169);
			((UniqConditionContext)_localctx).trigger = match(IDENTIFIER);
			setState(170);
			match(T__16);
			setState(171);
			((UniqConditionContext)_localctx).value = match(SIGNAL);
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

	public static class ConditionTransitionContext extends ParserRuleContext {
		public Token next;
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(ArduinomlParser.IDENTIFIER, 0); }
		public ConditionTransitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditionTransition; }
	}

	public final ConditionTransitionContext conditionTransition() throws RecognitionException {
		ConditionTransitionContext _localctx = new ConditionTransitionContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_conditionTransition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(173);
			condition();
			setState(174);
			match(T__11);
			setState(175);
			((ConditionTransitionContext)_localctx).next = match(IDENTIFIER);
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

	public static class InitialContext extends ParserRuleContext {
		public InitialContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_initial; }
	}

	public final InitialContext initial() throws RecognitionException {
		InitialContext _localctx = new InitialContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_initial);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(177);
			match(T__17);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\34\u00b6\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\4\3\4\3\4\3\4\6\4?\n\4\r\4\16\4@\3"+
		"\5\3\5\3\5\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\t\3\t\3\t\3\t"+
		"\3\n\6\nV\n\n\r\n\16\nW\3\13\5\13[\n\13\3\13\3\13\3\13\3\13\7\13a\n\13"+
		"\f\13\16\13d\13\13\3\13\7\13g\n\13\f\13\16\13j\13\13\3\13\6\13m\n\13\r"+
		"\13\16\13n\3\13\3\13\3\f\3\f\3\f\3\f\5\fw\n\f\3\f\3\f\7\f{\n\f\f\f\16"+
		"\f~\13\f\3\r\3\r\5\r\u0082\n\r\3\16\3\16\3\17\3\17\3\20\3\20\3\20\3\20"+
		"\3\21\3\21\3\21\3\21\3\21\3\22\3\22\5\22\u0093\n\22\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\3\24\3\24\3\24\5\24\u009e\n\24\3\25\3\25\3\25\3\25\3\25\3\25"+
		"\3\26\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30"+
		"\3\31\3\31\3\31\2\2\32\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,"+
		".\60\2\2\2\u00ad\2\62\3\2\2\2\4\67\3\2\2\2\6>\3\2\2\2\bB\3\2\2\2\nE\3"+
		"\2\2\2\fH\3\2\2\2\16M\3\2\2\2\20P\3\2\2\2\22U\3\2\2\2\24Z\3\2\2\2\26r"+
		"\3\2\2\2\30\u0081\3\2\2\2\32\u0083\3\2\2\2\34\u0085\3\2\2\2\36\u0087\3"+
		"\2\2\2 \u008b\3\2\2\2\"\u0092\3\2\2\2$\u0094\3\2\2\2&\u009d\3\2\2\2(\u009f"+
		"\3\2\2\2*\u00a5\3\2\2\2,\u00ab\3\2\2\2.\u00af\3\2\2\2\60\u00b3\3\2\2\2"+
		"\62\63\5\4\3\2\63\64\5\6\4\2\64\65\5\22\n\2\65\66\7\2\2\3\66\3\3\2\2\2"+
		"\678\7\3\2\289\7\26\2\29\5\3\2\2\2:?\5\b\5\2;?\5\n\6\2<?\5\16\b\2=?\5"+
		"\f\7\2>:\3\2\2\2>;\3\2\2\2><\3\2\2\2>=\3\2\2\2?@\3\2\2\2@>\3\2\2\2@A\3"+
		"\2\2\2A\7\3\2\2\2BC\7\4\2\2CD\5\20\t\2D\t\3\2\2\2EF\7\5\2\2FG\5\20\t\2"+
		"G\13\3\2\2\2HI\7\6\2\2IJ\7\26\2\2JK\7\7\2\2KL\7\30\2\2L\r\3\2\2\2MN\7"+
		"\b\2\2NO\7\26\2\2O\17\3\2\2\2PQ\7\26\2\2QR\7\7\2\2RS\7\30\2\2S\21\3\2"+
		"\2\2TV\5\24\13\2UT\3\2\2\2VW\3\2\2\2WU\3\2\2\2WX\3\2\2\2X\23\3\2\2\2Y"+
		"[\5\60\31\2ZY\3\2\2\2Z[\3\2\2\2[\\\3\2\2\2\\]\7\26\2\2]b\7\t\2\2^a\5\36"+
		"\20\2_a\5\26\f\2`^\3\2\2\2`_\3\2\2\2ad\3\2\2\2b`\3\2\2\2bc\3\2\2\2ch\3"+
		"\2\2\2db\3\2\2\2eg\5 \21\2fe\3\2\2\2gj\3\2\2\2hf\3\2\2\2hi\3\2\2\2il\3"+
		"\2\2\2jh\3\2\2\2km\5\"\22\2lk\3\2\2\2mn\3\2\2\2nl\3\2\2\2no\3\2\2\2op"+
		"\3\2\2\2pq\7\n\2\2q\25\3\2\2\2rs\7\26\2\2sv\7\13\2\2tw\5\32\16\2uw\5\34"+
		"\17\2vt\3\2\2\2vu\3\2\2\2w|\3\2\2\2xy\7\f\2\2y{\5\30\r\2zx\3\2\2\2{~\3"+
		"\2\2\2|z\3\2\2\2|}\3\2\2\2}\27\3\2\2\2~|\3\2\2\2\177\u0082\5\32\16\2\u0080"+
		"\u0082\5\34\17\2\u0081\177\3\2\2\2\u0081\u0080\3\2\2\2\u0082\31\3\2\2"+
		"\2\u0083\u0084\7\31\2\2\u0084\33\3\2\2\2\u0085\u0086\7\26\2\2\u0086\35"+
		"\3\2\2\2\u0087\u0088\7\26\2\2\u0088\u0089\7\13\2\2\u0089\u008a\7\27\2"+
		"\2\u008a\37\3\2\2\2\u008b\u008c\7\r\2\2\u008c\u008d\5&\24\2\u008d\u008e"+
		"\7\16\2\2\u008e\u008f\7\26\2\2\u008f!\3\2\2\2\u0090\u0093\5.\30\2\u0091"+
		"\u0093\5$\23\2\u0092\u0090\3\2\2\2\u0092\u0091\3\2\2\2\u0093#\3\2\2\2"+
		"\u0094\u0095\7\17\2\2\u0095\u0096\7\30\2\2\u0096\u0097\7\25\2\2\u0097"+
		"\u0098\7\16\2\2\u0098\u0099\7\26\2\2\u0099%\3\2\2\2\u009a\u009e\5,\27"+
		"\2\u009b\u009e\5(\25\2\u009c\u009e\5*\26\2\u009d\u009a\3\2\2\2\u009d\u009b"+
		"\3\2\2\2\u009d\u009c\3\2\2\2\u009e\'\3\2\2\2\u009f\u00a0\7\26\2\2\u00a0"+
		"\u00a1\7\20\2\2\u00a1\u00a2\7\26\2\2\u00a2\u00a3\7\21\2\2\u00a3\u00a4"+
		"\7\27\2\2\u00a4)\3\2\2\2\u00a5\u00a6\7\26\2\2\u00a6\u00a7\7\22\2\2\u00a7"+
		"\u00a8\7\26\2\2\u00a8\u00a9\7\23\2\2\u00a9\u00aa\7\27\2\2\u00aa+\3\2\2"+
		"\2\u00ab\u00ac\7\26\2\2\u00ac\u00ad\7\23\2\2\u00ad\u00ae\7\27\2\2\u00ae"+
		"-\3\2\2\2\u00af\u00b0\5&\24\2\u00b0\u00b1\7\16\2\2\u00b1\u00b2\7\26\2"+
		"\2\u00b2/\3\2\2\2\u00b3\u00b4\7\24\2\2\u00b4\61\3\2\2\2\17>@WZ`bhnv|\u0081"+
		"\u0092\u009d";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}