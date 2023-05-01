package com.Interface;

interface Me {
	void m1();
}

interface Friend {
	void m1();
}

class Best implements Me, Friend {
	public void m1() {
		System.out.println("Friends Forever");
	}
}

public class MultipleInheritanceWithSameMethods {

	public static void main(String[] args) {

		Best b1 = new Best();
		b1.m1();
	}

}
