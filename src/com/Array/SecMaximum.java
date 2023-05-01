package com.Array;

public class SecMaximum {

	public static void main(String[] args) {
		int a[] = { 10, 45, 98, 67, 87 };
		int max = a[0];
		int secmax = a[0];
		
		for (int i = 1; i < a.length; i++) {
			if (a[i] > max) {
				secmax=max;
				max=a[i];
			}
			else if (a[i] > secmax) {
				secmax=a[i];
			}
		}
		
		System.out.println("Maximun number " + max);
		System.out.println("Second Maximum Number " + secmax);
	}

}
