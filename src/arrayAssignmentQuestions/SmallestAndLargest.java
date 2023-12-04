package arrayAssignmentQuestions;

import java.util.Arrays;
import java.util.Scanner;

public class SmallestAndLargest {

	int[] numbers = new int[5];
	Scanner sc = new Scanner(System.in);
    
	//Write a program to find smallest and largest number in an array
	
	void populateArray() {
		System.out.println("Enter the Array numbers");
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = sc.nextInt();

		}
		System.out.println("Entered numbers are :");
		System.out.println(Arrays.toString(numbers));
		//findSmallestAndBiggest();
	}

	SmallLarge findSmallestAndBiggest() {
		
		SmallLarge findNumber = new SmallLarge();
		for (int i = 0; i < numbers.length - 1; i++) {
			for (int j = i + 1; j < numbers.length; j++) {
				if (numbers[i] > numbers[j]) {
					int temp = numbers[i];
					numbers[i] = numbers[j];
					numbers[j] = temp;
				}

			}
		}
		findNumber.smallNumber = numbers[0];
		findNumber.largeNumber = numbers[numbers.length-1];
		return findNumber;
	}

}
