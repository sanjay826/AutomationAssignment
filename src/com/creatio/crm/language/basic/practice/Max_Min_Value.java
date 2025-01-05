package com.creatio.crm.language.basic.practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Max_Min_Value {

	public static void main(String[] args) {

		/*
		 * Input : List = [3, 5, 18, 4, 6] Output: Min value of our list : 3 max value
		 * of our list : 18
		 * 
		 */

		List<Integer> CompareValue = new ArrayList<>();

		CompareValue.add(3);
		CompareValue.add(5);
		CompareValue.add(18);
		CompareValue.add(4);
		CompareValue.add(6);

		int min = Collections.min(CompareValue);
		int max = Collections.max(CompareValue);
		if (min == max) {

			System.out.println("All Element are equal");
		} else {
			System.out.println("Min value of our list : " + min);
			System.out.println("Max value of our list : " + max);
		}

	}

}
