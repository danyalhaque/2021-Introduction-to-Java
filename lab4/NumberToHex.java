/**
 * Number To Hex program converts an integer from 0 to 15 to hex value.
 * @author Danyal Haque
 * @version 1.0
 */

package lab4;

import java.util.Scanner;

public class NumberToHex {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.print("Enter a decimal value (0 to 15): ");
		int hex = input.nextInt();

		System.out.printf("The hex value is %X", hex);

	}
}