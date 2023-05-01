package com.ConstructorOverloading;

public class ConstructorOverloading {

	String cName, cColor, cModel;
	int cPrice;
	int cCapacity;

	public ConstructorOverloading(String carName, String carColor) {
		cName = carName;
		cColor = carColor;
	}

	public ConstructorOverloading(String carName, String carColor, int price) {
		cName = carName;
		cColor = carColor;
		cPrice = price;
	}

	public ConstructorOverloading(String carName, String carColor, int price, String carModel, int carCapacity) {
		cName = carName;
		cColor = carColor;
		cPrice = price;
		cModel = carModel;
		cCapacity = carCapacity;
	}

	public static void main(String[] args) {

		ConstructorOverloading cons1 = new ConstructorOverloading("Indica", "White");
		System.out.println(cons1.cName + " " + cons1.cColor);

		ConstructorOverloading cons2 = new ConstructorOverloading("Audi", "Black", 2500000);
		System.out.println(cons2.cName + " " + cons2.cColor + " " + cons2.cPrice);

		ConstructorOverloading cons3 = new ConstructorOverloading("Nano", "Yellow", 65000, "nano724", 4);
		System.out.println(
				cons3.cName + " " + cons3.cColor + " " + cons3.cPrice + " " + cons3.cModel + " " + cons3.cCapacity);

	}

}
