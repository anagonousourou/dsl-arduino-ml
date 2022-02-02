// Generated from io/github/mosser/arduinoml/externals/antlr/grammar/Arduinoml.g4 by ANTLR 4.7
package io.github.mosser.arduinoml.externals.antlr.grammar;
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
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, DURATION_UNIT=20, IDENTIFIER=21, SIGNAL=22, INTEGER=23, 
		STRING=24, NEWLINE=25, WS=26, COMMENT=27;
	public static final int
		RULE_root = 0, RULE_declaration = 1, RULE_bricks = 2, RULE_sensor = 3, 
		RULE_actuator = 4, RULE_exceptionDeclaration = 5, RULE_printer = 6, RULE_location = 7, 
		RULE_states = 8, RULE_state = 9, RULE_print = 10, RULE_printable = 11, 
		RULE_literalString = 12, RULE_brickToPrint = 13, RULE_action = 14, RULE_exceptionTransition = 15, 
		RULE_transition = 16, RULE_temporalTransition = 17, RULE_printTransition = 18, 
		RULE_condition = 19, RULE_andCondition = 20, RULE_orCondition = 21, RULE_uniqCondition = 22, 
		RULE_conditionTransition = 23, RULE_initial = 24;
	public static final String[] ruleNames = {
		"root", "declaration", "bricks", "sensor", "actuator", "exceptionDeclaration", 
		"printer", "location", "states", "state", "print", "printable", "literalString", 
		"brickToPrint", "action", "exceptionTransition", "transition", "temporalTransition", 
		"printTransition", "condition", "andCondition", "orCondition", "uniqCondition", 
		"conditionTransition", "initial"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'application'", "'sensor'", "'actuator'", "'exception'", "':'", 
		"'printer'", "'{'", "'}'", "'<='", "','", "'handle'", "'=>'", "'after'", 
		"'print'", "'and'", "'are'", "'or'", "'is'", "'->'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, "DURATION_UNIT", "IDENTIFIER", 
		"SIGNAL", "INTEGER", "STRING", "NEWLINE", "WS", "COMMENT"
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArduinomlListener ) ((ArduinomlListener)listener).enterRoot(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArduinomlListener ) ((ArduinomlListener)listener).exitRoot(this);
		}
	}

	public final RootContext root() throws RecognitionException {
		RootContext _localctx = new RootContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_root);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(50);
			declaration();
			setState(51);
			bricks();
			setState(52);
			states();
			setState(53);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArduinomlListener ) ((ArduinomlListener)listener).enterDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArduinomlListener ) ((ArduinomlListener)listener).exitDeclaration(this);
		}
	}

	public final DeclarationContext declaration() throws RecognitionException {
		DeclarationContext _localctx = new DeclarationContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(55);
			match(T__0);
			setState(56);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArduinomlListener ) ((ArduinomlListener)listener).enterBricks(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArduinomlListener ) ((ArduinomlListener)listener).exitBricks(this);
		}
	}

	public final BricksContext bricks() throws RecognitionException {
		BricksContext _localctx = new BricksContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_bricks);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(62); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(62);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__1:
					{
					setState(58);
					sensor();
					}
					break;
				case T__2:
					{
					setState(59);
					actuator();
					}
					break;
				case T__5:
					{
					setState(60);
					printer();
					}
					break;
				case T__3:
					{
					setState(61);
					exceptionDeclaration();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(64); 
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArduinomlListener ) ((ArduinomlListener)listener).enterSensor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArduinomlListener ) ((ArduinomlListener)listener).exitSensor(this);
		}
	}

	public final SensorContext sensor() throws RecognitionException {
		SensorContext _localctx = new SensorContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_sensor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(66);
			match(T__1);
			setState(67);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArduinomlListener ) ((ArduinomlListener)listener).enterActuator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArduinomlListener ) ((ArduinomlListener)listener).exitActuator(this);
		}
	}

	public final ActuatorContext actuator() throws RecognitionException {
		ActuatorContext _localctx = new ActuatorContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_actuator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(69);
			match(T__2);
			setState(70);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArduinomlListener ) ((ArduinomlListener)listener).enterExceptionDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArduinomlListener ) ((ArduinomlListener)listener).exitExceptionDeclaration(this);
		}
	}

	public final ExceptionDeclarationContext exceptionDeclaration() throws RecognitionException {
		ExceptionDeclarationContext _localctx = new ExceptionDeclarationContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_exceptionDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(72);
			match(T__3);
			setState(73);
			((ExceptionDeclarationContext)_localctx).name = match(IDENTIFIER);
			setState(74);
			match(T__4);
			setState(75);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArduinomlListener ) ((ArduinomlListener)listener).enterPrinter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArduinomlListener ) ((ArduinomlListener)listener).exitPrinter(this);
		}
	}

	public final PrinterContext printer() throws RecognitionException {
		PrinterContext _localctx = new PrinterContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_printer);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(77);
			match(T__5);
			setState(78);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArduinomlListener ) ((ArduinomlListener)listener).enterLocation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArduinomlListener ) ((ArduinomlListener)listener).exitLocation(this);
		}
	}

	public final LocationContext location() throws RecognitionException {
		LocationContext _localctx = new LocationContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_location);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(80);
			((LocationContext)_localctx).id = match(IDENTIFIER);
			setState(81);
			match(T__4);
			setState(82);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArduinomlListener ) ((ArduinomlListener)listener).enterStates(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArduinomlListener ) ((ArduinomlListener)listener).exitStates(this);
		}
	}

	public final StatesContext states() throws RecognitionException {
		StatesContext _localctx = new StatesContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_states);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(85); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(84);
				state();
				}
				}
				setState(87); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__18 || _la==IDENTIFIER );
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArduinomlListener ) ((ArduinomlListener)listener).enterState(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArduinomlListener ) ((ArduinomlListener)listener).exitState(this);
		}
	}

	public final StateContext state() throws RecognitionException {
		StateContext _localctx = new StateContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_state);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(90);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__18) {
				{
				setState(89);
				initial();
				}
			}

			setState(92);
			((StateContext)_localctx).name = match(IDENTIFIER);
			setState(93);
			match(T__6);
			setState(98);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(96);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
					case 1:
						{
						setState(94);
						action();
						}
						break;
					case 2:
						{
						setState(95);
						print();
						}
						break;
					}
					} 
				}
				setState(100);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			}
			setState(104);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__10) {
				{
				{
				setState(101);
				exceptionTransition();
				}
				}
				setState(106);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(108); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(107);
				transition();
				}
				}
				setState(110); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__12) | (1L << T__13) | (1L << IDENTIFIER))) != 0) );
			setState(112);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArduinomlListener ) ((ArduinomlListener)listener).enterPrint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArduinomlListener ) ((ArduinomlListener)listener).exitPrint(this);
		}
	}

	public final PrintContext print() throws RecognitionException {
		PrintContext _localctx = new PrintContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_print);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(114);
			((PrintContext)_localctx).receiver = match(IDENTIFIER);
			setState(115);
			match(T__8);
			setState(118);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STRING:
				{
				setState(116);
				literalString();
				}
				break;
			case IDENTIFIER:
				{
				setState(117);
				brickToPrint();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(124);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__9) {
				{
				{
				setState(120);
				match(T__9);
				setState(121);
				printable();
				}
				}
				setState(126);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArduinomlListener ) ((ArduinomlListener)listener).enterPrintable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArduinomlListener ) ((ArduinomlListener)listener).exitPrintable(this);
		}
	}

	public final PrintableContext printable() throws RecognitionException {
		PrintableContext _localctx = new PrintableContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_printable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(129);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STRING:
				{
				setState(127);
				literalString();
				}
				break;
			case IDENTIFIER:
				{
				setState(128);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArduinomlListener ) ((ArduinomlListener)listener).enterLiteralString(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArduinomlListener ) ((ArduinomlListener)listener).exitLiteralString(this);
		}
	}

	public final LiteralStringContext literalString() throws RecognitionException {
		LiteralStringContext _localctx = new LiteralStringContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_literalString);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(131);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArduinomlListener ) ((ArduinomlListener)listener).enterBrickToPrint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArduinomlListener ) ((ArduinomlListener)listener).exitBrickToPrint(this);
		}
	}

	public final BrickToPrintContext brickToPrint() throws RecognitionException {
		BrickToPrintContext _localctx = new BrickToPrintContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_brickToPrint);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(133);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArduinomlListener ) ((ArduinomlListener)listener).enterAction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArduinomlListener ) ((ArduinomlListener)listener).exitAction(this);
		}
	}

	public final ActionContext action() throws RecognitionException {
		ActionContext _localctx = new ActionContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_action);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(135);
			((ActionContext)_localctx).receiver = match(IDENTIFIER);
			setState(136);
			match(T__8);
			setState(137);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArduinomlListener ) ((ArduinomlListener)listener).enterExceptionTransition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArduinomlListener ) ((ArduinomlListener)listener).exitExceptionTransition(this);
		}
	}

	public final ExceptionTransitionContext exceptionTransition() throws RecognitionException {
		ExceptionTransitionContext _localctx = new ExceptionTransitionContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_exceptionTransition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(139);
			match(T__10);
			setState(140);
			condition();
			setState(141);
			match(T__11);
			setState(142);
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
		public PrintTransitionContext printTransition() {
			return getRuleContext(PrintTransitionContext.class,0);
		}
		public TransitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_transition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArduinomlListener ) ((ArduinomlListener)listener).enterTransition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArduinomlListener ) ((ArduinomlListener)listener).exitTransition(this);
		}
	}

	public final TransitionContext transition() throws RecognitionException {
		TransitionContext _localctx = new TransitionContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_transition);
		try {
			setState(147);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(144);
				conditionTransition();
				}
				break;
			case T__12:
				enterOuterAlt(_localctx, 2);
				{
				setState(145);
				temporalTransition();
				}
				break;
			case T__13:
				enterOuterAlt(_localctx, 3);
				{
				setState(146);
				printTransition();
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArduinomlListener ) ((ArduinomlListener)listener).enterTemporalTransition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArduinomlListener ) ((ArduinomlListener)listener).exitTemporalTransition(this);
		}
	}

	public final TemporalTransitionContext temporalTransition() throws RecognitionException {
		TemporalTransitionContext _localctx = new TemporalTransitionContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_temporalTransition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(149);
			match(T__12);
			setState(150);
			((TemporalTransitionContext)_localctx).duration = match(INTEGER);
			setState(151);
			match(DURATION_UNIT);
			setState(152);
			match(T__11);
			setState(153);
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

	public static class PrintTransitionContext extends ParserRuleContext {
		public Token string;
		public TerminalNode IDENTIFIER() { return getToken(ArduinomlParser.IDENTIFIER, 0); }
		public PrintTransitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_printTransition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArduinomlListener ) ((ArduinomlListener)listener).enterPrintTransition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArduinomlListener ) ((ArduinomlListener)listener).exitPrintTransition(this);
		}
	}

	public final PrintTransitionContext printTransition() throws RecognitionException {
		PrintTransitionContext _localctx = new PrintTransitionContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_printTransition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(155);
			match(T__13);
			setState(156);
			((PrintTransitionContext)_localctx).string = match(IDENTIFIER);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArduinomlListener ) ((ArduinomlListener)listener).enterCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArduinomlListener ) ((ArduinomlListener)listener).exitCondition(this);
		}
	}

	public final ConditionContext condition() throws RecognitionException {
		ConditionContext _localctx = new ConditionContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_condition);
		try {
			setState(161);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(158);
				uniqCondition();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(159);
				andCondition();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(160);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArduinomlListener ) ((ArduinomlListener)listener).enterAndCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArduinomlListener ) ((ArduinomlListener)listener).exitAndCondition(this);
		}
	}

	public final AndConditionContext andCondition() throws RecognitionException {
		AndConditionContext _localctx = new AndConditionContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_andCondition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(163);
			((AndConditionContext)_localctx).trigger1 = match(IDENTIFIER);
			setState(164);
			match(T__14);
			setState(165);
			((AndConditionContext)_localctx).trigger2 = match(IDENTIFIER);
			setState(166);
			match(T__15);
			setState(167);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArduinomlListener ) ((ArduinomlListener)listener).enterOrCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArduinomlListener ) ((ArduinomlListener)listener).exitOrCondition(this);
		}
	}

	public final OrConditionContext orCondition() throws RecognitionException {
		OrConditionContext _localctx = new OrConditionContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_orCondition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(169);
			((OrConditionContext)_localctx).trigger1 = match(IDENTIFIER);
			setState(170);
			match(T__16);
			setState(171);
			((OrConditionContext)_localctx).trigger2 = match(IDENTIFIER);
			setState(172);
			match(T__17);
			setState(173);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArduinomlListener ) ((ArduinomlListener)listener).enterUniqCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArduinomlListener ) ((ArduinomlListener)listener).exitUniqCondition(this);
		}
	}

	public final UniqConditionContext uniqCondition() throws RecognitionException {
		UniqConditionContext _localctx = new UniqConditionContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_uniqCondition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(175);
			((UniqConditionContext)_localctx).trigger = match(IDENTIFIER);
			setState(176);
			match(T__17);
			setState(177);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArduinomlListener ) ((ArduinomlListener)listener).enterConditionTransition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArduinomlListener ) ((ArduinomlListener)listener).exitConditionTransition(this);
		}
	}

	public final ConditionTransitionContext conditionTransition() throws RecognitionException {
		ConditionTransitionContext _localctx = new ConditionTransitionContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_conditionTransition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(179);
			condition();
			setState(180);
			match(T__11);
			setState(181);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArduinomlListener ) ((ArduinomlListener)listener).enterInitial(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArduinomlListener ) ((ArduinomlListener)listener).exitInitial(this);
		}
	}

	public final InitialContext initial() throws RecognitionException {
		InitialContext _localctx = new InitialContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_initial);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(183);
			match(T__18);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\35\u00bc\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\4\3\4\3\4\3\4\6\4A\n\4\r"+
		"\4\16\4B\3\5\3\5\3\5\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\t\3"+
		"\t\3\t\3\t\3\n\6\nX\n\n\r\n\16\nY\3\13\5\13]\n\13\3\13\3\13\3\13\3\13"+
		"\7\13c\n\13\f\13\16\13f\13\13\3\13\7\13i\n\13\f\13\16\13l\13\13\3\13\6"+
		"\13o\n\13\r\13\16\13p\3\13\3\13\3\f\3\f\3\f\3\f\5\fy\n\f\3\f\3\f\7\f}"+
		"\n\f\f\f\16\f\u0080\13\f\3\r\3\r\5\r\u0084\n\r\3\16\3\16\3\17\3\17\3\20"+
		"\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\5\22\u0096\n\22"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\25\3\25\3\25\5\25\u00a4"+
		"\n\25\3\26\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\27\3\30"+
		"\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\32\3\32\3\32\2\2\33\2\4\6\b\n\f"+
		"\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\2\2\2\u00b3\2\64\3\2\2\2\4"+
		"9\3\2\2\2\6@\3\2\2\2\bD\3\2\2\2\nG\3\2\2\2\fJ\3\2\2\2\16O\3\2\2\2\20R"+
		"\3\2\2\2\22W\3\2\2\2\24\\\3\2\2\2\26t\3\2\2\2\30\u0083\3\2\2\2\32\u0085"+
		"\3\2\2\2\34\u0087\3\2\2\2\36\u0089\3\2\2\2 \u008d\3\2\2\2\"\u0095\3\2"+
		"\2\2$\u0097\3\2\2\2&\u009d\3\2\2\2(\u00a3\3\2\2\2*\u00a5\3\2\2\2,\u00ab"+
		"\3\2\2\2.\u00b1\3\2\2\2\60\u00b5\3\2\2\2\62\u00b9\3\2\2\2\64\65\5\4\3"+
		"\2\65\66\5\6\4\2\66\67\5\22\n\2\678\7\2\2\38\3\3\2\2\29:\7\3\2\2:;\7\27"+
		"\2\2;\5\3\2\2\2<A\5\b\5\2=A\5\n\6\2>A\5\16\b\2?A\5\f\7\2@<\3\2\2\2@=\3"+
		"\2\2\2@>\3\2\2\2@?\3\2\2\2AB\3\2\2\2B@\3\2\2\2BC\3\2\2\2C\7\3\2\2\2DE"+
		"\7\4\2\2EF\5\20\t\2F\t\3\2\2\2GH\7\5\2\2HI\5\20\t\2I\13\3\2\2\2JK\7\6"+
		"\2\2KL\7\27\2\2LM\7\7\2\2MN\7\31\2\2N\r\3\2\2\2OP\7\b\2\2PQ\7\27\2\2Q"+
		"\17\3\2\2\2RS\7\27\2\2ST\7\7\2\2TU\7\31\2\2U\21\3\2\2\2VX\5\24\13\2WV"+
		"\3\2\2\2XY\3\2\2\2YW\3\2\2\2YZ\3\2\2\2Z\23\3\2\2\2[]\5\62\32\2\\[\3\2"+
		"\2\2\\]\3\2\2\2]^\3\2\2\2^_\7\27\2\2_d\7\t\2\2`c\5\36\20\2ac\5\26\f\2"+
		"b`\3\2\2\2ba\3\2\2\2cf\3\2\2\2db\3\2\2\2de\3\2\2\2ej\3\2\2\2fd\3\2\2\2"+
		"gi\5 \21\2hg\3\2\2\2il\3\2\2\2jh\3\2\2\2jk\3\2\2\2kn\3\2\2\2lj\3\2\2\2"+
		"mo\5\"\22\2nm\3\2\2\2op\3\2\2\2pn\3\2\2\2pq\3\2\2\2qr\3\2\2\2rs\7\n\2"+
		"\2s\25\3\2\2\2tu\7\27\2\2ux\7\13\2\2vy\5\32\16\2wy\5\34\17\2xv\3\2\2\2"+
		"xw\3\2\2\2y~\3\2\2\2z{\7\f\2\2{}\5\30\r\2|z\3\2\2\2}\u0080\3\2\2\2~|\3"+
		"\2\2\2~\177\3\2\2\2\177\27\3\2\2\2\u0080~\3\2\2\2\u0081\u0084\5\32\16"+
		"\2\u0082\u0084\5\34\17\2\u0083\u0081\3\2\2\2\u0083\u0082\3\2\2\2\u0084"+
		"\31\3\2\2\2\u0085\u0086\7\32\2\2\u0086\33\3\2\2\2\u0087\u0088\7\27\2\2"+
		"\u0088\35\3\2\2\2\u0089\u008a\7\27\2\2\u008a\u008b\7\13\2\2\u008b\u008c"+
		"\7\30\2\2\u008c\37\3\2\2\2\u008d\u008e\7\r\2\2\u008e\u008f\5(\25\2\u008f"+
		"\u0090\7\16\2\2\u0090\u0091\7\27\2\2\u0091!\3\2\2\2\u0092\u0096\5\60\31"+
		"\2\u0093\u0096\5$\23\2\u0094\u0096\5&\24\2\u0095\u0092\3\2\2\2\u0095\u0093"+
		"\3\2\2\2\u0095\u0094\3\2\2\2\u0096#\3\2\2\2\u0097\u0098\7\17\2\2\u0098"+
		"\u0099\7\31\2\2\u0099\u009a\7\26\2\2\u009a\u009b\7\16\2\2\u009b\u009c"+
		"\7\27\2\2\u009c%\3\2\2\2\u009d\u009e\7\20\2\2\u009e\u009f\7\27\2\2\u009f"+
		"\'\3\2\2\2\u00a0\u00a4\5.\30\2\u00a1\u00a4\5*\26\2\u00a2\u00a4\5,\27\2"+
		"\u00a3\u00a0\3\2\2\2\u00a3\u00a1\3\2\2\2\u00a3\u00a2\3\2\2\2\u00a4)\3"+
		"\2\2\2\u00a5\u00a6\7\27\2\2\u00a6\u00a7\7\21\2\2\u00a7\u00a8\7\27\2\2"+
		"\u00a8\u00a9\7\22\2\2\u00a9\u00aa\7\30\2\2\u00aa+\3\2\2\2\u00ab\u00ac"+
		"\7\27\2\2\u00ac\u00ad\7\23\2\2\u00ad\u00ae\7\27\2\2\u00ae\u00af\7\24\2"+
		"\2\u00af\u00b0\7\30\2\2\u00b0-\3\2\2\2\u00b1\u00b2\7\27\2\2\u00b2\u00b3"+
		"\7\24\2\2\u00b3\u00b4\7\30\2\2\u00b4/\3\2\2\2\u00b5\u00b6\5(\25\2\u00b6"+
		"\u00b7\7\16\2\2\u00b7\u00b8\7\27\2\2\u00b8\61\3\2\2\2\u00b9\u00ba\7\25"+
		"\2\2\u00ba\63\3\2\2\2\17@BY\\bdjpx~\u0083\u0095\u00a3";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}