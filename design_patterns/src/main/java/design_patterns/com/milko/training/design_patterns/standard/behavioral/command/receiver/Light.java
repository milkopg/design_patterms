package design_patterns.com.milko.training.design_patterns.standard.behavioral.command.receiver;

public class Light {
	
	boolean isOn = false;
	
	public void on () {
		System.out.println("Light switched on.");
	}
	
	public void off () {
		System.out.println("Light switched off.");
	}
	
	public void toggle() {
		if (isOn) {
			off ();
			isOn = false;
		} else {
			on();
			isOn = true;
		}
	}
	
	public boolean isOn() {
		return isOn;
	}
}
