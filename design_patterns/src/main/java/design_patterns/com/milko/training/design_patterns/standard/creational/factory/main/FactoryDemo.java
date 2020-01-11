package design_patterns.com.milko.training.design_patterns.standard.creational.factory.main;

import design_patterns.com.milko.training.design_patterns.standard.creational.factory.factory.WebsiteFactory;
import design_patterns.com.milko.training.design_patterns.standard.creational.factory.typeenum.WebsiteType;
import design_patterns.com.milko.training.design_patterns.standard.creational.factory.website.base.WebSite;

public class FactoryDemo {

	public static void main(String[] args) {
		WebSite site = WebsiteFactory.getWebsite(WebsiteType.BLOG);
		System.out.println(site.getPages());
		
		site = WebsiteFactory.getWebsite(WebsiteType.SHOP);
		System.out.println(site.getPages());
	}

}
