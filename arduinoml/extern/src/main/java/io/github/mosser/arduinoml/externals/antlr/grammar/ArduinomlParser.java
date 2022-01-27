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
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, DURATION_UNIT=15, IDENTIFIER=16, 
		SIGNAL=17, INTEGER=18, NEWLINE=19, WS=20, COMMENT=21;
	public static final int
		RULE_root = 0, RULE_declaration = 1, RULE_bricks = 2, RULE_sensor = 3, 
		RULE_actuator = 4, RULE_location = 5, RULE_states = 6, RULE_state = 7, 
		RULE_action = 8, RULE_transition = 9, RULE_temporalTransition = 10, RULE_triggerTransition = 11, 
		RULE_conjunctionTriggerTransition = 12, RULE_disjunctionTriggerTransition = 13, 
		RULE_initial = 14;
	public static final String[] ruleNames = {
		"root", "declaration", "bricks", "sensor", "actuator", "location", "states", 
		"state", "action", "transition", "temporalTransition", "triggerTransition", 
		"conjunctionTriggerTransition", "disjunctionTriggerTransition", "initial"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'application'", "'sensor'", "'actuator'", "':'", "'{'", "'}'", 
		"'<='", "'after'", "'=>'", "'is'", "'and'", "'are'", "'or'", "'->'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, "DURATION_UNIT", "IDENTIFIER", "SIGNAL", "INTEGER", 
		"NEWLINE", "WS", "COMMENT"
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
			setState(30);
			declaration();
			setState(31);
			bricks();
			setState(32);
			states();
			setState(33);
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
			setState(35);
			match(T__0);
			setState(36);
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
			setState(40); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(40);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__1:
					{
					setState(38);
					sensor();
					}
					break;
				case T__2:
					{
					setState(39);
					actuator();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(42); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__1 || _la==T__2 );
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
			setState(44);
			match(T__1);
			setState(45);
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
	public static class PrinterContext extends ParserRuleContext {
		public LocationContext location() {
			return getRuleContext(LocationContext.class,0);
		}
		public PrinterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_actuator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArduinomlListener ) ((ArduinomlListener)listener).enterPrinter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArduinomlListener ) ((ArduinomlListener)listener).exitPrinter(this);
		}
	}

	public final ActuatorContext actuator() throws RecognitionException {
		ActuatorContext _localctx = new ActuatorContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_actuator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(47);
			match(T__2);
			setState(48);
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
		enterRule(_localctx, 10, RULE_location);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(50);
			((LocationContext)_localctx).id = match(IDENTIFIER);
			setState(51);
			match(T__3);
			setState(52);
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
		enterRule(_localctx, 12, RULE_states);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(55); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(54);
				state();
				}
				}
				setState(57); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__13 || _la==IDENTIFIER );
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
		enterRule(_localctx, 14, RULE_state);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(60);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__13) {
				{
				setState(59);
				initial();
				}
			}

			setState(62);
			((StateContext)_localctx).name = match(IDENTIFIER);
			setState(63);
			match(T__4);
			setState(65); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(64);
					action();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(67); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(70); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(69);
				transition();
				}
				}
				setState(72); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__7 || _la==IDENTIFIER );
			setState(74);
			match(T__5);
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

	public static class PrintContext extends ParserRuleContext {
		public Token receiver;
		public Token value;
		public TerminalNode IDENTIFIER() { return getToken(ArduinomlParser.IDENTIFIER, 0); }
		public TerminalNode SIGNAL() { return getToken(ArduinomlParser.SIGNAL, 0); }
		public PrintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_action; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArduinomlListener ) ((ArduinomlListener)listener).enterPrint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArduinomlListener ) ((ArduinomlListener)listener).exitPrint(this);
		}
	}

	public final ActionContext action() throws RecognitionException {
		ActionContext _localctx = new ActionContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_action);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(76);
			((ActionContext)_localctx).receiver = match(IDENTIFIER);
			setState(77);
			match(T__6);
			setState(78);
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

	public static class TransitionContext extends ParserRuleContext {
		public TemporalTransitionContext temporalTransition() {
			return getRuleContext(TemporalTransitionContext.class,0);
		}
		public TriggerTransitionContext triggerTransition() {
			return getRuleContext(TriggerTransitionContext.class,0);
		}
		public ConjunctionTriggerTransitionContext conjunctionTriggerTransition() {
			return getRuleContext(ConjunctionTriggerTransitionContext.class,0);
		}
		public DisjunctionTriggerTransitionContext disjunctionTriggerTransition() {
			return getRuleContext(DisjunctionTriggerTransitionContext.class,0);
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
		enterRule(_localctx, 18, RULE_transition);
		try {
			setState(84);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(80);
				temporalTransition();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(81);
				triggerTransition();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(82);
				conjunctionTriggerTransition();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(83);
				disjunctionTriggerTransition();
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
		enterRule(_localctx, 20, RULE_temporalTransition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(86);
			match(T__7);
			setState(87);
			((TemporalTransitionContext)_localctx).duration = match(INTEGER);
			setState(88);
			match(DURATION_UNIT);
			setState(89);
			match(T__8);
			setState(90);
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

	public static class TriggerTransitionContext extends ParserRuleContext {
		public Token trigger;
		public Token value;
		public Token next;
		public List<TerminalNode> IDENTIFIER() { return getTokens(ArduinomlParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(ArduinomlParser.IDENTIFIER, i);
		}
		public TerminalNode SIGNAL() { return getToken(ArduinomlParser.SIGNAL, 0); }
		public TriggerTransitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_triggerTransition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArduinomlListener ) ((ArduinomlListener)listener).enterTriggerTransition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArduinomlListener ) ((ArduinomlListener)listener).exitTriggerTransition(this);
		}
	}

	public final TriggerTransitionContext triggerTransition() throws RecognitionException {
		TriggerTransitionContext _localctx = new TriggerTransitionContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_triggerTransition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(92);
			((TriggerTransitionContext)_localctx).trigger = match(IDENTIFIER);
			setState(93);
			match(T__9);
			setState(94);
			((TriggerTransitionContext)_localctx).value = match(SIGNAL);
			setState(95);
			match(T__8);
			setState(96);
			((TriggerTransitionContext)_localctx).next = match(IDENTIFIER);
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

	public static class ConjunctionTriggerTransitionContext extends ParserRuleContext {
		public Token trigger1;
		public Token trigger2;
		public Token value;
		public Token next;
		public List<TerminalNode> IDENTIFIER() { return getTokens(ArduinomlParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(ArduinomlParser.IDENTIFIER, i);
		}
		public TerminalNode SIGNAL() { return getToken(ArduinomlParser.SIGNAL, 0); }
		public ConjunctionTriggerTransitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conjunctionTriggerTransition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArduinomlListener ) ((ArduinomlListener)listener).enterConjunctionTriggerTransition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArduinomlListener ) ((ArduinomlListener)listener).exitConjunctionTriggerTransition(this);
		}
	}

	public final ConjunctionTriggerTransitionContext conjunctionTriggerTransition() throws RecognitionException {
		ConjunctionTriggerTransitionContext _localctx = new ConjunctionTriggerTransitionContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_conjunctionTriggerTransition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(98);
			((ConjunctionTriggerTransitionContext)_localctx).trigger1 = match(IDENTIFIER);
			setState(99);
			match(T__10);
			setState(100);
			((ConjunctionTriggerTransitionContext)_localctx).trigger2 = match(IDENTIFIER);
			setState(101);
			match(T__11);
			setState(102);
			((ConjunctionTriggerTransitionContext)_localctx).value = match(SIGNAL);
			setState(103);
			match(T__8);
			setState(104);
			((ConjunctionTriggerTransitionContext)_localctx).next = match(IDENTIFIER);
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

	public static class DisjunctionTriggerTransitionContext extends ParserRuleContext {
		public Token trigger1;
		public Token trigger2;
		public Token value;
		public Token next;
		public List<TerminalNode> IDENTIFIER() { return getTokens(ArduinomlParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(ArduinomlParser.IDENTIFIER, i);
		}
		public TerminalNode SIGNAL() { return getToken(ArduinomlParser.SIGNAL, 0); }
		public DisjunctionTriggerTransitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_disjunctionTriggerTransition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArduinomlListener ) ((ArduinomlListener)listener).enterDisjunctionTriggerTransition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArduinomlListener ) ((ArduinomlListener)listener).exitDisjunctionTriggerTransition(this);
		}
	}

	public final DisjunctionTriggerTransitionContext disjunctionTriggerTransition() throws RecognitionException {
		DisjunctionTriggerTransitionContext _localctx = new DisjunctionTriggerTransitionContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_disjunctionTriggerTransition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(106);
			((DisjunctionTriggerTransitionContext)_localctx).trigger1 = match(IDENTIFIER);
			setState(107);
			match(T__12);
			setState(108);
			((DisjunctionTriggerTransitionContext)_localctx).trigger2 = match(IDENTIFIER);
			setState(109);
			match(T__9);
			setState(110);
			((DisjunctionTriggerTransitionContext)_localctx).value = match(SIGNAL);
			setState(111);
			match(T__8);
			setState(112);
			((DisjunctionTriggerTransitionContext)_localctx).next = match(IDENTIFIER);
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
		enterRule(_localctx, 28, RULE_initial);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(114);
			match(T__13);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\27w\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t\13\4"+
		"\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\3\2\3\2\3\2\3\2\3\2\3\3\3"+
		"\3\3\3\3\4\3\4\6\4+\n\4\r\4\16\4,\3\5\3\5\3\5\3\6\3\6\3\6\3\7\3\7\3\7"+
		"\3\7\3\b\6\b:\n\b\r\b\16\b;\3\t\5\t?\n\t\3\t\3\t\3\t\6\tD\n\t\r\t\16\t"+
		"E\3\t\6\tI\n\t\r\t\16\tJ\3\t\3\t\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\5"+
		"\13W\n\13\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3"+
		"\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3"+
		"\20\3\20\3\20\2\2\21\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36\2\2\2p\2 "+
		"\3\2\2\2\4%\3\2\2\2\6*\3\2\2\2\b.\3\2\2\2\n\61\3\2\2\2\f\64\3\2\2\2\16"+
		"9\3\2\2\2\20>\3\2\2\2\22N\3\2\2\2\24V\3\2\2\2\26X\3\2\2\2\30^\3\2\2\2"+
		"\32d\3\2\2\2\34l\3\2\2\2\36t\3\2\2\2 !\5\4\3\2!\"\5\6\4\2\"#\5\16\b\2"+
		"#$\7\2\2\3$\3\3\2\2\2%&\7\3\2\2&\'\7\22\2\2\'\5\3\2\2\2(+\5\b\5\2)+\5"+
		"\n\6\2*(\3\2\2\2*)\3\2\2\2+,\3\2\2\2,*\3\2\2\2,-\3\2\2\2-\7\3\2\2\2./"+
		"\7\4\2\2/\60\5\f\7\2\60\t\3\2\2\2\61\62\7\5\2\2\62\63\5\f\7\2\63\13\3"+
		"\2\2\2\64\65\7\22\2\2\65\66\7\6\2\2\66\67\7\24\2\2\67\r\3\2\2\28:\5\20"+
		"\t\298\3\2\2\2:;\3\2\2\2;9\3\2\2\2;<\3\2\2\2<\17\3\2\2\2=?\5\36\20\2>"+
		"=\3\2\2\2>?\3\2\2\2?@\3\2\2\2@A\7\22\2\2AC\7\7\2\2BD\5\22\n\2CB\3\2\2"+
		"\2DE\3\2\2\2EC\3\2\2\2EF\3\2\2\2FH\3\2\2\2GI\5\24\13\2HG\3\2\2\2IJ\3\2"+
		"\2\2JH\3\2\2\2JK\3\2\2\2KL\3\2\2\2LM\7\b\2\2M\21\3\2\2\2NO\7\22\2\2OP"+
		"\7\t\2\2PQ\7\23\2\2Q\23\3\2\2\2RW\5\26\f\2SW\5\30\r\2TW\5\32\16\2UW\5"+
		"\34\17\2VR\3\2\2\2VS\3\2\2\2VT\3\2\2\2VU\3\2\2\2W\25\3\2\2\2XY\7\n\2\2"+
		"YZ\7\24\2\2Z[\7\21\2\2[\\\7\13\2\2\\]\7\22\2\2]\27\3\2\2\2^_\7\22\2\2"+
		"_`\7\f\2\2`a\7\23\2\2ab\7\13\2\2bc\7\22\2\2c\31\3\2\2\2de\7\22\2\2ef\7"+
		"\r\2\2fg\7\22\2\2gh\7\16\2\2hi\7\23\2\2ij\7\13\2\2jk\7\22\2\2k\33\3\2"+
		"\2\2lm\7\22\2\2mn\7\17\2\2no\7\22\2\2op\7\f\2\2pq\7\23\2\2qr\7\13\2\2"+
		"rs\7\22\2\2s\35\3\2\2\2tu\7\20\2\2u\37\3\2\2\2\t*,;>EJV";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}