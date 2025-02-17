package com.interview.question;

public class FactorialValue {

	/* How to find factorial value of 5 */
	
	public static void main(String[] args) {
		int input=5;
		int output=1;
		//1*5*4*3*2*1=120;
		
	/*	output =output*5;
		output =output*4;
		output =output*3;
		output =output*2;
		output =output*1; */
		
	for(int i=input;i>=1;i--) {
		output =output*i;
	}
		
//		for(int i=1;i<=5;i++) {
//			output =output*i;
//		}
			
		
		System.out.println("Factorial Value is : "+output);

	}

}
