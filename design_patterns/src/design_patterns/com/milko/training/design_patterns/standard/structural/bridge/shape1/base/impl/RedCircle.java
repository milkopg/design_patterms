package design_patterns.com.milko.training.design_patterns.standard.structural.bridge.shape1.base.impl;

import design_patterns.com.milko.training.design_patterns.standard.structural.bridge.shape1.base.abstracts.Circle;

public class RedCircle extends Circle {

	@Override
	public void applyColor() {
		System.out.println("Applying red color");
	}

}
