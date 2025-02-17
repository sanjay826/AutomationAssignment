package com.interview.question;

import java.util.Arrays;

/*
. Sum of Elements
  Write a program to take an array of integers as input and calculate the sum of all elements in the array in java */

public class SumOfElements {
	
    public static void main(String[] args) {
    	int[] input= {2,4,5,6,7};
    	int sum=0;
    	for(int additionTotalnumber :input) {
    		sum+=additionTotalnumber;
    		
    	}
    	System.out.println("Array" + Arrays.toString(input));
    	System.out.println("Total of Number :" +sum);
    	
    	
    }
}
