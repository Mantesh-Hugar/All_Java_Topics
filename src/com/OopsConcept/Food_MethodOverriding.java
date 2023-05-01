package com.OopsConcept;

class Zomato {
	public void getRestaurants() {
		System.out.println("As per location");
	}
}

class Customer extends Zomato {
	public void getRestaurants() {
		System.out.println("As per review");
	}
}

public class Food_MethodOverriding {

	public static void main(String[] args) {

		Zomato z1 = new Zomato();
		z1.getRestaurants();

		Customer c1 = new Customer();
		c1.getRestaurants();

	}

}
