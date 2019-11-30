package design_patterns.com.milko.training.design_patterns.standard.behavioral.observer.subject.impl;

import java.util.ArrayDeque;
import java.util.Deque;

import design_patterns.com.milko.training.design_patterns.standard.behavioral.observer.subject.base.Subject;

public class MessageStream extends Subject{

	private Deque<String> messageHistory = new ArrayDeque<String>() {};
	
	@Override
	public void setState(String message) {
		messageHistory.add(message);
		
	}

	@Override
	public String getState() {
		return messageHistory.getLast();
	}

}
