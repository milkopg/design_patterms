package design_patterns.com.milko.training.design_patterns.standard.behavioral.chain.handler.impl;

import design_patterns.com.milko.training.design_patterns.standard.behavioral.chain.enums.RequestType;
import design_patterns.com.milko.training.design_patterns.standard.behavioral.chain.handler.base.Handler;
import design_patterns.com.milko.training.design_patterns.standard.behavioral.request.Request;

public class VP extends Handler{

	@Override
	public void handleRequest(Request request) {
		if (RequestType.PURCHASE == request.getRequestType()) {
			if(request.getAmount() < 1500) {
				System.out.println("VPs can approve purchases below 1500");
			}
			else {
				successor.handleRequest(request);
			}
		}
	}
}
