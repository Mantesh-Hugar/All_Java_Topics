package com.Method;

public class ArguementStdInfo {

	public static void student_details(String name, long contact, String email, int yop, String address) {
		System.out.println("Student name: "+name);
		System.out.println("Student contact: "+contact);
		System.out.println("Student email: "+email);
		System.out.println("Student yop: "+yop);
		System.out.println("Student address: "+address);
		System.out.println("\n");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		student_details("Mantesh1", 9876543210l, "mantesh1@gmail.com", 2019, "Karnataka");
		student_details("Mantesh2", 9876543210l, "mantesh2@gmail.com", 2020, "Karnataka");
		student_details("Mantesh3", 9876543210l, "mantesh3@gmail.com", 2021, "Karnataka");
		student_details("Mantesh4", 9876543210l, "mantesh4@gmail.com", 2022, "Karnataka");
		student_details("Mantesh5", 9876543210l, "mantesh5@gmail.com", 2023, "Karnataka");

	}

}
