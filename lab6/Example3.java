package lab6;

public class Example3 {

	public static void swap(int val1, int val2) {
		System.out.println("Inside swap method...");
		System.out.printf("swap 7: swap(%d, %d)->val1=%d, val2=%d\n", val1, val2, val1, val2);
		int ret = val1;
		val1 = val2;
		val2 = ret;
		System.out.printf("swap 11: swap(%d, %d)->val1=%d, val2=%d\n", val1, val2, val1, val2);
		System.out.println("Inside swap method... ended");
			}

	public static void main(String[] args) {
		System.out.println("Inside main method...");
		int val1 = 1;
		int val2 = 10;
		System.out.printf("swap before: swap(%d, %d)\n", val1, val2);
		swap(val1, val2);
		System.out.printf("swap after: swap(%d, %d)->val1=%d, val2=%d\n", val1, val2, val1, val2);
		System.out.println("Inside main method... ended");
	}

}
