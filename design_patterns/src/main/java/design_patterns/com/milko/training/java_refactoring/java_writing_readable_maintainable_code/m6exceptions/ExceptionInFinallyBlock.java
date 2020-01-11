package design_patterns.com.milko.training.java_refactoring.java_writing_readable_maintainable_code.m6exceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ExceptionInFinallyBlock {

    public static void main(String[] args){

        try {
            int result = 1/0; // ArithmeticException
        } finally {
            cleanup();
        }
    }

    private static void cleanup() {
       throw new IllegalStateException();
    }



    void readFile(){
        try (Scanner scanner = new Scanner(new File("file.txt"))) {
            // read file
        } catch (FileNotFoundException e) {
            // handle it!
        }
    }









}
