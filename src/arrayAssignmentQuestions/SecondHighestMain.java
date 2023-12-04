package arrayAssignmentQuestions;

public class SecondHighestMain {

	public static void main(String[] args) {
		SecondHighestNumber secondHighestNumber = new SecondHighestNumber();
		secondHighestNumber.populateArray();
		int result = secondHighestNumber.descendingArray();
		System.out.println("Second Highest Number in this list is :" + result);
	}

}
