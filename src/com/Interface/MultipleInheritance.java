package com.Interface;

interface A{
	void m1();
}
interface B{
	void m2();
}
class C implements A,B{
	public void m1() {
		System.out.println("m1");
	}
	public void m2() {
		System.out.println("m2");
	}
}
public class MultipleInheritance {

	public static void main(String[] args) {
		C c1 = new C();
		c1.m1();
		c1.m2();

	}

}
