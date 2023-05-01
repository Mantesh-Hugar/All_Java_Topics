package com.ExceptionHandling;

public class CombinationOfTry {

	public static void main(String[] args) {
		
	//1	try-->catch-->catch
		
//		try {
//			
//		} catch (ArithmeticException e) {
//			// TODO: handle exception
//		}
//		catch (Exception e) {
//			// TODO: handle exception
//		}
		
		
		
		
		//2 try-->try - catch-->catch
		try {
			try {
				
			} catch (Exception e) {
				// TODO: handle exception
			}
		} catch (Exception e) {
			// TODO: handle exception
		}

		
		
		
		//3 try-->catch-->try - catch
		try {
			
		} catch (Exception e) {
			try {
				
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
		
		
		
		//4 try-->catch-->finally
		
		try {
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		finally {
			
		}
		
		
		
		//5 try-->finally
		try {
			
		}
		finally {
			
		}
		
		
		
		//6 try-->finally-->try - catch
		
		try {
			
		} finally {
			// TODO: handle finally clause
			
			try {
				
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
	}

}
