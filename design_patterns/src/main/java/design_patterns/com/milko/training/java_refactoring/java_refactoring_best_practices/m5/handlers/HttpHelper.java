package design_patterns.com.milko.training.java_refactoring.java_refactoring_best_practices.m5.handlers;

import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.stream.Collectors;

/**
 * A WebHttpClient
 */
public class HttpHelper {

    private HttpClient client = getDefaultClient();

    public HttpResponse sendGet(String s) throws IOException {
        return client.execute(new HttpGet(s));
    }

    private CloseableHttpClient getDefaultClient(){
        return HttpClientBuilder.create()
                .build();
    }
    
	public String getCurrencyRate(String baseCurrency) {
		HttpResponse response;
		String result = null;
		try {
			response = sendGet("https://api.exchangeratesapi.io/latest?base=" + baseCurrency);
			result = new BufferedReader(new InputStreamReader(response.getEntity().getContent())).lines()
					.collect(Collectors.joining("\n"));
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}

		return result;
	}
}
