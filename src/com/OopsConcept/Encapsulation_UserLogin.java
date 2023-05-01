package com.OopsConcept;

class Login {
	private String Uname;
	private String Pwd;

	// Setter()

	public void setUname(String Uname) {
		this.Uname = Uname;
	}

	public void setPwd(String Pwd) {
		this.Pwd = Pwd;
	}

	// getter()

	public String getUname() {
		String reg_username = "mantesh724@gmail.com"; // actual username

		// validation
		if (Uname == reg_username) {
			return "Valid username please enter password";
		} else {
			return "Invalid Username, please enter valid username";
		}
	}

	public String getPwd() {
		String reg_pwd = "20-05-2005";
		if (Pwd == reg_pwd) {
			return "Password is correct, wait for next instruction";
		} else {
			return "Invalid password, please enter valid password";
		}
	}
}

public class Encapsulation_UserLogin {

	public static void main(String[] args) {
		Login l1 = new Login();
		l1.setUname("mantesh724@gmail.com");
		l1.setPwd("mantesh 20-05-2005");
		System.out.println(l1.getUname());
		System.out.println(l1.getPwd());

	}

}
