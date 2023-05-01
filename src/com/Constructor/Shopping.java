package com.Constructor;

public class Shopping {

	
	String pName;
	int pPrice;
	String pColor;
	String pBrand;
	int pQuantity;
	
	public Shopping(String pdtName,int pdtPrice,String pdtColor,String pdtBrand,int pdtQuantity) {
		pName=pdtName;
		pPrice=pdtPrice;
		pColor=pdtColor;
		pBrand=pdtBrand;
		pQuantity=pdtQuantity;
	}
	
	public void display() {
		System.out.println(pName);
		System.out.println(pPrice);
		System.out.println(pColor);
		System.out.println(pBrand);
		System.out.println(pQuantity);
	}
	
	public static void main(String[] args) {
		
		Shopping sp1 = new Shopping("iPhone",50000, "White", "Apple", 1);
		sp1.display();
		
		Shopping sp2 = new Shopping("Laptop", 49000, "Black", "Window 10", 2);
		sp2.display();
		
		Shopping sp3 = new Shopping("Car", 100000, "Brown", "Audi", 3);
		sp3.display();
		

	}

}
