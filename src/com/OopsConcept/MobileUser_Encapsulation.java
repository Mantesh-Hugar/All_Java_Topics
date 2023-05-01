package com.OopsConcept;

class Mobile {
	private String mobile1;
	private String mobile2;

	public void setmobile1(String mobile1) {
		this.mobile1 = mobile1;
	}

	public void setmobile2(String mobile2) {
		this.mobile2 = mobile2;
	}

	public String getmobile1() {
		String reg_mobile1 = "Mobile@123";
		if (mobile1 == reg_mobile1) {
			return "Valid Password";
		} else {
			return "Invalid Password";
		}
	}

	public String getmobile2() {
		String reg_mobile2 = "mantesh@345";
		if (mobile2 == reg_mobile2) {
			return "Valid password";
		} else {
			return "Invalid password";
		}

	}
}

public class MobileUser_Encapsulation {

	public static void main(String[] args) {

		Mobile m1 = new Mobile();
		m1.setmobile1("Mobile@123");
		m1.setmobile2("Mantesh@345");
		System.out.println(m1.getmobile1());
		System.out.println(m1.getmobile2());
	}

}
