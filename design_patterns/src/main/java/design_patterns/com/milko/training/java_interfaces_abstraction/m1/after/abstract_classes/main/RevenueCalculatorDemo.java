package design_patterns.com.milko.training.java_interfaces_abstraction.m1.after.abstract_classes.main;

import design_patterns.com.milko.training.java_interfaces_abstraction.m1.after.abstract_classes.base.RevenueCalculator;
import design_patterns.com.milko.training.java_interfaces_abstraction.m1.after.abstract_classes.impl.FixedFeeCalculator;
import design_patterns.com.milko.training.java_interfaces_abstraction.m1.common.ClientEngagement;

public class RevenueCalculatorDemo {
	public static void main(String[] args) {
		ClientEngagement clientEngagement = new ClientEngagement("pluralsigth", 100, 15_000);
		
		RevenueCalculator revenueCalculator = new FixedFeeCalculator(FixedFeeCalculator.STANDARD_FEE);
		final double price = revenueCalculator.calculate(clientEngagement);
		System.out.println("price: " + price);
		
	}
}
