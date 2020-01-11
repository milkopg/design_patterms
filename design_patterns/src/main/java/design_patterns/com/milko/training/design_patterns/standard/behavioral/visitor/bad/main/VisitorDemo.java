package design_patterns.com.milko.training.design_patterns.standard.behavioral.visitor.bad.main;

import design_patterns.com.milko.training.design_patterns.standard.behavioral.visitor.bad.impl.Fender;
import design_patterns.com.milko.training.design_patterns.standard.behavioral.visitor.bad.impl.Oil;
import design_patterns.com.milko.training.design_patterns.standard.behavioral.visitor.bad.impl.Wheel;
import design_patterns.com.milko.training.design_patterns.standard.behavioral.visitor.bad.order.PartsOrder;

public class VisitorDemo {
	public static void main(String[] args) {
		PartsOrder order = new PartsOrder();
		order.addPart(new Wheel());
		order.addPart(new Fender());
		order.addPart(new Oil());
		
		double shippingCost = order.calculateShipping();
		System.out.println(shippingCost);
		
	}
}
