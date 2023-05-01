package com.JavaCollections;

import java.util.HashMap;

public class HashMapDemo {

	public static void main(String[] args) {

		HashMap m = new HashMap(); // By default this will allow all kind of data

		// HashMap<Integer, String> m = new HashMap<Integer, String>(); // If we want to restrict key and value pair
		// specific data

	// put()--->add the element
		m.put(101, "John");
		m.put(102, "David");
		m.put(103, "Scott");
		m.put(104, "Mary");
		m.put(105, "Tye");
		m.put(103, "DuplicateKey");
		m.put(106, "David");

		System.out.println(m);// {101=John, 102=David, 103=DuplicateKey, 104=Mary, 105=Tye, 106=David}

		// get()-->retrive the data
		System.out.println(m.get(105)); // Tye

		// remove()-->remove the pair from hashmap

		m.remove(106);
		System.out.println(m); // {101=John, 102=David, 103=DuplicateKey, 104=Mary, 105=Tye}

		// containsKey()--->is used to verify this key is present or not

		System.out.println(m.containsKey(101)); // true
		System.out.println(m.containsKey(106));// false

		// containsValue()---->is used to verify this value is present or not

		System.out.println(m.containsValue("Mary"));// true
		System.out.println(m.containsValue("Y"));// false
		
		//isEmpty()
		System.out.println(m.isEmpty());//false
		
		//keySet-->return all the keys as Set object, it wont allow duplicates
		
		System.out.println(m.keySet()); // [101, 102, 103, 104, 105]
		
		//if i want to print all the keys individual we use for each loop
		
		for (Object i : m.keySet()) {
			System.out.println(i);
		}
		
/* O/p 	101
		102
		103
		104
		105  */
		
			
		//values()-->return all the values as Collection
	//	System.out.println(m.values()); // [John, David, DuplicateKey, Mary, Tye]
		
		for (Object i : m.values()) {
			System.out.println(i);
		}
/* O/p		
		John
		David
		DuplicateKey
		Mary
		Tye
		*/
		
		//if i want to print all the objects with key and value pair
		
		for (Object i : m.keySet()) {
			System.out.println(i+"  "+m.get(i));
		}
		
	/* O/p:-
		101  John
		102  David
		103  DuplicateKey
		104  Mary
		105  Tye
		*/
		
		//entrySet()-->return all the entryies as Set 
		System.out.println(m.entrySet()); // [101=John, 102=David, 103=DuplicateKey, 104=Mary, 105=Tye]
				
	}

}
