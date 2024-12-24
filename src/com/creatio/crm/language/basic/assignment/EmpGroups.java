package com.creatio.crm.language.basic.assignment;

/** 
 * Created program like how to access and print employee data 
 * from two separate classes: Employees and EmpGroups.
 * 
 * The Employees class stores the names and IDs of employees as Arrays of String and Integer.
 * 
 * The EmpGroups class retrieves the data from the Employees class , stores it in its own arrays, and then prints the 
 * employee names and IDs.
 * 
 * 
 */

class Employee {
	
	// Display empNames as String Array with value 
	String[] empNames = { "Bharath", "ABC", "XYZ" };
	
	// Display the Employee Id as int array with value 
	int[] empids = { 1234, 1235, 1236 };

}

public class EmpGroups {

	public static void main(String[] args) {
        
		// created Object for Employee 
		Employee emp = new Employee();
		String[] empNames = emp.empNames;
		int[] empIds = emp.empids;
		
		//Printed all the Employee's name with corresponding id's
		System.out.println("Employee Name: " + empNames[0] + ", Employee ID: " + empIds[0]);
		System.out.println("Employee Name: " + empNames[1] + ", Employee ID: " + empIds[1]);
		System.out.println("Employee Name: " + empNames[2] + ", Employee ID: " + empIds[2]);

	}

}
