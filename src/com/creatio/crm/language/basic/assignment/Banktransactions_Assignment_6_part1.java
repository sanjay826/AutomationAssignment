package com.creatio.crm.language.basic.assignment;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class Banktransactions_Assignment_6_part1 {

	public static void main(String[] args) {

		// store all transactions with Map
		Map<Integer, Integer> transactions = new HashMap<Integer, Integer>();
		transactions.put(1, 50000);
		transactions.put(2, 3000);
		transactions.put(3, 4000);
		transactions.put(4, -2000);
		transactions.put(5, -15000);
		transactions.put(6, -200);
		transactions.put(7, 4000);
		transactions.put(8, -3000);

		// Printed all transactions
		System.out.println("All Transcation :" + transactions);

		// Addition all credited amount
		int totalCredited = transactions.get(1) + transactions.get(2) + transactions.get(3) + transactions.get(7);

		// Addition all debited amount
		int totalDebited = transactions.get(4) + transactions.get(5) + transactions.get(6) + transactions.get(8);

		// Printed total amount of Credit
		System.out.println("Total Amount Credited: " + totalCredited);
		// Printed total amount of Debit
		System.out.println("Total Amount Debited: " + (totalDebited));
		// Remaining amount in bank account
		System.out.println("Current Balance: " + (totalCredited + totalDebited));
        
		//suspiciousCount is taken as int type variable with 0 initialization
		int suspiciousCount = 0;
		// for each loop for check each and very transactions with if condition 10000 above transactions 
		for (int amount : transactions.values()) {
			if (amount > 10000 || amount < -10000) {
				//Printed all Suspicious transaction
				System.out.println("Suspicious transaction with amount: " + amount);
				suspiciousCount++;
			}
		}
        // Printed Total number of suspicious transactions
		System.out.println("Total number of suspicious transactions: " + suspiciousCount);
	}

}
