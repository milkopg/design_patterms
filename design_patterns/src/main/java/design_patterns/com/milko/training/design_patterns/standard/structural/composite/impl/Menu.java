package design_patterns.com.milko.training.design_patterns.standard.structural.composite.impl;

import java.util.Iterator;

import design_patterns.com.milko.training.design_patterns.standard.structural.composite.base.MenuComponent;

public class Menu extends MenuComponent {

	public Menu(String name, String url) {
		this.name = name;
		this.url = url;
	}
	
	@Override
	public MenuComponent add(MenuComponent menuComponent) {
		menuComponents.add(menuComponent);
		return menuComponent;
	}
	
	@Override
	public MenuComponent remove(MenuComponent menuComponent) {
		menuComponents.remove(menuComponent);
		return menuComponent;
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder(); //builder pattern
		
		builder.append(print(this));
		
		Iterator<MenuComponent> itr = menuComponents.iterator();
		while(itr.hasNext()) {
			MenuComponent menuComponent = itr.next();
			builder.append(menuComponent.toString());
		}
		
		return builder.toString();
	}

}
