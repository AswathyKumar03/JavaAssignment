package arrayAssignmentQuestions;

public class PrimeOrNot {
	int number;
	//Write a program to find if the number is prime or not.
	
	int checkPrimeOrNot() {
		int flag = 0;

		for (int i = 2; i <= number/2; i++) {
			if (number % i == 0) {
				flag = 1;
				break;

			}
		}
		return flag;

	}

}
