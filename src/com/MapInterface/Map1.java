package com.MapInterface;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Map1 {

	public static void main(String[] args) {
		// For Heterogeneous k, v
		// HashMap hm = new HashMap();

		// For Specific k, v pair
		
		HashMap<Integer, String> hm = new HashMap<Integer, String>();

		hm.put(101, "Mantesh");
		hm.put(102, "Mahesh");
		hm.put(103, "Dinesh");
		hm.put(104, "Varun");
		hm.put(105, "Nagesh");
		hm.put(101, "Ajay");
		hm.put(106, "Varun");

		System.out.println(hm); // {101=Ajay, 102=Mahesh, 103=Dinesh, 104=Varun, 105=Nagesh, 106=Varun}

		System.out.println(hm.get(105)); // Nagesh

		hm.remove(106);
		System.out.println(hm); // {101=Ajay, 102=Mahesh, 103=Dinesh, 104=Varun, 105=Nagesh}

		System.out.println(hm.containsKey(102)); // true
		System.out.println(hm.containsKey(106)); // false

		System.out.println(hm.containsValue("Dinesh")); // true
		System.out.println(hm.containsValue("Y")); // false

		System.out.println(hm.isEmpty()); // false

		System.out.println(hm.keySet()); // [101, 102, 103, 104, 105]

		for (int i : hm.keySet()) {
			System.out.println(i);
		}

		System.out.println(hm.values()); // [Ajay, Mahesh, Dinesh, Varun, Nagesh]

		for (String j : hm.values()) {
			System.out.println(j);
		}

		System.out.println(hm.entrySet()); // [101=Ajay, 102=Mahesh, 103=Dinesh, 104=Varun, 105=Nagesh]

		for (Integer i : hm.keySet()) {
			System.out.println(i + "      " + hm.get(i));
		}

		// Entry Methods
		// **************
//		for(Map.Entry entry:hm.entrySet()) {
//			System.out.println(entry.getKey()+"  "+entry.getValue());
//		}
//	}

		// iterator()

		Set s = hm.entrySet();

		Iterator itr = s.iterator();

		while (itr.hasNext()) {
			Map.Entry entry = (Entry) itr.next();
			System.out.println(entry.getKey() + "  " + entry.getValue());
		}
	}
}
