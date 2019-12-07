package design_patterns.com.milko.training.design_patterns.standard.behavioral.visitor.good.visitor.impl;

import design_patterns.com.milko.training.design_patterns.standard.behavioral.visitor.good.order.PartsOrder;
import design_patterns.com.milko.training.design_patterns.standard.behavioral.visitor.good.impl.Fender;
import design_patterns.com.milko.training.design_patterns.standard.behavioral.visitor.good.impl.Oil;
import design_patterns.com.milko.training.design_patterns.standard.behavioral.visitor.good.impl.Wheel;
import design_patterns.com.milko.training.design_patterns.standard.behavioral.visitor.good.visitor.api.AtvPartVisitor;

public class AvtPartsDisplayVisitor implements AtvPartVisitor {

	@Override
	public void visit(Wheel wheel) {
		System.out.println("We have a wheel.");
	}

	@Override
	public void visit(Fender fender) {
		System.out.println("We have a fender.");

	}

	@Override
	public void visit(Oil oil) {
		System.out.println("We have oil.");

	}

	@Override
	public void visit(PartsOrder partsOrder) {
		System.out.println("We have an order.");

	}

}
