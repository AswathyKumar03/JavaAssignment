package arrayAssignmentQuestions;
// Write a program to reverse array in place i.e reverse the

import java.util.Arrays;

// elements of an array without using any other array

import java.util.Scanner;

public class ReverseArray {
	int[] userArray = new int[6];
	Scanner sc = new Scanner(System.in);

	void populateArray() {
		System.out.println("Enter the Numbers ");
		for (int i = 0; i < userArray.length; i++) {
			userArray[i] = sc.nextInt();
		}
		System.out.println("Entered Numbers are :");
		System.out.println(Arrays.toString(userArray));
	}

	int[] reverse() {
		
		int j = userArray.length-1;
		for (int i = 0; i < userArray.length / 2; i++) {
			int temp = userArray[i];
			userArray[i] = userArray[j];
			userArray[j] = temp;
			j--;
		}
		return userArray;
	}
}
