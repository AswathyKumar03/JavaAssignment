package arrayAssignmentQuestions;

import java.util.Arrays;
import java.util.Scanner;

public class DescendingOrder {

	int[] numbers = new int[5];

	Scanner sc = new Scanner(System.in);

	void populateArray() {
		System.out.println("Enter the Numbers you want to sort");
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = sc.nextInt();

		}
	}
	//Write a program to print the numbers in an array in descending order
	
	int[] descendingArray() {
		System.out.println("\nEntered Nmbers are :");
		System.out.println(Arrays.toString(numbers));

		for (int i = 0; i < numbers.length - 1; i++) {
			for (int j = i + 1; j < numbers.length; j++) {
				if (numbers[i] < numbers[j]) {
					int temp = numbers[i];
					numbers[i] = numbers[j];
					numbers[j] = temp;
				}
			}

		}return numbers;
		
	}

}
