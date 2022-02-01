#!/bin/bash
set -e
mvn clean install
cd intern
mvn exec:java