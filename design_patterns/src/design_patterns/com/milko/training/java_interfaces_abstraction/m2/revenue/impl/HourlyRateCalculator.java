package design_patterns.com.milko.training.java_interfaces_abstraction.m2.revenue.impl;

import design_patterns.com.milko.training.java_interfaces_abstraction.m2.revenue.api.RevenueCalculator;
import design_patterns.com.milko.training.java_interfaces_abstraction.m2.revenue.client.ClientEngagement;

public class HourlyRateCalculator implements RevenueCalculator
{
    public static final double STANDARD_HOURLY_RATE = 50;

    private final double hourlyRate;

    public HourlyRateCalculator(final double hourlyRate){
        this.hourlyRate = hourlyRate;
    }

    @Override
    public double calculate(final ClientEngagement clientEngagement){
        return hourlyRate * clientEngagement.getHoursWorked();
    }
}
