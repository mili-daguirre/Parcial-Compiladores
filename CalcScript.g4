grammar CalcScript;

program
  : (statement ';'?)+ EOF
  ;

statement
  : assignment
  | print
  | expr
  ;

// Asignación
assignment
  : ID '=' expr
  ;

// Impresión
print
  : 'print' expr
  ;

// Expresiones matemáticas
expr
  : expr '^' expr         # Pow
  | '-' expr              # Neg
  | expr '*' expr         # Mul
  | expr '/' expr         # Div
  | expr '+' expr         # Add
  | expr '-' expr         # Sub
  | atom                  # AtomExpr
  ;

atom
  : NUMBER                # Number
  | ID                    # Variable
  | '(' expr ')'          # Parens
  | function              # FunctionCall
  ;

// Funciones matemáticas básicas
function
  : ('sin' | 'cos' | 'sqrt') '(' expr ')'
  ;

// Tokens
ID      : [a-zA-Z][a-zA-Z0-9]* ;
NUMBER  : [0-9]+ ('.' [0-9]+)? ;
WS      : [ \t\r\n]+ -> skip ;
