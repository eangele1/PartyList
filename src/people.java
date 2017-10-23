import java.util.Scanner;

public class people extends partyList {

	public static void run(){
		Scanner input = new Scanner (System.in);

		//Asks user for amount of guests attending.
		System.out.print("\nHow many kids and how many adults?");

		System.out.print("\nKids: ");
		kids[0] = input.nextInt();

		System.out.print("\nAdults: ");
		adults[0] = input.nextInt();
	}
}