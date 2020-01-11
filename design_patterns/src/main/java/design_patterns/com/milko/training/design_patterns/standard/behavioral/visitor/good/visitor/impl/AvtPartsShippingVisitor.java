package design_patterns.com.milko.training.design_patterns.standard.behavioral.visitor.good.visitor.impl;

import java.util.List;

import design_patterns.com.milko.training.design_patterns.standard.behavioral.visitor.good.api.AtvPart;
import design_patterns.com.milko.training.design_patterns.standard.behavioral.visitor.good.impl.Fender;
import design_patterns.com.milko.training.design_patterns.standard.behavioral.visitor.good.impl.Oil;
import design_patterns.com.milko.training.design_patterns.standard.behavioral.visitor.good.impl.Wheel;
import design_patterns.com.milko.training.design_patterns.standard.behavioral.visitor.good.order.PartsOrder;
import design_patterns.com.milko.training.design_patterns.standard.behavioral.visitor.good.visitor.api.AtvPartVisitor;

public class AvtPartsShippingVisitor implements AtvPartVisitor {

	 double shippingAmount = 0;
		
		@Override
		public void visit(Wheel wheel) {
			System.out.println("Wheels are bulky and expensive to ship.");
			shippingAmount += 15;
		}

		@Override
		public void visit(Fender fender) {
			System.out.println("Fenders are light and cheap to ship.");
			shippingAmount += 3;
		}

		@Override
		public void visit(Oil oil) {
			System.out.println("Oil is hazardous and has a fee to ship.");
			shippingAmount += 9;
		}

		@Override
		public void visit(PartsOrder order) {
			System.out.println("If they bought more than 3 things we will give them a discount on shipping.");
			List<AtvPart> parts = order.getParts();
			if(parts.size() > 3) {
				shippingAmount -= 5;
			}
			System.out.println("Shipping amount is: " + shippingAmount);
		}

}
