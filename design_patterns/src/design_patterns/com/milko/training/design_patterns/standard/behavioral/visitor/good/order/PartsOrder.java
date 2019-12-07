package design_patterns.com.milko.training.design_patterns.standard.behavioral.visitor.good.order;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import design_patterns.com.milko.training.design_patterns.standard.behavioral.visitor.good.api.AtvPart;
import design_patterns.com.milko.training.design_patterns.standard.behavioral.visitor.good.visitor.api.AtvPartVisitor;

public class PartsOrder implements AtvPart {
	private List<AtvPart> parts = new ArrayList<>();

	public PartsOrder() {

	}

	public void addPart(AtvPart atvPart) {
		parts.add(atvPart);
	}

	public List<AtvPart> getParts() {
		return Collections.unmodifiableList(parts);
	}

	@Override
	public void accept(AtvPartVisitor visitor) {
		for (AtvPart atvPart : parts) {
			atvPart.accept(visitor);
		}
		visitor.visit(this);

	}

}
