package com.creatio.crm.language.basic.assignment;

public class Assingment15_Part2 {

	public static boolean isPalindrome(String s) {
		// Convert to lowercase and remove non-alphanumeric characters
		String cleanedStr = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

		// Check if the cleaned string is a palindrome
		int left = 0;
		int right = cleanedStr.length() - 1;
		while (left < right) {
			if (cleanedStr.charAt(left) != cleanedStr.charAt(right)) {
				return false;
			}
			left++;
			right--;
		}
		return true;
	}

	public static void main(String[] args) {
		String example1 = "A man, a plan, a canal: Panama";
		String example2 = "race a car";

		System.out.println(isPalindrome(example1)); // Output: true
		System.out.println(isPalindrome(example2)); // Output: false
	}
}
