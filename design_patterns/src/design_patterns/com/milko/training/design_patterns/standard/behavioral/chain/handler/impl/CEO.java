package design_patterns.com.milko.training.design_patterns.standard.behavioral.chain.handler.impl;

import design_patterns.com.milko.training.design_patterns.standard.behavioral.chain.handler.base.Handler;
import design_patterns.com.milko.training.design_patterns.standard.behavioral.request.Request;

public class CEO extends Handler{

	@Override
	public void handleRequest(Request request) {
		System.out.println("CEOs can approve anything they want");
	}

}
