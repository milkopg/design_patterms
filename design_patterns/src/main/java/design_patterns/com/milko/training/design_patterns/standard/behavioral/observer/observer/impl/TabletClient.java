package design_patterns.com.milko.training.design_patterns.standard.behavioral.observer.observer.impl;

import design_patterns.com.milko.training.design_patterns.standard.behavioral.observer.observer.base.Observer;
import design_patterns.com.milko.training.design_patterns.standard.behavioral.observer.subject.base.Subject;

public class TabletClient extends Observer {

	public TabletClient(Subject subject) {
		this.subject = subject;
		subject.attach(this);
	}
	
	public void addMessage(String message) {
		subject.setState(message + " - sent from tablet");
	}
	
	@Override
	public void update() {
		System.out.println("Tablet Stream: " + subject.getState());
	}

}
