package design_patterns.com.milko.training.java_interfaces_abstraction.m1.after.abstract_classes.impl;

import design_patterns.com.milko.training.java_interfaces_abstraction.m1.after.abstract_classes.base.RevenueCalculator;
import design_patterns.com.milko.training.java_interfaces_abstraction.m1.common.ClientEngagement;

public class HourlyRateCalculator extends RevenueCalculator {

	public static final double HOURLY_RATE = 50;
	
	private final double hourlyRate;
	
	public HourlyRateCalculator(final double hourlyRate) {
		this.hourlyRate = hourlyRate;
	}
	
	
	@Override
	public double calculate(ClientEngagement clientEngagement) {
		return hourlyRate * clientEngagement.getHoursWorked();
	}

}
