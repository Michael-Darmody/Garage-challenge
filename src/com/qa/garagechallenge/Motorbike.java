package com.qa.garagechallenge;

public class Motorbike extends Vehicle {
	private boolean seatStorage;

	public Motorbike(String make, String colour, boolean seatStorage) {
		super(make, colour, 2);
		this.seatStorage = seatStorage;
	}

	public boolean isSeatStorage() {
		return seatStorage;
	}

	public void setSeatStorage(boolean seatStorage) {
		this.seatStorage = seatStorage;
	}

}
