package design_patterns.com.milko.training.java_interfaces_abstraction.m2.revenue.service;

import java.util.List;

import design_patterns.com.milko.training.java_interfaces_abstraction.m2.revenue.api.RevenueCalculator;
import design_patterns.com.milko.training.java_interfaces_abstraction.m2.revenue.client.ClientEngagement;

public class CalculatorServiceImpl implements CalculatorService{

	@Override
	public double calculateTotalRevenew(List<ClientEngagement> clientEngagements, RevenueCalculator revenueCalculator) {
		double total = 0;
		for (ClientEngagement clientEngagement : clientEngagements) {
			total += revenueCalculator.calculate(clientEngagement);
		}
		System.out.println("total: " + total);
		return total;
	}

}
