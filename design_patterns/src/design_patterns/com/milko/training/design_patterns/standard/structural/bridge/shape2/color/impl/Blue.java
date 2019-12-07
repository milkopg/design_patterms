package design_patterns.com.milko.training.design_patterns.standard.structural.bridge.shape2.color.impl;

import design_patterns.com.milko.training.design_patterns.standard.structural.bridge.shape2.color.api.Color;

public class Blue implements Color {

	@Override
	public void applyColor() {
		System.out.println("Applying blue color");
	}

}
