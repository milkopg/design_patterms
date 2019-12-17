package design_patterns.com.milko.training.java_interfaces_abstraction.m2.revenue.api;

import design_patterns.com.milko.training.java_interfaces_abstraction.m2.revenue.client.ClientEngagement;

public interface RevenueCalculator
{
    double calculate(ClientEngagement clientEngagement);
}
