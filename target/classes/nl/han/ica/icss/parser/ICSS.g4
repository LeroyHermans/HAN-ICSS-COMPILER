grammar ICSS;

/* PARSER RULES */

stylesheet
    : stylesheetpart*;

stylesheetpart
    : stylerule
    | constantassignment
    | switchrule;

stylerule
    : selector STYLERULE_OPEN declarationpart* STYLERULE_CLOSE;

selector
    : SELECTOR_ELEMENT #elementselector
    | SELECTOR_ID #idselector
    | SELECTOR_CLASS #classselector;

declarationpart
    : declaration;

declaration
    : attribute ATTRIBUTE_SEPARATOR value ENDLINE;

attribute
    : COLOR_ATT
    | BG_COL_ATT
    | WIDTH_ATT
    | HEIGTH_ATT;

value
    : realvalue
    | sum;

sum
    : realvalue ADD_OPP realvalue
    | realvalue ADD_OPP (sum | subtraction | multiply);

subtraction
    : realvalue SUBSTRACT_OPP realvalue
    | realvalue SUBSTRACT_OPP (sum | subtraction | multiply);

multiply
    : realvalue MULTIPLY_OPP realvalue
    | realvalue MULTIPLY_OPP (sum | subtraction | multiply);


realvalue
    : (literal
    | constantreference);

literal
    : COLOR_LITERAL #colorliteral
    | PIXEL_LITERAL #pixelliteral
    | PERCENTAGE_LITERAL #percentageliteral
    | SCALAR_LITERAL #scalarliteral;

constantassignment
    : CONSTANT_DECLARATOR constantreference CONSTANT_ASSIGNMENT_SEPERATOR value ENDLINE;

constantreference
    : CONSTANT_NAME;

switchrule
    : selector SWITCH_KEYWORD realvalue switchvaluecase*;

switchvaluecase
    : CASE_KEYWORD realvalue STYLERULE_OPEN declaration STYLERULE_CLOSE #switchcase
    | DEFAULT_KEYWORD STYLERULE_OPEN declaration STYLERULE_CLOSE #defaultswitchcase;

/* LEXER RULES */
WHITESPACE: [ \t\r\n]+ -> skip;

STYLERULE_OPEN: '{';
STYLERULE_CLOSE: '}';
ENDLINE: ';';

COLOR_ATT: 'color';
BG_COL_ATT: 'background-color';
WIDTH_ATT: 'width';
HEIGTH_ATT: 'height';

ATTRIBUTE_SEPARATOR: ':';

COLOR_LITERAL: '#'[0-9A-Fa-f][0-9A-Fa-f][0-9A-Fa-f][0-9A-Fa-f][0-9A-Fa-f][0-9A-Fa-f];
PIXEL_LITERAL: [0-9]+'px';
PERCENTAGE_LITERAL: [0-9]+'%';
SCALAR_LITERAL: [0-9]*;

SWITCH_KEYWORD: 'switch';
SWITCH_OPEN: '(';
SWITCH_CLOSE: ')';
CASE_KEYWORD: 'case';
DEFAULT_KEYWORD: 'default';

CONSTANT_DECLARATOR: 'let';
CONSTANT_NAME: '$'(NUMBER | LETTER)+ ('-'|'_')? (NUMBER | LETTER)*;
CONSTANT_ASSIGNMENT_SEPERATOR: 'is';

SELECTOR_ID: '#'[a-z0-9]+;
SELECTOR_CLASS: '.'[a-z0-9]+;
SELECTOR_ELEMENT: [a-z0-9]+;

ADD_OPP: '+';
SUBSTRACT_OPP: '-';
MULTIPLY_OPP: '*';

NUMBER: [0-9];
LETTER: [a-zA-Z];