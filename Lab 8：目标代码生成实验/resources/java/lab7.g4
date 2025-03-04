grammar lab7;
// 符号
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
// 关键字
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
// 标识符
IDENTIFIER: [a-zA-Z_][0-9a-zA-Z_]* ;
// 整型常量
INTEGER_CONSTANT: ([1-9][0-9]*|'0'[0-7]*|('0x'|'0X')[0-9a-fA-F]+ ) INTEGER_SUFFIX?;
fragment INTEGER_SUFFIX: [uU]([lL]|('ll'|'LL'))?|([lL]|('ll'|'LL'))[uU]?;
// 浮点型常量
FLOATING_CONSTANT: (DECIMAL_FLOAT|HEXADECIMAL_FLOAT);
fragment DECIMAL_FLOAT: ([0-9]+('.'[0-9]*)?)([eE][+-]?[0-9]+)?[flFL]?;
fragment HEXADECIMAL_FLOAT: ('0x'|'0X')([0-9a-fA-F]+('.'[0-9a-fA-F]*)?)([pP][+-]?[0-9]+)?[flFL]?;
// 字符型常量
CHARACTER_CONSTANT: [LuU]?'\''(~['\\\r\n]|'\\'['"?\\abfnrtv0-7x])*'\'';
// 字符串
STRING_LITERAL: ('u8'|[uUL])?'"'(~["\\\r\n]|'\\'['"?\\abfnrtv0-7x])*'"';
// 注释与空白字符
COMMENT: ('//'~[\r\n]*'\r'?'\n'|'/*'.*?'*/') -> skip ;
WS: [ \t\r\n] -> skip ;

// 分析入口
translation_unit
    :   external_declaration*
    ;
external_declaration
    :   function_definition
    |   declaration
    ;
// 函数定义
function_definition
    :   declaration_specifiers declarator '(' parameter_list? ')' compound_statement
    ;
// 声明语句说明符
declaration_specifiers
    :   declaration_specifier+?
    ;
declaration_specifier
    :   storage_class_specifier
    |   type_specifier
    |   type_qualifier
    |   function_specifier
    ;
// 存储类型说明符
storage_class_specifier
    :   TYPEDEF | EXTERN | STATIC | AUTO
    ;
// 类型说明符
type_specifier
    :   VOID | CHAR | SHORT | INT | LONG | FLOAT | DOUBLE | SIGNED | UNSIGNED | BOOL
    |   struct_or_union_specifier
    |   typedef_name
    ;

typedef_name: IDENTIFIER;
// 结构体或联合声明符
struct_or_union_specifier
    :   ( STRUCT | UNION ) IDENTIFIER? '{' struct_declaration+ '}'
    |   ( STRUCT | UNION ) IDENTIFIER
    ;
// 结构体声明
struct_declaration
    :   ( type_specifier | type_qualifier )+ struct_declarator_list ';'
    ;
struct_declarator_list
    :   struct_declarator ( ',' struct_declarator )*
    ;
struct_declarator: declarator;
// 类型限定符
type_qualifier
    :   CONST | RESTRICT | VOLATILE
    ;
// 函数说明符
function_specifier
    :   INLINE
    ;
// 声明符
declarator
    :   pointer? direct_declarator
    ;
// 直接声明符
direct_declarator
    :   IDENTIFIER                                                          #direct_declarator_id
    |   direct_declarator '[' type_qualifier* assignment_expression? ']'    #direct_declarator_array
    |   direct_declarator '(' parameter_list? ')'                           #direct_declarator_para
    ;
// 指针
pointer
    :   '*' type_qualifier*         #pointer_tq
    |   '*' type_qualifier* pointer #pointer_recu
    ;
// 函数的参数列表
parameter_list
    :   parameter_declaration ( ',' parameter_declaration )*
    ;
parameter_declaration
    :   declaration_specifiers declarator
    ;
// 声明语句
declaration
    :   declaration_specifiers init_declarator_list? ';'
    ;
// 带初始化的声明列表
init_declarator_list
    :   init_declarator ( ',' init_declarator )*
    ;
// 带初始化的声明语句
init_declarator
    :   declarator                  #init_declarator_decl
    |   declarator '=' initializer  #init_declarator_decl_init
    ;
// 初始化元素
initializer
    :   assignment_expression       #initializer_assi
    |   '{' initializer_list '}'    #initializer_initL
    ;
// 初始化列表
initializer_list
    :   initializer ( ',' initializer )*
    ;
// 复合语句块
compound_statement
    :   '{' block_item* '}'
    ;
block_item
    :   declaration
    |   statement
    ;
// 语句块
statement
    :   labeled_statement
    |   compound_statement
    |   expression_statement
    |   selection_statement
    |   iteration_statement
    |   jump_statement
    ;
// 命名语句块
labeled_statement
    :   IDENTIFIER ':' statement                    #label_id
    |   CASE conditional_expression ':' statement   #label_case
    |   DEFAULT ':' statement                       #label_def
    ;
// 表达式语句块
expression_statement
    :   expression? ';'
    ;
// 分支选择语句块
selection_statement
    :   IF '(' expression ')' statement                 #select_if
    |   IF '(' expression ')' statement ELSE statement  #select_ifelse
    |   SWITCH '(' expression ')' statement             #select_switch
    ;
// 迭代语句块
iteration_statement
    :   WHILE '(' expression ')' statement                                  #loop_while
    |   DO statement WHILE '(' expression ')' ';'                           #loop_dowhile
    |   FOR '(' expression? ';' expression? ';' expression? ')' statement   #loop_for
    |   FOR '(' declaration expression? ';' expression? ')' statement       #loop_for_dec
    ;
// 跳转语句
jump_statement
    :   GOTO IDENTIFIER ';'     #jump_goto
    |   CONTINUE ';'            #jump_cont
    |   BREAK ';'               #jump_break
    |   RETURN expression? ';'  #jump_ret
    ;
// 表达式
expression
    :   assignment_expression                   #expr_assi
    |   expression ',' assignment_expression    #expr_recu
    ;
assignment_expression
    :   conditional_expression                                      #assi_cond
    |   unary_expression assignment_operator assignment_expression  #assi_recu
    ;
assignment_operator: '=' | '*=' | '/=' | '%=' | '+=' | '-=' | '<<=' | '>>=' | '&=' | '^=' | '|=';
conditional_expression
    :   logical_or_expression                                           #cond_logor
    |   logical_or_expression '?' expression ':' conditional_expression #cond_recu
    ;
logical_or_expression
    :   logical_and_expression                              #log_or_logand
    |   logical_or_expression '||' logical_and_expression   #log_or_recu
    ;
logical_and_expression
    :   inclusive_or_expression                             #log_and_inor
    |   logical_and_expression '&&' inclusive_or_expression #log_and_recu
    ;
inclusive_or_expression
    :   exclusive_or_expression                             #in_or_exor
    |   inclusive_or_expression '|' exclusive_or_expression #in_or_recu
    ;
exclusive_or_expression
    :   and_expression                              #ex_or_and
    |   exclusive_or_expression '^' and_expression  #ex_or_recu
    ;
and_expression
    :   equality_expression                     #and_eq
    |   and_expression '&' equality_expression  #and_recu
    ;
equality_expression
    :   relational_expression                                       #eq_rela
    |   equality_expression equality_operator relational_expression #eq_recu
    ;
equality_operator: '==' | '!=';
relational_expression
    :   shift_expression                                            #rela_shift
    |   relational_expression relational_operator shift_expression  #rela_recu
    ;
relational_operator: '<' | '>' | '<=' | '>=';
shift_expression
    :   additive_expression                                 #shift_addi
    |   shift_expression shift_operator additive_expression #shift_recu
    ;
shift_operator: '<<' | '>>';
additive_expression
    :   multiplicative_expression                                       #addi_mul
    |   additive_expression additive_operator multiplicative_expression #addi_recu
    ;
additive_operator: '+' | '-';
multiplicative_expression
    :   cast_expression                                                     #mul_cast
    |   multiplicative_expression multiplicative_operator cast_expression   #mul_recu
    ;
multiplicative_operator: '*' | '/' | '%';
cast_expression
    :   unary_expression                  #cast_unar
    |   '(' type_name ')' cast_expression #cast_recu
    ;
unary_expression
    :   postfix_expression                  #unary_post
    |   inc_dec_operator unary_expression   #unary_recu_INC_DEC
    |   unary_opeartor cast_expression      #unary_cast
    |   SIZEOF unary_expression             #unary_recu_sizeof
    |   SIZEOF '(' type_name ')'            #unary_sizeof
    ;
inc_dec_operator: '++' | '--';
unary_opeartor : '&' | '*' | '+' | '-' | '~' | '!';
postfix_expression
    :   primary_expression                                      #post_prim
    |   postfix_expression '[' expression ']'                   #post_recu_array
    |   postfix_expression '(' argument_expression_list? ')'    #post_recu_argu
    |   postfix_expression '.' IDENTIFIER                       #post_recu_doc
    |   postfix_expression '->' IDENTIFIER                      #post_recu_arrow
    |   postfix_expression inc_dec_operator                     #post_recu_INC_DEC
    ;
argument_expression_list
    :   assignment_expression ( ',' assignment_expression)*
    ;

type_name
    :   ( type_specifier | type_qualifier )+ abstract_declarator?
    ;
abstract_declarator
    :   pointer
    |   pointer? direct_abstract_declarator
    ;
direct_abstract_declarator
    :   '[' type_qualifier* assignment_expression? ']'
    ;


primary_expression
    :   IDENTIFIER          #prim_id
    |   constant            #prim_cons
    |   STRING_LITERAL      #prim_str
    |   '(' expression ')'  #prim_expr
    ;

constant: INTEGER_CONSTANT | FLOATING_CONSTANT | CHARACTER_CONSTANT;