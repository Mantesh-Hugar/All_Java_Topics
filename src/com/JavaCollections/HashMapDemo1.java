package com.JavaCollections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapDemo1 {

	public static void main(String[] args) {
		
		
		HashMap<Integer, String> m = new HashMap<Integer, String>();
		
		m.put(101, "John");
		m.put(102, "David");
		m.put(103, "Scott");
		m.put(104, "Mary");
		m.put(105, "Tye");
		m.put(103, "DuplicateKey");
		m.put(106, "David");
		
		//System.out.println(m);
		
		//	************ Entry Methods ***********
		
		for (Map.Entry entry : m.entrySet()) {
			System.out.println(entry.getKey()+"  "+entry.getValue());
		}
		
		/* O/p:-
		101  John
		102  David
		103  DuplicateKey
		104  Mary
		105  Tye
		106  David
		*/
		
		System.out.println("Iterator");
		//iterator
		Set s = m.entrySet();
		Iterator it = s.iterator();
		while(it.hasNext()) {
		Map.Entry  entry=(Entry) it.next();
		System.out.println(entry.getKey()+" "+entry.getValue());
		}
		
/* O/p:-
101=John
102=David
103=DuplicateKey
104=Mary
105=Tye
106=David
		 */

	}

}
