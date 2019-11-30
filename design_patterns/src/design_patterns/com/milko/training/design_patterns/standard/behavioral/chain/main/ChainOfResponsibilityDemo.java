package design_patterns.com.milko.training.design_patterns.standard.behavioral.chain.main;

import design_patterns.com.milko.training.design_patterns.standard.behavioral.chain.enums.RequestType;
import design_patterns.com.milko.training.design_patterns.standard.behavioral.chain.handler.impl.CEO;
import design_patterns.com.milko.training.design_patterns.standard.behavioral.chain.handler.impl.Director;
import design_patterns.com.milko.training.design_patterns.standard.behavioral.chain.handler.impl.VP;
import design_patterns.com.milko.training.design_patterns.standard.behavioral.request.Request;

public class ChainOfResponsibilityDemo {

	public static void main(String[] args) {
		Director director = new Director();
		VP vp = new VP();
		CEO ceo = new CEO();
		
		director.setParentSuccessor(vp);
		vp.setParentSuccessor(ceo);
		
		Request request = new Request(RequestType.CONFERENCE, 500);
		director.handleRequest(request);
		
		request = new Request(RequestType.PURCHASE, 1000);
		vp.handleRequest(request);
		
		request = new Request(RequestType.PURCHASE, 2000);
		ceo.handleRequest(request);

	}

}
