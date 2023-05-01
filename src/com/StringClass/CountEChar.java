package com.StringClass;

public class CountEChar {

	public static void main(String[] args) {
		String s1 = new String("Java Developer");
		char ch;
		int count=0;
		
		for(int i=0;i<s1.length();i++) {
			ch=s1.charAt(i);
			if(ch=='e') {
				count++;
			}
		}
		System.out.println(count);

	}

}
