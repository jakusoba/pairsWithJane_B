package com.techelevator.PostageCalculator;

public class SPU4Day implements DeliveryDriver {

	
	
	@Override
	public double calculateRate(int distance, double weight) {
	
		return (weight * 0.005)* distance;
	}
	@Override
	public String toString() {
		return "SPU (4-Day Ground)" ;
		
	}

}
