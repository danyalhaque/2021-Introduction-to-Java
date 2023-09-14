package lab5;

import java.util.Scanner;

public class ETSTS {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		// create a menu
		int tries = 0;
		for (; tries < 5; tries++) {
			System.out.printf("### Program Menu ###%n%n  1)Print Data %n  2)Exit %n  Selection)");
			int userSelection = input.nextInt();

			switch (userSelection) {
			case 1:
				System.out.println("user picked " + userSelection);
				break;
			case 2:
				System.out.println("user picked " + userSelection);
				break;
			default:
				System.out.println("user picked - bad choice ");
			}
			if (userSelection == 1 || userSelection == 2) {
				break;
			}
		}
			if (tries == 5) {
				System.out.println("max tries " + 5 + " reached");
			}
		
		System.out.println("## Program ended ###");
	}

}
