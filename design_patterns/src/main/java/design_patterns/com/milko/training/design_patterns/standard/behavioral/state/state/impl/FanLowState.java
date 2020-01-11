package design_patterns.com.milko.training.design_patterns.standard.behavioral.state.state.impl;

import design_patterns.com.milko.training.design_patterns.standard.behavioral.state.context.Fan;
import design_patterns.com.milko.training.design_patterns.standard.behavioral.state.state.base.State;

public class FanLowState extends State {

	private Fan context;
	
	public FanLowState(Fan context) {
		this.context = context;
	}

	@Override
	public void handleRequest() {
		context.setState(context.getFanMedState());
		System.out.println("Turning fan on medium");
	}

	@Override
	public String toString() {
		return "Fan is on low";
	}
}
