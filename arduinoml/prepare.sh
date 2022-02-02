#!/bin/bash
mvn clean install
mvn dependency:build-classpath -DincludeTypes=jar -Dmdep.outputFile=.cp.txt