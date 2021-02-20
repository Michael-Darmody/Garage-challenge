package com.qa.garagechallenge;

import java.util.ArrayList;

public class Garage {
	private ArrayList<Vehicle> vehicleList;
	private int totalCost;
	private int vehicleCount;

	public Garage() {
		this.vehicleList = new ArrayList<>();
		this.totalCost = 0;
		this.vehicleCount = 1;
	}

	public boolean addVehicle(Vehicle vehicle) {
		vehicle.setId(vehicleCount++);
		System.out.println("You have added the " + vehicle.getMake() + " to the garage.");
		return vehicleList.add(vehicle);
	}

	public boolean removeVehicle(String vehicleType) {
		ArrayList<Vehicle> toRemove = new ArrayList<>();

		for (Vehicle vehicle : this.vehicleList) {
			if (vehicle.getClass().getSimpleName().equalsIgnoreCase(vehicleType)) {
				toRemove.add(vehicle);
			}
		}

		return this.vehicleList.removeAll(toRemove);
	}

	public boolean removeVehicle(int id) {
		for (Vehicle vehicle : this.vehicleList) {
			if (vehicle.getId() == id) {
				System.out.println("The vehicle at position " + vehicle.getId() + " has been removed.");
				return this.vehicleList.remove(vehicle);
			}
		}
		System.out.println("The vehicle at this id could not be found");
		return false;
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
