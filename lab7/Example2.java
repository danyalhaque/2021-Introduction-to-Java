package lab7;

public class Example2 {

	public static void main(String[] args) {

		// declaring and initializing array
		// default for new double is 0.0
		// new creates memory in heap, hex code ([D@15db9742)
		double[] myList = new double[3];

		// array value assignment (write)
		myList[0] = 4.5;
		myList[1] = 5.0;
		myList[2] = 6.5;

		// System.out.println(myList[0]);
		// System.out.println(myList[1]);
		// System.out.println(myList[2]);
		// System.out.println(myList[3]);
		// System.out.println(myList);

		double sum = 0.0;
		for (int index = 0; index < myList.length; index++) {
			sum +=myList[index];
			System.out.printf("%d. %.2f%n",index+ 1, myList[index]);
		}
		System.out.printf("length is %d%n", myList.length);
		System.out.printf("sum is %.2f%n", sum);
		System.out.printf("avg is %.2f", sum/myList.length);
	}

}
