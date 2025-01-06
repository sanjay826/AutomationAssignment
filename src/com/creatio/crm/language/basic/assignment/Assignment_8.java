package com.creatio.crm.language.basic.assignment;

import java.util.HashMap;
import java.util.Map;

class EmpDetail {
	String name;
	int salary;
	int experience;
	double rating;
	int hike;
	int bonus;
	int reward;

	public void hikeBoonusAndReward() {
		if (rating >= 4) {
			hike = 15;
			bonus = 1500;
		} else if (rating >= 3 && rating < 4) {
			hike = 10;
			bonus = 1200;
		} else {
			hike = 3;
			bonus = 300;
		}
		if (experience >= 5) { 
			reward = 5000; 
			} else {
				reward = 0;
				}
	}
}

public class Assignment_8 {
	public static void main(String[] args) {
		Map<String, EmpDetail> empTable = new HashMap<>();

		// Add employee Alice with details
		EmpDetail alice = new EmpDetail();
		alice.name = "Alice Johnson";
		alice.salary = 75000;
		alice.experience = 5;
		alice.rating = 4.2;
		alice.hikeBoonusAndReward();
		empTable.put(alice.name, alice);
       
		 //Add employee Bob with details
		EmpDetail bob = new EmpDetail();
		bob.name = "Bob Smith";
		bob.salary = 68000;
		bob.experience = 3;
		bob.rating = 3.8;
		bob.hikeBoonusAndReward();
		empTable.put(bob.name, bob);
		
		//Add employee carol with details
		EmpDetail carol = new EmpDetail();
		carol.name = "Carol Devis";
		carol.salary = 82000;
		carol.experience = 7;
		carol.rating = 4.5;
		carol.hikeBoonusAndReward();
		empTable.put(carol.name, carol);
		
		//Add employee Devid with details
		EmpDetail devid = new EmpDetail();
		devid.name = "Devid Brown";
		devid.salary = 90000;
		devid.experience = 10;
		devid.rating = 2.0;
		devid.hikeBoonusAndReward();
		empTable.put(devid.name, devid);
        
		//Add employee eva with details
		EmpDetail eva = new EmpDetail();
		eva.name = "Eva Green";
		eva.salary = 60000;
		eva.experience = 2;
		eva.rating = 3.5;
		eva.hikeBoonusAndReward();
		empTable.put(eva.name, eva);

		// Printed all employees with all hike, bonus and reward
		for (String allData : empTable.keySet()) {
			EmpDetail emp = empTable.get(allData);
			System.out.println("Emplayee Name: " + emp.name + ",Base Salary: " + emp.salary + ", Experience (Years): "
					+ emp.experience + "  Year- End Rating(out of 5): " + emp.rating + "Hike: " + emp.hike
					+ "%, Bonus: " + emp.bonus + " More Than 5 Years Exp get extra Reward: " + emp.reward);
		}

	}
}
