package arrayAssignmentQuestions;

public class PrimeOrNot {
	int number;
	//Write a program to find if the number is prime or not.
	
	boolean checkPrimeOrNot() {
		
		boolean isPrime =true;
		if(number==1) {
			return false;
		}
		for (int i = 2; i <= number/2; i++) {
			if (number % i == 0) {
				isPrime = false;
				break;

			}
		}
		return isPrime;

	}

}
