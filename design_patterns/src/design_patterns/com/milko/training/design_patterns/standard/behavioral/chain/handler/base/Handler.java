package design_patterns.com.milko.training.design_patterns.standard.behavioral.chain.handler.base;

import design_patterns.com.milko.training.design_patterns.standard.behavioral.request.Request;

public abstract class Handler {
	protected Handler successor;
	
	public void setParentSuccessor(Handler successor) {
		this.successor = successor;
	}
	
	public abstract void handleRequest(Request request);
}
