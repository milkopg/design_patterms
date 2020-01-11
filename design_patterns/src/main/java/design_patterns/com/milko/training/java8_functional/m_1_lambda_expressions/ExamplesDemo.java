package design_patterns.com.milko.training.java8_functional.m_1_lambda_expressions;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;

public class ExamplesDemo {
	public static void main(String[] args) {
		BinaryOperator<Integer> max = Integer::max;
		System.out.println(max.apply(2, 3));
		
		Consumer<String> printer = s-> System.out.println(s);
		printer.accept("consumer");
		
		Consumer<String> printer2 = System.out::println;
		printer2.accept("consumer2");
		
		comparatorExample();
	}

	private static void comparatorExample() {
		List<String> list1 = Arrays.asList("V", "bfdd", "we");
		List<String> list2 = Arrays.asList("V", "bfdd", "we");		
	
		java.util.Comparator<String> comparator = new java.util.Comparator<String>() {
			

			@Override
			public int compare(String o1, String o2) {
				return Integer.compare(o1.length(), o2.length());
			}
		};
		
		java.util.Comparator<String> comparator2 = (String s1, String s2) ->
			Integer.compare(s1.length(), s2.length());
		
			Collections.sort(list1, comparator);
			Collections.sort(list2, comparator2);
			
			System.out.println("list1: " + list1);
			System.out.println("list2: " + list2);
			
	}
}
