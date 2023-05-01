package com.JavaCollections;

import java.util.LinkedList;

public class LinkedListSpecificMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedList l = new LinkedList();
		
		l.add("Mantesh");
		l.add("Pranit");
		l.add("Raj");
		l.add("Ajay");
		l.add("Basava");
		
		System.out.println(l); // [Mantesh, Pranit, Raj, Ajay, Basava]
		
		l.addFirst("M Hugar");
		l.addLast("Mahesh");
		
		System.out.println(l);// [M Hugar, Mantesh, Pranit, Raj, Ajay, Basava, Mahesh]
		
		System.out.println(l.getFirst());// M Hugar
		System.out.println(l.getLast());// Mahesh
		
		l.removeFirst();
		System.out.println(l); // [Mantesh, Pranit, Raj, Ajay, Basava, Mahesh]
		l.removeLast();
		System.out.println(l); // [Mantesh, Pranit, Raj, Ajay, Basava]

	}

}
