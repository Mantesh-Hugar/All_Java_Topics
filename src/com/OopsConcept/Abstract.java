package com.OopsConcept;

abstract class Rbi {
	abstract public void minBal();

	abstract public void rateOfInterest();
}

class Sbi extends Rbi {
	public void minBal(int i) {
		System.out.println("Minimum balance is :" + i);
	}

	public void rateOfInterest(float f) {
		System.out.println("Rate of Interest is :" + f);
	}
}

public class Abstract {

	public static void main(String[] args) {
		
		Sbi s1 = new Sbi();
		s1.minBal(2500);
		s1.rateOfInterest(5.6f);
	}

}
