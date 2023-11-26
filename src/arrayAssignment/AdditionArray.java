package arrayAssignment;

public class AdditionArray {
	
	int[] numbers = {-40, -5, 1, 3, 6, 7, 8, 20  };
	int pairSum ;
	int count  =1;
	void resultDisplay() {
		boolean ispairFound = false;
		for(int i = 0; i< numbers.length; i++) {
			for(int j = i+1;j<numbers.length;j++) {
				int result = numbers[i] + numbers[j];
				if(result == pairSum) {
					System.out.println("Pair " +  count++  +": " + numbers[i] +" and " + numbers[j]);
					ispairFound = true;
				}
			}
		}
		if(!ispairFound) {
			System.out.println("No Pairs found in this list");
		}
	}
	

}
