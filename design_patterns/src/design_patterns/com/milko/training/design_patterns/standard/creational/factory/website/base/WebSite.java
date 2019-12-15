package design_patterns.com.milko.training.design_patterns.standard.creational.factory.website.base;

import java.util.ArrayList;
import java.util.List;

import design_patterns.com.milko.training.design_patterns.standard.creational.factory.page.base.Page;

public abstract class WebSite {
	protected List<Page> pages = new ArrayList<>();
	
	public WebSite() {
		this.createWebsite();
	}
	
	protected abstract void createWebsite();

	public List<Page> getPages() {
		return pages;
	}
	
}
