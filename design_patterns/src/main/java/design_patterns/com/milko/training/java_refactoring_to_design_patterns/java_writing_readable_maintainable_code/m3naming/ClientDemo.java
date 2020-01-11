package design_patterns.com.milko.training.java_refactoring_to_design_patterns.java_writing_readable_maintainable_code.m3naming;

import java.io.IOException;

import org.apache.http.HttpResponse;

public class ClientDemo {

    public static void main(String[] args) throws IOException {

        HttpResponse response = new WebHttpClient().sendGet("https://api.github.com/");


    }
}
