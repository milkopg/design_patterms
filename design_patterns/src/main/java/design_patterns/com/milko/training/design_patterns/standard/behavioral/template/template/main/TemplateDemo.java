package design_patterns.com.milko.training.design_patterns.standard.behavioral.template.template.main;

import design_patterns.com.milko.training.design_patterns.standard.behavioral.template.template.base.OrderTemplate;
import design_patterns.com.milko.training.design_patterns.standard.behavioral.template.template.impl.StoreOrder;
import design_patterns.com.milko.training.design_patterns.standard.behavioral.template.template.impl.WebOrder;

public class TemplateDemo {

	public static void main(String[] args) {
		OrderTemplate storeOrder = new StoreOrder();
		storeOrder.processOrder();
		System.out.println("StoreOrder");
		
		System.out.println("");
		
		OrderTemplate webOrder = new WebOrder();
		webOrder.processOrder();
		System.out.println("WebOrder");
	}

}
