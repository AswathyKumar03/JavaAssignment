package arrayAssignmentQuestions;

import java.util.Scanner;

public class FibonacciMain {

	public static void main(String[] args) {
		FibonacciSeries fibonacci = new FibonacciSeries();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the limit of the Fibonacci Series");
		fibonacci.limit = sc.nextInt() ;
		
		System.out.print(fibonacci.developFibonacci());

	}

}
