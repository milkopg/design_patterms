package design_patterns.com.milko.training.design_patterns.standard.structural.bridge.shape2.shape.base;

import design_patterns.com.milko.training.design_patterns.standard.structural.bridge.shape2.color.api.Color;

public abstract class Shape {
	protected Color color;
	
	public Shape(Color color) {
		this.color = color;
	}
	
	public abstract void applyColor();
}
