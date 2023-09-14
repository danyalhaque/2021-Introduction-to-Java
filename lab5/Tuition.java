/**
 * Tuition program calculates tuition to 10 years.
 * @author Danyal Haque
 * @version 1.0
 */

package lab5;

import java.util.Scanner;

public class Tuition {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int initialTuition;

		System.out.print("Enter initial tuition: ");
		initialTuition = input.nextInt();

		System.out.printf("Year #|Tuition%n--------------%n");

		for (int index = 1; index <= 10; index++) {
			initialTuition = (int) (initialTuition * 1.05);
			System.out.printf("%-6d|$%d %n", index, initialTuition);

		}

	}
}
