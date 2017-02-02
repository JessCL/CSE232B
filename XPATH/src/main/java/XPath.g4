grammar XPath;


//absolute path
ap: doc  '//' rp    #doubleAP
  | doc  '/' rp     #singleAP
  ;
doc: 'doc("' FILENAME '")';
//relative path
rp : tagName                   #tagRP
   | '*'                       #anyRP
   | '.'                       #selfRP
   | '..'                      #parentRP
   | 'text()'                  #textRP
   | '@' attName               #attRP
   |  rp ',' rp                #commaRP
   | '(' rp ')'                #braceRP
   | rp '/' rp                 #singleSlashRp
   | rp '//' rp                #doubleSlashRP
   | rp '[' f ']'              #filterRP
   ; 

//path filter
f : rp                         #rpFiter
  | rp EQ rp                   #eqFilter
  | rp IS rp                   #isFilter
  | '(' f ')'                  #braceFilter
  | f 'and' f                  #andFilter
  | f 'or' f                   #orFilter
  | 'not' f                    #notFilter
  ;

tagName:  ID;
attName:  ID;

EQ: '=' | 'eq';
IS: '==' | 'is';
ID: [a-zA-Z]+ ;

FILENAME:('a'..'z'|'A'..'Z'|'.'|'..'|'_')+ ;

WHITESPACE:[ \t\n\r]+ -> skip;


