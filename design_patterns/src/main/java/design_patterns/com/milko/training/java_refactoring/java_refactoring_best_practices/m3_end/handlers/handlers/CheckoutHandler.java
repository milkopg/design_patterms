package design_patterns.com.milko.training.java_refactoring.java_refactoring_best_practices.m3_end.handlers.handlers;

import java.util.List;

import design_patterns.com.milko.training.java_refactoring.java_refactoring_best_practices.m3_end.handlers.entities.DeliveryTimeWindow;
import design_patterns.com.milko.training.java_refactoring.java_refactoring_best_practices.m3_end.handlers.entities.Order;
import design_patterns.com.milko.training.java_refactoring.java_refactoring_best_practices.m3_end.handlers.handlers.DeliveryManager;
import design_patterns.com.milko.training.java_refactoring.java_refactoring_best_practices.m3_end.handlers.handlers.DiscountManager;
import design_patterns.com.milko.training.java_refactoring.java_refactoring_best_practices.m3_end.handlers.items.Item;

public class CheckoutHandler {
	
	 private DiscountManager discountManager = new DiscountManager();
	 private DeliveryManager deliveryManager = new DeliveryManager();


	private double sumItemPrices(List<Item> items) {
		double sum = 0;

		for (Item item: items) {
			sum = sum + item.price();
		}
		return sum;
	}
	
	
	

	public double calculateTotal(Order order) {
		double baseTotal = sumItemPrices(order.getItems());
		baseTotal =  discountManager.applyVoucher(order.getVoucher(), baseTotal);
		baseTotal = deliveryManager.addDeliveryFee(order.getCustomer(), baseTotal);
		
		return baseTotal;
	}

	public void setDeliveryTimeWindow(DeliveryTimeWindow window) {
	
		System.out.println(String.format("Your Order will delivered some time between %s and %s", window.getStart(),
				window.getEnd()));
	}
}
