package com.JavaCollections;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListDemo1 {

	public static void main(String[] args) {

		// Declare Linked List

		// Allow Heterogeneous data
		// LinkedList l=new LinkedList();

		// Allow homogeneous data
		// LinkedList<Integer> l=new LinkedList<Integer>();
		// LinkedList<String> l=new LinkedList<String>();

		LinkedList l = new LinkedList();

		// Add elements into Linked List
		l.add(100);
		l.add("WelCome");
		l.add(15.5);
		l.add('A');
		l.add(true);
		l.add(null);
		System.out.println(l);// [100, WelCome, 15.5, A, true, null]
		System.out.println(l.size());// 6

		// remove
		l.remove(3);// By Index
		System.out.println("After removing, new list: " + l);// [100, WelCome, 15.5, true, null]

		// Insert/Adding element in the middle of linked list
		l.add(3, "Java");
		System.out.println("After inserting element :" + l);// [100, WelCome, 15.5, Java, true, null]

		// Retrieving vlue/object
		System.out.println(l.get(3));// Java

		// Change the value
		l.set(5, 'D');
		System.out.println("After changing the value :" + l);// [100, WelCome, 15.5, Java, true, D]
		
		//Contains
		System.out.println(l.contains("Java"));//true
		System.out.println(l.contains("Python"));//false
		
		//isEmpty()
		System.out.println(l.isEmpty());//false
		
		//Reading elements from linked list using for loop
//		System.out.println("Reading the data by using for loop");
//		for(int i=0;i<l.size();i++) {
//			System.out.println(l.get(i));
//		}
		
//		System.out.println("Reading data by using for each loop");
//		
//		for (Object e : l) {
//			System.out.println(e);
//		}
		
		
		System.out.println("Reading data by using iterator");
		Iterator it=l.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}
	

}
