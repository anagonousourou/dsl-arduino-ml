#!/bin/bash

jshell --startup DEFAULT --startup PRINTING --class-path `cat .cp.txt`:target/classes imports.jsh $1
