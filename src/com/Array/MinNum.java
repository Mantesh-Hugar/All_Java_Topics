package com.Array;

public class MinNum {

	public static void main(String[] args) {
		
		int a[]= {2,-8,0,45,5};
		int min=a[0];
		
		for(int i=0;i<a.length;i++) {
			if(a[i]<min) {
				min=a[i];
			}
		}
System.out.println("Minimum Number "+min);
	}

}
