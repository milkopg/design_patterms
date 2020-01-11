package design_patterns.com.milko.training.java_interfaces_abstraction.m2.revenue.main;

import java.util.Arrays;
import java.util.List;

import design_patterns.com.milko.training.java_interfaces_abstraction.m2.revenue.client.ClientEngagement;
import design_patterns.com.milko.training.java_interfaces_abstraction.m2.revenue.impl.FixedFeeCalculator;
import design_patterns.com.milko.training.java_interfaces_abstraction.m2.revenue.impl.HourlyRateCalculator;
import design_patterns.com.milko.training.java_interfaces_abstraction.m2.revenue.impl.RoyaltyShareCalculator;
import design_patterns.com.milko.training.java_interfaces_abstraction.m2.revenue.service.CalculatorService;
import design_patterns.com.milko.training.java_interfaces_abstraction.m2.revenue.service.CalculatorServiceImpl;

public class RevenueCalculatorDemo {

	public static void main(String[] args) {
		final List<ClientEngagement> engagements = Arrays.asList(
	            new ClientEngagement("Catherine's Cookies", 40, 40_000),
	            new ClientEngagement("Bob's Burgers", 30, 4000),
	            new ClientEngagement("Dave's Doughnuts", 25, 1000),
	            new ClientEngagement("Susan's Sausages", 10, 2000));
		
		CalculatorService calculatorService = new CalculatorServiceImpl();
		
		System.out.println("\nFixed fee");
		calculatorService.calculateTotalRevenew(engagements, new FixedFeeCalculator(FixedFeeCalculator.STANDARD_FEE));
		
		System.out.println("\nHourly rate");
		calculatorService.calculateTotalRevenew(engagements, new HourlyRateCalculator(HourlyRateCalculator.STANDARD_HOURLY_RATE));
		
		System.out.println("\nRoyalty share");
		calculatorService.calculateTotalRevenew(engagements, new RoyaltyShareCalculator(RoyaltyShareCalculator.STANDARD_ROYALTY_PERCENTAGE));
	}

}
