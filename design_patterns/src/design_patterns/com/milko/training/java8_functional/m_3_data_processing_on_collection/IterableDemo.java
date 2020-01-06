package design_patterns.com.milko.training.java8_functional.m_3_data_processing_on_collection;

import java.util.List;

import design_patterns.com.milko.training.java8_functional.m_1_lambda_expressions.Person;
import design_patterns.com.milko.training.java8_functional.m_1_lambda_expressions.PersonListCreator;

public class IterableDemo {

	public static void main(String[] args) {
		
		List<Person> people = PersonListCreator.getGalevList();
		people.forEach(System.out::println);
		
		System.out.println("removeIf person.getAge() > 20");
		people.removeIf(person -> person.getAge() > 20);
		people.forEach(System.out::println);
	}

}
