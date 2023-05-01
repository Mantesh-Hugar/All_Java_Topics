package com.OopsConcept;


//class A {
//	public void run() {
//		System.out.println("Running");
//	}
//}
//
//class B extends A {
//	public void fly() {
//		System.out.println("Flying");
//	}
//}
//
//public class Down_Casting {
//
//	public static void main(String[] args) {
//		// 1. Down Casted Object
//		// B b1=new A();
//
//		// 2. Down Casted Object Explicitly
//		/*
//		 * B b1=(B)new A(); b1.run(); b1.fly();
//		 */
//
//		// 3. Up Casted Object
//		A a1 = new B();
//		a1.run();
//
//		// 4. Down Casted Object
//		//B b1 = (B) a1;
//		//or
//		B b1=(B)new B();
//		b1.fly();
//		b1.run();
//	}
//
//} 

class Police{
	public void lockDown() {
		System.out.println("Stay Safe");
	}
}
class BoyFriend extends Police{
	public void meetGF() {
		System.out.println("Want to see");
	}
}
public class Down_Casting{
	public static void main(String args[]) {
		Police P1=new BoyFriend();
		P1.lockDown();
		
		BoyFriend b1=(BoyFriend)P1;
		b1.lockDown();
		b1.meetGF();
	}
}



