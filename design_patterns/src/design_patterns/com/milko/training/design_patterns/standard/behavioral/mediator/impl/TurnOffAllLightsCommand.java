package design_patterns.com.milko.training.design_patterns.standard.behavioral.mediator.impl;

import design_patterns.com.milko.training.design_patterns.standard.behavioral.mediator.api.Command;
import design_patterns.com.milko.training.design_patterns.standard.behavioral.mediator.mediator.Mediator;

public class TurnOffAllLightsCommand implements Command {
	
	private Mediator mediator;
	
	public TurnOffAllLightsCommand(Mediator mediator) {
		this.mediator = mediator;
	}

	@Override
	public void execute() {
		mediator.turnOffAllLights();
	}
}
