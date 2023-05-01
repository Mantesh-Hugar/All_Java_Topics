package com.OopsConcept;

class Animal {
	public void eat() {
		System.out.println("Animals eat");
	}
}

class Dog extends Animal {
	public void bark() {
		System.out.println("Dog bark");
	}
}

class Cat extends Dog {
	public void meow() {
		System.out.println("Cat drink milk");
	}
}

public class MultiLevelInheritance {

	public static void main(String[] args) {

		Cat c1 = new Cat();
		c1.bark();
		c1.eat();
		c1.meow();
	}

}
