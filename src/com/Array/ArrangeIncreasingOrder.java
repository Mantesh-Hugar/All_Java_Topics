package com.Array;

public class ArrangeIncreasingOrder {

	public static void main(String[] args) {
		int a[] = { 11, 8, 95, 162, 4 };
		int temp;

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length - 1; j++) {
				if (a[j] > a[j + 1]) {
					temp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = temp;
				}
			}
		}
		for (int k = 0; k < a.length; k++) {
			System.out.println(a[k]);
		}
	}

}
