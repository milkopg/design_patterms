package main.java.design_patterns.com.milko.training.algorithms.recursion_and_backtracking.recursion;

import java.util.Scanner;

public class RecurionFactorialExample {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();
		
		int factorial = calculateFactorial(number);
		System.out.println(factorial);
	}

	private static int calculateFactorial(int number) {
		if ( number == 1) {
			return 1;
		}
		
		
		return number * calculateFactorial(number-1);
	}

}

//4 => 1 * 2 * 3 * 4