package design_patterns.com.milko.training.design_patterns.standard.behavioral.mediator.mediator;

import java.util.ArrayList;
import java.util.List;

import design_patterns.com.milko.training.design_patterns.standard.behavioral.mediator.receiver.Light;

public class Mediator {
	private List<Light> lights = new ArrayList<>();
	
	public void registerLight(Light light) {
		this.lights.add(light);
	}
	
	public void turnOnAllLights() {
		for (Light light : lights) {
			if (!light.isOn()) {
				light.toggle();
			}
		}
	}
	
	public void turnOffAllLights() {
		for (Light light : lights) {
			if (light.isOn()) {
				light.toggle();
			}
		}
	}
}
