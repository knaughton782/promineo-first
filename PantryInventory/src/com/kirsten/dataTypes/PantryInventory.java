package com.kirsten.dataTypes;

public class PantryInventory {

	public static void main(String[] args) {
//		byte
//		short
//		int
//		long
//		char
//		float
//		double
//		boolean
		//String
		boolean boysEat = true;
		if (boysEat == false) {
				
			//Before the boys eat
			byte cansOfFruit = 6;
			short boxesMacAndCheese = 12;
			int fruitSnacks = 120;
			long thingsToEat = 12345678L;
			char crackerBoxes = 6;
			float openedPackagesOfPudding = 3.0009f;
			double gallonsOfMilk = 2.75;
			boolean thereIsFood = true;
			String kitchen = " and the kitchen is clean.";
			
			System.out.println("Before the boys eat, there are " + cansOfFruit + " cans of fruit, " );
			System.out.println(boxesMacAndCheese + " boxes of Mac and Cheese, " );
			System.out.println(fruitSnacks + " Fruit Snacks, " );
			System.out.println( + crackerBoxes + " boxes of crackers." );
			System.out.println( + openedPackagesOfPudding + " packages of pudding that someone stuck their fingers in, and " );
			System.out.println( + gallonsOfMilk + " gallons of milk." );
			System.out.println("There is food in the kitchen: " + thereIsFood);
			System.out.println( "Before the boys eat there are "+ thingsToEat + " things to eat" );
			System.out.println(kitchen );
		
		} else {
		//After the boys eat
		
			byte cansOfFruit = 0;
			short boxesMacAndCheese = 0;
			int fruitSnacks = 0;
			long thingsToEat = 0L;
			char crackerBoxes = 0;
			float openedPackagesOfPudding = 0f;
			double gallonsOfMilk = 0;
			boolean thereIsFood = false;
			String kitchen = " and the kitchen is very messy."; 
			
			System.out.println("After the boys eat, there are " + cansOfFruit + " cans of fruit, " );
			System.out.println(boxesMacAndCheese + " boxes of Mac and Cheese, " );
			System.out.println(fruitSnacks + " Fruit Snacks, " );
			System.out.println( + crackerBoxes + " boxes of crackers." );
			System.out.println( + openedPackagesOfPudding + " packages of pudding that someone stuck their fingers in, and " );
			System.out.println( + gallonsOfMilk + " gallons of milk." );
			System.out.println("There is food in the kitchen: " + thereIsFood);
			System.out.println( "After the boys eat there are "+ thingsToEat + " things to eat" );
			System.out.println(kitchen );
		

	}
	}
}
