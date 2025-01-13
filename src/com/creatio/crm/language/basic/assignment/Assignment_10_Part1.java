package com.creatio.crm.language.basic.assignment;

public class Assignment_10_Part1 {

	public static void main(String[] args) {

		int[] value = { 12, 34, 11, 36, 87, 98, 93 };

		int highest = value[0];
		int secondHighest = 0;
		int thridHighest = 0;
		for (int i = 1; i < value.length; i++) {
			if (value[i] > highest) {
				thridHighest = secondHighest;
				secondHighest = highest;
				highest = value[i];
			} else if (value[i] > secondHighest && value[i] != highest) {
				thridHighest = secondHighest;
				secondHighest = value[i];

			} else if (value[i] > thridHighest && value[i] != secondHighest && value[i] != highest) {
				thridHighest = value[i];
			}
		}
		
		System.out.println("Second highest value : " + secondHighest);
		System.out.println("Third highest value: " + thridHighest);

	}

}
