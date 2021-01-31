package com.techelevator.PostageCalculator;

public class PostalServiceThirdClass implements DeliveryDriver {


	
	@Override
	public double calculateRate(int distance, double weight) {
		if(weight <= 2) {
			return 0.0020 * distance;
		}
		else if(weight <= 8) {
			return 0.0022 * distance;
		}
		else if(weight <= 15) {
			return 0.0024 * distance;
			
		}
		else if(weight <= 16) {
			return 0.015 * distance;
		}
		else if(weight <= 128) {
			return 0.016 * distance;
		}
		return 0.017 * distance;
	}
	@Override
	public String toString() {
		return "Postal Service(3rd)" ;
		
	}
	

}
