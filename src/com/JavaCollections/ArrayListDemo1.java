package com.JavaCollections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListDemo1 {

	public static void main(String[] args) {

		// Declaration of array list--for Specify any arrayList, with heterogeneous data
		// 1. ArrayList al = new ArrayList();
		// 2. List al=new ArrayList();

		// Specify particular array list--With homogeneous data

		// 3. ArrayList<Integer> al = new ArrayList<Integer>();
		// 4. ArrayList<String> al = new ArrayList<String>();

		ArrayList al = new ArrayList();

		// Add new elements into the arraylist

		al.add(100);
		al.add("Wel-Come");
		al.add(15.5);
		al.add('A');
		al.add(true);

		// Print all the elements
		System.out.println(al); // O/P--> [100, Wel-Come, 15.5, A, true]

		// size()
		System.out.println("Number of elements in arryList " + al.size()); // Number of elements in arryList 5, but
																			// index start with zero.

		// remove
		al.remove(2); // here 2 is an index
		al.remove("Wel-Come"); // here wel-come is an element

		System.out.println(al); // [100, A, true]

		// Insert a new element at the middle of the object
		// add(index,object)

		al.add(2, "Hi Team");
		al.add(0, "Mantesh");
		System.out.println("After insertion :" + al); // [Mantesh, 100, A, Hi Team, true]

		// Retrive specific element from array list
		System.out.println(al.get(0)); // Mantesh

		// Change element/replace
		al.set(2, "C#");
		System.out.println("After replacing element :" + al); // [Mantesh, 100, C#, Hi Team, true]

		// Search - contains() --Return True/False
		System.out.println(al.contains("C#"));// true
		System.out.println(al.contains("C++"));// false

		// isEmpty()
		System.out.println(al.isEmpty());// false

		
		
		// Read all the element by using for loop, for each loop, iterator
		
		// 1. for loop
//		System.out.println("Reading elements by using for loop.........");
//		for (int i = 0; i <al.size(); i++) {
//			System.out.println(al.get(i));
//		}

		
		// 2. for each loop

//		System.out.println("Reading elements using for ...each loop");
//		for (Object ele : al) {
//			System.out.println(ele);
//		}

		
		// 3. Iterator
		
		System.out.println("Reading element by using iterator method");
		Iterator it = al.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}

	}

}
