import io.github.mosser.arduinoml.externals.antlr.ModelBuilder;
import io.github.mosser.arduinoml.externals.antlr.StopErrorListener;
import io.github.mosser.arduinoml.externals.antlr.grammar.ArduinomlLexer;
import io.github.mosser.arduinoml.externals.antlr.grammar.ArduinomlParser;
import io.github.mosser.arduinoml.kernel.App;
import io.github.mosser.arduinoml.kernel.generator.ToWiring;
import io.github.mosser.arduinoml.kernel.generator.Visitor;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Main {

    public static void main(String[] args) throws Exception {
        System.out.println("\n\nRunning the ANTLR compiler for ArduinoML");

        CharStream stream = getCharStream(args);
        App theApp = buildModel(stream);
        exportToCode(theApp, args.length > 1 ? args[1] : null);

    }

    private static CharStream getCharStream(String[] args) throws IOException {
        if (args.length < 1)
            throw new RuntimeException("no input file");
        Path input = Paths.get(new File(args[0]).toURI());
        System.out.println("Using input file: " + input);
        return CharStreams.fromPath(input);
    }

    private static App buildModel(CharStream stream) {
        ArduinomlLexer lexer = new ArduinomlLexer(stream);
        lexer.removeErrorListeners();
        lexer.addErrorListener(new StopErrorListener());

        ArduinomlParser parser = new ArduinomlParser(new CommonTokenStream(lexer));
        parser.removeErrorListeners();
        parser.addErrorListener(new StopErrorListener());

        ParseTreeWalker walker = new ParseTreeWalker();
        ModelBuilder builder = new ModelBuilder();

        walker.walk(builder, parser.root()); // parser.root() is the entry point of the grammar

        return builder.retrieve();
    }

    private static void exportToCode(App theApp, String outputfilePath) throws IOException {
        Visitor<StringBuffer> codeGenerator = new ToWiring();
        theApp.accept(codeGenerator);
        if (outputfilePath == null) {
            System.out.println(codeGenerator.getResult());
        } else {
            Path filePath = Path.of(outputfilePath);
            filePath.toFile().createNewFile();
            try (BufferedWriter bw = Files.newBufferedWriter(filePath)) {
                bw.write(codeGenerator.getResult().toString());
            } catch (IOException e) {
                e.printStackTrace();
            }

        }

    }

}
