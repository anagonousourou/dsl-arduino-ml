#!/bin/bash
set -e
create_directory(){
    if [[ ! -d "$1" ]]; then
        echo "Creating $1 directory"
        mkdir "$1"
    else
        echo "$1 directory already exists"
    fi
}
create_directory output

ls extern/src/main/resources/ | grep ok- | while read f
do
    java -jar extern/target/external-antlr-1.0-SNAPSHOT-jar-with-dependencies.jar extern/src/main/resources/$f output/$f.cc
    if [ $? == 1 ]; then
        echo "Test $f failed"
        exit $?
    fi
done