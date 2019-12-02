package design_patterns.com.milko.training.design_patterns.standard.behavioral.state.main;

import design_patterns.com.milko.training.design_patterns.standard.behavioral.state.context.Fan;

public class StateDemo {

	public static void main(String[] args) {
		Fan fan = new Fan();

		System.out.println(fan);
		fan.pullChain();
		
		System.out.println(fan);
		fan.pullChain();
		
		System.out.println(fan);
		fan.pullChain();
		
		System.out.println(fan);
		fan.pullChain();
		
	}

}
