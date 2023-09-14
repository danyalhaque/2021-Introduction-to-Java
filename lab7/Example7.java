package lab7;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Example7 {

	public static void main(String[] args) throws FileNotFoundException {
		
		int[][] points = new int[100][2];
		Scanner fileScanner = new Scanner(new File("data"));
		
		for(int i = 0; i<points.length; i++) {
			for (int j =0; j<points[i].length; j++ ) {
				points[i][j] = fileScanner.nextInt();
				
			}
		}
		
		for(int[] b: points) {
			System.out.printf("point (%d, %d)%n", b[0],b[1]);
		}
		
		fileScanner.close();
	}
}
