package com.Interface;

//interface Book {
//	void bookname();
//
//	void authorname();
//
//	void dateofborrowing();
//}
//
//class Java implements Book {
//	public void bookname() {
//		System.out.println("Book name is Java");
//	}
//
//	public void authorname() {
//		System.out.println("Mantesh");
//	}
//
//	public void dateofborrowing() {
//		System.out.println("3rd march");
//	}
//}
//
//class SQL implements Book {
//	public void bookname() {
//		System.out.println("SQL");
//	}
//
//	public void authorname() {
//		System.out.println("My SQL");
//	}
//
//	public void dateofborrowing() {
//		System.out.println("6th March");
//	}
//}
//
//class Automation implements Book {
//	public void bookname() {
//		System.out.println("Automation");
//	}
//
//	public void authorname() {
//		System.out.println("James");
//	}
//
//	public void dateofborrowing() {
//		System.out.println("9th March");
//	}
//}
//
//public class Librarian {
//
//	public static void main(String[] args) {
//    Java j1 = new Java();
//    j1.bookname();
//    j1.authorname();
//    j1.dateofborrowing();
//    
//    SQL s1 = new SQL();
//    s1.bookname();
//    s1.authorname();
//    s1.dateofborrowing();
//    
//    Automation a1 = new Automation();
//    a1.bookname();
//    a1.authorname();
//    a1.dateofborrowing();
//	}
//
//}

interface Book{
	void bookName();
	void bookAuthor();
	void dateOfBorrowing();
}

class Java implements Book{
	public void bookName() {
		System.out.println("Book Name is Core Java");
	}
	
	public void bookAuthor() {
		System.out.println("Book author is James Gosling");
	}
	public void dateOfBorrowing() {
		System.out.println("2004");
	}
}

class SQL implements Book{
	public void bookName() {
		System.out.println("Book Name is SQL");
	}
	
	public void bookAuthor() {
		System.out.println("Book Author is Abc");
	}
	public void dateOfBorrowing() {
		System.out.println("2000");
	}
}
class Automation implements Book{
	public void bookName() {
		System.out.println("Book Name is Automation");
	}
	
	public void bookAuthor() {
		System.out.println("Book Author is Naveen");
	}
	public void dateOfBorrowing() {
		System.out.println("2006");
	}
}

public class Librarian{
	public static void main(String args[]) {
		
		Java j1 = new Java();
		j1.bookName();
		
		SQL s1 = new SQL();
		s1.bookAuthor();
		
		Automation a1 = new Automation();
		a1.dateOfBorrowing();
	}
}































