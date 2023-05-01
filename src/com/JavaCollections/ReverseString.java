package com.JavaCollections;

public class ReverseString {

	public static void main(String[] args) {

		String str = "Welcome";
		String nstr = "";
		char ch;

		System.out.println("Original Name" + str);
		for (int i = 0; i < str.length(); i++) {
			ch = str.charAt(i);
			nstr = ch + nstr;
		}
		System.out.println("Reverse name " + nstr);
	}

}
