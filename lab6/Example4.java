package lab6;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Example4 {

	public static void printTable() {
			System.out.println("called printTable...");
	}
	
	public static void main(String[] args) throws IOException {
		File userInputFile = new File("userInput");
		Scanner fileScanner = new Scanner(userInputFile);
		int firstValue = fileScanner.nextInt();
		int secondValue = fileScanner.nextInt();
		
		System.out.printf("first=%d, second=%d", firstValue, secondValue);
		fileScanner.close(); //use this or else you will hit the upper limit of files opened
		
		//System.out.println(userInputFile.length()); //DETERMINES SIZE OF FILE
	}

}
