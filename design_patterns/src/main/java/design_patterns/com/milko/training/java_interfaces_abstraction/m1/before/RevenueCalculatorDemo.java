package design_patterns.com.milko.training.java_interfaces_abstraction.m1.before;

import design_patterns.com.milko.training.java_interfaces_abstraction.m1.common.ClientEngagement;

public class RevenueCalculatorDemo {

	public static void main(String[] args) {
		final ClientEngagement clientEngagement = new ClientEngagement("Pluralsight", 100, 15_000);
		
		// "Hourly"
        // "FixedFee"
        // "RoyaltyPercentage"
		
		final double hourlyPrice = RevenueCalculator.price("Hourly", clientEngagement);
		System.out.println("hourlyPrice: " +  hourlyPrice);
		
		final double fixedFee = RevenueCalculator.price("FixedFee", clientEngagement);
		System.out.println("fixedFee: " +  fixedFee);
		
		final double royaltyPercentage = RevenueCalculator.price("RoyaltyPercentage", clientEngagement);
		System.out.println("royaltyPercentage: " +  royaltyPercentage);
		
	}

}
