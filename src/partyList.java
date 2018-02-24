import java.util.ArrayList;
import java.util.Scanner;

public class partyList {

	// Introduction before the program starts

	public static void intro(){
		System.out.println( "*******************************************************"
						+ "\n* Copyright (C) 2017 Ezer Angeles                     *"
						+ "\n*                                                     *"
						+ "\n* Party List can not be copied and/or distributed     *"
						+ "\n* without the express permission of Ezer Angeles.     *"
						+ "\n*******************************************************");
		System.out.println("");
		System.out.println("Hello.");
		System.out.println("");
		System.out.println("This program will estimate the amount of "
				+ "\nmaterials you will need for the meal aspect \nof your party.");
		System.out.println("");
		System.out.println("In order to use this program, it is highly recommended you"
				+ "\nhave your guests RSVP to your party ahead of time via in-person, phone or email.");
		System.out.println("\nNOTE: \nThese calculations are approximate. "
				+ "\nPlease plan according to your situation.");
	}

	//--GLOBAL VARIABLES START--

	static int[] adults = new int[1];
	static int[] kids = new int[1];
	static ArrayList<String> drinkNames = new ArrayList<String>();
	static ArrayList<String> mealNames = new ArrayList<String>();
	static ArrayList<String> kidsMealNames = new ArrayList<String>();
	static ArrayList<String> adultMealNames = new ArrayList<String>();
	static int cups, plates, mealChoice, maxKidsMeals, maxAdultMeals;

	//--GLOBAL VARIABLES END--

	public static void main(String[] args){

		Scanner input = new Scanner (System.in);

		int startOver = 0;

		intro();

		//Infinite loop unless the user decides to export the party list.

		while(true){

			//Erases array lists contents after each loop.
			drinkNames.clear();
			mealNames.clear();
			kidsMealNames.clear();
			adultMealNames.clear();

			//First object to take in information
			people.run();

			//--Variable declaration & input start--
			System.out.println("\nHow many kinds of drinks will you have?");
			int maxdrinks = input.nextInt();

			int[] drinkAmounts = new int[maxdrinks];
			//--Variable declaration & input end--

			//Second object to take in information
			drinks.run(maxdrinks, drinkAmounts);

			//Third object to take in information
			dishes.run();

			//--Variable declaration & input start--
			int maxmeals;

			System.out.println("\nHow many kinds of meals will you serve?");
			maxmeals = input.nextInt();

			int[]mealAmounts = new int[maxmeals];

			ArrayList <Integer> kidsMealAmounts = new ArrayList <Integer>();
			ArrayList <Integer> adultsMealAmounts = new ArrayList <Integer>();
			//--Variable declaration & input end--

			//Erases array lists contents after each loop.
			kidsMealAmounts.clear();
			adultsMealAmounts.clear();

			//Fourth object to take in information
			meals.run(maxmeals, kidsMealAmounts, adultsMealAmounts, mealAmounts);

			//Final object that prints out other object's information
			results.run(maxmeals, maxdrinks, drinkAmounts, cups, plates, mealChoice, kidsMealAmounts, adultsMealAmounts, mealAmounts);

			//Asks user if they want to start over or not.
			System.out.println("\nWould you like to start over? (1 for yes, 0 for no)");
			startOver = input.nextInt();

			while(startOver > 1 || startOver < 0){
				System.out.println("Invalid. Type 1 or 0.");
				System.out.println("\nWould you like to start over? (1 for yes, 0 for no)");
				startOver = input.nextInt();
			}

			if(startOver == 1){
				continue;
			}
			else{
				break;
			}
		}

		System.out.println("\n\nThanks for using this program!" + 
				"\n\nCopyright (C) 2017 Ezer Angeles. All rights reserved.");
	}
}