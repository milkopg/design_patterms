package design_patterns.com.milko.training.java_interfaces_abstraction.m1.before;

import design_patterns.com.milko.training.java_interfaces_abstraction.m1.common.ClientEngagement;

public class RevenueCalculator {
	private static final double HOURLY_RATE = 50;
	private static final double FIXED_FEE = 50;
	private static final double ROYALTY_PERCENTAGE = 50;
	
	public static double price (String method, final ClientEngagement clientEngagement) {
		switch (method) {
		 case "Hourly":
             return HOURLY_RATE * clientEngagement.getHoursWorked();

         case "FixedFee":
             return FIXED_FEE;

         case "RoyaltyPercentage":
             return ROYALTY_PERCENTAGE * clientEngagement.getAnticipatedRevenue();

         default:
             throw new IllegalArgumentException("Unknown method: " + method);
		}
	}
}
