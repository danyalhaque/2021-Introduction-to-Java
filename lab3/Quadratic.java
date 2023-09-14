/**
 * Quadratic program calculates the roots of a quadratic equation.
 * @author Danyal Haque
 * @version 1.0
 */

package lab3;

import java.util.Scanner;

public class Quadratic {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		double a;
		double b;
		double c;
		double discriminant;

		System.out.print("Enter a, b, c: ");
		a = input.nextDouble();
		b = input.nextDouble();
		c = input.nextDouble();

		discriminant = (Math.sqrt(Math.pow(b, 2) - 4 * a * c));
		// System.out.println((-b - Math.sqrt(Math.pow(b, 2) - 4 * a * c)) / 2);
		// System.out.println((-b + Math.sqrt(Math.pow(b, 2) - 4 * a * c)) / 2);

		if (discriminant > 0) {
			System.out.printf("The equation has two roots %f and %f", (-b + discriminant) / 2, (-b - discriminant) / 2);
		} else if (discriminant == 0) {
			System.out.printf("The equation has one root %f", (-b + discriminant) / 2);
		} else {
			System.out.print("The equation has no real roots");

		}

	}

}
