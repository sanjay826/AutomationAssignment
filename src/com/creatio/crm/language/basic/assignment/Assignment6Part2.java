package com.creatio.crm.language.basic.assignment;

public class Assignment6Part2 {

	public static void main(String[] args) {
         
		String customerName="john Doe";
		int creditScore = 720;
		int income = 55000;
		boolean employed = true;
		double debtToIncomeRatio = 35.0;
		
		System.out.println("Customer Namer :" +customerName);

		if (creditScore > 750) {
			System.out.println("The loan is automatically approved!!!" +creditScore);

		} else if (creditScore >= 650 && creditScore <= 750) {
			System.out.println("additional checks are performed :"+creditScore);
			if (income >= 50000) {
				System.out.println("Customer met the icome creteria :" + income);

				if (employed) {
					System.out.println("Customer is employed");

					if (debtToIncomeRatio < 40) {
						System.out.println("Loan is approved !!! debt To Income Ratio less than : 40%");
					} else {
						System.out.println("The Loan is denied due to dept to income ratio is greater than 40%  ");
					}

				} else {
					System.out.println("The Loan is denied due to Customer is unemployed ");
				}

			} else {
				System.out.println("The Loan is denied due to Customer icome is less than 50000 ");

			}

		} else {
			System.out.println("the loan is denied  due to crdit score is less than 650.");
		}

	}

}
