import java.util.Scanner;

public class dishes extends partyList{

	public static void run(){

		Scanner input = new Scanner (System.in);

		int cupsChoice = 0, platesChoice = 0;

		//--Asks for cups--

		System.out.println("\nWill you use your own or buy cups?" +
				"\n(1 for use your own cups, 0 for buy cups)");
		cupsChoice = input.nextInt();

		while (cupsChoice > 1 || cupsChoice < 0){
			System.out.println("Invalid. Choose 1 or 0.");

			System.out.println("\nWill you use your own or buy cups?" +
					"\n(1 for use your own cups, 0 for buy cups)");
			cupsChoice = input.nextInt();
		}

		if (cupsChoice == 0){
			cups = ((adults[0]) + (kids[0]));
		}
		else{
			cups = 0;
		}

		//--Asks for plates--

		System.out.println("\nWill you use your own or buy plates?" +
				"\n(1 for use your own plates, 0 for buy plates)");
		platesChoice = input.nextInt();

		while (platesChoice > 1 || platesChoice < 0){
			System.out.println("Invalid. Choose 1 or 0.");

			System.out.println("\nWill you use your own or buy plates?" +
					"\n(1 for use your own plates, 0 for buy plates)");
			platesChoice = input.nextInt();
		}

		if (platesChoice == 0){
			plates = ((adults[0]) + (kids[0]));
		}
		else{
			plates = 0;
		}
	}
}