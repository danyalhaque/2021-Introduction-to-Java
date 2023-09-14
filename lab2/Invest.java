/**
 * Invest program calculates the final value of an investment.
 * @author Danyal Haque
 * @version 1.0
 */


package lab2;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Scanner;

public class Invest {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		double investment;
		double interest;
		double years;
		double monthlyInterest;
		double finalAnswer;

		NumberFormat df = NumberFormat.getCurrencyInstance();

		System.out.print("Enter investment amount: ");
		investment = input.nextDouble();
		System.out.print("Enter annual interest rate in percentage: ");
		interest = input.nextDouble();
		interest = interest / 100;
		System.out.print("Enter number of years: ");
		years = input.nextDouble();

		monthlyInterest = (interest / 12);
		years = (years * 12);
		finalAnswer = investment * Math.pow((1 + monthlyInterest), (years));

		System.out.println("Investment Principle: " + df.format(investment));
		System.out.println("Interest Earned: " + df.format(finalAnswer - investment));
		System.out.print("Principle and Interest: " + df.format(finalAnswer));

	}

}
