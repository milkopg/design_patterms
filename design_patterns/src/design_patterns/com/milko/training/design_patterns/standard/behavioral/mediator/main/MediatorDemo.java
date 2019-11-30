package design_patterns.com.milko.training.design_patterns.standard.behavioral.mediator.main;

import design_patterns.com.milko.training.design_patterns.standard.behavioral.mediator.api.Command;
import design_patterns.com.milko.training.design_patterns.standard.behavioral.mediator.impl.TurnOffAllLightsCommand;
import design_patterns.com.milko.training.design_patterns.standard.behavioral.mediator.impl.TurnOnAllLightsCommand;
import design_patterns.com.milko.training.design_patterns.standard.behavioral.mediator.mediator.Mediator;
import design_patterns.com.milko.training.design_patterns.standard.behavioral.mediator.receiver.Light;

public class MediatorDemo {

	public static void main(String[] args) {
		Mediator mediator = new Mediator();
		
		Light bedroomLight = new Light("bedroom");
		Light kitchenLight = new Light("kitchen");

		mediator.registerLight(bedroomLight);
		mediator.registerLight(kitchenLight);
		
		Command turnOnAllLightsCommand = new TurnOnAllLightsCommand(mediator);
		turnOnAllLightsCommand.execute();
		
		Command turnOffAllLightsCommand = new TurnOffAllLightsCommand(mediator);
		turnOffAllLightsCommand.execute();
		
	}

}
