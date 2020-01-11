package design_patterns.com.milko.training.design_patterns.standard.behavioral.observer.observer.base;

import design_patterns.com.milko.training.design_patterns.standard.behavioral.observer.subject.base.Subject;

public abstract class Observer {
	protected Subject subject;
	public abstract void update();
}
