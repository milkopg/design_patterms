package design_patterns.com.milko.training.design_patterns.standard.creational.prototype.impl;

import design_patterns.com.milko.training.design_patterns.standard.creational.prototype.base.Item;

public class Movie extends Item {
	private String runtime;

	public String getRuntime() {
		return runtime;
	}

	public void setRuntime(String runtime) {
		this.runtime = runtime;
	}
}
