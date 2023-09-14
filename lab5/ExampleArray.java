package lab5;

public class ExampleArray {

	public static void main(String[] args) {

		int x = 1;
		int sum = 0;
		 int[] xy = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 0 };

		for (int index = 0; index < xy.length; index++) {
			System.out.printf("xy[%d] = %d%n", index, xy[index]);
			 sum += xy[index];
		}
		System.out.println("sum of all values is: " + sum);
	}
	
	
	
}
