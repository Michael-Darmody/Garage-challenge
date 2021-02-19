package com.qa.garagechallenge;

import java.util.ArrayList;

public class Garage {
	private ArrayList<Vehicle> vehicleList;
	private int totalCost;

	public Garage() {
		this.vehicleList = new ArrayList<>();
		this.totalCost = 0;
	}

	public void addVehicle(Vehicle vehicle) {
		vehicleList.add(vehicle);
		System.out.println("You have added the " + vehicle.getMake() + " to the garage.");
	}

	public void removeVehicle(String vehicleType) {
		for (Vehicle vehicle : new ArrayList<>(this.vehicleList)) {
			if (vehicle.getClass().getTypeName().contains(vehicleType)) {
				this.vehicleList.remove(vehicle);
			}
		}
	}

	public void removeVehicle(int id) {
		for (int i = 0; i < this.vehicleList.size(); i++) {
			Vehicle currentVehicle = this.vehicleList.get(i);
			if (currentVehicle.getId() == id) {
				this.vehicleList.remove(i);
				System.out.println("The " + currentVehicle.getMake() + " has been removed.");
				break;
			}
			System.out.println("Could not find the vehicle youre looking for.");
		}
	}

	public void emptyGarage() {
		this.vehicleList.clear();
		System.out.println("The garage has been cleared for new orders.");
	}

	public int calculateCost() {
		for (Vehicle vehicle : this.vehicleList) {
			if (vehicle instanceof Car) {
				this.totalCost += 500;
			} else if (vehicle instanceof Motorbike) {
				this.totalCost += 200;
			} else {
				this.totalCost += 700;
			}
		}

		return totalCost;
	}

	public ArrayList<Vehicle> getVehicleList() {
		return vehicleList;
	}

	public void setVehicleList(ArrayList<Vehicle> vehicleList) {
		this.vehicleList = vehicleList;
	}

}
