#!/bin/bash
java -jar /usr/local/lib/antlr-4.5.3-complete.jar -no-listener -visitor src/main/java/XQuery.g4
javac src/main/java/XQuery*.java