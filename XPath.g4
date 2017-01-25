grammar XPath;


//absolute path
ap: "doc(" fileName ")/" rp
  | "doc(" fileName ")//" rp
  ;

//relative path
rp : tagName
   | "*"
   ; 

//path filter
f : rp
  |
  ;

fileName: [a-zA-Z]+;
tagName: [a-zA-Z]+;
