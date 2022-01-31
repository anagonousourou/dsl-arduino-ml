grammar Arduinoml;

/******************
 * * Parser rules ** ****************
 */

root: declaration bricks states EOF;

declaration: 'application' name = IDENTIFIER;

bricks: (sensor | actuator | printer |exceptionDeclaration)+;
sensor: 'sensor' location;
actuator: 'actuator' location;
exceptionDeclaration:
	'exception' name = IDENTIFIER ':' code = INTEGER;
printer: 'printer' id = IDENTIFIER ;
location: id = IDENTIFIER ':' port = INTEGER;

states: state+;
state:
	initial? name = IDENTIFIER '{' (action | print)* exceptionTransition* transition+ '}';
print: receiver = IDENTIFIER '<=' (literalString | brickToPrint) (',' printable)*;
printable: (literalString | brickToPrint);
literalString: value = STRING;
brickToPrint: value = IDENTIFIER;

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
STRING: '"' (~["\\\r\n] | EscapeSequence)* '"';
/*************
 * * Helpers ** ***********
 */
fragment DIGITS: [0-9];
fragment LOWERCASE: [a-z];
fragment SPECIAL: (NEWLINE|WS|COMMENT|'@'|'-'|'_')+;
// abstract rule, does not really exists
fragment UPPERCASE: [A-Z];
NEWLINE: ('\r'? '\n' | '\r')+ -> skip;
WS: ((' ' | '\t')+) -> skip;
// who cares about whitespaces?
COMMENT: '#' ~('\r' | '\n')* -> skip;
// Single line comments, starting with a #
fragment EscapeSequence
    : '\\' [btnfr"'\\]
    | '\\' ([0-3]? [0-7])? [0-7]
    | '\\' 'u'+ HexDigit HexDigit HexDigit HexDigit
    ;
fragment HexDigits
    : HexDigit ((HexDigit | '_')* HexDigit)?
    ;
fragment HexDigit
    : [0-9a-fA-F]
    ;