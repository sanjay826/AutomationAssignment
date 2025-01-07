package com.creatio.crm.language.basic.assignment;

import java.util.HashMap;
import java.util.Map;

class StudentGrades {

	Map<String, Character> studentGrades;

	public StudentGrades() {
		studentGrades = new HashMap<String, Character>();

	}

	void addNewStudentGrade(String name, Character grade) {

		studentGrades.put(name, grade);
	}

	void removeGrade(String name) {
		studentGrades.remove(name);

	}

	void viewGrades() {
		System.out.println(studentGrades.isEmpty() ? "Student Grade is not available "
				: "Student Grade List Here :" + studentGrades);
	}

}

public class Assignment_9_2_StudentTest {

	public static void main(String[] args) {
		
		StudentGrades grade=new StudentGrades();
		
		grade.addNewStudentGrade("sanjay", 'B');
		grade.addNewStudentGrade("Kumar", 'A');
		grade.addNewStudentGrade("Yash", 'C');
		
		grade.removeGrade("Yash");
		grade.viewGrades();
		
		
	}

}
