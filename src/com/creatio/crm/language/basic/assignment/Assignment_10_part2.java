package com.creatio.crm.language.basic.assignment;

public class Assignment_10_part2 {

	public static void main(String[] args) {
		{
			int totalNoOfItreation = 5;
			int space = 5;
			// this loop iterate row
			for (int i = 1; i <= totalNoOfItreation; i++) {

				// this loop iterate column
				for (int j = i; j < space; j++) {
					// print the space 
					System.out.print(" ");
				}
                // iterate the digit by increment 
				for (int k = 1; k <= i; k++) {
					// print the value in ascending order 
					System.out.print(k + " ");
				}
				// now print to next line 
				System.out.println();
			}
			// Again this loop is iterate the row but decrement way 
			for (int i = totalNoOfItreation - 1; i >= 1; i--) {
				// Again this loop is iterate the column
				for (int m = totalNoOfItreation; m > i; m--) {
					System.out.print(" ");
				}
				for (int n = 1; n <= i; n++) {
					System.out.print(n + " ");
				}
				System.out.println();
			}
		}
	}
}
