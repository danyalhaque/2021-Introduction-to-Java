package lab6;

import java.util.Scanner;

public class Palindrome2 {

	public static int reverse(int userinput) {
		int sum = 0;
		if (userinput < 10) {
			sum = userinput;
		}
		if (userinput > 10 && userinput < 100) {

			int first = (userinput / 10 % 10);
			int second = (userinput % 10);

			sum = second * 10 + first;
		}

		if (userinput > 99) {

			int first = (userinput / 100 % 10);
			int second = (userinput / 10 % 10);
			int third = (userinput % 10);

			sum = third * 100 + second * 10 + first;

		}
		return sum;
	}

	public static boolean isPalindrome(int userinput) {

		return userinput == reverse(userinput);

	}

	public static void main(String[] args) {
		int sum = 0;

		Scanner input = new Scanner(System.in);

		System.out.print("Enter number (0 to 1000): ");
		int userinput = input.nextInt();

		boolean result = isPalindrome(userinput);

		if (result == true) {
			System.out.printf("%d is a palindrome", userinput);
		} else if (result == false) {
			System.out.printf("%d is not a palindrome", userinput);
		}

	}
}
