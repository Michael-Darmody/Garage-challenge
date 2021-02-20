package com.qa.garagechallenge;

public class Vehicle {
	private int id;
	private String make;
	private String colour;
	private int wheels;

	public Vehicle(String make, String colour, int wheels) {
		this.make = make;
		this.colour = colour;
		this.wheels = wheels;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	public int getWheels() {
		return wheels;
	}

	public void setWheels(int wheels) {
		this.wheels = wheels;
	}

}
