import java.util.ArrayList;
import java.util.Scanner;

public class meals extends partyList{

	public static void adultMeals(ArrayList<Integer> adultsMealAmounts){

		Scanner input = new Scanner (System.in);

		//Asks user what kinds of meals will be served to adults
		System.out.println("What kind of meals will you serve to adults? (Type in their names)");

		for(int i = 0; i < maxAdultMeals; i++){
			System.out.print("\nMeal " + (i + 1) + ": ");
			String name = input.nextLine();
			adultMealNames.add(name);
		}
		
		for (int i = 0; i < maxAdultMeals; i++){
			adultsMealAmounts.add(i, adults[0]);
		}

	}

	public static void kidsMeals(ArrayList <Integer> kidsMealAmounts){
		
		Scanner input = new Scanner (System.in);
		
		//Asks user what kinds of meals will be served to kids
		System.out.println("What kind of meals will you serve to kids? (Type in their names)");

		for(int i = 0; i < maxKidsMeals; i++){
			System.out.print("\nMeal " + (i + 1) + ": ");
			String name = input.nextLine();
			kidsMealNames.add(name);
		}

		for (int i = 0; i < maxKidsMeals; i++){
			kidsMealAmounts.add(i, kids[0]);
		}
		
	}
	
	public static void separate(ArrayList <Integer> kidsMealAmounts, ArrayList<Integer> adultsMealAmounts) {

		Scanner input = new Scanner (System.in);

		//Asks user for how many kinds of meals will be served to kids and adults
		System.out.print("\nHow many kinds of meals will you serve to kids?\n");
		maxKidsMeals = input.nextInt();

		System.out.print("\nHow many kinds of meals will you serve to adults?\n");
		maxAdultMeals = input.nextInt();

		adultMeals(adultsMealAmounts);
		
		kidsMeals(kidsMealAmounts);

	}

	public static void nonSeparate(int maxmeals, int[] mealAmounts) {

		Scanner input = new Scanner (System.in);

		//Asks user for how many kinds of meals will be served in general
		System.out.println("What kind of meals will you serve? (Type in their names)");

		for(int i = 1; i <= maxmeals; i++){
			System.out.print("\nMeal " + (i) + ": ");
			String name = input.nextLine();
			mealNames.add(name);
		}

		for(int i = 0; i < maxmeals; i++){
			mealAmounts[i] = ((adults[0]) + (kids[0]));
		}	

	}	

	public static void run(int maxmeals, ArrayList <Integer> kidsMealAmounts, ArrayList<Integer> adultsMealAmounts, int[] mealAmounts){

		Scanner input = new Scanner (System.in);

		//Asks user if meals are seperate
		System.out.println("\nWill your meals be separate? (Adult meals and kids meals?)"
				+ "\n(Type 1 for yes, 0 for no)");
		mealChoice = input.nextInt();

		while(mealChoice > 1 || mealChoice < 0){
			System.out.println("\nInvalid. Type in 1 or 0.");
			System.out.println("\nWill your meals be seperate? (Adult meals and kids meals?)");
			mealChoice = input.nextInt();
		}

		if(mealChoice == 1){
			separate(kidsMealAmounts, adultsMealAmounts);
		}
		else{
			nonSeparate(maxmeals, mealAmounts);
		}
	}
}