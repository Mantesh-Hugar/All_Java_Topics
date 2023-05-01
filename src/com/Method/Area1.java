package com.Method;

public class Area1 {

	
	public static void areaOfSquare() {
		int side=4,area_s;
		area_s=side*side;
		System.out.println(area_s);
	}
	public static void areaOfTri() {
		int breadth=3,height=4;
		float area_t=(0.5f)*breadth*height;
		System.out.println(area_t);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		areaOfSquare();
		areaOfTri();

	}

}
