package com.JavaCollections;

import java.util.Iterator;
import java.util.PriorityQueue;

public class QueueDemo {

	public static void main(String[] args) {
		
		PriorityQueue q=new PriorityQueue();
		
		// Adding elements add() and offer()
		
		q.add("A");
		q.add("B");
		q.add("C");
		q.offer("C"); // Not allowed heterogeneous data
		
		System.out.println(q); // [A, B, C, C] // Insertion order is preserved and duplicates are allowed
		
		// To get head element we use element() and peek()
		
		/*System.out.println(q.element()); //A
		
		System.out.println(q.peek()); */ //A
		
		
		// Return and Remove element from the queue, we have 2 methods remove() and poll()
		
	//	System.out.println(q.remove()); // A
	//	System.out.println(q);//[B, C, C]
		
	//	System.out.println(q.poll()); // A
	//	System.out.println(q); //[B, C, C]
		
		/*Iterator it=q.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}*/
		
		for (Object e : q) {
			System.out.println(e);
		}
		
		
		
		
		
		
		
		
		

	}

}
