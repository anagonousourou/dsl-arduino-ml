 mvn clean install; cd extern; mvn exec:java -Dexec.args="src/main/resources/$1"; cd ..;