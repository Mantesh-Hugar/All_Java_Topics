package com.Constructor;

public class ParameterisedConstructorByThisKW {

	String name;
	int age;
	float per;
	
	public ParameterisedConstructorByThisKW(String name,int age,float per) {
		
		this.name=name;
		this.age=age;
	    this.per=per;
	}
	public void display() {
		System.out.println(name);
		System.out.println(age);
		System.out.println(per);
	}
	public static void main(String[] args) {
		
		ParameterisedConstructorByThisKW std1 = new ParameterisedConstructorByThisKW("Mantesh", 25, 87.5f);
		std1.display();
		
		ParameterisedConstructorByThisKW std2 = new ParameterisedConstructorByThisKW("Mahesh", 23, 87.5f);
		std2.display();
		

	}

}
