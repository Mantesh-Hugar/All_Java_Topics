package com.OopsConcept;


class Animal{
	public void eat() {
		System.out.println("Animal eat");
	}
}

class Dog extends Animal{
	public void bark() {
		System.out.println("Dog bark");
	}
}

class Cat extends Animal{
	public void meow() {
		System.out.println("Meow Meow");
	}
}
public class Hierarchial {

	public static void main(String[] args) {
	Dog d1 = new Dog();
	d1.eat();
	d1.bark();
	Cat c1 = new Cat();
	c1.eat();
	c1.meow();

	}

}
