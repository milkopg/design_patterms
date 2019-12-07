package design_patterns.com.milko.training.design_patterns.standard.behavioral.visitor.bad.impl;

import design_patterns.com.milko.training.design_patterns.standard.behavioral.visitor.bad.api.AtvPart;

public class Wheel implements AtvPart {
	@Override
	public double calculateShipping() {
		return 12;
	}
}
