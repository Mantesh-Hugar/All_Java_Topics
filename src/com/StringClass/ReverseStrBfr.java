package com.StringClass;

//Java program to demonstrate conversion from
//String to StringBuffer and reverse of string

public class ReverseStrBfr {
	public static void main(String[] args) {
		String str = "Geeks";
		System.out.println(str);
		// conversion from String object to StringBuffer
		StringBuffer sbr = new StringBuffer(str);
		// To reverse the string
		sbr.reverse();
		System.out.println(sbr);
	}
}
