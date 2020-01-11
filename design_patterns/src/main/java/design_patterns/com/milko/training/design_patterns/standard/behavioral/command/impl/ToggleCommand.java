package design_patterns.com.milko.training.design_patterns.standard.behavioral.command.impl;

import design_patterns.com.milko.training.design_patterns.standard.behavioral.command.api.Command;
import design_patterns.com.milko.training.design_patterns.standard.behavioral.command.receiver.Light;

public class ToggleCommand implements Command {
	private Light light;
	
	public ToggleCommand(Light light) {
		this.light = light;
	}

	@Override
	public void execute() {
		light.toggle();
	}

}
