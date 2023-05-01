package com.Array;

public class SumAndAvg {

	public static void main(String[] args) {
		int a[]= {10,20,30,40,50,60,70};
		int sum=0;
		
		for(int i=0;i<a.length;i++) {
			sum=sum+a[i];
			
		}
		System.out.println("Sum of all the numbers "+sum);
		float avg;
		avg=sum/a.length;
		System.out.println("Avarage of all the number "+avg);
	}

}
