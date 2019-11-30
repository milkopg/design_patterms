package design_patterns.com.milko.training.design_patterns.standard.behavioral.command.command.main;

import java.util.Arrays;
import java.util.List;

import design_patterns.com.milko.training.design_patterns.standard.behavioral.command.command.api.Command;
import design_patterns.com.milko.training.design_patterns.standard.behavioral.command.command.impl.AllLightsCommand;
import design_patterns.com.milko.training.design_patterns.standard.behavioral.command.command.impl.ToggleCommand;
import design_patterns.com.milko.training.design_patterns.standard.behavioral.command.invoker.Switch;
import design_patterns.com.milko.training.design_patterns.standard.behavioral.command.receiver.Light;

public class CommandDemo {

	public static void main(String[] args) {
		Light bedroomLight = new Light();
		Light kitchenLight = new Light();
		
		Switch lightSwitch = new Switch();

		Command toggleCommand = new ToggleCommand(bedroomLight);
		lightSwitch.execute(toggleCommand);
		
		List<Light> lights = Arrays.asList(bedroomLight, kitchenLight);
		Command allLightsCommand = new AllLightsCommand(lights);
		lightSwitch.execute(allLightsCommand);
	}

}
