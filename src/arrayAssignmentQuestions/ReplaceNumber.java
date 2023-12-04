package arrayAssignmentQuestions;

import java.util.Arrays;
import java.util.Scanner;

//Write a program to replace the numbers in an array with an String 
// e.g whenever a number is prime, replace that value by string “prime”.

public class ReplaceNumber {

	int[] number = new int[6];
	String[] replace = new String[6];
	Scanner sc = new Scanner(System.in);

	int[] populateArray() {
		System.out.println("Enter the numbers :");
		for (int i = 0; i < number.length; i++) {
			number[i] = sc.nextInt();
		}
		return number;
	}
	
	//this method replace the even number with the string "even".
	
	String[] replaceWithString() {
		for (int i = 0; i < number.length; i++) {
			if (number[i] % 2 == 0) {
				replace[i] = "even";
			} else {
				replace[i] = String.valueOf(number[i]);
			}
		}
		return replace;
	}



}
