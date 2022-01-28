grammar Arduinoml;

/******************
 * * Parser rules ** ****************
 */

root: declaration bricks states EOF;

declaration: 'application' name = IDENTIFIER;

bricks: (sensor | actuator | printer)+;
sensor: 'sensor' location;
actuator: 'actuator' location;
printer: 'printer' location;
location: id = IDENTIFIER ':' port = INTEGER;

states: state+;
state: initial? name = IDENTIFIER '{' action+ transition+ '}';
action: receiver = IDENTIFIER '<=' value = SIGNAL;
print: receiver = IDENTIFIER '<=' value = STRING;

transition:
	temporalTransition
	| triggerTransition
	| conjunctionTriggerTransition
	| disjunctionTriggerTransition;
temporalTransition:
	'after' duration = INTEGER DURATION_UNIT '=>' next = IDENTIFIER;
triggerTransition:
	trigger = IDENTIFIER 'is' value = SIGNAL '=>' next = IDENTIFIER;
conjunctionTriggerTransition:
	trigger1 = IDENTIFIER 'and' trigger2 = IDENTIFIER 'are' value = SIGNAL '=>' next = IDENTIFIER;

disjunctionTriggerTransition:
	trigger1 = IDENTIFIER 'or' trigger2 = IDENTIFIER 'is' value = SIGNAL '=>' next = IDENTIFIER;
initial: '->';

/*****************
 * * Lexer rules ** ***************
 */

DURATION_UNIT: 'milliseconds' | 'millisecond';
IDENTIFIER: LOWERCASE (LOWERCASE | UPPERCASE | DIGITS)+;
SIGNAL: 'HIGH' | 'LOW';
INTEGER: [1-9] [0-9]*;
STRING: (LOWERCASE | UPPERCASE | DIGITS | SPECIAL)+;

/*************
 * * Helpers ** ***********
 */
fragment DIGITS : [0-9];
fragment LOWERCASE: [a-z];
fragment SPECIAL: (NEWLINE|WS|COMMENT|'@'|'-'|'_')+;
// abstract rule, does not really exists
fragment UPPERCASE: [A-Z];
NEWLINE: ('\r'? '\n' | '\r')+ -> skip;
WS: ((' ' | '\t')+) -> skip;
// who cares about whitespaces?
COMMENT: '#' ~('\r' | '\n')* -> skip;
// Single line comments, starting with a #
