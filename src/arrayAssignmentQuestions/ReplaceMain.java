package arrayAssignmentQuestions;

import java.util.Arrays;

public class ReplaceMain {

	public static void main(String[] args) {
		ReplaceNumber replaceNumber = new ReplaceNumber();
		int[] result= replaceNumber.populateArray();
		System.out.println("Entered numbers are :" + Arrays.toString(result));
		System.out.println("Replaced Array is :");
		String[] replace = replaceNumber.replaceWithString();
		System.out.println(Arrays.toString(replace));
	}

}
