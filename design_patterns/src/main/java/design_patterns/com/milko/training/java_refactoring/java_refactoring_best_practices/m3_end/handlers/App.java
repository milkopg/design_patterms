package design_patterns.com.milko.training.java_refactoring.java_refactoring_best_practices.m3_end.handlers;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

import design_patterns.com.milko.training.java_refactoring.java_refactoring_best_practices.m3_end.handlers.entities.Customer;
import design_patterns.com.milko.training.java_refactoring.java_refactoring_best_practices.m3_end.handlers.entities.DeliveryTimeWindow;
import design_patterns.com.milko.training.java_refactoring.java_refactoring_best_practices.m3_end.handlers.entities.Order;
import design_patterns.com.milko.training.java_refactoring.java_refactoring_best_practices.m3_end.handlers.handlers.CheckoutHandler;
import design_patterns.com.milko.training.java_refactoring.java_refactoring_best_practices.m3_end.handlers.items.Cheese;
import design_patterns.com.milko.training.java_refactoring.java_refactoring_best_practices.m3_end.handlers.items.Chocolate;
import design_patterns.com.milko.training.java_refactoring.java_refactoring_best_practices.m3_end.handlers.items.Item;


public class App {

	public static void main(String[] args) {
		// Create customer
		Customer customer1 = new Customer("GOLD", "MyStreet 123, US");

		// add items to list
		List<Item> shoppingList = Arrays.asList(new Chocolate(), new Chocolate(), new Cheese());

		CheckoutHandler checkout = new CheckoutHandler();

		// calculate total
		Order order = new Order(shoppingList, "DummyVoucher");
		order.setCustomer(customer1);
		double total1 = checkout.calculateTotal(order);
		System.out.println("Total price for goods: " + total1);


		DeliveryTimeWindow window  = new DeliveryTimeWindow(LocalDate.now().plusDays(1), LocalDate.now().plusDays(2));
		checkout.setDeliveryTimeWindow(window);
	}

}
