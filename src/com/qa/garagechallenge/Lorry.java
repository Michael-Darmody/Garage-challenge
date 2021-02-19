package com.qa.garagechallenge;

public class Lorry extends Vehicle {
	private String trailerSize;
	private boolean bedroom;

	public Lorry(int id, String make, String colour, int wheels, String trailerSize, boolean bedroom) {
		super(id, make, colour, 4);
		this.trailerSize = trailerSize;
		this.bedroom = bedroom;
	}

	public String getTrailerSize() {
		return trailerSize;
	}

	public void setTrailerSize(String trailerSize) {
		this.trailerSize = trailerSize;
	}

	public boolean isBedroom() {
		return bedroom;
	}

	public void setBedroom(boolean bedroom) {
		this.bedroom = bedroom;
	}

}
