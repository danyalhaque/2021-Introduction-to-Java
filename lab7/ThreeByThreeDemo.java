package lab7;

import java.util.Arrays;

public class ThreeByThreeDemo {

	public static void main(String[] args) {
		int[][] myList = new int[6][11];
		
		for (int i =0; i<myList.length; i++ ) {
			System.out.print("[");
			for (int j = 0;j<myList[i].length;j++) {
				if (j != myList[i].length-1) {
					System.out.print(myList[i][j]+", ");

					
				}
			}
		}	
			//will print out entire array
			//System.out.println(Arrays.toString(myList[i]));
		
			//print out entire array without Arrays class
		//	for (int i =0; i<myList.length; i++ )
		//	for (int j = 0;j<myList[i].length;j++)
		System.out.printf("length is %d%n", myList.length);

		
	}

}
