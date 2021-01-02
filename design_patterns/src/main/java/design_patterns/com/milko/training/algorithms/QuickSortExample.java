package main.java.design_patterns.com.milko.training.algorithms;

import java.util.Arrays;

/**
 * Quicksort algorithm is one of the most used sorting algorithm, especially to sort large lists/arrays. Quicksort is a divide and conquer algorithm, which means original array is divided into two arrays, each of them is sorted individually and then sorted output is merged to produce the sorted array. On the average, it has O(n log n) complexity, making quicksort suitable for sorting big data volumes.

In more standard words, quicksort algorithm repeatedly divides an un-sorted section into a lower order sub-section and a higher order sub-section by comparing to a pivot element. At the end of recursion, we get sorted array. Please note that the quicksort can be implemented to sort “in-place”. This means that the sorting takes place in the array and that no additional array need to be created.

Quicksort algorithm
The basic idea of Quicksort algorithm can be described as these steps:

If the array contains only one element or zero elements then the array is sorted. If the array contains more then one element then:

Select an element as a pivot element, generally from middle but not necessary.
Data elements are grouped into two parts: one with elements that are in lower order than the pivot element, one with element that are in higher order than the pivot element.
Sort the both parts separately by repeating step 1 and 2.
 * @author Mgalev
 *
 */

public class QuickSortExample {

	public static void main(String[] args) {
		//This is unsorted array
		 Integer[] array = new Integer[] { 12, 13, 24, 10, 3, 6, 90, 70 };
		 
		 //use quicksort
		 quickSort(array, 0, array.length - 1);
		 
		 //print sorted array
		 System.out.println(Arrays.toString(array));

	}

	private static void quickSort(Integer[] array, int low, int high) {
		//add validations
		
		//check for empty or null array
		if (array == null || array.length == 0) {
			return;
		}
		
		if (low >= high) {
			return;
		}
		
		//declare pivot and make left < pivot and right > pivot
		int middle = low + (high - low) /2;
		int pivot = array[middle];
		
		// sort left < pivot and right > pivot
		int i=low, j = high;
		while (i <= j) {
			
		}
	}

}
