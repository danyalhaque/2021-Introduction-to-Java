/**
 * Number Analysis program calculates how many positive and negative numbers are in a sequence, and computes total and average.
 * @author Danyal Haque
 * @version 1.0
 */

package lab5;

import java.util.Scanner;

public class NumberAnalysis {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int numbers = 0;
		int negatives = 0;
		int positives = 0;
		int sum = 0;
		double index = 0;

		System.out.print("Enter integers, the input ends if it is 0: ");

		for (;; index++) {

			numbers = input.nextInt();

			if (numbers > 0) {
				positives++;
				sum = numbers + sum;
			} else if (numbers < 0) {
				negatives++;
				sum = numbers + sum;
			} else if (numbers == 0) {
				break;
			}
		}
		if (positives == 0 && negatives == 0) {
			System.out.print("No total or average was computed.");
		} else {
			System.out.println("The number of positives is " + positives);
			System.out.println("The number of negatives is " + negatives);
			System.out.println("The total is " + sum);
			System.out.println("The average is " + (sum / index));
		}

	}
}