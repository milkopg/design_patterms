package design_patterns.com.milko.training.design_patterns.standard.structural.decorator.component.impl;

import design_patterns.com.milko.training.design_patterns.standard.structural.decorator.component.api.Sandwitch;

public class SimpleSandwitch implements Sandwitch {

	@Override
	public String make() {
		return "Bread";
	}

}
