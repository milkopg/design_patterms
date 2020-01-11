package design_patterns.com.milko.training.java_refactoring_to_design_patterns.java_writing_readable_maintainable_code.m6exceptions;

public class IllegalAgeException extends RuntimeException{

    public IllegalAgeException(String message, Throwable cause){
        super(message, cause);
    }
}
