package com.qa.garagechallenge;

public class Main {

	public static void main(String[] args) {
		Car car = new Car(1, "BMW", "Blue", 5, false);
		Car car2 = new Car(2, "Merc", "Black", 4, false);
		Motorbike bike = new Motorbike(3, "Honda", "Red", false);
		Garage garage = new Garage();

		garage.addVehicle(car);
		garage.addVehicle(car2);
		garage.addVehicle(bike);

		System.out.println(garage.calculateCost());

		garage.removeVehicle(8);

	}

}
