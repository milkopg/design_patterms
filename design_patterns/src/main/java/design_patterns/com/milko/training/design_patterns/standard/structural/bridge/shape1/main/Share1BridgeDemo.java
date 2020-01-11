package design_patterns.com.milko.training.design_patterns.standard.structural.bridge.shape1.main;

import design_patterns.com.milko.training.design_patterns.standard.structural.bridge.shape1.base.abstracts.Circle;
import design_patterns.com.milko.training.design_patterns.standard.structural.bridge.shape1.base.abstracts.Square;
import design_patterns.com.milko.training.design_patterns.standard.structural.bridge.shape1.base.impl.BlueCircle;
import design_patterns.com.milko.training.design_patterns.standard.structural.bridge.shape1.base.impl.GreenSquare;
import design_patterns.com.milko.training.design_patterns.standard.structural.bridge.shape1.base.impl.RedSquare;

public class Share1BridgeDemo {

	public static void main(String[] args) {
		Circle circle = new BlueCircle();

		Square square = new RedSquare();
		
		Square greenSquare = new GreenSquare();

		circle.applyColor();
		square.applyColor();
		greenSquare.applyColor();

	}

}
