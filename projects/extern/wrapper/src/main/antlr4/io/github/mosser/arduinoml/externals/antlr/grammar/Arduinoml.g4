grammar Arduinoml;

/******************
 * * Parser rules ** ****************
 */

root: declaration bricks states EOF;

declaration: 'application' name = IDENTIFIER;

bricks: (sensor | actuator)+;
sensor: 'sensor' location;
actuator: 'actuator' location;
location: id = IDENTIFIER ':' port = PORT_NUMBER;

states: state+;
state: initial? name = IDENTIFIER '{' action+ transition+ '}';
action: receiver = IDENTIFIER '<=' value = SIGNAL;
condition:
	trigger1 = IDENTIFIER ('or' | 'and') trigger2 = IDENTIFIER;

transition:
	temporal_transition
	| trigger = IDENTIFIER 'is' value = SIGNAL '=>' next = IDENTIFIER;
temporal_transition:
	'after' duration = INTEGER DURATION_UNIT '=>' next = IDENTIFIER;
initial: '->';

/*****************
 * * Lexer rules ** ***************
 */

PORT_NUMBER: [1-9] | '11' | '12';
IDENTIFIER: LOWERCASE (LOWERCASE | UPPERCASE)+;
SIGNAL: 'HIGH' | 'LOW';
DURATION_UNIT: 'milliseconds' | 'millisecond';
INTEGER: [1-9] [0-9]*;

/*************
 * * Helpers ** ***********
 */

fragment LOWERCASE: [a-z];
// abstract rule, does not really exists
fragment UPPERCASE: [A-Z];
NEWLINE: ('\r'? '\n' | '\r')+ -> skip;
WS: ((' ' | '\t')+) -> skip;
// who cares about whitespaces?
COMMENT: '#' ~('\r' | '\n')* -> skip;
// Single line comments, starting with a #
