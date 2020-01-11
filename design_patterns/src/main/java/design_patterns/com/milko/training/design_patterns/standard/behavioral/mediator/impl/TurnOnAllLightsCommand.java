package design_patterns.com.milko.training.design_patterns.standard.behavioral.mediator.impl;

import design_patterns.com.milko.training.design_patterns.standard.behavioral.mediator.api.Command;
import design_patterns.com.milko.training.design_patterns.standard.behavioral.mediator.mediator.Mediator;

public class TurnOnAllLightsCommand implements Command {

	private Mediator mediator;
	
	public TurnOnAllLightsCommand(Mediator mediator) {
		this.mediator = mediator;
	}
	
	
	@Override
	public void execute() {
		mediator.turnOnAllLights();
	}

}
