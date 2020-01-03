package design_patterns.com.milko.training.java8_functional.m_2_data_processing_functions;

import java.util.function.BiPredicate;

public class BiPredicateDemo {

	public static void main(String[] args) {
		BiPredicate<Integer, Double> isBigger = (x, y) -> x > y;
		System.out.println("4 > 5 : " + isBigger.test(4, 5d));
		System.out.println("5 > 4 : " + isBigger.test(5, 4d));
		
	}

}
