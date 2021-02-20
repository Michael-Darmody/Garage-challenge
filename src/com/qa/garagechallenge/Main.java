package com.qa.garagechallenge;

public class Main {

	public static void main(String[] args) {
		Car car1 = new Car("BMW", "Blue", 4, false);
		Car car2 = new Car("Merc", "Black", 4, false);
		Motorbike motorbike1 = new Motorbike("Honda", "Red", false);
		Lorry lorry = new Lorry("Ford", "White", "Large", false);
		Garage garage = new Garage();

		garage.addVehicle(car1);
		garage.addVehicle(car2);
		garage.addVehicle(motorbike1);
		garage.addVehicle(lorry);

		int cost = garage.calculateCost();
		System.out.println("The cost of fixing these vehicles is: £" + cost);

		garage.removeVehicle(5);
		garage.removeVehicle(2);
		System.out.println(garage.getVehicleList());
	}

}
