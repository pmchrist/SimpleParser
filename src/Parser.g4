/**
Written by Christos Perchanidis
pmchrist@csd.auth.gr
*/


grammar Parser;

//Commands

program
    : 'class' ID '{' 'public' 'static' 'void' 'main' '(' ')' comp_stmt '}'
    ;

stmt
    : assign_stmt
    | for_stmt
    | while_stmt
    | if_stmt
    | comp_stmt
    | declaration
    | null_stmt
    | 'println' '(' expr ')'
    ;

assign_stmt
    : assign_expr
    ;

assign_expr
    : ID '=' expr
    ;

bool_expr
    : expr c_op expr
    ;

expr
    : assign_expr
    | rval
    ;

for_stmt
    : 'for' '(' opassign_expr ';' opbool_expr ';' opassign_expr ')' stmt
    ;

opassign_expr
    : assign_expr
    |
    ;

opbool_expr
    : bool_expr
    |
    ;

while_stmt
    : 'while' '(' bool_expr ')' stmt
    ;

if_stmt
    : 'if' '(' bool_expr ')' stmt else_part
    ;

else_part
    : 'else' stmt
    ;

comp_stmt
    : '{' stmp_list '}'
    ;

declaration
    : type id_list
    ;

null_stmt
    : ';'
    ;

stmp_list
    : stmp_list stmt
    |
    ;

id_list
    : ID ',' id_list
    | ID
    ;

rval
    : rval '+' term
    | rval '-' term
    | term
    ;

term
    : term '*' factor
    | term '/' factor
    | factor
    ;

factor
    : '(' expr ')'
    | '-' factor
    | ID
    | NUM
    ;

type
    : 'int'
    | 'float'
    ;

c_op
    : '=='
    | '<'
    | '>'
    | '<='
    | '>='
    | '!='
    ;


//Keywords

CLASS : 'class';
PUBLIC : 'public';
STATIC : 'static';
VOID : 'void';
MAIN : 'main';

PRINTLN : 'println';

INT : 'int';
FLOAT : 'float';

IF : 'if';
ELSE : 'else';
FOR : 'for';
WHILE : 'while';

LPAREN : '(';
RPAREN : ')';
LBRACE : '{';
RBRACE : '}';
SEMI : ';';
COMMA : ',';
DOT : '.';

ASSIGN : '=';
GT : '>';
LT : '<';
EQUAL : '==';
LE : '<=';
GE : '>=';
NOTEQUAL : '!=';
ADD : '+';
SUB : '-';
MUL : '*';
DIV : '/';


//Identifiers (must appear after all keywords in the grammar)

ID
    : Letter (Letter | Digit | '_')*
    ;

NUM
    : [0-9] (Digit)* ('.' (Digit)*)?
    ;

fragment
Letter
    : [a-zA-Z]
    ;

fragment
Digit
    : [0-9]
    ;

//Skip Spaces
WS  :  [ \t\r\n\u000C]+ -> skip
    ;