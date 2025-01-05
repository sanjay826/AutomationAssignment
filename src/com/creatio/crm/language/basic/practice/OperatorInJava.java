package com.creatio.crm.language.basic.practice;

public class OperatorInJava {
	
//	Operators in Java

//	1. Arithmetic Operators (+, -, *, /, %, ++ (increment by 1), -- (decrement by 1)) (Special chars used to perform mathematical operations)
//	2. Assignment Operators (=,+=,-=,*=,/=,%=)  (Special chars used to assign value to variable)
//	3. Conditional Operators (==, !=, >, <, >=, <= ) (Special chars used to compare primitive values)
//	4. Logical Operators (&&, ||, ! ) (Special chars used to build conditions)
//	5. Ternary Operator	 ( ? --> Used as a shorthand for if-else statements.)

	public static void main(String[] args) {

		System.out.println("=======Airithmetic Operators ====");
		int a = 10;
		int b = 20;
		
		
		System.out.println(a++);
		System.out.println(++b);
		
		System.out.println(a--);
		System.out.println(--b);
		
		
		System.out.println("========Assignment Operator ============");
		int c=10;
		c+=5;
		System.out.println(c); //15
		
		c-=5;
		System.out.println(c); //10
		
		c%=3;
		System.out.println(c); //1
		
		System.out.println("========Conditional Operator ============");
		
		int d=10;
		int e=20;
		
		System.out.println(d==e); //false 
		System.out.println(d!=e); // true
		System.out.println(d>e);  // false
		System.out.println(d<e); // true
		
		System.out.println("========Logical Operators ============");
		
		int x=10;
		int y=20;
		int z=10;
		
		System.out.println(x>y && x==z); // false
		System.out.println(x>y || x==z); //true
		System.out.println(!(x>y || x==z)); // false
		
		System.out.println("==========Ternary Operator============");
		
		// syntax: (condition) ? true :false
		int i=30;
		int j=20;
		
		int k = (i>j) ? i:j;
		System.out.println(k);
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
