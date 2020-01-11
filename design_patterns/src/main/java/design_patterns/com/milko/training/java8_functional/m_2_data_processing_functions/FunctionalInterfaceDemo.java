package design_patterns.com.milko.training.java8_functional.m_2_data_processing_functions;

import java.util.function.Predicate;

public class FunctionalInterfaceDemo {

	public static void main(String[] args) {
		Predicate<String> jdk7Predicate = new Predicate<String>() {

			@Override
			public boolean test(String string) {
				// TODO Auto-generated method stub
				return string.length() < 20;
			}
		};
		
		System.out.println("jdk7Predicate : " + jdk7Predicate.test("jdk7Predicate"));
		
		Predicate<String> jdk8Predicate = s-> s.length() < 20;
		System.out.println("jdk8Predicate : " + jdk8Predicate.test("jdk8Predicate"));
		
		
	}

}
