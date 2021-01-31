package com.techelevator.PostageCalculator;

public class SPU2Day implements DeliveryDriver {

	
	
	@Override
	public double calculateRate(int distance, double weight) {
	
		return (weight * 0.050)* distance;
	}
	@Override
	public String toString() {
		return "SPU (2-Day Business)" ;
		
	}
	

}
