package com.Interface;

interface ATM {
	void deposite();

	void withdraw();

	void ministatement();
}

public class ICICI implements ATM {
	public void deposite() {
		System.out.println("Using ATM we can deposite upto 50k");
	}

	public void withdraw() {
		System.out.println("Daily we can withdraw 49k");
	}

	public void ministatement() {
		System.out.println("Last transaction on 27th March 2023");
	}

	//public class Customer {
		public static void main(String args[]) {
			ICICI b1 = new ICICI();
			b1.deposite();
			b1.withdraw();
			b1.ministatement();
		}
	}
//}
