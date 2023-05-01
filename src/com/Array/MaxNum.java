package com.Array;

public class MaxNum {

	public static void main(String[] args) {
		
		int a[]= {22,-11,85,7,4};
		int max=a[0];
		
		for(int i=0;i<a.length;i++) {
			if(a[i]>max) {
				max=a[i];
			}
		}
		System.out.println("Maximum Number "+max);

	}

}
