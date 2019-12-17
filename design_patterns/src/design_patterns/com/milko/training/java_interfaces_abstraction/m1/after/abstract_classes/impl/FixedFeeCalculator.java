package design_patterns.com.milko.training.java_interfaces_abstraction.m1.after.abstract_classes.impl;

import design_patterns.com.milko.training.java_interfaces_abstraction.m1.after.abstract_classes.base.RevenueCalculator;
import design_patterns.com.milko.training.java_interfaces_abstraction.m1.common.ClientEngagement;

public class FixedFeeCalculator extends RevenueCalculator {

	public static final double STANDARD_FEE = 50;
	
	private final double fee;
	
	public FixedFeeCalculator(final double fee) {
		this.fee = fee;
	}
	
	@Override
	public double calculate(ClientEngagement clientEngagement) {
		return fee;
	}

}
