package com.CustomOrUserDefinedException;

// Compile Time Exception or Checked Exception

class UnderAgeException extends Exception {

	UnderAgeException() {
		super("You are under age"); // Default exception handler
	}

	UnderAgeException(String Message) {
		super(Message);
	}
}

public class Voting {

	public static void main(String[] args) {
		int age = 17;
		try {
			if (age < 18) {
				throw new UnderAgeException("You cannot vote as your age is beow 18");
			}
		} catch (UnderAgeException e) {
			e.printStackTrace();
		}
		System.out.println("Continue Testing");

	}
}

// Run Time Exception

//class UnderAgeException extends RuntimeException {
//	public UnderAgeException() {
//		super();
//	}
//
//	public UnderAgeException(String Message) {
//		super(Message);
//	}
//
//}
//
//public class Voting {
//	
//	public static void main(String args[]) {
//		int age = 17;
//		try {
//			if (age < 18) {
//				throw new UnderAgeException();
//			} else {
//				System.out.println("You can vote now.....");
//			}
//		} catch (UnderAgeException e) {
//			e.printStackTrace();
//		}
//		System.out.println("Continue testing");
//	}
//}
