package com.creatio.crm.language.basic.practice;

public class TwoDArr {

	public static void main(String[] args) {

		/*
		 * int[] arr1= {10,20,30}; int [] arr2= {50,60,70}; int [] arr3= {80,90,100};
		 */

		int[][] arr = { { 10, 20, 30 }, { 50, 60, 70 }, { 80, 90, 100 } };
		// index--{0 ,1 ,2} {0 ,1 ,2} {0 ,1 ,2}
		// index {1 } {2 } {3 }

		/*
		 * System.out.println(arr[0][0]); System.out.println(arr[0][1]);
		 * System.out.println(arr[0][2]);
		 */

		for (int i = 0; i <arr.length; i++) {
			for (int j = 0; j<arr[i].length; j++) {
				System.out.println(arr[i][j]);
			}
			System.out.println("");

		}

	}

}
