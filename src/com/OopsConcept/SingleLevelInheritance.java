package com.OopsConcept;

class Animal {
	public void eat() {
		System.out.println("All animals eat");
	}
}

class Dog extends Animal {
	public void bark() {
		System.out.println("dogs bark");
	}
}

public class SingleLevelInheritance {

	public static void main(String[] args) {
		Dog d1 = new Dog();
		d1.eat();
		d1.bark();
	}

}
