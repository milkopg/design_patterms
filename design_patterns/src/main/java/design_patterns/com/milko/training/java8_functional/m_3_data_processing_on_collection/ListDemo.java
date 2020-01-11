package design_patterns.com.milko.training.java8_functional.m_3_data_processing_on_collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

import design_patterns.com.milko.training.java8_functional.m_1_lambda_expressions.Person;
import design_patterns.com.milko.training.java8_functional.m_1_lambda_expressions.PersonListCreator;

public class ListDemo {

	public static void main(String[] args) {
		List<String> names = new ArrayList<String>(Arrays.asList("Milko", "Nora", "Pavel", "Nataliya"));
		names.replaceAll(name -> name.toUpperCase());
		System.out.println(names);
		
		List<String> names2 = new ArrayList<String>(Arrays.asList("Milko", "Nora", "Pavel", "Nataliya"));
		names2.replaceAll(String::toUpperCase);
		System.out.println(names2);
		List<Person> people = PersonListCreator.getGalevList();
		
		people.sort(Comparator.comparing(Person::getFirstName)
				.thenComparing(Person::getAge));
		System.out.println(people);
	} 

}
