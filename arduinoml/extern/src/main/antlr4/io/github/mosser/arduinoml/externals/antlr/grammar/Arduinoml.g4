grammar Arduinoml;

/******************
 * * Parser rules ** ****************
 */

root: declaration bricks states EOF;

declaration: 'application' name = IDENTIFIER;

bricks: (sensor | actuator | exceptionDeclaration)+;
sensor: 'sensor' location;
actuator: 'actuator' location;
exceptionDeclaration:
	'exception' name = IDENTIFIER ':' code = INTEGER;

location: id = IDENTIFIER ':' port = INTEGER;

states: state+;
state:
	initial? name = IDENTIFIER '{' action+  exceptionTransition* transition+ '}';
action: receiver = IDENTIFIER '<=' value = SIGNAL;

exceptionTransition: 'handle' condition '=>' next = IDENTIFIER;
transition: conditionTransition | temporalTransition;
temporalTransition:
	'after' duration = INTEGER DURATION_UNIT '=>' next = IDENTIFIER;
condition: uniqCondition | andCondition | orCondition;
andCondition:
	trigger1 = IDENTIFIER 'and' trigger2 = IDENTIFIER 'are' value = SIGNAL;
orCondition:
	trigger1 = IDENTIFIER 'or' trigger2 = IDENTIFIER 'is' value = SIGNAL;
uniqCondition: trigger = IDENTIFIER 'is' value = SIGNAL;
conditionTransition: condition '=>' next = IDENTIFIER;
initial: '->';

/*****************
 * * Lexer rules ** ***************
 */

DURATION_UNIT: 'milliseconds' | 'millisecond';
IDENTIFIER: LOWERCASE (LOWERCASE | UPPERCASE | DIGITS)+;
SIGNAL: 'HIGH' | 'LOW';
INTEGER: [1-9] [0-9]*;

/*************
 * * Helpers ** ***********
 */
fragment DIGITS: [0-9];
fragment LOWERCASE: [a-z];
// abstract rule, does not really exists
fragment UPPERCASE: [A-Z];
NEWLINE: ('\r'? '\n' | '\r')+ -> skip;
WS: ((' ' | '\t')+) -> skip;
// who cares about whitespaces?
COMMENT: '#' ~('\r' | '\n')* -> skip;
// Single line comments, starting with a #
