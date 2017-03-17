grammar XPath;


//absolute path
ap: doc  '//' rp    #doubleAP
  | doc  '/' rp     #singleAP
  ;
doc: 'doc("' filename '")' | 'document("' filename '")';
//relative path
rp : tagName                   #tagRP
   | '*'                       #childrenRP
   | '.'                       #selfRP
   | '..'                      #parentRP
   | 'text()'                  #textRP
   | '@' attName               #attRP
   |  rp ',' rp                #commaRP
   | '(' rp ')'                #braceRP
   | rp '/' rp                 #singleSlashRP
   | rp '//' rp                #doubleSlashRP
   | rp '[' f ']'              #filterRP
   ; 

//path filter
f : rp                         #rpFilter
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
ID: [a-zA-Z0-9_-]+ ;

filename: FILENAME;
FILENAME: [a-zA-Z0-9._]+;

WHITESPACE:[ \t\n\r]+ -> skip;


