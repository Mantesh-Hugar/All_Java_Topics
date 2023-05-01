package com.Interface;



interface ATM{
	void deposite();
	void withdraw();
	void ministatement();
}

class ICICI implements ATM{
	public void deposite() {
		System.out.println("We can deposite 50k");
	}
	public void withdraw() {
		System.out.println("We can withdraw upto 1 lacs per day");
	}
}

class ICICI_1 extends ICICI{
	public void ministatement() {
		System.out.println("Take Mini statement");
	}
}
public class User {

	public static void main(String[] args) {
		ICICI_1 i1 = new ICICI_1();
		i1.deposite();
		i1.withdraw();
		i1.ministatement();

	}

}
