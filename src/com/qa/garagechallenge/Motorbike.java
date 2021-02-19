package com.qa.garagechallenge;

public class Motorbike extends Vehicle {
	private boolean seatStorage;

	public Motorbike(int id, String make, String colour, boolean seatStorage) {
		super(id, make, colour, 2);
		this.seatStorage = seatStorage;
	}

	public boolean isSeatStorage() {
		return seatStorage;
	}

	public void setSeatStorage(boolean seatStorage) {
		this.seatStorage = seatStorage;
	}

}
