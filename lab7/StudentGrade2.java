/**
 * Student Grade program determines the best grade, and grades along a scale based on the best.
 * @author Danyal Haque
 * @version 1.0
 */

package lab7;

import java.util.Scanner;

public class StudentGrade2 {

	public static int[] gradeAssign(int[] grades, int high) {
		char[] letterGrades = { 'A', 'B', 'C', 'D', 'F' };
		

		for (int i = 0; i < grades.length; i++) {
			
			if (grades[i] >= high - 10) {
				System.out.printf("Student %d score is %d and grade is %c %n",i, grades[i], letterGrades[0]);

			}

			else if (grades[i] >= high - 20) {
				System.out.printf("Student %d score is %d and grade is %c %n",i, grades[i], letterGrades[1]);

			}
			else if (grades[i] >= high - 30) {
				System.out.printf("Student %d score is %d and grade is %c %n",i, grades[i], letterGrades[2]);

			}
			else if (grades[i] >= high - 40) {
				System.out.printf("Student %d score is %d and grade is %c %n",i, grades[i], letterGrades[3]);

			}
			else {
				System.out.printf("Student %d score is %d and grade is %c %n",i, grades[i], letterGrades[4]);

			}

		}
		return grades;

	}

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int high = 0;
		int next = 0;

		System.out.print("Enter the number of students: ");
		int userinput = input.nextInt();
		int[] grades = new int[userinput];

		System.out.printf("Enter %d scores: ", grades.length);
		for (int i = 0; i < grades.length; i++) {
			next = input.nextInt();
			grades[i] = next;
			if (next >= high) {
				high = next;
			}

		}

		gradeAssign(grades, high);

		// if (grade >= best - 10) {

		// }
	}

}
