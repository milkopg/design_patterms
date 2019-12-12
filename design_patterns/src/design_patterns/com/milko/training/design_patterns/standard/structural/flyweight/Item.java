package design_patterns.com.milko.training.design_patterns.standard.structural.flyweight;

public class Item {
	private final String name;
	
	public Item(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return name;
	}
}
