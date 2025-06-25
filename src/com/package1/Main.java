package com.package1;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		ArrayList<StudentDetails> details=new ArrayList<>();
		
		Scanner scan=new Scanner(System.in);
		
		boolean student=true;
		
		
		while(student) {
		System.out.println("------------------------------------");
		System.out.println("Welcome to Student Management System");
		System.out.println("------------------------------------");
		
		System.out.println("1. Add Student");
		System.out.println("2. View Student Details");
		System.out.println("3. Update Student Details");
		System.out.println("4. Delete Student");
		System.out.println("5. Exit");
		
		System.out.println("Enter the Operation Number : ");
		int choice=scan.nextInt();
		
		switch(choice) {
		
		case 1:{
			StudentAccessMethods.addStudent(details);
			break;
		}
		
		case 2:{
			StudentAccessMethods.getStudents(details);
			break;
		}
		
		case 3:{
			StudentAccessMethods.updateStudent(details);
			break;
		}
		
		case 4:{
			StudentAccessMethods.deleteStudent(details);
			break;
		}
		
		case 5:{
			break;
		}
		
		default:{
			System.out.println("Invalid Operation Number try again");
			break;
		}
		
		}
		if (choice==5) {
			student=false;
			System.out.println("ThankYou For Visiting....");
		}
		}
	}

}
