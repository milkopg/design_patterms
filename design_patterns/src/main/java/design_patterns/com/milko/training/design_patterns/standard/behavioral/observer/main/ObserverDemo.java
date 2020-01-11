package design_patterns.com.milko.training.design_patterns.standard.behavioral.observer.main;

import design_patterns.com.milko.training.design_patterns.standard.behavioral.observer.observer.impl.PhoneClient;
import design_patterns.com.milko.training.design_patterns.standard.behavioral.observer.observer.impl.TabletClient;
import design_patterns.com.milko.training.design_patterns.standard.behavioral.observer.subject.base.Subject;
import design_patterns.com.milko.training.design_patterns.standard.behavioral.observer.subject.impl.MessageStream;

public class ObserverDemo {

	public static void main(String[] args) {
		Subject subject = new MessageStream();
		
		PhoneClient phoneClient = new PhoneClient(subject);
		TabletClient tabletClient = new TabletClient(subject);
		
		phoneClient.addMessage("Here is a new message");
		
		subject.notifyObservers();
		
		tabletClient.addMessage("Another new message");

		subject.notifyObservers();
		
	}

}
