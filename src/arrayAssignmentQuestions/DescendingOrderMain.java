package arrayAssignmentQuestions;

import java.util.Arrays;

//import java.util.Scanner;

public class DescendingOrderMain {

	public static void main(String[] args) {
		DescendingOrder descendingOrder = new DescendingOrder();
		descendingOrder.populateArray(); 
		int[] result = descendingOrder.descendingArray();
		System.out.println("\nDescending Order is :");
		System.out.println(Arrays.toString(result));

	}

}
