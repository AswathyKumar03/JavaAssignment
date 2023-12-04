package arrayAssignmentQuestions;

//) Write a simple Java program which will print Fibonacci series,
//e.g. 1 1 2 3 5 8 13 ... . up to a given number

public class FibonacciSeries {
	
	int limit;
    
	String developFibonacci() {
		int number1 = 0;
		int number2 = 1;
		int nextNumber =0;
		String series = "0  1";
		//System.out.print("Fibonacci Series is : 0  1"  );
		while(nextNumber <= limit) {
			nextNumber = number1 + number2;
			if(nextNumber > limit) {
				break;
			}
			number1 = number2;
			number2 = nextNumber;
			series = series + "  " +nextNumber;
		}
		return series;
		
	}
}
