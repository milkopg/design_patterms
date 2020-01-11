package design_patterns.com.milko.training.design_patterns.standard.behavioral.command.impl;

import java.util.List;

import design_patterns.com.milko.training.design_patterns.standard.behavioral.command.api.Command;
import design_patterns.com.milko.training.design_patterns.standard.behavioral.command.receiver.Light;

public class AllLightsCommand implements Command{
	private List<Light> lights;

	public AllLightsCommand(List<Light> light) {
		this.lights = light;
	}
	
	@Override
	public void execute() {
		for (Light light : lights) {
			if (light.isOn()) {
				light.toggle();
			}
		}
		
	}

}
