package design_patterns.com.milko.training.design_patterns.standard.behavioral.state.state.impl;

import design_patterns.com.milko.training.design_patterns.standard.behavioral.state.context.Fan;
import design_patterns.com.milko.training.design_patterns.standard.behavioral.state.state.base.State;

public class FanHighState extends State {
	
	private Fan context;
	
	public FanHighState(Fan context) {
		this.context = context;
	}

	@Override
	public void handleRequest() {
		System.out.println("Turning fan off ...");
		context.setState(context.getFanHighState());
	}

	@Override
	public String toString() {
		return "Fan is on high";
	}
	
}
