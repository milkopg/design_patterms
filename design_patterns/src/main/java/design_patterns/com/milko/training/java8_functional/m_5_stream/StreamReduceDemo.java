package design_patterns.com.milko.training.java8_functional.m_5_stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import design_patterns.com.milko.training.java8_functional.m_1_lambda_expressions.Person;
import design_patterns.com.milko.training.java8_functional.m_1_lambda_expressions.PersonListCreator;

public class StreamReduceDemo {
	public static void main(String[] args) {
		List<Person> people = PersonListCreator.getGalevList();
//		int sumOfAges = people.stream()
//				.map(p -> p.getAge() > 0)
//							//.reduce((p1, p2) -> p1.getAge() + p2.getAge());
//							.reduce((p1, p2) -> p1.getAge() + p2.getAge());
//		
//		people.stream()
//			.reduce(new ArrayList<Integer>(), 
//					(list, p) -> {list.add(p.get)}, combiner)
		  // Creating list of integers 
        List<Integer> array = Arrays.asList(-2, 0, 4, 6, 8); 
  
        // Finding sum of all elements 
        int sum = array.stream().reduce(0, 
                (element1, element2) -> element1 + element2); 
        System.out.println(sum);
	}
}
