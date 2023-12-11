package arrayAssignmentQuestions;

import java.util.Arrays;
import java.util.Scanner;

public class AscendingArray {

	int[] numbers = new int[5];
	
	Scanner sc = new Scanner(System.in);
	
	// Write a program to sort an array of number.

	void populateArray() {
		System.out.println("Enter the Array numbers");
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = sc.nextInt();

		}
		System.out.println("Entered numbers are :");
		System.out.println(Arrays.toString(numbers));
	}

	int[] sortArray() {
		for (int i = 0; i < numbers.length - 1; i++) {
			for (int j = i + 1; j < numbers.length; j++) {
				if (numbers[i] > numbers[j]) {				//  12  34  98  78  10
					int temp = numbers[i];
					numbers[i] = numbers[j];
					numbers[j] = temp;
				}

			}
		}
		return numbers;
	}
}