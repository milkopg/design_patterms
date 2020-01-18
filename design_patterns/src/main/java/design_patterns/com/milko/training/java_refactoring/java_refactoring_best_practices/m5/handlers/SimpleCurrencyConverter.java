package design_patterns.com.milko.training.java_refactoring.java_refactoring_best_practices.m5.handlers;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.stream.Collectors;

import org.apache.http.HttpResponse;

public class SimpleCurrencyConverter {

	private String currencyTo;
	private HttpHelper httpClient = new HttpHelper();

	public SimpleCurrencyConverter(String currencyTo) {
		this.currencyTo = currencyTo;
	}

	public double convert(double price) {
		if (currencyTo.equalsIgnoreCase("EUR")) {
			return price * 0.9;
		} else if (currencyTo.equalsIgnoreCase("CAD")) {
			return price * 1.35;
		} else {
			throw new IllegalArgumentException("Unrecognized currency : " + currencyTo);
		}
	}



	private double getRate(String rates, String currencyTo) {
		return Double.valueOf(rates.substring(rates.lastIndexOf(currencyTo)).substring(5, 9));
	}

	public double convertWithWebService(double price) {

		String rates = httpClient.getCurrencyRate("USD");

		if (currencyTo.equalsIgnoreCase("EUR")) {
			return price * getRate(rates, "EUR");

		} else if (currencyTo.equalsIgnoreCase("CAD")) {
			return price * getRate(rates, "CAD");

		} else {
			throw new IllegalArgumentException("Unrecognized currency : " + currencyTo);
		}
	}
	
	public void printUsdRateFor(String currencyTo) {
		String rates = httpClient.getCurrencyRate("USD");
		System.out.println(getRate(rates, currencyTo));
	}
}
