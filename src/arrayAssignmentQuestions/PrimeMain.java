package arrayAssignmentQuestions;

import java.util.Scanner;

public class PrimeMain {

	public static void main(String[] args) {
		
		PrimeOrNot prime = new PrimeOrNot();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number");
		prime.number = sc.nextInt();
		int result = prime.checkPrimeOrNot();
		if (result == 1) {
			System.out.println(prime.number + " is not a Prime Number");
		} else {
			System.out.println(prime.number + " is a Prime Number");

		}

	}

}
