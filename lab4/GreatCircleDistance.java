/**
 * Great Circle Distance program calculates the great circle distance between two points on Earth.
 * @author Danyal Haque
 * @version 1.0
 */

package lab4;

import java.util.Scanner;

public class GreatCircleDistance {

	public static void main(String[] args) {

		double x1, x2;
		double y1, y2;
		final double EARTH_RADIUS = 6371.01; // KM

		Scanner input = new Scanner(System.in);

		System.out.print("Enter point 1 (latitude and longitude) in degrees: ");
		x1 = Math.toRadians(input.nextDouble());
		y1 = Math.toRadians(input.nextDouble());

		System.out.print("Enter point 2 (latitude and longitude) in degrees: ");
		x2 = Math.toRadians(input.nextDouble());
		y2 = Math.toRadians(input.nextDouble());

		double answer = Math.acos(Math.sin(x1) * Math.sin(x2)
				+ Math.cos(x1) * Math.cos(x2) * Math.cos(y1 - y2));
		
		
		answer = EARTH_RADIUS * answer;
		
		
	//	double answer = (((EARTH_RADIUS) * ((Math.acos(Math.sin(x1))) * (Math.sin(x2))
	//			+ (Math.cos(x1)) * (Math.cos(x2)) * (Math.cos(y1 - y2)))));
		
		System.out.printf("The distance between the two points is: %d km", Math.round(answer));

	}

}
