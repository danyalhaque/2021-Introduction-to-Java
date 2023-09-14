/**
 * Smallest Value program finds the smallest value out of ten numbers.
 * @author Danyal Haque
 * @version 1.0
 */

package lab7;

import java.util.Scanner;

public class SmallestValue {

	public static double min(double[] array) {
		double min = array[0];

		for (int index = 0; index < array.length; index++) {
			double next = array[index];
			
		if (next < min) {
			min = next;
		}
		}

		return min;

	}

	public static void main(String[] args) {
		double[] array = new double[10];

		System.out.print("Enter ten numbers: ");
		Scanner input = new Scanner(System.in);
		String	line = input.nextLine();
		
		String[] numbers = line.split(" ");
		for (int index = 0; index < numbers.length; index++) {
			array[index] = Double.valueOf(numbers[index]);
		}
	System.out.printf("The minimum number is: %.1f", min(array));	;

	}

}
