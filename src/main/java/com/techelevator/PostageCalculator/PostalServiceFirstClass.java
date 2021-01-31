package com.techelevator.PostageCalculator;

public class PostalServiceFirstClass implements DeliveryDriver {

	
	
	
	
	
	@Override
	public double calculateRate(int distance, double weight) {
		if(weight <= 2) {
			return 0.035 * distance;
		}
		else if(weight <= 8) {
			return 0.04 * distance;
		}
		else if(weight <= 15) {
			return 0.047 * distance;
			
		}
		else if(weight <= 16) {
			return 0.195 * distance;
		}
		else if(weight <= 128) {
			return 0.45 * distance;
		}
		return 0.5 * distance;
	}

	/**@Override
	public String toString() {
		return "PostalServiceFirstClass [getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}**/
	
	@Override
	public String toString() {
		return "Postal Service(1st)" ;
		
	}
	
	
	
	
	

}
