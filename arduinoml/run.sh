#!/bin/bash
mvn clean install
java -jar extern/target/external-antlr-1.0-SNAPSHOT-jar-with-dependencies.jar $1 $2