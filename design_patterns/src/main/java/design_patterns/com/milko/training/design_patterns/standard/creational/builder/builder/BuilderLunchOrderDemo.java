package design_patterns.com.milko.training.design_patterns.standard.creational.builder.builder;

import design_patterns.com.milko.training.design_patterns.standard.creational.builder.builder.LunchOrder.Builder;

public class BuilderLunchOrderDemo {

	public static void main(String[] args) {
		Builder builder = new LunchOrder.Builder();
		builder.bread("Wheat").dressing("Mayo").meat("Turkey");
		
		LunchOrder lunchOrder = builder.build();
		
		System.out.println(lunchOrder.getBread());
		System.out.println(lunchOrder.getCondiments());
		System.out.println(lunchOrder.getDressing());
		System.out.println(lunchOrder.getMeat());	

	}

}
