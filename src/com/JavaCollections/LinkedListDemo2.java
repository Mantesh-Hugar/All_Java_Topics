package com.JavaCollections;

import java.util.Collections; 
import java.util.LinkedList;

public class LinkedListDemo2 {

	public static void main(String[] args) {

		LinkedList l = new LinkedList();

		l.add(200);
		l.add("Java");
		l.add(2.5);
		l.add('R');
		l.add(200);

		// Add all method
		LinkedList new_l = new LinkedList();
		new_l.addAll(l);
		System.out.println(new_l); // [200, Java, 2.5, R, 200]

		// remove all method
		new_l.removeAll(l);
		System.out.println(new_l); // []

		// Sorting and reverse will happen when we have same kind of data
		
		// Sort Collections.sort
		System.out.println("Before sorting :" + l);
		Collections.sort(l);
		System.out.println("After sorting :" + l);

		// reverse order
		Collections.sort(l, Collections.reverseOrder());
		System.out.println("After revrse order :" + l);

		// Shuffling
		Collections.shuffle(l);
		System.out.println("After shuffling :" + l);
	}

}
