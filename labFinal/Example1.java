package labFinal;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class Example1 {

	final static int SIZE = 14;
	
	static String[] lastNames = new String[SIZE];
	static String[] firstNames = new String[SIZE];
	static String[] streetNums = new String[SIZE];
	static String[] streetNames = new String[SIZE];
	static String[] streetType = new String[SIZE];
	static String[] states = new String[SIZE];
	static String[] cities = new String[SIZE];
	static 	String[] zipcodes = new String[SIZE];
	static	int[] fts = new int[SIZE];
	static	int[] ins = new int[SIZE];
	static	int[] lbs = new int[SIZE];
	
	
	public static void main(String[] args) throws FileNotFoundException {
		
		
		
		populateData(firstNames, lastNames, streetNums, streetNames, streetType, cities, states, zipcodes, fts, ins, lbs);
		printBMISortByLastName();
		
//		System.out.println(firstNames.length);
//		System.out.println(lastNames.length);
//		
//		String[] sortedLastNames = Arrays.copyOf(lastNames, lastNames.length);
//		Arrays.sort(sortedLastNames);
//		
//	System.out.println(Arrays.toString(lastNames));
//	System.out.println(Arrays.toString(sortedLastNames));
	
//	for(int index = 0; index <SIZE; index++) {
//		int retIndx = findRecord(lastNames, firstNames, sortedLastNames[index]);
//		System.out.printf("%s %s%n%s %s %s%n%s %s %s%n%d %d %d%%n", 
//				firstNames[index],
//				sortedLastNames[retIndx],
//				streetNums[retIndx],
//				streetNames[retIndx],
//				streetType[retIndx],
//				states[retIndx],
//				cities[retIndx],
//				zipcodes[retIndx],
//				fts[retIndx],
//				ins[retIndx],
//				lbs[retIndx]
//				);
//		
//	}
	}
	public static void printBMISortByLastName() {
		String[] sortedLastNames = Arrays.copyOf(lastNames,  SIZE);
		
		System.out.printf("Last, First         ZIP Code BMI (lb/in^2)%n");
		System.out.printf("------------------- -------- -------------%n");
		for (int index = 0; index < SIZE; index++) {
			int oldIndx = findRecord(sortedLastNames, firstNames, sortedLastNames[index]);
			System.out.printf("%-19s, %-8s %-.1f%n ",
					sortedLastNames[index] + ", " +firstNames[oldIndx],
					zipcodes[oldIndx],
					(lbs[oldIndx]/Math.pow(fts[oldIndx]*12+ins[oldIndx], 2))*703);
		}
	}
	public static void printBMISorted () {
		double[] bmi = calculateBMI();
		double[] bmiSorted = Arrays.copyOf(bmi, SIZE);
		Arrays.sort(bmi);
		
		System.out.printf("Last, First         ZIP Code BMI (lb/in^2)%n");
		System.out.printf("------------------- -------- -------------%n");
		for (int index = 0; index < SIZE; index++) {
//			int oldIndx = findRecord(sortedLastNames, firstNames, sortedLastNames[index]);
			System.out.printf("%-19s, %-8s %-.1f%n ",
					lastNames[findBMIByIndex(bmi, bmiSorted[index])] + ", " +firstNames[index],
					zipcodes[findBMIByIndex(bmi, bmiSorted[index])],
					bmi[findBMIByIndex(bmi, bmiSorted[index])]);
		}
		
	}
	
	public static int findBMIByIndex(double[] bmi, double bmiToFind) {
		int retIndex = 0;
		for (int index = 0; index<SIZE; index++) {
			if (bmiToFind == bmi[index]) {
				retIndex = index;
			}
		}
		return retIndex;
	}
	
	public static double[] calculateBMI() {
		double[] bmi = new double[SIZE];
		
		for (int index = 0; index<SIZE; index++) {
			bmi [index] = (lbs[index]/Math.pow(fts[index]*12+ins[index], 2))*703;
		}
		
		
		return bmi;
	}
	public static int findRecord(String[] lastNames, String[] firstNames, String lastName) {
		int retIndex = -1;
		for (int index = 0; index < lastNames.length; index++) {
			if (lastName.equals(lastNames[index])) {
				retIndex=index;
			}
		}
		return retIndex;
		
	}
	
	public static void populateData(
			String[] firstNames, 
			String[] lastNames,
			String[] streetNums,
			String[] streetNames,
			String[] streetType,
			String[] states,
			String[] cities,
			String[] zipcodes,
			int[] fts,
			int[] ins,
			int[] lbs
			) throws FileNotFoundException {
		Scanner fileScanner = createScanner();
		for (int index = 0; fileScanner.hasNext(); index++){
			firstNames[index] = fileScanner.next();
			lastNames[index] = fileScanner.next();
			streetNums[index] = fileScanner.next();
			streetNames[index] = fileScanner.next();
			streetType[index] = fileScanner.next();
			states[index] = fileScanner.next();
			cities[index] = fileScanner.next();
			zipcodes[index] = fileScanner.next();
			fts[index] = fileScanner.nextInt();
			ins[index] = fileScanner.nextInt();
			lbs[index] = fileScanner.nextInt();
			fileScanner.next();
			
			
//			//15 fileScanner.next(); for skipping 15 word in the file
//			fileScanner.next();	
//			fileScanner.next();	
//			fileScanner.next();	
//			fileScanner.next();	
//			fileScanner.next();	
//			fileScanner.next();	
//			fileScanner.next();	
//			fileScanner.next();	
//			fileScanner.next();	
//			fileScanner.next();	
//			fileScanner.next();	
//			fileScanner.next();	
//			fileScanner.next();	
//			fileScanner.next();	
//			fileScanner.next();	
				}
				fileScanner.close();
	}
public static Scanner createScanner() throws FileNotFoundException{
	return new Scanner(new File("data"));
}
}
