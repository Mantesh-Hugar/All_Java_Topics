package com.Array;

public class SecMinimum {

	public static void main(String[] args) {
		int a[] = { 10, 2, 3, 1, 35 };
		int min = a[0];
		int secmin = a[0];

		for (int i = 0; i < a.length; i++) {
			if (a[i] < min) {
				secmin = min;
				min = a[i];
			} else if (a[i] < secmin) {
				a[i] = secmin;

			}
		}
		System.out.println("Minimum Number " + min);
		System.out.println("Second Minimum Number " + secmin);
	}

}
