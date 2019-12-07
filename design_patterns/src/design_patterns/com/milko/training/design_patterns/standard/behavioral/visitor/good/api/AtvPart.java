package design_patterns.com.milko.training.design_patterns.standard.behavioral.visitor.good.api;

import design_patterns.com.milko.training.design_patterns.standard.behavioral.visitor.good.visitor.api.AtvPartVisitor;

public interface AtvPart {
	public void accept(AtvPartVisitor visitor);
}
