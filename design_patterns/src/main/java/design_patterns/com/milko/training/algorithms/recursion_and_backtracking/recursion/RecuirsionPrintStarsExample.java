package main.java.design_patterns.com.milko.training.algorithms.recursion_and_backtracking.recursion;

import java.util.Scanner;

/**
 * create a program which draws following picture
 * 
 * 	*****
 *  ****
 *  ***
 *  **
 *  *
 *  #
 *  ##
 *  ###
 *  ####
 *  #####
 * @author Mgalev
 *
 */
public class RecuirsionPrintStarsExample {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();
		
		print(number);
	}

	private static void print(int number) {
		if (number == 0) {
			return;
		}
		
		drawString(number, "*");
		System.out.println("");
		print(number-1);
			
		drawString(number, "#");
		System.out.println("");
	}

	private static void drawString(int number, String string) {
		for (int i=0; i< number ; i++) {
			System.out.print(string);
		}
	}
}
