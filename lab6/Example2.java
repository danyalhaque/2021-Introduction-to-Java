package lab6;

public class Example2 {

	public static int swap(int val1, int val2) {
		int ret = val1;
		System.out.printf("ret %d, val1 %d\n", ret, val1);
		val1 = 100;
		System.out.printf("ret %d, val1 %d\n", ret, val1);
		return 0;
	}

	public static void main(String[] args) {
		swap(1, 10);
	}

}
