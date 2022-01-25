package io.github.mosser.arduinoml.kernel.exceptions;

import java.util.List;

public class SemanticException extends RuntimeException{

    private List<String> errors;

    public SemanticException(List<String> errors) {
        this.errors=errors;
    }

    public List<String> getErrors() {
        return errors;
    }
    
}
