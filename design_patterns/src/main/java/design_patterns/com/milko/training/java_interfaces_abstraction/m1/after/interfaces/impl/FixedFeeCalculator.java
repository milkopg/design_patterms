package design_patterns.com.milko.training.java_interfaces_abstraction.m1.after.interfaces.impl;

import design_patterns.com.milko.training.java_interfaces_abstraction.m1.after.interfaces.api.RevenueCalculator;
import design_patterns.com.milko.training.java_interfaces_abstraction.m1.common.ClientEngagement;

public class FixedFeeCalculator implements RevenueCalculator {
	
	public static final double STANDARD_FEE = 500;

	private final double fee;
	
	public FixedFeeCalculator(final double fee) {
		this.fee = fee;
	}
	
	@Override
	public double calculate(ClientEngagement clientEngagement) {
		return fee;
	}

}
