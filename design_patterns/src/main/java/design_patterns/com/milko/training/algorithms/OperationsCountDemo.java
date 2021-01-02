package main.java.design_patterns.com.milko.training.algorithms;

public class OperationsCountDemo {

	public static void main(String[] args) {
		long count = getOperatisonsCount(25);
		System.out.println(count);
	}

	private static long getOperatisonsCount(int n) {
		long counter = 0;
		for (int i=0; i < n; i++) 
			for (int j=0; j < n ; j++)
				counter++;
		return counter;
	}

}
