package arrayAssignmentQuestions;

import java.util.Arrays;

public class AscendingArrayMain {

	public static void main(String[] args) {
		AscendingArray sortObject = new AscendingArray();
		sortObject.populateArray();
		System.out.println("Ascending order of the Array is : " );
		System.out.println(Arrays.toString(sortObject.sortArray()));
	}

}
