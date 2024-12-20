package com.creatio.crm.language.basic;

public class HelloWorld {
	
	public static void main (String[] args)
	{
		//Print the data and end with the next line;
		System.out.println("Hello World");
		
		// print the data and stay with the same line
		System.out.print("Hellow");
		System.out.print(" Word");
		System.out.println();
		
		
		//Print statements to print with specific format
		
		System.out.printf("My name is %s and Age is: %d.%n","Sanjay",32);
		
		//Print statement to print explicit format of digits 
		
		System.out.format("Pi  value is approx %.2f",3.14157);
		System.out.println("");
		
		//Print  the char based on ASCII
		System.out.write(65);
		System.out.println("Test");
		
		// Print the Error Message 
		System.err.println("Error while converting ASCII to normal Char");
		
		
		// Print informational message along with time stamps: 
		
		
	}

}
