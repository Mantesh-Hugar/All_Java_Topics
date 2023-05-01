package com.ExceptionHandling;

public class Finally {

	public static void main(String[] args) {
		// If exception occures in try block-->try->catch->finally will be execute
//		try {
//
//			int a = 100, b =0, c;
//			c = a / b;
//			System.out.println(c);
//		}
//		catch (ArithmeticException e) 
//		{
//
//			System.out.println("Exception :" + e);
//		} 
//		
//		finally 
//		{
//			System.out.println(" finally block");
//		}
//	
		// we can use finally block with try block and also with try,catch blocks.
		
		try {
			int a=100, b=0,c;
			c=a/b;
		}
		finally {
			System.out.println("Finally i am at finally block");
		}
		System.out.println("hiiii");
	}

}
