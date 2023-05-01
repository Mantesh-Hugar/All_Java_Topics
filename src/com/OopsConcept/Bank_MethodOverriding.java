package com.OopsConcept;


class SBI{
	public void getRateOfInterest() {
		System.out.println("10%");
	}
}

class ICICI extends SBI{
	public void getRateOfInterest() {
		System.out.println("12%");
	}
}

class Iob extends SBI{
	public void getRateOfInterest() {
		System.out.println("16%");
	}
}

class Citi extends SBI{
	public void getRateOfInterest() {
		System.out.println("8%");
	}
}
public class Bank_MethodOverriding {

	public static void main(String[] args) {
		SBI s1 = new SBI();
		s1.getRateOfInterest();
		ICICI c1 = new ICICI();
		c1.getRateOfInterest();
		Iob i1 = new Iob();
		i1.getRateOfInterest();
		Citi c2 = new Citi();
		c2.getRateOfInterest();

	}

}
