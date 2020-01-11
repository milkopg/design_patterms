package design_patterns.com.milko.training.java_interfaces_abstraction.m2.revenue.impl;

import design_patterns.com.milko.training.java_interfaces_abstraction.m2.revenue.api.RevenueCalculator;
import design_patterns.com.milko.training.java_interfaces_abstraction.m2.revenue.client.ClientEngagement;

public class FixedFeeCalculator implements RevenueCalculator
{
    public static final double STANDARD_FEE = 500;

    private final double fee;

    public FixedFeeCalculator(final double fee) {
        this.fee = fee;
    }

    @Override
    public double calculate(final ClientEngagement clientEngagement) {
        return fee;
    }
}
