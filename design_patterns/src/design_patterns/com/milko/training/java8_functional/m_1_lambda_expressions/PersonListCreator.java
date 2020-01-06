package design_patterns.com.milko.training.java8_functional.m_1_lambda_expressions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PersonListCreator {
	public static List<Person> getGalevList() {
		Person milko = new Person("Milko", "Galev", 37);
		Person nora = new Person("Nora", "Galeva", 34);
		Person pavel = new Person("Pavel", "Galev", 6);
		Person nataliya = new Person("Nataliya", "Galeva", 1);
		List<Person> people = new ArrayList<Person>(Arrays.asList(milko, nora, pavel, nataliya));
		return people;
	}
	
	public static List<Person> getVasileviList() {
		Person milko = new Person("Milko", "Vasilev", 62);
		Person tanya = new Person("Tanya", "Vasileva", 60);
		List<Person> people = new ArrayList<Person>(Arrays.asList(milko, tanya));
		return people;
	}
	
	
}
