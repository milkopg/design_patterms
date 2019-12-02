package design_patterns.com.milko.training.design_patterns.standard.behavioral.state.state.impl;

import design_patterns.com.milko.training.design_patterns.standard.behavioral.state.context.Fan;
import design_patterns.com.milko.training.design_patterns.standard.behavioral.state.state.base.State;

public class FanOffState extends State {
	
	private Fan context;

	public FanOffState(Fan fan) {
		this.context = fan;
	}

	@Override
	public void handleRequest() {
		System.out.println("Turning fan on to low");
		context.setState(context.getFanLowState());
	}
	
	@Override
	public String toString() {
		return "Fan is off";
	}

}
