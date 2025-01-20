package com.creatio.crm.language.basic.assignment;

public class Assignment_13_PartA_2 {
	public static void main(String[] args) {
		String sentence = "Sanjay Kumar";

		String[] words = sentence.split(" ");

		for (int i = words.length - 1; i >= 0; i--) {
			System.out.print(words[i] + " ");
		}

	}

}
