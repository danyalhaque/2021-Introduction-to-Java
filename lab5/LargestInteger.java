/**
 * Largest Integer program finds the largest integer and coutns its amount of occurences.
 * @author Danyal Haque
 * @version 1.0
 */

package lab5;

import java.util.Scanner;

public class LargestInteger {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int newNumber = 0;
		int largestNumber = 0;
		int occurance = 0;

		System.out.print("Enter numbers, the input ends if it is 0: ");

		for (;;) {

			newNumber = input.nextInt();

			if (newNumber > largestNumber) {
				occurance = 0;
				largestNumber = newNumber;
			}
			if (newNumber == largestNumber) {
				++occurance;
			} else if (newNumber < largestNumber) {
				;
			}
			if (newNumber == 0) {
				break;
			}
		}

		System.out.println("The largest number is " + largestNumber);
		System.out.println("The occurance count of the largest number is " + occurance);

	}
}