package com.JavaCollections;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo1 {

	public static void main(String[] args) {
		
		//HashSet hs=new HashSet(); // Default capacity 16 and Load factor 0.75
		
		//HashSet hs =new HashSet(100); // initial capacity 100
		
		//HashSet hs=new HashSet(100,(float)0.95); Initial capacity with load factor
		
		//HashSet<Integer> hs=new HashSet<Integer>(); // Specific data type or restrict with some data tyep
		
		HashSet hs=new HashSet();
		
		//add objects/elements into HashSet
		
		hs.add(100);
		hs.add("Mantesh");
		hs.add(15.5);
		hs.add('A');
		hs.add(true);
		hs.add(null);
		
		System.out.println(hs);// [null, A, 100, Mantesh, 15.5, true] // Insertion order is not preserved
		
		// remove()
		
		hs.remove(15.5); //value
		System.out.println("After removing element :"+hs); // [null, A, 100, Mantesh, true]
		
		
		// contain() is used for verification purpose or searching the element
		
		System.out.println(hs.contains("Mantesh")); //true
		System.out.println(hs.contains("XYZ")); // false
		
		System.out.println(hs.isEmpty());//false
		
		//Reading elements/objects from HashSet by using for...each loop
		
		/* for (Object e : hs) {
			System.out.println(e);
		} */
		
		System.out.println("Reading through iterator");
		Iterator it=hs.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}

	}

}
