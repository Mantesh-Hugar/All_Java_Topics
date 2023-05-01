package com.OopsConcept;

// 1

/*class Parents{
	public void marriage() {
		System.out.println("Arrange Marriage");
	}
}

class Son extends Parents{
	public void marriage() {
		System.out.println("Love Marriage");
	}
}
public class MethodOverriding1 {

	public static void main(String[] args) {
		Son s1 = new Son();
		s1.marriage();

	}

}*/


// 2

/* class Parents {
	public void marriage() {
		System.out.println("Arrange Marriage");
	}
}

class Sons extends Parents {
	public void marriage() {
		System.out.println("Love Marriage");
	}

	public void friends() {
		marriage();
	}
}

public class MethodOverriding1 {
	public static void main(String args[]) {
		Sons s1 = new Sons();
		s1.friends();
	}
}*/

/*class Parents{
	public void marriage() {
		System.out.println("Arrange Marriage");
	}
}
class Son extends Parents{
	public void marriage() {
		System.out.println("Love Marriage");
	}
	public void friends() {
		super.marriage();
	}
}

public class MethodOverriding1{
	public static void main(String args[]) {
		Son s1 = new Son();
		s1.friends();
	}
}*/


class Parents{
	public void marriage() {
		System.out.println("Arrange Marriage");
	}
}

class Son extends Parents{
	public void marriage() {
		System.out.println("Love Marriage");
	}
	public void friends() {
		marriage();
		super.marriage();
	}
}

public class MethodOverriding1{
	public static void main(String args[]) {
		Son s1 = new Son();
		s1.friends();
	}
}
