# CSE232B
Project of UC San Diego Winter 2017 CSE232B [Database Systems: Advanced Topics and Implementation]: Construction of an XQuery processor.

Consider a subset/modification of XML’s data model, XQuery, and XQuery’s type system as described in [this note](https://github.com/MelodyLC/CSE232B/blob/master/XQuery%20Semantics.pdf). The processor receives an XQuery, parses it into an abstract tree representation, optimizes it and finally executes the optimized plan.Use Antlr4 as the XPath and XQuery parser.
To access XML files, use the standard DOM interface and Java API for XML Processing (JAXP).

Course Website : https://cseweb.ucsd.edu/classes/wi17/cse232B-a/

##Milestone #1:
XPath implementation, the Sub-language of XQuery   
Implement an XPath evaluator that receives the XPath expression and an input XML file and evaluates the expression using some evaluation functions that are described in [this note (Section 1)](https://github.com/MelodyLC/CSE232B/blob/master/XQuery%20Semantics.pdf).

##Milestone #2 
Query implementation, including naive join evaluation  
A straightforward query execution engine receives the simplified XQuery and an input XML file and evaluates the query using a recursive evaluation routine which, given an XQuery expression (path, concatenation, element creation, etc) and a list of input nodes, produces a list of output nodes. 
 
##Milestone #3 
Optimized join implementation  
Implement a join operator as defined in Section 7 of [this note](https://github.com/MelodyLC/CSE232B/blob/master/project-notes.pdf). Implement an algorithm which detects the fact that the FOR and WHERE clause computation can be implemented using the join operator. Assume that the input XQueries to be optimized are in the simplified "Core" syntax given in the note.



