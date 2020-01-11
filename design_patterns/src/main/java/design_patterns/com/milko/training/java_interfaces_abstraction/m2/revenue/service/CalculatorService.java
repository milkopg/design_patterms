package design_patterns.com.milko.training.java_interfaces_abstraction.m2.revenue.service;

import java.util.List;

import design_patterns.com.milko.training.java_interfaces_abstraction.m2.revenue.api.RevenueCalculator;
import design_patterns.com.milko.training.java_interfaces_abstraction.m2.revenue.client.ClientEngagement;

public interface CalculatorService {
	double calculateTotalRevenew(List<ClientEngagement> clientEngagements, final RevenueCalculator revenueCalculator);
}
