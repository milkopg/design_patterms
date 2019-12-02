package design_patterns.com.milko.training.design_patterns.standard.behavioral.state.state.impl;

import design_patterns.com.milko.training.design_patterns.standard.behavioral.state.context.Fan;
import design_patterns.com.milko.training.design_patterns.standard.behavioral.state.state.base.State;

public class FanMedState extends State {
	
	private Fan context;

	public FanMedState(Fan fan) {
		this.context = fan;
	}

	@Override
	public void handleRequest() {
		context.setState(context.getFanHighState());
		System.out.println("Turning fan on High");
	}

	@Override
	public String toString() {
		return "Fan is on medium";
	}
	
}
