package com.JavaCollections;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashTableDemo1 {

	public static void main(String[] args) {
		
		// Hashtable t = new Hashtable(); //Capacity is 11, load factor 0.75
		
		
		//if we want to configure capacity or load factor
		//Hashtable t=new(initial capacity);
		
		//Here we are providing capacity and load factor
		//Hashtable t=new(initial capacity, fill ratio/load factor);
		
		//For specific data type with key and value
		Hashtable<Integer, String> t=new Hashtable<Integer, String>();

		t.put(101, "John");
		t.put(102, "David");
		t.put(103, "Smith");
		//t.put(null, "R"); //NullPointerException
		//t.put(101, null); //NullPointerException
		
		System.out.println(t); // {103=Smith, 102=Devid, 101=John}
		
		System.out.println(t.get(101)); // John
		
		t.remove(103);
		System.out.println(t); // {102=Devid, 101=John}
		
		System.out.println(t.containsKey(102)); // true
		System.out.println(t.containsKey(104)); // false
		
		System.out.println(t.containsValue("David"));// true
		System.out.println(t.containsValue("y")); // false
		
		System.out.println(t.isEmpty()); // false
		
		System.out.println(t.keySet()); // [102, 101]
		System.out.println(t.values()); // [David, John]
		
		
		//To read individual key and value
		
		for(Integer k:t.keySet()) {
			System.out.println(k+"  "+t.get(k));
		}
		
	/*	102  David
		101  John */
		
		// Entry specific method
		
		for(Map.Entry entry:t.entrySet())  //(key,value)
		{
			System.out.println(entry.getKey()+"  "+entry.getValue());
		}
		
		/* 102  David
		101  John */
		
		Set s = t.entrySet();
		Iterator it = s.iterator();
		while(it.hasNext()) {
		Map.Entry	entry=(Entry) it.next();
		System.out.println(entry.getKey()+"   "+entry.getValue());
		}
	}

}
