package arrayAssignmentQuestions;

import java.util.Scanner;

public class MaximunNumberMain {

	public static void main(String[] args) {
		MaximumNumber maximumNumber = new MaximumNumber();
		Scanner sc = new Scanner( System.in);
		System.out.println("Enter the Array values");
		maximumNumber.populateArray();
		int result = maximumNumber.findMaximumNumber();
		System.out.println("Maximum number in the list is :" + result);
		

	}

}
