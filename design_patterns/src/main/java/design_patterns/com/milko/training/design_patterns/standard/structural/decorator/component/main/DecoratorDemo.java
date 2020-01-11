package design_patterns.com.milko.training.design_patterns.standard.structural.decorator.component.main;

import design_patterns.com.milko.training.design_patterns.standard.structural.decorator.component.api.Sandwitch;
import design_patterns.com.milko.training.design_patterns.standard.structural.decorator.component.impl.SimpleSandwitch;
import design_patterns.com.milko.training.design_patterns.standard.structural.decorator.decorator.impl.DressingDecorator;
import design_patterns.com.milko.training.design_patterns.standard.structural.decorator.decorator.impl.MeatDecorator;

public class DecoratorDemo {

	public static void main(String[] args) {
		Sandwitch sandwitch = new DressingDecorator(new MeatDecorator(new SimpleSandwitch()));
		System.out.println(sandwitch.make());
	}

}
