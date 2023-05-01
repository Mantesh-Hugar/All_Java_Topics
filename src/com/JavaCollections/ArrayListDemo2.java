package com.JavaCollections;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListDemo2 {

	public static void main(String[] args) {

// Add group of element or a collection into array list

		ArrayList al = new ArrayList();

		al.add("X");
		al.add("Y");
		al.add("Z");
		al.add("A");
		al.add("B");
		al.add("C");
		al.add("D");

// al --is a collection which contains group of elements

		ArrayList al_dub = new ArrayList();

		al_dub.addAll(al);
		System.out.println("Added the group of elements :" + al_dub); // [X, Y, Z, A, B, C, D]

		al_dub.removeAll(al);
		System.out.println("After removing :" + al_dub); // []

		// Sort ------Collections.sort()

		System.out.println("Elements in the array list: " + al); // [X, Y, Z, A, B, C, D]

		Collections.sort(al);
		System.out.println("Elements in the array list after sorting: " + al); // [A, B, C, D, X, Y, Z]

		Collections.sort(al, Collections.reverseOrder());
		System.out.println("Elements in the array list after sorting in the reverse order : " + al); // [Z, Y, X, D, C,
																										// B, A]

		// Shuffling Collections.shuffle()
		Collections.shuffle(al);
		System.out.println("Elements in the array list after shuffling order : " + al);// [B, X, Z, A, D, C, Y]
	}

}
