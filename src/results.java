import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Scanner;

public class results extends partyList{

	public static void list(int maxmeals, int maxdrinks, int[] drinkAmounts, int cups, int plates, int mealChoice, ArrayList <Integer> kidsMealAmounts, ArrayList <Integer> adultsMealAmounts, int[] mealAmounts){

		int[] utensils = new int[2];

		utensils[0] = adults[0];
		utensils[1] = kids[0];

		//Starts list and prints out number of utensils needed
		System.out.println("\nThis is your overall list:");
		System.out.println("\nPlastic or Silverware Utensils \n(Sets of 1 Knife, 1 Fork, and 1 Spoon): "
				+ "\nAdults: " + utensils[0] + "\nKids: " + utensils[1]);
		System.out.println("\nDrinks:");

		//Prints out drinks for people
		for (int i = 0; i < maxdrinks; i++){
			System.out.print(drinkNames.get(i) + ": ");
			System.out.println(drinkAmounts[i]);
		}

		//Prints out cups and plates to buy
		System.out.println("\nCups to buy: "
				+ "\n" + cups);
		System.out.println("\nPlates to buy: "
				+ "\n" + plates);

		//Prints out meals names, which depend on whether they are seperate or not
		System.out.println("\nMeals:");

		if(mealChoice == 1){
			System.out.println("\n-Kids Meals:");
			for (int i = 0; i < maxKidsMeals; i++){
					System.out.println(kidsMealNames.get(i) + ": " + kidsMealAmounts.get(i));
			}
			System.out.println("\n-Adults Meals:");
			for (int i = 0; i < maxAdultMeals; i++){
					System.out.println(adultMealNames.get(i) + ": " + adultsMealAmounts.get(i));
			}
		}
		else{
			for (int i = 0; i < maxmeals; i++){
					System.out.println(mealNames.get(i) + ": " + mealAmounts[i]);
			}
		}
	}

	public static void run(int maxmeals, int maxdrinks, int[] drinkAmounts, int cups, int plates, int mealChoice, ArrayList <Integer> kidsMealAmounts, ArrayList <Integer> adultsMealAmounts, int[] mealAmounts){
		Scanner input = new Scanner (System.in);

		int choice = 0;

		//Asks user if list will be printed into a text document
		System.out.println("\nWould you like to export this list into a text file?"
				+ "\n(1 for yes, 0 for no)");
		choice = input.nextInt();

		while(choice > 1 || choice < 0){
			System.out.println("Invalid. Type in 1 or 0.");
			System.out.println("\nWould you like to export this list into a text file?"
					+ "\n(1 for yes, 0 for no)");
			choice = input.nextInt();
		}

		if (choice == 1){
			//List will be printed to a document
			try {
				String userHomeFolder = System.getProperty("user.home") + "/Desktop";
				PrintStream o = new PrintStream(new File(userHomeFolder, "Party List.txt"));
				PrintStream console = System.out;
				System.setOut(o);
				list(maxmeals, maxdrinks, drinkAmounts, cups, plates, mealChoice, kidsMealAmounts, adultsMealAmounts, mealAmounts);
				System.setOut(console);
				System.out.println("");
				System.out.println("Done!");
				System.out.println("");
				list(maxmeals, maxdrinks, drinkAmounts, cups, plates, mealChoice, kidsMealAmounts, adultsMealAmounts, mealAmounts);
			} catch (FileNotFoundException e) {
				e.printStackTrace();
				System.out.println("ERROR. STOPPING PROGRAM NOW.");
				System.exit(0);
			}
		}
		else{
			//List will not be printed to a document
			list(maxmeals, maxdrinks, drinkAmounts, cups, plates, mealChoice, kidsMealAmounts, adultsMealAmounts, mealAmounts);
		}
	}
}