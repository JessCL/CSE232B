grammar XPath;


//absolute path
ap: 'doc(' fileName ')/' rp  #apSingle
  | 'doc(' fileName ')//' rp #apDouble
  ;

//relative path
rp : tagName
   | '*'
   | '.'
   | '..'
   | 'text()'
   | '@' attName
   | '(' rp ')'
   | rp '/' rp
   | rp '//' rp
   | rp '[' f ']'
   | rp ',' rp
   ; 

//path filter
f : rp         //#FilterRP
  | rp EQ rp
  | rp IS rp 
  | '(' f ')'  //#FilterParen
  | f 'and' f  //#FilterConj
  | f 'or' f
  | 'not' f
  ;

EQ: '=' | 'eq';
IS: '==' | 'is';

tagName:  ID;
attName:  ID;
fileName: ID;
//fileName: [a-zA-Z0-9_, ., /]+

ID: [a-zA-Z0-9]+ ;