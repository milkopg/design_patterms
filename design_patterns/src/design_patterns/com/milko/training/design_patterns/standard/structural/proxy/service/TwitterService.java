package design_patterns.com.milko.training.design_patterns.standard.structural.proxy.service;

public interface TwitterService {
	public String getTimeline(String screenName);
	public void postToTimeline(String screenName, String message);
}
