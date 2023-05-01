package com.Method;

public class AreasWithArgu {

	
	public static void areaOfTri(int breadth, int height) {
		float area_t;
		area_t=(0.5f)*breadth*height;
		System.out.println(area_t);
	}
	public static void areaOfCir(int radius) {
		float area_c;
		area_c=(3.14f)*radius*radius;
		System.out.println(area_c);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
areaOfTri(4,5);
areaOfCir(5);
	}

}
