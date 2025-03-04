grammar lab6;

LP: '(' ;
RP: ')' ;
LC: '{' ;
RC: '}' ;
SC: ';' ;
CM: ',' ;
LB: '[' ;
RB: ']' ;
MUL: '*' ;
EQ: '=' ;
COL: ':' ;
MULEQ: '*=' ;
DIVEQ: '/=' ;
MODEQ: '%=' ;
ADDEQ: '+=' ;
SUBEQ: '-=' ;
LSEQ: '<<=' ;
RSEQ: '>>=' ;
ANDEQ: '&=' ;
XOREQ: '^=' ;
OREQ: '|=' ;
QM: '?' ;
LOR: '||' ;
LAND: '&&' ;
OR: '|' ;
XOR: '^' ;
AND: '&' ;
EQEQ: '==' ;
NEQ: '!=' ;
LT: '<' ;
GT: '>' ;
LTEQ: '<=' ;
GTEQ: '>=' ;
LSHIFT: '<<' ;
RSHIFT: '>>' ;
ADD: '+' ;
SUB: '-' ;
DIV: '/' ;
MOD: '%' ;
INC: '++' ;
DEC: '--' ;
NOT: '~' ;
LNOT: '!' ;
DOT: '.' ;
ARROW: '->' ;
TYPEDEF: 'typedef' ;
EXTERN: 'extern' ;
STATIC: 'static' ;
AUTO: 'auto' ;
VOID: 'void';
CHAR: 'char';
SHORT: 'short';
INT: 'int';
LONG: 'long';
FLOAT: 'float';
DOUBLE: 'double';
SIGNED: 'signed';
UNSIGNED: 'unsigned';
BOOL: 'bool';
CONST: 'const';
RESTRICT: 'restrict';
VOLATILE: 'volatile';
INLINE: 'inline';
CASE: 'case';
DEFAULT: 'default';
IF: 'if';
ELSE: 'else';
SWITCH: 'switch';
DO: 'do';
WHILE: 'while';
FOR: 'for';
GOTO: 'goto';
CONTINUE: 'continue';
BREAK: 'break';
RETURN: 'return';
SIZEOF: 'sizeof';
STRUCT: 'struct';
UNION: 'union';

IDENTIFIER: [a-zA-Z_][0-9a-zA-Z_]* ;
INTEGER_CONSTANT: ([1-9][0-9]*|'0'[0-7]*|('0x'|'0X')[0-9a-fA-F]+ ) INTEGER_SUFFIX?;
fragment INTEGER_SUFFIX: [uU]([lL]|('ll'|'LL'))?|([lL]|('ll'|'LL'))[uU]?;
FLOATING_CONSTANT: (DECIMAL_FLOAT|HEXADECIMAL_FLOAT);
fragment DECIMAL_FLOAT: ([0-9]+('.'[0-9]*)?)([eE][+-]?[0-9]+)?[flFL]?;
fragment HEXADECIMAL_FLOAT: ('0x'|'0X')([0-9a-fA-F]+('.'[0-9a-fA-F]*)?)([pP][+-]?[0-9]+)?[flFL]?;
CHARACTER_CONSTANT: [LuU]?'\''(~('\''|'\\'|'\r'|'\n')|'\\'.)*'\'';
STRING_LITERAL: ('u8'|[uUL])?'"'(~('\''|'\\'|'\r'|'\n')|'\\'.)*'"';

COMMENT: ('//'~('\n'|'\r')*'\r'?'\n'|'/*'.*?'*/') -> skip ;
WS: (' '|'\t'|'\r'|'\n') -> skip ;

translation_unit
    :    external_declaration*
    ;

external_declaration
    :    function_definition
    |    declaration
    ;

function_definition
    :    declaration_specifiers declarator LP parameter_list? RP compound_statement
    ;

declaration_specifiers
    :   declaration_specifier+
    ;

declaration_specifier
    :    storage_class_specifier
    |    type_specifier
    |    type_qualifier
    |    function_specifier
    ;

storage_class_specifier
    :    TYPEDEF | EXTERN | STATIC | AUTO
    ;
type_specifier
    :    VOID | CHAR | SHORT | INT | LONG | FLOAT | DOUBLE | SIGNED | UNSIGNED | BOOL
    |    struct_or_union_specifier
    |    typedef_name
    ;

typedef_name: IDENTIFIER;

struct_or_union_specifier
    :    ( STRUCT | UNION ) IDENTIFIER? LC struct_declaration+ RC
    |    ( STRUCT | UNION ) IDENTIFIER
    ;
struct_declaration
    :    ( type_specifier | type_qualifier )+ struct_declarator_list SC
    ;
struct_declarator_list
    :    struct_declarator ( CM struct_declarator )*
    ;
struct_declarator: declarator;

type_qualifier
    :    CONST | RESTRICT | VOLATILE
    ;

function_specifier
    :    INLINE
    ;

declarator
    :    pointer? direct_declarator
    ;

direct_declarator
    :    IDENTIFIER (LB type_qualifier* assignment_expression? RB
         |  LP parameter_list RP
         |  LP IDENTIFIER* RP)*
    ;
pointer
    :    ( MUL type_qualifier* )+
    ;

parameter_list
    :    parameter_declaration ( CM parameter_declaration )*
    ;
parameter_declaration
    :    declaration_specifiers declarator
    ;

declaration
    :    declaration_specifiers init_declarator_list SC
    ;
init_declarator_list
    :    init_declarator ( CM init_declarator )*
    ;
init_declarator
    :    declarator ( EQ initializer)?
    ;
initializer
    :    assignment_expression
    |   LC initializer_list RC
    ;
initializer_list
    :    initializer ( CM initializer )*
    ;

compound_statement
    :    LC block_item* RC
    ;
block_item
    :    declaration
    |    statement
    ;

statement
    :    labeled_statement
    |    compound_statement
    |    expression_statement
    |    selection_statement
    |    iteration_statement
    |    jump_statement
    ;
labeled_statement
    :    IDENTIFIER COL statement
    |    CASE conditional_expression COL statement
    |    DEFAULT COL statement
    ;
expression_statement
    :    expression? SC
    ;
selection_statement
    :    IF LP expression RP statement ( ELSE statement )?
    |    SWITCH LP expression RP statement
    ;
iteration_statement
    :    WHILE LP expression RP statement
    |    DO statement WHILE LP expression RP SC
    |    FOR LP expression? SC expression? SC expression? RP statement
    |    FOR LP declaration expression? SC expression? RP statement
    ;
jump_statement
    :    GOTO IDENTIFIER SC
    |    CONTINUE SC
    |    BREAK SC
    |    RETURN expression? SC
    ;

expression
    :    assignment_expression ( CM assignment_expression )*
    ;
assignment_expression
    :    ( unary_expression (EQ|MULEQ|DIVEQ|MODEQ|ADDEQ|SUBEQ|LSEQ|RSEQ|ANDEQ|XOREQ|OREQ) )* conditional_expression
    ;
conditional_expression
    :    logical_or_expression ( QM expression COL logical_or_expression )*
    ;

logical_or_expression
    :    logical_and_expression ( LOR logical_and_expression )*
    ;
logical_and_expression
    :    inclusive_or_expression ( LAND inclusive_or_expression)*
    ;
inclusive_or_expression
    :    exclusive_or_expression ( OR exclusive_or_expression )*
    ;
exclusive_or_expression
    :    and_expression ( XOR and_expression )*
    ;
and_expression
    :    equality_expression ( AND equality_expression )*
    ;
equality_expression
    :    relational_expression ( (EQEQ | NEQ) relational_expression )*
    ;
relational_expression
    :    shift_expression ( (LT | GT | LTEQ | GTEQ) shift_expression )*
    ;
shift_expression
    :    additive_expression ( (LSHIFT | RSHIFT) additive_expression )*
    ;
additive_expression
    :    multiplicative_expression ( (ADD | SUB) multiplicative_expression )*
    ;
multiplicative_expression
    :    cast_expression ( (MUL | DIV | MOD) cast_expression )*
    ;
cast_expression
    :    ( LP type_name RP )* unary_expression
    ;
unary_expression
    :    postfix_expression
    |    (INC | DEC) unary_expression
    |    (AND | MUL | ADD | SUB | NOT | LNOT) cast_expression
    |    SIZEOF LP type_name RP
    ;
postfix_expression
    :    primary_expression(  LB expression RB
         |  LP argument_expression_list? RP
         |  (DOT | ARROW) IDENTIFIER
         |  (INC | DEC) )*
    ;
argument_expression_list
    :    assignment_expression ( CM assignment_expression)*
    ;

type_name
    :    ( type_specifier | type_qualifier )+ abstract_declarator?
    ;
abstract_declarator
    :    pointer
    |    pointer? direct_abstract_declarator
    ;
direct_abstract_declarator
    :    LB type_qualifier* assignment_expression? RB
    |    LP parameter_list? RP
    ;


primary_expression
    :    IDENTIFIER | constant | STRING_LITERAL | LP expression RP
    ;

constant
    :    INTEGER_CONSTANT
    |    FLOATING_CONSTANT
    |    CHARACTER_CONSTANT
    ;


