package design_patterns.com.milko.training.design_patterns.standard.structural.proxy.service;

public class TwitterServiceStub implements TwitterService {


	@Override
	public String getTimeline(String screenName) {
		return "My neato timeline";
	}

	@Override
	public void postToTimeline(String screenName, String message) {
		
	}

}
