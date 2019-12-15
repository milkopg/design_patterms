package design_patterns.com.milko.training.design_patterns.standard.creational.prototype.registry;

import java.util.HashMap;
import java.util.Map;

import design_patterns.com.milko.training.design_patterns.standard.creational.prototype.base.Item;
import design_patterns.com.milko.training.design_patterns.standard.creational.prototype.impl.Book;
import design_patterns.com.milko.training.design_patterns.standard.creational.prototype.impl.Movie;

public class Registry {
	private Map<String, Item> items = new HashMap<String, Item>();
	
	public Registry() {
		loadItems();
	}

	private void loadItems() {
		Movie movie = new Movie();
		movie.setTitle("Basic Movie");
		movie.setPrice(24.99);
		movie.setRuntime("2 hours");
		items.put("Movie", movie);
		
		Book book = new Book();
		book.setNumberOfPages(335);
		book.setPrice(19.99);
		book.setTitle("Basic Book");
		items.put("Book", book);
	}
	
	public Item createItem (String type) {
		Item item = null;
		try {
			item = (Item)(items.get(type)).clone();
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return item;
	}
}
