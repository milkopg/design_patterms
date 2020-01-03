package design_patterns.com.milko.training.java8_functional.m_2_data_processing_functions;

import java.util.function.Supplier;

import design_patterns.com.milko.training.java8_functional.m_1_lambda_expressions.Person;

public class SupplierDemo2 {

	public static void main(String[] args) {
		Supplier<Person> personSupprier = () -> new Person();
		System.out.println(personSupprier.get());
		
		Supplier<Person> otherPersonSupprier = Person::new;
		System.out.println(otherPersonSupprier.get());
		

	}

}
