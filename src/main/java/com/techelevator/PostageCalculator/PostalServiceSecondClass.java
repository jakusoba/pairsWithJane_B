package com.techelevator.PostageCalculator;

public class PostalServiceSecondClass implements DeliveryDriver {

	
	
	
	
	
	@Override
	public double calculateRate(int distance, double weight) {
		if(weight <= 2) {
			return 0.0035 * distance;
		}
		else if(weight <= 8) {
			return 0.004 * distance;
		}
		else if(weight <= 15) {
			return 0.0047 * distance;
			
		}
		else if(weight <= 16) {
			return 0.0195 * distance;
		}
		else if(weight <= 128) {
			return 0.045 * distance;
		}
		return 0.05 * distance;
	}
	
	@Override
	public String toString() {
		return "Postal Service(2nd)" ;
		
	}
	

}
