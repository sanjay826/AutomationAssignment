package com.creatio.crm.language.basic.assignment;

public class Assignment_13_PartA_1 {

	static int countWords(String sentence) {
		
		int count = 1;

		for (int i = 0; i < sentence.length(); i++) {
			if (sentence.charAt(i) == ' ') {
				count++;
			}
		}

		return count;
	}

	public static void main(String[] args) {

		String sentence = "fun and challenging";
		System.out.println("Number of words: " + countWords(sentence));
	}

}
