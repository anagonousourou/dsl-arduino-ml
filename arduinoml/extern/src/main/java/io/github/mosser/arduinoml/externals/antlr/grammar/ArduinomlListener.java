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
	 * Enter a parse tree produced by {@link ArduinomlParser#exceptionDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterExceptionDeclaration(ArduinomlParser.ExceptionDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ArduinomlParser#exceptionDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitExceptionDeclaration(ArduinomlParser.ExceptionDeclarationContext ctx);
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
	 * Enter a parse tree produced by {@link ArduinomlParser#exceptionTransition}.
	 * @param ctx the parse tree
	 */
	void enterExceptionTransition(ArduinomlParser.ExceptionTransitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ArduinomlParser#exceptionTransition}.
	 * @param ctx the parse tree
	 */
	void exitExceptionTransition(ArduinomlParser.ExceptionTransitionContext ctx);
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
	 * Enter a parse tree produced by {@link ArduinomlParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterCondition(ArduinomlParser.ConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ArduinomlParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitCondition(ArduinomlParser.ConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ArduinomlParser#andCondition}.
	 * @param ctx the parse tree
	 */
	void enterAndCondition(ArduinomlParser.AndConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ArduinomlParser#andCondition}.
	 * @param ctx the parse tree
	 */
	void exitAndCondition(ArduinomlParser.AndConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ArduinomlParser#orCondition}.
	 * @param ctx the parse tree
	 */
	void enterOrCondition(ArduinomlParser.OrConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ArduinomlParser#orCondition}.
	 * @param ctx the parse tree
	 */
	void exitOrCondition(ArduinomlParser.OrConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ArduinomlParser#uniqCondition}.
	 * @param ctx the parse tree
	 */
	void enterUniqCondition(ArduinomlParser.UniqConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ArduinomlParser#uniqCondition}.
	 * @param ctx the parse tree
	 */
	void exitUniqCondition(ArduinomlParser.UniqConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ArduinomlParser#conditionTransition}.
	 * @param ctx the parse tree
	 */
	void enterConditionTransition(ArduinomlParser.ConditionTransitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ArduinomlParser#conditionTransition}.
	 * @param ctx the parse tree
	 */
	void exitConditionTransition(ArduinomlParser.ConditionTransitionContext ctx);
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
