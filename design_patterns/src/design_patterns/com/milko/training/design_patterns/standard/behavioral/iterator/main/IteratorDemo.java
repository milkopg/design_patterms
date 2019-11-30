package design_patterns.com.milko.training.design_patterns.standard.behavioral.iterator.main;

import java.util.Iterator;

import design_patterns.com.milko.training.design_patterns.standard.behavioral.iterator.repository.BikeRepository;

public class IteratorDemo {

	public static void main(String[] args) {
		BikeRepository repo = new BikeRepository();
		repo.addBike("Cervelo");
		repo.addBike("Scott");
		repo.addBike("Fuji");
		
		Iterator<String> bikeIterator = repo.iterator();
		for (String bike : repo) {
			System.out.println(bike);
		}
	}
}
