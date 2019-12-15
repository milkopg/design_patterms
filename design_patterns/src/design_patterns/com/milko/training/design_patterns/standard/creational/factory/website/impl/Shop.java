package design_patterns.com.milko.training.design_patterns.standard.creational.factory.website.impl;

import design_patterns.com.milko.training.design_patterns.standard.creational.factory.page.impl.CartPage;
import design_patterns.com.milko.training.design_patterns.standard.creational.factory.page.impl.ItemPage;
import design_patterns.com.milko.training.design_patterns.standard.creational.factory.page.impl.SearchPage;
import design_patterns.com.milko.training.design_patterns.standard.creational.factory.website.base.WebSite;

public class Shop extends WebSite {

	@Override
	protected void createWebsite() {
		pages.add(new CartPage());
		pages.add(new ItemPage());
		pages.add(new SearchPage());
	}

}
