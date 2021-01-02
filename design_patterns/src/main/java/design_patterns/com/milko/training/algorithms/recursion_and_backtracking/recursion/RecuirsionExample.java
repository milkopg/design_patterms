package main.java.design_patterns.com.milko.training.algorithms.recursion_and_backtracking.recursion;

import java.util.Arrays;
import java.util.Scanner;

public class RecuirsionExample {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		
		//int [] array = {1,2,3,4,5,6};
		int [] array = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
		int total = sum (array, 0);
		System.out.println("Total Recursion: " + total);
		
		int totalOpposite = sumOpposite(array, array.length -1);
		System.out.println("Total Recursion Opposite: " + totalOpposite);
		
		int totalIterative = sumIterative(array);
		System.out.println ("Total iterator: " + totalIterative);
	}

	

	


	private static int sum(int[] array, int index) {
		if (array.length -1 == index) {
			return array[index];
		}
		return array[index] + sum(array, (index + 1));
	}

	private static int sumOpposite(int[] array, int index) {
		if (index < 0) {
			return 0;
		}
		
		return array[index] + sumOpposite(array, (index-1));
	}
	
	private static int sumIterative(int[] array) {
		int sum = 0;
		for (int i=0; i< array.length; i++) {
			sum += array[i];
		}
		return sum;
	}

	
}
