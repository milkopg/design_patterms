package design_patterns.com.milko.training.java8_functional.m_4_map_filter_reduce;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;

public class BinaryOperatorCalculateSumDemo {
	public static void main(String[] args) {
		List<Integer> ints = new ArrayList<>(Arrays.asList(1, 2, 5, -2, 32, 31, 1, 44));
		int sum = 0;
		
		BinaryOperator<Integer> op = (op1, op2) -> op1 + op2;
		for (int i : ints) {
			sum = op.apply(sum, i);
		}
		
		System.out.println("Sum: " + sum);
	}
}
