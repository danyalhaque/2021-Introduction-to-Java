package lab6;

public class Example {

	public static int sum(int i1, int i2) {
		int sum = 0;
		i1 += 3;
		i2 += 4;
		for (int i = i1; i <= i2; i++)
			sum += i;
		System.out.printf("Sum(int, int) Sum between %d and %d is %d\n", i1, i2, sum);
		return sum;
	}



	public static void main(String[] args) {
		// sum(1, 10);
		int i1 = 1;
		int i2 = 10;
		int sum = sum(i1, i2); //in Java we pass by value, which is the address of data
		//System.out.printf("Sum returned %d\n", sum);
		System.out.printf("Sum returned %d\n", sum(i1, i2));
	}

}

//public static int sum(double i1, int i2) {
//	int sum = 0;
	//for (double i = i1; i <= i2; i++)
	//	sum += i;
	//System.out.printf("Sum(Double, Double) Sum between %f and %f is %f\n", i1, i2, sum);
//	return sum;

//}