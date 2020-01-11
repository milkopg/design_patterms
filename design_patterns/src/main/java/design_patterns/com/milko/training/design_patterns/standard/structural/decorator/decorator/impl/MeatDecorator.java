package design_patterns.com.milko.training.design_patterns.standard.structural.decorator.decorator.impl;

import design_patterns.com.milko.training.design_patterns.standard.structural.decorator.component.api.Sandwitch;
import design_patterns.com.milko.training.design_patterns.standard.structural.decorator.decorator.base.SandwitchDecorator;

public class MeatDecorator extends SandwitchDecorator {

	public MeatDecorator(Sandwitch sandwitch) {
		super(sandwitch);
	}

	@Override
	public String make() {
		return customSandwitch.make() + addMeat();
	}

	private String addMeat() {
		return " turkey";
	}
}
