import java.util.Scanner;

public class drinks extends partyList {

	public static void run(int maxdrinks, int[] drinkAmounts){

		Scanner input = new Scanner (System.in);

		//Asks user for names of drinks
		System.out.println("What kind of drinks will you have? (Type in their names)");

		for(int i = 0; i < maxdrinks; i++){
			System.out.print("\nDrink " + (i + 1) + ": ");
			String name = input.nextLine();
			drinkNames.add(name);
		}

		//Asks user for how many of those drinks mentioned
		System.out.println("\nHow many of those kinds of drinks will you have?");
		for(int i = 0; i < maxdrinks; i++){
			System.out.println(drinkNames.get(i) + ":" + " ");
			drinkAmounts[i] = input.nextInt();
		}
	}
}