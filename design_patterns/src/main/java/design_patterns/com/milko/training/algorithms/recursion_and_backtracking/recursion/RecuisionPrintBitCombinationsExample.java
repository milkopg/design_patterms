package main.java.design_patterns.com.milko.training.algorithms.recursion_and_backtracking.recursion;

/**
 * print all bits in byte number
 * 
 *  00000000
 *  00000001
 *  00000011
 *  
 *   ....
 *  01111111
 *  10000000
 *  
 *  .........
 *  11111110
 *  11111111
 *   
 * @author Mgalev
 *
 */
public class RecuisionPrintBitCombinationsExample {
	public static void main(String[] args) {
		int memory [] = new int[3];
		printBit(0, memory);
	}

	private static void printBit(int index, int [] memory) {
		if (index >= memory.length) {
			printMemory(memory);
			return;
		}
		
		for (int i = 0; i <= 1; i++) {
			memory[index] = i;
			printBit(index+1, memory);
		}
	}

	private static void printMemory(int[] memory) {
		for (int i : memory) {
			System.out.print(i);
		}
		System.out.println();
	}
}
