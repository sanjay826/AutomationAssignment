package com.creatio.crm.language.basic.practice;

import java.util.Arrays;
import java.util.stream.IntStream;

public class SortingAlgorithm {

	public static void main(String[] args) {

		/*
		 * We want value in ascending and descending order of value
		 * Select any one element, compare with rest of the element, find the least value and place it either
		 * at first position or last position.
		 * 
		 */

		int[] arr = { 4, 1, 3, 5, 2 };
		System.out.println("unsorted Array" +Arrays.toString(arr));
		for(int i=0;i<arr.length-1;i++) { // Select element loop
			for(int j=i+1;j<arr.length;j++) { // comparison element loop
				
				if(arr[i]>arr[j]) {
					int swap=arr[i];
					arr[i]=arr[j];
					arr[j]=swap;
					
				}
				
			}
			
		}
		System.out.println("sorted Array" +Arrays.toString(arr));
		

		
		
		
		
		
		// Ascending order with java inbuilt functionality
		int[] ascending = IntStream.of(arr).sorted().toArray();
		System.out.println("Ascending Order: " + Arrays.toString(ascending));

		// Descending order with java inbuilt functionality
		int[] descending = IntStream.of(arr).boxed().sorted((a, b) -> b - a).mapToInt(Integer::intValue).toArray();
		System.out.println("Descending Order: " + Arrays.toString(descending));
	}

}
