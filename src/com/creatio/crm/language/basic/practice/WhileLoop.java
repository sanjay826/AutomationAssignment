package com.creatio.crm.language.basic.practice;

public class WhileLoop {

	public static void main(String[] args) {

		int i = 0;

		while (i > 0) {

			System.out.println("Refresh the Page");

			i++;
		}
		do {

			System.out.println("Refresh the Page");

			i++;
			break;
		} while (i > 10);

	}

}
