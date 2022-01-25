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
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, DURATION_UNIT=17, 
		IDENTIFIER=18, SIGNAL=19, INTEGER=20, NEWLINE=21, WS=22, COMMENT=23;
	public static final int
		RULE_root = 0, RULE_declaration = 1, RULE_bricks = 2, RULE_sensor = 3, 
		RULE_actuator = 4, RULE_exceptionDeclaration = 5, RULE_location = 6, RULE_states = 7, 
		RULE_state = 8, RULE_action = 9, RULE_exceptionTransition = 10, RULE_transition = 11, 
		RULE_temporalTransition = 12, RULE_condition = 13, RULE_andCondition = 14, 
		RULE_orCondition = 15, RULE_uniqCondition = 16, RULE_conditionTransition = 17, 
		RULE_initial = 18;
	private static String[] makeRuleNames() {
		return new String[] {
			"root", "declaration", "bricks", "sensor", "actuator", "exceptionDeclaration", 
			"location", "states", "state", "action", "exceptionTransition", "transition", 
			"temporalTransition", "condition", "andCondition", "orCondition", "uniqCondition", 
			"conditionTransition", "initial"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'application'", "'sensor'", "'actuator'", "'exception'", "':'", 
			"'{'", "'}'", "'<='", "'handle'", "'=>'", "'after'", "'and'", "'are'", 
			"'or'", "'is'", "'->'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, "DURATION_UNIT", "IDENTIFIER", "SIGNAL", 
			"INTEGER", "NEWLINE", "WS", "COMMENT"
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
			setState(38);
			declaration();
			setState(39);
			bricks();
			setState(40);
			states();
			setState(41);
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
			setState(43);
			match(T__0);
			setState(44);
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
			setState(49); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(49);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__1:
					{
					setState(46);
					sensor();
					}
					break;
				case T__2:
					{
					setState(47);
					actuator();
					}
					break;
				case T__3:
					{
					setState(48);
					exceptionDeclaration();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(51); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__2) | (1L << T__3))) != 0) );
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
			setState(53);
			match(T__1);
			setState(54);
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
			setState(56);
			match(T__2);
			setState(57);
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
			setState(59);
			match(T__3);
			setState(60);
			((ExceptionDeclarationContext)_localctx).name = match(IDENTIFIER);
			setState(61);
			match(T__4);
			setState(62);
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
		enterRule(_localctx, 12, RULE_location);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(64);
			((LocationContext)_localctx).id = match(IDENTIFIER);
			setState(65);
			match(T__4);
			setState(66);
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
		enterRule(_localctx, 14, RULE_states);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(69); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(68);
				state();
				}
				}
				setState(71); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__15 || _la==IDENTIFIER );
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
		public List<ExceptionTransitionContext> exceptionTransition() {
			return getRuleContexts(ExceptionTransitionContext.class);
		}
		public ExceptionTransitionContext exceptionTransition(int i) {
			return getRuleContext(ExceptionTransitionContext.class,i);
		}
		public StateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_state; }
	}

	public final StateContext state() throws RecognitionException {
		StateContext _localctx = new StateContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_state);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(74);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__15) {
				{
				setState(73);
				initial();
				}
			}

			setState(76);
			((StateContext)_localctx).name = match(IDENTIFIER);
			setState(77);
			match(T__5);
			setState(79); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(78);
					action();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(81); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(84); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(83);
				transition();
				}
				}
				setState(86); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__10 || _la==IDENTIFIER );
			setState(91);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__8) {
				{
				{
				setState(88);
				exceptionTransition();
				}
				}
				setState(93);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(94);
			match(T__6);
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
		enterRule(_localctx, 18, RULE_action);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(96);
			((ActionContext)_localctx).receiver = match(IDENTIFIER);
			setState(97);
			match(T__7);
			setState(98);
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
		enterRule(_localctx, 20, RULE_exceptionTransition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(100);
			match(T__8);
			setState(101);
			condition();
			setState(102);
			match(T__9);
			setState(103);
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
		enterRule(_localctx, 22, RULE_transition);
		try {
			setState(107);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(105);
				conditionTransition();
				}
				break;
			case T__10:
				enterOuterAlt(_localctx, 2);
				{
				setState(106);
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
		enterRule(_localctx, 24, RULE_temporalTransition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(109);
			match(T__10);
			setState(110);
			((TemporalTransitionContext)_localctx).duration = match(INTEGER);
			setState(111);
			match(DURATION_UNIT);
			setState(112);
			match(T__9);
			setState(113);
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
		enterRule(_localctx, 26, RULE_condition);
		try {
			setState(118);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(115);
				uniqCondition();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(116);
				andCondition();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(117);
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
		enterRule(_localctx, 28, RULE_andCondition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(120);
			((AndConditionContext)_localctx).trigger1 = match(IDENTIFIER);
			setState(121);
			match(T__11);
			setState(122);
			((AndConditionContext)_localctx).trigger2 = match(IDENTIFIER);
			setState(123);
			match(T__12);
			setState(124);
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
		enterRule(_localctx, 30, RULE_orCondition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(126);
			((OrConditionContext)_localctx).trigger1 = match(IDENTIFIER);
			setState(127);
			match(T__13);
			setState(128);
			((OrConditionContext)_localctx).trigger2 = match(IDENTIFIER);
			setState(129);
			match(T__14);
			setState(130);
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
		enterRule(_localctx, 32, RULE_uniqCondition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(132);
			((UniqConditionContext)_localctx).trigger = match(IDENTIFIER);
			setState(133);
			match(T__14);
			setState(134);
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
		enterRule(_localctx, 34, RULE_conditionTransition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(136);
			condition();
			setState(137);
			match(T__9);
			setState(138);
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
		enterRule(_localctx, 36, RULE_initial);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(140);
			match(T__15);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\31\u0091\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\4\3\4\3\4\6\4\64"+
		"\n\4\r\4\16\4\65\3\5\3\5\3\5\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3"+
		"\b\3\b\3\t\6\tH\n\t\r\t\16\tI\3\n\5\nM\n\n\3\n\3\n\3\n\6\nR\n\n\r\n\16"+
		"\nS\3\n\6\nW\n\n\r\n\16\nX\3\n\7\n\\\n\n\f\n\16\n_\13\n\3\n\3\n\3\13\3"+
		"\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\r\3\r\5\rn\n\r\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\17\3\17\3\17\5\17y\n\17\3\20\3\20\3\20\3\20\3\20\3\20\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\24"+
		"\3\24\3\24\2\2\25\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&\2\2\2\u0088"+
		"\2(\3\2\2\2\4-\3\2\2\2\6\63\3\2\2\2\b\67\3\2\2\2\n:\3\2\2\2\f=\3\2\2\2"+
		"\16B\3\2\2\2\20G\3\2\2\2\22L\3\2\2\2\24b\3\2\2\2\26f\3\2\2\2\30m\3\2\2"+
		"\2\32o\3\2\2\2\34x\3\2\2\2\36z\3\2\2\2 \u0080\3\2\2\2\"\u0086\3\2\2\2"+
		"$\u008a\3\2\2\2&\u008e\3\2\2\2()\5\4\3\2)*\5\6\4\2*+\5\20\t\2+,\7\2\2"+
		"\3,\3\3\2\2\2-.\7\3\2\2./\7\24\2\2/\5\3\2\2\2\60\64\5\b\5\2\61\64\5\n"+
		"\6\2\62\64\5\f\7\2\63\60\3\2\2\2\63\61\3\2\2\2\63\62\3\2\2\2\64\65\3\2"+
		"\2\2\65\63\3\2\2\2\65\66\3\2\2\2\66\7\3\2\2\2\678\7\4\2\289\5\16\b\29"+
		"\t\3\2\2\2:;\7\5\2\2;<\5\16\b\2<\13\3\2\2\2=>\7\6\2\2>?\7\24\2\2?@\7\7"+
		"\2\2@A\7\26\2\2A\r\3\2\2\2BC\7\24\2\2CD\7\7\2\2DE\7\26\2\2E\17\3\2\2\2"+
		"FH\5\22\n\2GF\3\2\2\2HI\3\2\2\2IG\3\2\2\2IJ\3\2\2\2J\21\3\2\2\2KM\5&\24"+
		"\2LK\3\2\2\2LM\3\2\2\2MN\3\2\2\2NO\7\24\2\2OQ\7\b\2\2PR\5\24\13\2QP\3"+
		"\2\2\2RS\3\2\2\2SQ\3\2\2\2ST\3\2\2\2TV\3\2\2\2UW\5\30\r\2VU\3\2\2\2WX"+
		"\3\2\2\2XV\3\2\2\2XY\3\2\2\2Y]\3\2\2\2Z\\\5\26\f\2[Z\3\2\2\2\\_\3\2\2"+
		"\2][\3\2\2\2]^\3\2\2\2^`\3\2\2\2_]\3\2\2\2`a\7\t\2\2a\23\3\2\2\2bc\7\24"+
		"\2\2cd\7\n\2\2de\7\25\2\2e\25\3\2\2\2fg\7\13\2\2gh\5\34\17\2hi\7\f\2\2"+
		"ij\7\24\2\2j\27\3\2\2\2kn\5$\23\2ln\5\32\16\2mk\3\2\2\2ml\3\2\2\2n\31"+
		"\3\2\2\2op\7\r\2\2pq\7\26\2\2qr\7\23\2\2rs\7\f\2\2st\7\24\2\2t\33\3\2"+
		"\2\2uy\5\"\22\2vy\5\36\20\2wy\5 \21\2xu\3\2\2\2xv\3\2\2\2xw\3\2\2\2y\35"+
		"\3\2\2\2z{\7\24\2\2{|\7\16\2\2|}\7\24\2\2}~\7\17\2\2~\177\7\25\2\2\177"+
		"\37\3\2\2\2\u0080\u0081\7\24\2\2\u0081\u0082\7\20\2\2\u0082\u0083\7\24"+
		"\2\2\u0083\u0084\7\21\2\2\u0084\u0085\7\25\2\2\u0085!\3\2\2\2\u0086\u0087"+
		"\7\24\2\2\u0087\u0088\7\21\2\2\u0088\u0089\7\25\2\2\u0089#\3\2\2\2\u008a"+
		"\u008b\5\34\17\2\u008b\u008c\7\f\2\2\u008c\u008d\7\24\2\2\u008d%\3\2\2"+
		"\2\u008e\u008f\7\22\2\2\u008f\'\3\2\2\2\13\63\65ILSX]mx";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}