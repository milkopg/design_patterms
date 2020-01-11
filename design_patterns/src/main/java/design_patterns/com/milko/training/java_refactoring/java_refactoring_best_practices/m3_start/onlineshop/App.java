package design_patterns.com.milko.training.java_refactoring.java_refactoring_best_practices.m3_start.onlineshop;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

import design_patterns.com.milko.training.java_refactoring.java_refactoring_best_practices.m3_start.onlineshop.entities.Customer;
import design_patterns.com.milko.training.java_refactoring.java_refactoring_best_practices.m3_start.onlineshop.items.Cheese;
import design_patterns.com.milko.training.java_refactoring.java_refactoring_best_practices.m3_start.onlineshop.items.Chocolate;
import design_patterns.com.milko.training.java_refactoring.java_refactoring_best_practices.m3_start.onlineshop.items.Item;

public class App {

	public static void main(String[] args) {
		// Create customer
		Customer customer1 = new Customer("GOLD", "MyStreet 123, US");
		String memberShip = customer1.getMembership();
		String address = customer1.getAddress();

		// add items to list
		List<Item> shoppingList = Arrays.asList(new Chocolate(), new Chocolate(), new Cheese());

		CheckoutHandler checkout = new CheckoutHandler();

		// calculate total
		double total1 = checkout.calculateTotal(shoppingList, "Dummyvoucher", memberShip, address);
		System.out.println("Total price for goods: " + total1);

		LocalDate start = LocalDate.now().plusDays(1);
		LocalDate end = LocalDate.now().plusDays(2);

		checkout.setDeliveryTimeWindow(start, end);
	}

}
