package design_patterns.com.milko.training.java8_functional.m_5_stream;

import java.util.List;
import java.util.Optional;

import design_patterns.com.milko.training.java8_functional.m_1_lambda_expressions.Person;
import design_patterns.com.milko.training.java8_functional.m_1_lambda_expressions.PersonListCreator;

public class StreamFindReductionDemo {

	public static void main(String[] args) {
		List<Person> people = PersonListCreator.getGalevList();
		Optional<Person> findFirst= people.stream()
			.findFirst()
			.filter(p -> p.getAge() > 35);
		System.out.println(findFirst.get());
		
		Optional<Person> findAny= people.stream()
				.findAny()
				.filter(p -> p.getAge() < 20);
			System.out.println(findAny.get());
			
	}

}
