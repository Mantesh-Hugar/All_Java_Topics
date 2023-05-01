package com.Constructor;

//public class ParameterigedConstructor {

//
//	String sname;
//	int age;
//	float per;
//
//	public ParameterigedConstructor(String name, int sage, float sper) {
//		sname = name;
//		age = sage;
//		per = sper;
//	}
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		ParameterigedConstructor std1 = new ParameterigedConstructor("Mantesh", 24, 78.4f);
//		System.out.println(std1.sname + " " + std1.age + " " + std1.per);
//
//		ParameterigedConstructor std2 = new ParameterigedConstructor("Naveen", 24, 86.f);
//		System.out.println(std2.sname + " " + std2.age + " " + std2.per);
//	}
//
//}

public class ParameterigedConstructor {

	String name;
	int age;
	float per;

	public ParameterigedConstructor(String sname, int sage, float sper) {
		name = sname;
		age = sage;
		per = sper;

	}

	public void display() {
		System.out.println(name);
		System.out.println(age);
		System.out.println(per);
	}

	public static void main(String args[]) {

		ParameterigedConstructor std1 = new ParameterigedConstructor("Mahesh", 23, 78.5f);
		std1.display();

		ParameterigedConstructor std2 = new ParameterigedConstructor("Ajay", 25, 87.5f);
		std2.display();
	}
}
