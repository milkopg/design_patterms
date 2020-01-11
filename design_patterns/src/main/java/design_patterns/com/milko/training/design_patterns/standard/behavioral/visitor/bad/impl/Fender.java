package design_patterns.com.milko.training.design_patterns.standard.behavioral.visitor.bad.impl;

import design_patterns.com.milko.training.design_patterns.standard.behavioral.visitor.bad.api.AtvPart;

public class Fender implements AtvPart {
	@Override
	public double calculateShipping() {
		return 3;
	}
}
