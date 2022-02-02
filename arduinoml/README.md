# Readme code

## Requirements
- JDK 11 and above
- Maven

# Procedure

Common part: Before everything Launch the script `prepare.sh` (on Linux-like environment) ou execute manually its content.

Use `external.sh` to generate the arduino C++ code of all scenarios in a folder output (that will be created if it does not exist) using the external DSL codes written in `extern/src/main/resources`

Use `internal.sh` to display the arduino C++ code of all scenarios on the screen using the embedded DSL. The embedded code of the scenarios is at `intern/src/main/java/Main.java`

In the case of the embedded DSL you can also use JShell scripts.
Jshell is a tool that does REPL for Java code, it was added in JDK 9. It allows you to quicklyy try Java code and write Java script.

The supported example scenarios are also written using JShell in `intern/scenarios`. You can write your own scenarios using the exisitng as example. In JShell the `;` is not taken into account to delimit an instruction, jshell evaluates everyline one after the other. If you are writing a multiline instruction you need to end the lines with `.` or an opening parentheses ... such that Jshell understands that there is more in the following lines. You execute them with `./source.sh name-of-script.jsh`. (You need to place yourself in the directory intern first).
