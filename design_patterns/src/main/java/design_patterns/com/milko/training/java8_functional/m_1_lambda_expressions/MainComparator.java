package design_patterns.com.milko.training.java8_functional.m_1_lambda_expressions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Function;

public class MainComparator {
	public static void main(String[] args) {
		Person milko = new Person("Milko", "Galev", 37);
		Person nora = new Person("Nora", "Galeva", 34);
		Person pavel = new Person("Pavel", "Galev", 6);
		Person nataliya = new Person("Nataliya", "Galeva", 1);
		List<Person> people = new ArrayList<Person>(Arrays.asList(milko, nora, pavel, nataliya));
		
		Comparator<Person> cmpAge = (p1, p2) -> p2.getAge() - p1.getAge();
		Comparator<Person> cmpFirstName = (p1, p2) -> p1.getFirstName().compareTo(p2.getFirstName());
		Comparator<Person> cmpLastName = (p1, p2) -> p1.getLastName().compareTo(p2.getLastName());
		
		Function<Person, Integer> f1 = p -> p.getAge();
		Function<Person, String> f2 = p -> p.getLastName();
		Function<Person, String> f3 = p-> p.getFirstName();
		
		Comparator<Person> cmpPerson = Comparator.comparing(Person::getAge);
		Comparator<Person> cmpPersonLastName = Comparator.comparing(Person::getLastName);
		
		Comparator<Person> cmp = Comparator.comparing(Person::getLastName)
				.thenComparing(Person::getFirstName)
				.thenComparing(Person::getAge);
		System.out.println(cmpAge.compare(milko, nora));
		
	}
}
