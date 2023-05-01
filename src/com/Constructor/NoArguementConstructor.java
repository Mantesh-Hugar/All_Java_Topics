package com.Constructor;

public class NoArguementConstructor {

	String name;

	public NoArguementConstructor() {
		name = "Mantesh";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NoArguementConstructor n0 = new NoArguementConstructor();
		System.out.println(n0.name);

		NoArguementConstructor n1 = new NoArguementConstructor();
		System.out.println(n1.name);

		NoArguementConstructor n2 = new NoArguementConstructor();
		System.out.println(n2.name);
	}

}
//No arguement constructor provide same value for every object.