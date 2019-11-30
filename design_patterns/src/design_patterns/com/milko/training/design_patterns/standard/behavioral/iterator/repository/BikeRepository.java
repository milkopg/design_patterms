package design_patterns.com.milko.training.design_patterns.standard.behavioral.iterator.repository;

import java.util.Iterator;

public class BikeRepository implements Iterable<String> {

	private String [] bikes;
	private int index;
	
	
	public BikeRepository() {
		bikes = new String [10];
		index = 0;
	}
	
	public void addBike(String bike) {
		if (index == bikes.length) {
			String [] largerBykes = new String[bikes.length + 5];
			System.arraycopy(bikes, 0, largerBykes, 0, bikes.length);
			bikes = largerBykes;
			largerBykes = null;
		}
		bikes[index] = bike;
		index++;
	}
	
	
	@Override
	public Iterator<String> iterator() {
		Iterator<String> it = new Iterator<String>() {
			private int currentIndex = 0;
			
			@Override
			public boolean hasNext() {
				return currentIndex < bikes.length && bikes[currentIndex] != null;
			}

			@Override
			public String next() {
				return bikes[currentIndex++];
			}
		};
		return it;
	}


}
