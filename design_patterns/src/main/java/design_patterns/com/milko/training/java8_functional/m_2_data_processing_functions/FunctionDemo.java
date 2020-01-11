package design_patterns.com.milko.training.java8_functional.m_2_data_processing_functions;

import java.util.function.Function;

import design_patterns.com.milko.training.java8_functional.m_1_lambda_expressions.Person;

public class FunctionDemo {

	public static void main(String[] args) {
		Function<Person, Integer> ageMappger = person -> person.getAge();
		Function<Person, Integer> otherAgeMappger = Person::getAge;
		
		System.out.println(ageMappger.apply(new Person("Milko", "Galev", 37)));
		System.out.println(otherAgeMappger.apply(new Person("Nora", "Galeva", 34)));
					
	}

}
