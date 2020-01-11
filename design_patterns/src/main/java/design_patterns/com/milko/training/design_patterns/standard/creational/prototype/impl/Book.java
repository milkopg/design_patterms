package design_patterns.com.milko.training.design_patterns.standard.creational.prototype.impl;

import design_patterns.com.milko.training.design_patterns.standard.creational.prototype.base.Item;

public class Book extends Item {
	
	private int numberOfPages;

	public int getNumberOfPages() {
		return numberOfPages;
	}

	public void setNumberOfPages(int numberOfPages) {
		this.numberOfPages = numberOfPages;
	}
}
