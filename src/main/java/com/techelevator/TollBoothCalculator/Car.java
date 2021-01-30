package com.techelevator.TollBoothCalculator;

public class Car implements Vehicle{
	
	private boolean hasTrailer;
	
	public Car(boolean hasTrailer) {
		this.hasTrailer = hasTrailer;
	}

	@Override
	public double calculateToll(int distance) {
		double toll = 0.0;
		toll = distance * 0.020;
		if (hasTrailer) {
			toll += 1.00;
		}
		
		return toll;
	}

	public boolean isHasTrailer() {
		return hasTrailer;
	}
	
	
	

}
