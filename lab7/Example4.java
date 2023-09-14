package lab7;

public class Example4 {

	public static void main(String[] args) {
		int[] intArray = new int[3];
		intArray[0] = 5;
		intArray[1] = 6;
		intArray[2] = 8;
		int[] intArray2 = new int[intArray.length];
		System.arraycopy(intArray, 0, intArray2, 0, intArray.length);
		
		System.out.println(intArray2[2]);
	}
}
