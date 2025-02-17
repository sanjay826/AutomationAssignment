package com.interview.question;

/*Find Maximum and Minimum
Write a program to find the maximum and minimum values in an array of integers.*/

public class FindMaxMin {

	public static void main(String[] args) {
		int[] number= {10,50,40,30};
		
		int max = number[0];
        int min = number[0];
		
		
		for(int i=1;i<number.length;i++) {
			if(number[i] >max) {
				max=number[i];
			}
			if(number[i]<min) {
				min=number[i];
			}
			
			
		}
		System.out.println("Maximum Value :" +max);
		System.out.println("Minimum Value :" +min);
		

	}

}
