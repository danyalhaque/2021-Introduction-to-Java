/**
 * Triangle Area program calculates the area of a triangle when given cartesian point coordinates.
 * @author Danyal Haque
 * @version 1.0
 */


package lab2;

import java.text.DecimalFormat;
import java.util.Scanner;

public class TriangleArea {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int ax, ay;
		int bx, by;
		int cx, cy;

		System.out.print("Enter three points for a triangle: ");
		ax = input.nextInt();
		ay = input.nextInt();

		bx = input.nextInt();
		by = input.nextInt();

		cx = input.nextInt();
		cy = input.nextInt();

		DecimalFormat df = new DecimalFormat("##,##0.00");
		
		double sideA = Math.sqrt(Math.pow(bx - cx, 2) + Math.pow(by - cy, 2));
		double sideB = Math.sqrt(Math.pow(ax - cx, 2) + Math.pow(ay - cy, 2));
		double sideC = Math.sqrt(Math.pow(ax - bx, 2) + Math.pow(ay - by, 2));
		double perimeter = (sideA+sideB+sideC);
		double sp = (perimeter/2);
		double area = Math.sqrt((sp)*(sp - sideA)*(sp - sideB)*(sp - sideC));
		
		System.out.println ("The area of the triangle is " + (df.format(area)));

		
				
	}

}
