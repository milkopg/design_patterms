package design_patterns.com.milko.training.java8_functional.m_2_data_processing_functions;

import java.util.function.BiFunction;
import java.util.function.DoubleToIntFunction;

public class BiFunctionDemo {

	public static void main(String[] args) {
		BiFunction<String, String, String> concat = (a, b) -> a + b;
		System.out.println("concat: " + concat.apply("Today is", " a wonderful day"));
		
		BiFunction<Integer, Integer, Integer> multiply = (a, b) -> a * b;
		System.out.println("multiply: " + multiply.apply(3, 4));
		
		DoubleToIntFunction doubleToInt = num -> (int) num;
		System.out.println("doubleToInt: " + doubleToInt.applyAsInt(123.456));
	}

}
