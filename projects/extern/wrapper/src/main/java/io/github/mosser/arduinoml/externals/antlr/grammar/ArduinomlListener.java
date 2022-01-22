// Generated from io/github/mosser/arduinoml/externals/antlr/grammar/Arduinoml.g4 by ANTLR 4.7
package io.github.mosser.arduinoml.externals.antlr.grammar;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ArduinomlParser}.
 */
public interface ArduinomlListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ArduinomlParser#root}.
	 * @param ctx the parse tree
	 */
	void enterRoot(ArduinomlParser.RootContext ctx);
	/**
	 * Exit a parse tree produced by {@link ArduinomlParser#root}.
	 * @param ctx the parse tree
	 */
	void exitRoot(ArduinomlParser.RootContext ctx);
	/**
	 * Enter a parse tree produced by {@link ArduinomlParser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterDeclaration(ArduinomlParser.DeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ArduinomlParser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitDeclaration(ArduinomlParser.DeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link ArduinomlParser#bricks}.
	 * @param ctx the parse tree
	 */
	void enterBricks(ArduinomlParser.BricksContext ctx);
	/**
	 * Exit a parse tree produced by {@link ArduinomlParser#bricks}.
	 * @param ctx the parse tree
	 */
	void exitBricks(ArduinomlParser.BricksContext ctx);
	/**
	 * Enter a parse tree produced by {@link ArduinomlParser#sensor}.
	 * @param ctx the parse tree
	 */
	void enterSensor(ArduinomlParser.SensorContext ctx);
	/**
	 * Exit a parse tree produced by {@link ArduinomlParser#sensor}.
	 * @param ctx the parse tree
	 */
	void exitSensor(ArduinomlParser.SensorContext ctx);
	/**
	 * Enter a parse tree produced by {@link ArduinomlParser#actuator}.
	 * @param ctx the parse tree
	 */
	void enterActuator(ArduinomlParser.ActuatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link ArduinomlParser#actuator}.
	 * @param ctx the parse tree
	 */
	void exitActuator(ArduinomlParser.ActuatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link ArduinomlParser#location}.
	 * @param ctx the parse tree
	 */
	void enterLocation(ArduinomlParser.LocationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ArduinomlParser#location}.
	 * @param ctx the parse tree
	 */
	void exitLocation(ArduinomlParser.LocationContext ctx);
	/**
	 * Enter a parse tree produced by {@link ArduinomlParser#states}.
	 * @param ctx the parse tree
	 */
	void enterStates(ArduinomlParser.StatesContext ctx);
	/**
	 * Exit a parse tree produced by {@link ArduinomlParser#states}.
	 * @param ctx the parse tree
	 */
	void exitStates(ArduinomlParser.StatesContext ctx);
	/**
	 * Enter a parse tree produced by {@link ArduinomlParser#state}.
	 * @param ctx the parse tree
	 */
	void enterState(ArduinomlParser.StateContext ctx);
	/**
	 * Exit a parse tree produced by {@link ArduinomlParser#state}.
	 * @param ctx the parse tree
	 */
	void exitState(ArduinomlParser.StateContext ctx);
	/**
	 * Enter a parse tree produced by {@link ArduinomlParser#action}.
	 * @param ctx the parse tree
	 */
	void enterAction(ArduinomlParser.ActionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ArduinomlParser#action}.
	 * @param ctx the parse tree
	 */
	void exitAction(ArduinomlParser.ActionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ArduinomlParser#transition}.
	 * @param ctx the parse tree
	 */
	void enterTransition(ArduinomlParser.TransitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ArduinomlParser#transition}.
	 * @param ctx the parse tree
	 */
	void exitTransition(ArduinomlParser.TransitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ArduinomlParser#temporalTransition}.
	 * @param ctx the parse tree
	 */
	void enterTemporalTransition(ArduinomlParser.TemporalTransitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ArduinomlParser#temporalTransition}.
	 * @param ctx the parse tree
	 */
	void exitTemporalTransition(ArduinomlParser.TemporalTransitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ArduinomlParser#triggerTransition}.
	 * @param ctx the parse tree
	 */
	void enterTriggerTransition(ArduinomlParser.TriggerTransitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ArduinomlParser#triggerTransition}.
	 * @param ctx the parse tree
	 */
	void exitTriggerTransition(ArduinomlParser.TriggerTransitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ArduinomlParser#conjunctionTriggerTransition}.
	 * @param ctx the parse tree
	 */
	void enterConjunctionTriggerTransition(ArduinomlParser.ConjunctionTriggerTransitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ArduinomlParser#conjunctionTriggerTransition}.
	 * @param ctx the parse tree
	 */
	void exitConjunctionTriggerTransition(ArduinomlParser.ConjunctionTriggerTransitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ArduinomlParser#disjunctionTriggerTransition}.
	 * @param ctx the parse tree
	 */
	void enterDisjunctionTriggerTransition(ArduinomlParser.DisjunctionTriggerTransitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ArduinomlParser#disjunctionTriggerTransition}.
	 * @param ctx the parse tree
	 */
	void exitDisjunctionTriggerTransition(ArduinomlParser.DisjunctionTriggerTransitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ArduinomlParser#initial}.
	 * @param ctx the parse tree
	 */
	void enterInitial(ArduinomlParser.InitialContext ctx);
	/**
	 * Exit a parse tree produced by {@link ArduinomlParser#initial}.
	 * @param ctx the parse tree
	 */
	void exitInitial(ArduinomlParser.InitialContext ctx);
}