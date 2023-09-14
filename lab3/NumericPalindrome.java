/**
 * Numeric Palindrome program determines if a sequence of 3 digits is a palindrome.
 * @author Danyal Haque
 * @version 1.0
 */

package lab3;

import java.util.Scanner;

public class NumericPalindrome {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.print("Enter a three-digit integer: ");
		int userinput = input.nextInt();

		if (userinput < 10) {
			System.out.printf("%d is a palindrome", userinput);
		}
		if (userinput > 10 && userinput < 100) {
			
			int first = (userinput / 10 % 10);
			int second = (userinput % 10);

			int sum = second * 10 + first;
			if (userinput == sum) {
				System.out.printf("%d is a palindrome", userinput);
			} else {
				System.out.printf("%d is not a palindrome", userinput);
			}
		}

		if (userinput > 99) {

			int first = (userinput / 100 % 10);
			int second = (userinput / 10 % 10);
			int third = (userinput % 10);

			int sum = third * 100 + second * 10 + first;

			if (userinput == sum) {
				System.out.printf("%d is a palindrome", userinput);
			} else {
				System.out.printf("%d is not a palindrome", userinput);
			}
		}

	}
}
