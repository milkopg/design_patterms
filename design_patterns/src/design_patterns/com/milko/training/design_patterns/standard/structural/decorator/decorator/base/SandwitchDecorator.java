package design_patterns.com.milko.training.design_patterns.standard.structural.decorator.decorator.base;

import design_patterns.com.milko.training.design_patterns.standard.structural.decorator.component.api.Sandwitch;

public abstract class SandwitchDecorator implements Sandwitch {

	protected Sandwitch customSandwitch;
	
	public SandwitchDecorator(Sandwitch sandwitch) {
		this.customSandwitch = sandwitch;
	}
	
	@Override
	public String make() {
		return customSandwitch.make();
	}

}
