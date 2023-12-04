package arrayAssignmentQuestions;

public class SmallestLargestMain {

	public static void main(String[] args) {
		SmallestAndLargest numberObject = new SmallestAndLargest();
		numberObject.populateArray();
		SmallLarge smallLarge = numberObject.findSmallestAndBiggest();
		//numberObject.findSmallestAndBiggest();
		System.out.println("Smallest number in the list is :" + smallLarge.smallNumber);
		System.out.println("Biggest  number in the list is :" + smallLarge.largeNumber);
	}

}

