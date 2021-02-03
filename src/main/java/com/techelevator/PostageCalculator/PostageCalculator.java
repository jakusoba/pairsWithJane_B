package com.techelevator.PostageCalculator;


import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PostageCalculator {

	public static void main(String[] args) {
		String weightChoice;
		
		Scanner scanner = new Scanner(System.in);
		
		Double weight;
		int distance;
		System.out.println("Please enter the weight of the package.");
		weight = Double.parseDouble(scanner.nextLine());
		
		System.out.println("Was that in (P)ounds or (O)unces? ");
		weightChoice = scanner.nextLine();
		if(weightChoice.equalsIgnoreCase("P")){
			weight *= 16;
		}
		
		System.out.println("What distance will it be traveling?");
		distance = Integer.parseInt(scanner.nextLine());
		
		List<DeliveryDriver>list = new ArrayList<DeliveryDriver>();
		PostalServiceFirstClass postalServiceFirstClass = new PostalServiceFirstClass();
		PostalServiceSecondClass postalServiceSecondClass = new PostalServiceSecondClass();
		PostalServiceThirdClass postalServiceThirdClass = new PostalServiceThirdClass();
		SPU4Day spu4Day = new SPU4Day();
		SPU2Day spu2Day = new SPU2Day();
		SPUNextDay spuNextDay = new SPUNextDay();
		FexED fexEd = new FexED();
		
		list.add(postalServiceFirstClass);
		list.add(postalServiceSecondClass);
		list.add(postalServiceThirdClass);
		list.add(spu2Day);
		list.add(spu4Day);
		list.add(spuNextDay);
		list.add(fexEd);
		
		System.out.println(String.format("%-25s %20s", "Delivery Method", "$ cost"));
		System.out.println("----------------------------------------------");
		

		for(DeliveryDriver service: list) {
			DecimalFormat dec = new DecimalFormat("#.##");
			String rateString = String.valueOf(dec.format(service.calculateRate(distance, weight)));
			service.toString();
			System.out.println(String.format("%-25s %20s", service.toString(), rateString));
			
		}
		
		
		
		
		
	
		
		//Create a for each loop, that loops through the list array, prints out the name of the object and 
		//calls the calculateRate method.
		
		
		
				
	
		
		
	}

}
