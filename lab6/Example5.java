package lab6;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Example5 {

	public static int printMainMenu() {
		System.out.println("### My Program (Main Menu) ###");
		System.out.println("1) file input");
		System.out.println("2) console input.");
		System.out.print("       Selection: ");
		Scanner userInput = new Scanner(System.in);
		int selection = userInput.nextInt();
		//userInput.close();
		return selection;
	}

	public static int sum(int x, int y) {
		return x + y;
	}

	public static void main(String[] args) throws IOException {
		int selection = printMainMenu();

		if (selection == 1) {
			File userInputFile = new File("newlocation\\userinput");
			Scanner fileScanner = new Scanner(userInputFile);
			int firstValue = fileScanner.nextInt();
			int secondValue = fileScanner.nextInt();

			// System.out.println("File used: " + userInputFile.getAbsolutePath()); //Full
			// Path Display
			System.out.println("File used: " + userInputFile.getPath());

			System.out.printf("sum of %d and %d is %d\n", firstValue, secondValue, sum(firstValue, secondValue));
			fileScanner.close(); // use this or else you will hit the upper limit of files opened

			// System.out.println(userInputFile.length()); //DETERMINES SIZE OF FILE

		} else {
			Scanner userInput = new Scanner(System.in);
			System.out.print("Enter value1: ");
			int x = userInput.nextInt();
			
			System.out.print("Enter value2: ");
			int y = userInput.nextInt();

			userInput.close();
			System.out.printf("sum of %d and %d is %d\n", x, y, sum(x, y));

		}
	}

}
