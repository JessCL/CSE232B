grammar XQuery;
import XPath;
xq : var                                                   #varXQ
   | StringConstant                                        #scXQ
   | ap                                                    #apXQ
   | '(' xq ')'                                            #braceXQ
   | xq ',' xq                                             #commaXQ
   | startTag '{' xq '}' endTag                            #tagXQ
   | xq '/' rp                                             #singleSlashXQ
   | xq '//' rp                                            #doubleSlashXQ
   | forClause letClause? whereClause? returnClause        #FLWR
   | letClause xq                                          #letXQ
   | joinClause                                            #joinXQ
   ;

joinClause : 'join' '(' xq ',' xq ',' idList ',' idList ')';
forClause : 'for' var 'in' xq (',' var 'in' xq)* ;
letClause : 'let' var ':=' xq (',' var ':=' xq)* ;
whereClause : 'where' cond ;
returnClause : 'return' rt ;

rt : xq                                                  #xqReturn
   | rt ',' rt                                           #commaReturn
   | startTag rt endTag                                  #tagReturn
   ;

cond : xq EQ xq                                                  #eqCond
     | xq IS xq                                                  #isCond
     | 'empty' '(' xq ')'                                           #emptyCond
     | 'some' var 'in' xq (',' var 'in' xq)* 'satisfies' cond    #satisfyCond
     | '(' cond ')'                                              #braceCond
     | cond 'and' cond                                           #andCond
     | cond 'or' cond                                            #orCond
     | 'not' cond                                                #notCond
     ;
startTag: '<' tagName '>';
endTag: '<' '/' tagName '>';
var: '$' ID;
idList : '[' ID (',' ID)* ']' ;
StringConstant: '"'+[a-zA-Z0-9,.!?; ''""-]+'"';
