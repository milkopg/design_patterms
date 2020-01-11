package design_patterns.com.milko.training.design_patterns.standard.structural.proxy.main;

import design_patterns.com.milko.training.design_patterns.standard.structural.proxy.proxy.SecurityProxy;
import design_patterns.com.milko.training.design_patterns.standard.structural.proxy.service.TwitterService;
import design_patterns.com.milko.training.design_patterns.standard.structural.proxy.service.TwitterServiceImpl;

public class TwitterDemo {

	public static void main(String[] args) {
		TwitterService service = (TwitterService) SecurityProxy.newInstance(new TwitterServiceImpl());
		System.out.println(service.getTimeline("dasdsa"));
		
		service.postToTimeline("bh5k", "Some message that shouldn't go through.");

	}

}
