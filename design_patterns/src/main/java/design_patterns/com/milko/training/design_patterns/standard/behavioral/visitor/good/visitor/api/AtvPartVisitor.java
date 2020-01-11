package design_patterns.com.milko.training.design_patterns.standard.behavioral.visitor.good.visitor.api;

import design_patterns.com.milko.training.design_patterns.standard.behavioral.visitor.good.order.PartsOrder;
import design_patterns.com.milko.training.design_patterns.standard.behavioral.visitor.good.impl.Fender;
import design_patterns.com.milko.training.design_patterns.standard.behavioral.visitor.good.impl.Oil;
import design_patterns.com.milko.training.design_patterns.standard.behavioral.visitor.good.impl.Wheel;

public interface AtvPartVisitor {
	void visit(Wheel wheel);
	void visit(Fender fender);
	void visit(Oil oil);
	void visit(PartsOrder partsOrder);
}
