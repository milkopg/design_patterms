package design_patterns.com.milko.training.design_patterns.standard.behavioral.visitor.good.impl;

import design_patterns.com.milko.training.design_patterns.standard.behavioral.visitor.good.api.AtvPart;
import design_patterns.com.milko.training.design_patterns.standard.behavioral.visitor.good.visitor.api.AtvPartVisitor;

public class Fender implements AtvPart {
	@Override
	public void accept(AtvPartVisitor visitor) {
		visitor.visit(this);
	}
}
