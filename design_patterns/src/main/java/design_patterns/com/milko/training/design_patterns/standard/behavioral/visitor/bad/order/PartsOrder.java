package design_patterns.com.milko.training.design_patterns.standard.behavioral.visitor.bad.order;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import design_patterns.com.milko.training.design_patterns.standard.behavioral.visitor.bad.api.AtvPart;

public class PartsOrder implements AtvPart{
	
	private List<AtvPart> parts = new ArrayList<AtvPart>();
	
	public PartsOrder() {
		// TODO Auto-generated constructor stub
	}
	
	public void addPart(AtvPart part) {
		parts.add(part);
	}
	
	public List<AtvPart> getParts() {
		return Collections.unmodifiableList(parts);
	}
	
	@Override
	public double calculateShipping() {
		double shippingCost = 0;
		for (AtvPart atvPart : parts) {
			shippingCost += atvPart.calculateShipping();
		}
		return shippingCost;
	}

}
