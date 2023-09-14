/**
 * Random Month program randomly generates a month from January to December.
 * @author Danyal Haque
 * @version 1.0
 */

package lab3;

public class RandomMonth {

	public static void main(String[] args) {

		int month = (int) Math.round((Math.random() * 12) + 1);

		switch (month) {
		case 1:
			System.out.println("The month of January (1)");
			break;
		case 2:
			System.out.println("The month of February (2)");
			break;
		case 3:
			System.out.println("The month of March (3)");
			break;
		case 4:
			System.out.println("The month of April (4)");
			break;
		case 5:
			System.out.println("The month of May (5)");
			break;
		case 6:
			System.out.println("The month of June (6)");
			break;
		case 7:
			System.out.println("The month of July (7)");
			break;
		case 8:
			System.out.println("The month of August (8)");
			break;
		case 9:
			System.out.println("The month of September (9)");
			break;
		case 10:
			System.out.println("The month of October (10)");
			break;
		case 11:
			System.out.println("The month of November (11)");
			break;
		case 12:
			System.out.println("The month of December (12)");
			break;

		}

	}
}
