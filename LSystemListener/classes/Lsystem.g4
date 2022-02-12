grammar Lsystem;
prog: init iter (stat)+;
init: 'init' ID;
iter: 'iter' NUM;
stat: rep with;

rep: 'replace' ID;
with: 'with' ID;

ID: [a-zA-Z]+;
NUM: [0-9]+;
WS : [ \t\r\n]+ -> skip ;
