package com.techelevator.TollBoothCalculator;

public class Truck implements Vehicle {
	
	private int numberofAxles;

	public Truck(int numberofAxles) {
		this.numberofAxles = numberofAxles;
	}

	@Override
	public double calculateToll(int distance) {
		double toll = 0;
		if (this.numberofAxles == 4) {
			toll = 0.040 * distance;
		}
		else if (this.numberofAxles == 6) {
			toll = 0.045 * distance;
		}
		else if (this.numberofAxles >= 8) {
			toll = 0.048 * distance;
		}		
		return toll;
	}


	public int getNumberofAxles() {
		return numberofAxles;
	}
}
