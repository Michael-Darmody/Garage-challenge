package com.qa.garagechallenge;

public class Car extends Vehicle {
	private int seatNum;
	private boolean spoiler;

	public Car(String make, String colour, int seatNum, boolean spoiler) {
		super(make, colour, 4);
		this.seatNum = seatNum;
		this.spoiler = spoiler;
	}

	public int getSeatNum() {
		return seatNum;
	}

	public void setSeatNum(int seatNum) {
		this.seatNum = seatNum;
	}

	public boolean getSpoler() {
		return spoiler;
	}

	public void setSpoiler(boolean spoiler) {
		this.spoiler = spoiler;
	}
}
