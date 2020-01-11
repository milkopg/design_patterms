package design_patterns.com.milko.training.java_refactoring_to_design_patterns.java_writing_readable_maintainable_code.m6exceptions;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;

public class MultipleExceptions {

    public static void main(String[] args){

        // too long
        try {
            readFile();
            executeSqlQuery();
        } catch (FileNotFoundException ex) {
            // handle it!
        } catch (IOException e) {
            // handle it!
        } catch (SQLException e) {
            // handle it!
        }



        // NO!
        try {
            readFile();
            executeSqlQuery();
        } catch (Exception ex) {
            // one exception to rule them all!
        }



        try {
            readFile();
            executeSqlQuery();
        } catch (IOException | SQLException ex) {
            // balance - handle it Java 7 way
        }



        // NO!
        try {
            readFile();
            executeSqlQuery();
        } catch (IOException | SQLException ex) {

            if (ex instanceof IOException) {
                // ...
            }
            if (ex instanceof SQLException){
                // ...
            }
        }


    }

    private static void executeSqlQuery() throws SQLException {
        throw new SQLException();
    }

    private static void readFile()throws IOException {
        throw new IOException();
    }


}
