/**
 * Number To Ascii program coverts an integer from 0 to 127 to an ASCII character.
 * @author Danyal Haque
 * @version 1.0
 */

package lab4;

import java.util.Scanner;

public class NumberToAscii {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.print("Enter an ASCII code: ");
		int ascii = input.nextInt();

		System.out.printf("The character for AscII code %d is %c", ascii, ascii);

		
	}
}