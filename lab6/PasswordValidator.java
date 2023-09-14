/**
 * Password Validator program checks a program for whether of not it has at least 8 characters, 2 digits, and consists of only letters and digits.
 * @author Danyal Haque
 * @version 1.0
 */


package lab6;

import java.util.Scanner;

public class PasswordValidator {

	public static boolean length(String userinput) {
		return userinput.length() >= 8;
	}

	public static boolean digits(String userinput) {
		int digits = 0;
		for (int index = 0; index < userinput.length(); index++) {
			char digit = userinput.charAt(index);

			if (Character.isDigit(digit)) {

				digits++;

			}
		}
		return digits >= 2;
	}

	public static boolean letterOrDigit(String userinput) {
		int nA = 0;
		for (int index = 0; index < userinput.length(); index++) {
			char digit = userinput.charAt(index);

			if (Character.isLetterOrDigit(digit) == false) {

				nA++;
			}
		}
		return nA == 0;
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter your password: ");
		String userinput = input.nextLine();

		boolean length = length(userinput);
		if (length == true) {
			boolean digits = digits(userinput);
			if (digits == true) {
				boolean nA = letterOrDigit(userinput);
				if (nA == true) {
					System.out.printf("'%s' is a valid password!", userinput);
				} else if (nA == false) {
					System.err.println("A can consist of only letters and digits!");
				}
			} else if (digits == false) {
				System.err.println("A password must have at two digits!");
			}
		} else if (length == false) {
			System.err.println("A password must have at least eight characters!");
		}

	



	}

}
