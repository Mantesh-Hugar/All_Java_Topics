package com.JavaCollections;

import java.util.HashSet;

public class HashSetDemo3 {

	public static void main(String[] args) {
		
		//Union, Intersection, difference
		
		HashSet<Integer> set1=new HashSet<Integer>();
		set1.add(1);
		set1.add(2);
		set1.add(3);
		set1.add(4);
		
		System.out.println("HashSet 1"+set1); // [1, 2, 3, 4]

		HashSet<Integer> set2=new HashSet<Integer>();
		set2.add(3);
		set2.add(4);
		set2.add(5);
		set2.add(6);
		System.out.println("HashSet 2"+set2); // [3, 4, 5, 6]
		
		//Union (Add multiple collections without duplicate)
		
		//set1.addAll(set2);
		//System.out.println("Union "+set1); // [1, 2, 3, 4, 5, 6]
		
		//Intersection or common elements between two sets
		//set1.retainAll(set2);
		//System.out.println("Intersection:"+set1); // [3, 4]
		
		//Difference -->All Set2 elements from set1, whichever not there those are not print
		set1.removeAll(set2);
		System.out.println("difference"+set1); // [1, 2]
		
		//Subset --->If the set2 elements are subset of set 1 means it will give o/p true
		//verifying the set2 is subset of set1
		
		System.out.println(set1.containsAll(set2)); // false
		
		
		
	}

}
