package design_patterns.com.milko.training.java_interfaces_abstraction.m1.after.abstract_classes.impl;

import design_patterns.com.milko.training.java_interfaces_abstraction.m1.after.abstract_classes.base.RevenueCalculator;
import design_patterns.com.milko.training.java_interfaces_abstraction.m1.common.ClientEngagement;

public class RoyaltyShareCalculator extends RevenueCalculator {

	public static final double ROYALTY_PERCENTAGE = 50;
	
	final double royaltyPercentage;
	
	public RoyaltyShareCalculator(final double royaltyPercentage) {
		this.royaltyPercentage = royaltyPercentage;
	}
	
	@Override
	public double calculate(ClientEngagement clientEngagement) {
		return royaltyPercentage * clientEngagement.getAnticipatedRevenue();
	}

}
