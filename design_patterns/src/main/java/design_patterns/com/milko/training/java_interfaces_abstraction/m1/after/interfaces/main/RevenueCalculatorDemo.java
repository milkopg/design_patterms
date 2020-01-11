package design_patterns.com.milko.training.java_interfaces_abstraction.m1.after.interfaces.main;

import design_patterns.com.milko.training.java_interfaces_abstraction.m1.after.interfaces.api.RevenueCalculator;
import design_patterns.com.milko.training.java_interfaces_abstraction.m1.after.interfaces.impl.FixedFeeCalculator;
import design_patterns.com.milko.training.java_interfaces_abstraction.m1.after.interfaces.impl.HourlyRateCalculator;
import design_patterns.com.milko.training.java_interfaces_abstraction.m1.common.ClientEngagement;

public class RevenueCalculatorDemo {

	public static void main(String[] args) {
		final ClientEngagement clientEngagement = new ClientEngagement("Pluralsight", 100, 15_000);
		
		RevenueCalculator revenueCalculator = new FixedFeeCalculator(HourlyRateCalculator.STANDARD_HOURLY_RATE);
		double price = revenueCalculator.calculate(clientEngagement);
		System.out.println("FixedFeeCalculator price: " + price);
		
		revenueCalculator = new HourlyRateCalculator(HourlyRateCalculator.STANDARD_HOURLY_RATE);
		price = revenueCalculator.calculate(clientEngagement);
		System.out.println("HourlyRateCalculator price: " + price);
	}

}
