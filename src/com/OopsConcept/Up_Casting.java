package com.OopsConcept;

/*class A{
	public void run() {
		System.out.println("Running");
	}
}

class B extends A{
	public void fly() {
		System.out.println("Flying");
	}
}
public class Up_Casting {

	public static void main(String[] args) {
		// Purely super class object
		
		A a1 = new A();
		a1.run();
		
		//purely sub class object
		
		B b1 = new B();
		b1.run();
		b1.fly();

	}

}*/

// Up casting

class A {
	public void run() {
		System.out.println("Running");
	}
}

class B extends A {
	public void fly() {
		System.out.println("Flying");
	}
}

public class Up_Casting {
	public static void main(String args[]) {
		// Up Casting
		A a1 = new B();
		a1.run();

	}
}
