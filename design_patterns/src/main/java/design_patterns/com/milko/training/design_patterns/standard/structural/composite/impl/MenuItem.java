package design_patterns.com.milko.training.design_patterns.standard.structural.composite.impl;

import design_patterns.com.milko.training.design_patterns.standard.structural.composite.base.MenuComponent;

public class MenuItem extends MenuComponent {

	public MenuItem(String name, String url) {
		this.name = name;
		this.url = url;
	}
	
	@Override
	public String toString() {
		return print(this);
	}

}
