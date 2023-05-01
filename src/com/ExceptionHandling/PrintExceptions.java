package com.ExceptionHandling;

public class PrintExceptions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int a = 100, b = 0, c;
			c = a / b;
			System.out.println(c);
		} catch (ArithmeticException e) {
			// TODO: handle exception
			// it will print the exception name, description, stack trace
			// e.printStackTrace();

// These two print the exception name and description	
//			System.out.println(e);
//			System.out.println(e.toString());
			// it will print the only description
			System.out.println(e.getMessage());
		}
	}

}
