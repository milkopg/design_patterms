package main.java.design_patterns.com.milko.training.algorithms.recursion_and_backtracking.backtracking;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//Input	Output
//3
//3
//---
//-*-
//--e	RRDD
//DDRR


//3
//5
//-**-e
//-----
//*****	DRRRRU
//DRRRUR




public class BackTrackingMatrixExample {
	static List<Character> path = new ArrayList<>();
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int rows = Integer.parseInt(scanner.nextLine());
		int cols = Integer.parseInt(scanner.nextLine());
		
		char [][] labyrinth = new char[rows][cols];
		

		for (int row = 0; row < rows ; row++) {
			labyrinth[row] = scanner.nextLine().toCharArray();
		}
		
		findPath(labyrinth, 0, 0, ' ');
			
	}

	private static void findPath(char[][] labyrinth, int row, int col, char dir) {
		if (!isInBounds(labyrinth, row, col) 
			|| labyrinth[row][col] == 'V'
			|| labyrinth[row][col] == '*'){
			return;
		}
		
		path.add(dir);
		
		if (labyrinth[row][col] == 'e') {
			//System.out.println(row + " " + col);
			printPath();
			path.remove(path.size() - 1);
			return;
		}
		
		labyrinth[row][col] = 'V';
		
		findPath(labyrinth, row -1, col, 'U'); //UP
		findPath(labyrinth, row + 1, col, 'D'); //DOWN
		findPath(labyrinth, row, col-1, 'L'); //LEFT 
		findPath(labyrinth, row, col+1, 'R'); //RIGHT
		
		labyrinth[row][col] = '-';
		
		path.remove(path.size() - 1);
	}

	private static void printPath() {
		//path.remove(0);
		
		for (int i=1; i < path.size() ; i++ ) {
			System.out.print(path.get(i));
		}
		
//		for (Character character : path) {
//			System.out.print(character);
//		}
		System.out.println();
	}

	private static boolean isInBounds(char[][] labyrinth, int row, int col) {
		return row < labyrinth.length && row >=0 && col < labyrinth[row].length && col >=0;
	}

}
