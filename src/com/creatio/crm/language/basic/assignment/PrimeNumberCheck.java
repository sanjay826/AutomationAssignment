package com.creatio.crm.language.basic.assignment;

public class PrimeNumberCheck {
    public static void main(String[] args) {
        int n = 25; 

        boolean result = isPrime(n);
        printMessage(n, result);
    }

    public static boolean isPrime(int n) {
        if (n <= 1) 
        	return false; // Numbers <= 1 are not prime
        if (n == 2 || n == 3) 
        	return true; // 2 and 3 are prime

		
        for (int i = 2; i * i <= n; i++) {
			/*  not prime Number */
        	
            if (n % i == 0) 
            	return false; 
        }
        return true;  //it's prime number
    }

    public static void printMessage(int n, boolean isPrime) {
        if (isPrime) {
            System.out.println( n + " has exactly two divisors: 1 and " + n + ", making it a prime number.");
        } else if (n == 1) {
            System.out.println( n + " has only one divisor (1 itself), which is not sufficient for it to be considered prime.");
        } else {
            System.out.print( n + " has more than two divisors: 1");
            
            for (int i = 2; i <= n; i++) {
                if (n % i == 0) {
                    System.out.print(", " + i);
                }
            }
            System.out.println(", so it is not a prime number.");
        }
    }
}
