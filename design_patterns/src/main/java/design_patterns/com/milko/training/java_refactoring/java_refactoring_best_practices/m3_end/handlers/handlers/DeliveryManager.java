package design_patterns.com.milko.training.java_refactoring.java_refactoring_best_practices.m3_end.handlers.handlers;

import design_patterns.com.milko.training.java_refactoring.java_refactoring_best_practices.m3_end.handlers.entities.Customer;
import design_patterns.com.milko.training.java_refactoring.java_refactoring_best_practices.m3_end.handlers.entities.Membership;

public class DeliveryManager {
	public double addDeliveryFee(Customer customer, double total) {
		if (isEligibleForFreeDelivery(customer.getMembership())) {

		} else {
			if (isUsAddress(customer.getAddress())) {
				System.out.println("Adding flat delivery fee of 5 USD");
				total = total + 5;
			} else {
				System.out.println("Adding flat global delivery fee of 10 USD");
				total = total + 10;
			}
		}
		return total;
	}

	public boolean isUsAddress(String address) {
		return address.contains("US");
	}

	public boolean isEligibleForFreeDelivery(String membership) {
		return membership.equalsIgnoreCase(Membership.GOLD.name());
	}
}
