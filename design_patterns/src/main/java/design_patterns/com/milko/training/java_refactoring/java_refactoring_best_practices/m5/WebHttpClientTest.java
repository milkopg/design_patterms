package design_patterns.com.milko.training.java_refactoring.java_refactoring_best_practices.m5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.stream.Collectors;

import org.apache.http.HttpResponse;

import design_patterns.com.milko.training.java_refactoring.java_refactoring_best_practices.m5.handlers.HttpHelper;

public class WebHttpClientTest {
	public static void main(String[] args) throws IOException {
		HttpHelper httpClient = new HttpHelper();
		HttpResponse response = httpClient.sendGet("https://api.exchangeratesapi.io/latest?base=USD" );
		String result = new BufferedReader(new InputStreamReader(response.getEntity().getContent()))
				  .lines().collect(Collectors.joining("\n"));
		//esponse.getEntity().getContent().
		System.out.println(result);
	}
}
