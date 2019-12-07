package design_patterns.com.milko.training.design_patterns.standard.structural.bridge.shape1.base.impl;

import design_patterns.com.milko.training.design_patterns.standard.structural.bridge.shape1.base.abstracts.Square;

public class BlueSquare extends Square {

	@Override
	public void applyColor() {
		System.out.println("Applying blue color");
	}

}
