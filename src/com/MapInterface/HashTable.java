package com.MapInterface;

import java.util.Hashtable;

public class HashTable {

	public static void main(String[] args) {

		// HashTable ht = new HashTable();
  //Hashtable t=new Hashtable<>(20);
  
		Hashtable<Integer, String> h1 = new Hashtable<Integer, String>();

		h1.put(101, "A");
		h1.put(102, "B");
		h1.put(103, "C");
		h1.put(104, "D");
		h1.put(105, "E");
		System.out.println(h1);
	}
//All the methods same as Hashmap
}
