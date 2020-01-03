package design_patterns.com.milko.training.java8_functional.m_2_data_processing_functions;

import java.util.function.DoublePredicate;
import java.util.function.Predicate;

import design_patterns.com.milko.training.java8_functional.m_1_lambda_expressions.Person;

public class PredicateDemo {

	public static void main(String[] args) {
		Predicate<Person> ageGT20 = person -> person.getAge() >20;
		System.out.println(ageGT20.test(new Person("Milko", "Galev", 37)) + "\n");
		
		Predicate<Integer> isEven = s-> s % 2 == 0;
		System.out.println("4 is even: " + isEven.test(4));
		System.out.println("3 is even: " + isEven.test(3));
		
		System.out.println("\n");
		
		DoublePredicate isPositive = p -> p > 0;
		System.out.println("isPositive: -1: " + isPositive.test(-1d));
		System.out.println("isPositive: 1: " + isPositive.test(1d));
	}

}
