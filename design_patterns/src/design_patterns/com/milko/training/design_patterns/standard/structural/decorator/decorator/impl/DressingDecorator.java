package design_patterns.com.milko.training.design_patterns.standard.structural.decorator.decorator.impl;

import design_patterns.com.milko.training.design_patterns.standard.structural.decorator.component.api.Sandwitch;
import design_patterns.com.milko.training.design_patterns.standard.structural.decorator.decorator.base.SandwitchDecorator;

public class DressingDecorator extends SandwitchDecorator {

	public DressingDecorator(Sandwitch sandwitch) {
		super(sandwitch);
	}

	@Override
	public String make() {
		return customSandwitch.make() + addDressing();
	}

	private String addDressing() {
		return " mustard";
	}
}
