package com.JavaCollections;

import java.util.HashSet;

public class LinkedHashSet { //Here insertion order is preserved

	public static void main(String[] args) {

		HashSet hs = new HashSet();
		hs.add(100);
		hs.add(200);
		hs.add(300);
		hs.add(400);
		hs.add(500);

		System.out.println(hs);// [400, 100, 500, 200, 300]

	}

}
