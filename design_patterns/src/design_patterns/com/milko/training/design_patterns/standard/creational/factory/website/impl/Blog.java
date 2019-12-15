package design_patterns.com.milko.training.design_patterns.standard.creational.factory.website.impl;

import design_patterns.com.milko.training.design_patterns.standard.creational.factory.page.impl.AboutPage;
import design_patterns.com.milko.training.design_patterns.standard.creational.factory.page.impl.CommentPage;
import design_patterns.com.milko.training.design_patterns.standard.creational.factory.page.impl.ContactPage;
import design_patterns.com.milko.training.design_patterns.standard.creational.factory.page.impl.PostPage;
import design_patterns.com.milko.training.design_patterns.standard.creational.factory.website.base.WebSite;

public class Blog extends WebSite {

	@Override
	protected void createWebsite() {
		pages.add(new PostPage());
		pages.add(new AboutPage());
		pages.add(new CommentPage());
		pages.add(new ContactPage());
	}
}
