package design_patterns.com.milko.training.java8_functional.m_5_stream;

import java.util.List;

import design_patterns.com.milko.training.java8_functional.m_1_lambda_expressions.Person;
import design_patterns.com.milko.training.java8_functional.m_1_lambda_expressions.PersonListCreator;

public class StreamMatchDemo {

	public static void main(String[] args) {
		List<Person> people = PersonListCreator.getGalevList();
		
		boolean anyMatch = people.stream()
					.anyMatch(p -> p.getAge() > 20);
		System.out.println("anyMatch p.age() > 20: " + anyMatch);
		
		boolean allMatch = people.stream()
						.allMatch(p -> p.getAge() > 20);
		System.out.println("allMatch p.age() > 20: " + allMatch);
		
		boolean noneMatch = people.stream()
							.noneMatch(p -> p.getAge() > 40);
		System.out.println("noneMatch p.age() > 40: " + noneMatch);
				
	}

}
