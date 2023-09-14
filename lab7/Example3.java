package lab7;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Random;
import java.util.Scanner;

public class Example3 {

	public static void main(String[] args) throws FileNotFoundException {
		int selection = askUserMain();
		String runData;
		
		switch (selection) {
		case 1:
			generateRandomDataSet();
			runData = askUserToRunData();
			if (runData.equals("n")) {
				break;	
			}
			
		case 2:

			File dataFile = new File("randomInts");
			if (dataFile.exists()) {
				System.out.println("File: " + dataFile.getName() + " found.");
				System.out.println("File: " + dataFile.getAbsolutePath() + " found.");
				System.out.println("File size is: " + dataFile.length());
			}

			int ARRAY_SIZE = arraySize(dataFile);
			int[] myIntList = new int[ARRAY_SIZE];
			loadDataFile(dataFile, myIntList);

			System.out.println("number of elements: " + myIntList.length);
			System.out.println("sum is: " + sum(myIntList));
			break;
		case 3:
			System.out.println("Program ended.");
			System.exit(0);
			break;
		}

		// Generates randomInts file with 100 random ints
		// generateRandomDataSet();

		

		// always close file
	}

	public static int askUserMain() {
		System.out.println("1) generate new random data.");
		System.out.println("2) use existing random data.");
		System.out.println("3) exit.");
		System.out.print("    Selection: ");
		Scanner userInput = new Scanner(System.in);
		int selection = userInput.nextInt();
		return selection;
	}
	public static String askUserToRunData() {
		System.out.print("Run with new data file. (y/n)");
		Scanner userInput = new Scanner(System.in);
		String selection = userInput.next();
		return selection;
	}

	public static int sum(int[] myIntList) {
		int sum = 0;
		for (int index = 0; index < myIntList.length; index++) {
			sum += myIntList[index];
		}
		return sum;
	}

	public static void loadDataFile(File dataFile, int[] myIntList) throws FileNotFoundException {
		Scanner fileScanner = new Scanner(dataFile);

		for (int index = 0; fileScanner.hasNext(); index++) {
			myIntList[index] = fileScanner.nextInt();
		}
		fileScanner.close();
	}

	public static int arraySize(File dataFile) throws FileNotFoundException {
		int size = 0;
		Scanner fileScanner = new Scanner(dataFile);
		while (fileScanner.hasNext()) {
			size++;
			fileScanner.next();
		}
		fileScanner.close();
		return size;
	}

	public static void generateRandomDataSet() throws FileNotFoundException {
		File dataFile = new File("randomInts");
		if (dataFile.exists()) {
			dataFile.delete();
		}
		PrintWriter pw = new PrintWriter(dataFile);

		Random rand = new Random();

		;
		for (int i = 0; i < 100; i++) {
			pw.println(rand.nextInt(100));
		}
		pw.close();
	}
}
