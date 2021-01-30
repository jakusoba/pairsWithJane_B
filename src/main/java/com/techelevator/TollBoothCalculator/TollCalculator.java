package com.techelevator.TollBoothCalculator;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class TollCalculator {

	public static void main(String[] args) {
		
		List<Vehicle> listOfVehicles = new ArrayList<Vehicle>();
		
		Truck toyota = new Truck(4);
		listOfVehicles.add(toyota);
		
		Truck ford6Axles = new Truck(6);
		listOfVehicles.add(ford6Axles);
		
		Truck bigSemiTruck = new Truck(10);
		listOfVehicles.add(bigSemiTruck);
		
		Tank tank = new Tank();
		listOfVehicles.add(tank);
		
		Car carNoTrailer = new Car(false);
		listOfVehicles.add(carNoTrailer);
		
		Car carHasTrailer = new Car(true);
		listOfVehicles.add(carHasTrailer);
		
		
		System.out.println("Vehicle		" + "Distance Traveled	" + "Toll $");
		System.out.println("-----------------------------------------------");
		for (Vehicle vehicle : listOfVehicles) {
			Random random = new Random();
			int rand = (int) random .nextInt(240 - 10 + 1) + 10;
			
			DecimalFormat dec = new DecimalFormat("#.##");
			;
			
			System.out.println(vehicle.getClass().getSimpleName() + "		" + rand + "			" + dec.format(vehicle.calculateToll(rand)));
				
			

		}
		System.out.println("\n\n***\n");
		
//		
		
		
		
		
		
		
		

	}

}
