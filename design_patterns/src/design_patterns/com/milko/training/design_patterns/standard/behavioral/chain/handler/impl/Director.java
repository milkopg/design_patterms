package design_patterns.com.milko.training.design_patterns.standard.behavioral.chain.handler.impl;

import design_patterns.com.milko.training.design_patterns.standard.behavioral.chain.enums.RequestType;
import design_patterns.com.milko.training.design_patterns.standard.behavioral.chain.handler.base.Handler;
import design_patterns.com.milko.training.design_patterns.standard.behavioral.chain.request.Request;

public class Director extends Handler{

	@Override
	public void handleRequest(Request request) {
		if (RequestType.CONFERENCE == request.getRequestType()) {
			System.out.println("Director can approve conference");
		} else  {
			successor.handleRequest(request);
		}
		
	}

}
