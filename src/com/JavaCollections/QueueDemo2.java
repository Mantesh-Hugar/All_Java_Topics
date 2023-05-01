package com.JavaCollections;

import java.util.LinkedList;

public class QueueDemo2 {

	public static void main(String[] args) {

		LinkedList q = new LinkedList();

		// Adding elements add() and offer()

		q.add("A");
		q.add("B");
		q.add("C");
		q.offer(100);
		q.offer("C"); // Allowed heterogeneous data

		System.out.println(q); // [A, B, C, 100, C]

		// To get head element we use element() and peek()

		// System.out.println(q.element()); // A

		// System.out.println(q.peek()); // A

		// Return and Remove element from the queue, we have 2 methods remove() and
		// poll()

		// System.out.println(q.remove()); // A
		// System.out.println(q);//[B, C,100, C]

		// System.out.println(q.poll()); // A
		// System.out.println(q); //[B, C,100, C]

		/*
		 * Iterator it=q.iterator(); while (it.hasNext()) {
		 * System.out.println(it.next()); }
		 */

		for (Object e : q) {
			System.out.println(e); 
		}

	}

}
