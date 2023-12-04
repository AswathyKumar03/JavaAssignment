package arrayAssignmentQuestions;

import java.util.Arrays;

public class ReverseArrayMain {

	public static void main(String[] args) {
		ReverseArray reverseArray = new ReverseArray();
		reverseArray.populateArray();
		System.out.println("Reverse Array is :");
		int[] result = reverseArray.reverse();
		System.out.println(Arrays.toString(result));

	}

}
