/**
 * Three By Four program returns the sum of all numbers in each column of a 3 by 4 matrix.
 * @author Danyal Haque
 * @version 1.0
 */

package lab7;

import java.util.Scanner;

public class ThreeByFourDemo {

	public static double sumColumn(double[][] m, int columnIndex) {
		double columnsum = 0;
		for(int j = 0 ;j<3 ; j++) {
		
		columnsum = columnsum +	m[j][columnIndex];	
			}
		
		
		return columnsum;
		
		
	}
	
	public static void main(String[] args) {
	
		Scanner input = new Scanner(System.in);
		



		
		double[][] m = new double[3][4];
		System.out.print("Enter a 3-by-4 matric row by row: ");
		
		for(int i = 0 ;i<3 ; i++) {
			
			for(int j = 0;j<4; j++){
				m[i][j] = input.nextDouble();
//				System.out.println(m[i][j]);
				
			}
			
		
		}
	
		for(int i = 0 ;i<4 ; i++) {
		System.out.printf("Sum of the elements at column %d is %.1f%n", i, sumColumn(m, i));
		
		}
		}
	

}
