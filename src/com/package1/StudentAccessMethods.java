package com.package1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class StudentAccessMethods {
	
	static Scanner scan=new Scanner(System.in);
	
	public static void addStudent(ArrayList<StudentDetails> details) {
		
		System.out.println("Enter the Student Id : ");
		int id=scan.nextInt();
		System.out.println("Enter the Student Name : ");
		String name=scan.next();
		System.out.println("Enter the mark1 : ");
		int mark1=scan.nextInt();
		System.out.println("Enter the mark2 : ");
		
		int mark2=scan.nextInt();
		
		StudentDetails det=new StudentDetails(id,name,mark1,mark2);
		details.add(det);
		
		System.out.println("Data Added Successfully..");
	}
	
	public static void getStudents(ArrayList<StudentDetails> details){
		
		for(StudentDetails det:details) {
			System.out.println(det);
		}
	}
	
	public static void updateStudent(ArrayList<StudentDetails> details) {
		System.out.println("Enter the Student id : ");
		int GetId=scan.nextInt();
		int choice=0;
		
		boolean studentfound=true;
		boolean isupdated=false;
		
		while(studentfound) {
		
		for(StudentDetails det:details) {
			
		if(det.getId()==GetId) {
			System.out.println("---------------------");
			System.out.println("Data Changing Process");
			System.out.println("---------------------");
			System.out.println("1. Change Name");
			System.out.println("2. Change Mark1");
			System.out.println("3. Change Mark2");
			System.out.println("4. Exit");
			System.out.println("Enter Operation Number : ");
			choice=scan.nextInt();
			
			if(choice==1) {
				isupdated=true;
				System.out.println("Enter the New Name : ");
				String newName=scan.next();
				det.setName(newName);
				System.out.println("Name Changed Successfully..");
				break;
			}
			else if(choice==2) {
				isupdated=true;
				System.out.println("Enter the New Mark1 : ");
				int newMark1=scan.nextInt();
				det.setMark1(newMark1);
				System.out.println("Mark1 Changed Successfully..");
				break;
			}
			else if(choice==3) {
				isupdated=true;
				System.out.println("Enter the New Mark2 : ");
				int newMark2=scan.nextInt();
				det.setMark2(newMark2);
				System.out.println("Mark2 Changed Successfully..");
				break;
			}
			else if(choice>=5){
				System.out.println("Invalid Operation number try again!!");
				break;
			}
		}
		}
		
		if(choice==4) {
			System.out.println("Data changing Process Ended..");
			break;
		}
	  }
		if(!isupdated) {
			System.out.println("Data is not found with this Id!");
		}
	}
	
	public static void deleteStudent(ArrayList<StudentDetails> details) {
		
		System.out.println("Enter Student Id to delete : ");
		int getId=scan.nextInt();
		
		boolean isdeleted=false;
			
		Iterator<StudentDetails> sd= details.iterator();
		
		while(sd.hasNext()) {
			StudentDetails det1=sd.next();
			if(det1.getId()==getId) {
				sd.remove();
				System.out.println("Student with Id "+getId+" is deleted Successfully..");
				isdeleted=true;
				break;
			}
	  }
		if(!isdeleted) {
			System.out.println("Student with Id "+getId+" is not Found..");
		}
	}
}
