package design_patterns.com.milko.training.design_patterns.standard.behavioral.visitor.good.main;

import design_patterns.com.milko.training.design_patterns.standard.behavioral.visitor.good.order.PartsOrder;
import design_patterns.com.milko.training.design_patterns.standard.behavioral.visitor.good.visitor.impl.AvtPartsDisplayVisitor;
import design_patterns.com.milko.training.design_patterns.standard.behavioral.visitor.good.visitor.impl.AvtPartsShippingVisitor;
import design_patterns.com.milko.training.design_patterns.standard.behavioral.visitor.good.impl.Fender;
import design_patterns.com.milko.training.design_patterns.standard.behavioral.visitor.good.impl.Oil;
import design_patterns.com.milko.training.design_patterns.standard.behavioral.visitor.good.impl.Wheel;

public class VisitorDemo {

	public static void main(String[] args) {
		PartsOrder order = new PartsOrder();
		order.addPart(new Wheel());
		order.addPart(new Fender());
		order.addPart(new Oil());
		
		order.accept(new AvtPartsDisplayVisitor());
		order.accept(new AvtPartsShippingVisitor());
	}

}
