package arrayAssignmentQuestions;

import java.util.Arrays;
import java.util.Scanner;

public class DuplicateNumber {

	int[] numbers = new int[5];
	String duplicateNumbers = "";

	Scanner sc = new Scanner(System.in);

	void populateArray() {
		System.out.println("Enter the Array");
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = sc.nextInt();

		}
		System.out.println("Your entered values are :  " + Arrays.toString(numbers));

	}

	void checkDuplicateNumber() {
		int k = 0;
		System.out.println("Duplicate Numbers :");
		for (int i = 0; i < numbers.length - 1; i++) {
			for (int j = i + 1; j < numbers.length; j++) {
				if (numbers[i] == numbers[j]) {

					System.out.println(numbers[i]);
					break;
				}
			}
		}
	}

}
