package com.techelevator.PostageCalculator;

public class FexED implements DeliveryDriver {
	private double rate = 20;
	
	
	

	
	@Override
	public double calculateRate(int distance, double weight) {
		if(distance > 500) {
			rate += 5.0;
		}
		if(weight > 48) {
			rate += 3.0;
		}
		return rate;
	}
	@Override
	public String toString() {
		return "FexED" ;
		
	}

}
