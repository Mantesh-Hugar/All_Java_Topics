package com.StringClass;

// java program to reverse a word

//class ReverseString {
//	public static void main(String[] args) {
//
//		String str = "Geeks", nstr = "";
//		char ch;
//
//	    System.out.println(str);
//
//		for (int i = 0; i < str.length(); i++) {
//			ch = str.charAt(i); // extracts each character
//			nstr = ch + nstr; // adds each character in front of the existing string
//		}
//		System.out.println("Reversed word: " + nstr);
//	}
//}


class ReverseString{
	public static void main(String args[]) {
		String str="Java Testing";
		String revStr="";
		char ch;
		
		for(int i=0;i<str.length();i++) {
			ch=str.charAt(i);
			revStr=ch+revStr;
			
		}
		System.out.println(revStr);
		
	}
}
































