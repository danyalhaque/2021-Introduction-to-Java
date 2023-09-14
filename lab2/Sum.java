/**
 * Sum Program computes the sum of digits to any number between 0 and 1000.
 * @author Danyal Haque
 * @version 1.0
 */

package lab2;

import java.util.Scanner;

public class Sum {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		
		System.out.print("Input an integer between 0 and 1000: ");
		int value = input.nextInt();

		int number = value;
		int digit1 = (value%10);
		int digit2 = (value/10%10);
		int digit3 = (value/100%10);
		System.out.println("Sum of " + number + " is " + (digit1 + digit2 + digit3));
	}

}
