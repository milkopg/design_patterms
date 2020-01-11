package design_patterns.com.milko.training.design_patterns.standard.structural.bridge.shape2.color.main;

import design_patterns.com.milko.training.design_patterns.standard.structural.bridge.shape2.color.api.Color;
import design_patterns.com.milko.training.design_patterns.standard.structural.bridge.shape2.color.impl.Blue;
import design_patterns.com.milko.training.design_patterns.standard.structural.bridge.shape2.color.impl.Green;
import design_patterns.com.milko.training.design_patterns.standard.structural.bridge.shape2.color.impl.Red;
import design_patterns.com.milko.training.design_patterns.standard.structural.bridge.shape2.shape.base.Shape;
import design_patterns.com.milko.training.design_patterns.standard.structural.bridge.shape2.shape.impl.Circle;
import design_patterns.com.milko.training.design_patterns.standard.structural.bridge.shape2.shape.impl.Square;

public class Shape2BridgeDemo {

	public static void main(String[] args) {
		Color blue = new Blue();
		
		Shape square = new Square(blue);
		
		Color red = new Red();
		Shape circle = new Circle(red);
		
		Color green = new Green();
		Shape greenCircle = new Circle(green);
		Shape greenSquare = new Square(green);
		
		square.applyColor();
		circle.applyColor();
		greenCircle.applyColor();
		greenSquare.applyColor();
	}

}
