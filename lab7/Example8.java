package lab7;

import java.util.Arrays;

public class Example8 {

	public static void main(String[] args) {
		int[] values = {2, 5, 9, 1, 66, 25, 87};
		String[] values1 = {"Tom", "Ray", "Mike", "John"};
		
		System.out.println(Arrays.toString(values));
		
		Arrays.sort(values);
		
		System.out.println(Arrays.toString(values));
	
		System.out.println(Arrays.toString(values1));
		Arrays.sort(values1);
		System.out.println(Arrays.toString(values1));
	}

}
