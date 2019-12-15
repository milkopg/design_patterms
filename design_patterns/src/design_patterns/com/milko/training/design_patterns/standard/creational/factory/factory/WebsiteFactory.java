package design_patterns.com.milko.training.design_patterns.standard.creational.factory.factory;

import design_patterns.com.milko.training.design_patterns.standard.creational.factory.typeenum.WebsiteType;
import design_patterns.com.milko.training.design_patterns.standard.creational.factory.website.base.WebSite;
import design_patterns.com.milko.training.design_patterns.standard.creational.factory.website.impl.Blog;
import design_patterns.com.milko.training.design_patterns.standard.creational.factory.website.impl.Shop;

public class WebsiteFactory {
	public static WebSite  getWebsite(WebsiteType type) {
		switch (type) {
		
		case BLOG : return new Blog();
		case SHOP : return new Shop();

		default:
			break;
		}
		return null;
		
	}
}
