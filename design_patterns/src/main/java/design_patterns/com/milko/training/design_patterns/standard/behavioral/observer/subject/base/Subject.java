package design_patterns.com.milko.training.design_patterns.standard.behavioral.observer.subject.base;

import java.util.ArrayList;
import java.util.List;

import design_patterns.com.milko.training.design_patterns.standard.behavioral.observer.observer.base.Observer;

public abstract class Subject {
	private List<Observer> observers = new ArrayList<>();
	
	public abstract void setState(String state);
	public abstract String getState();
	
	public void attach(Observer observer) {
		this.observers.add(observer);
	}
	
	public void detach(Observer observer) {
		this.observers.remove(observer);
	}
	
	public void notifyObservers() {
		for (Observer observer : observers) {
			observer.update();
		}
	}
}
