package arrayAssignmentQuestions;

import java.util.Scanner;

public class MaximumNumber {
	
	int [] maxNumber = new int[5];
	Scanner sc = new Scanner(System.in);
	
	void populateArray() {
		for(int i =0; i<maxNumber.length; i++) {
			maxNumber[i] = sc.nextInt();
		}
	}
	
	int findMaximumNumber() {
		int largeNumber;  
		for(int i =0; i<maxNumber.length-1; i++) {
			for(int j = i+1; j<maxNumber.length; j++) {
				if(maxNumber[i] < maxNumber[j]) {
					int temp = maxNumber[i];
					maxNumber[i] = maxNumber[j] ;
					maxNumber[j] = maxNumber[i];
				}
			}
		}
		
		largeNumber = maxNumber[0];
		return largeNumber;
	}

}
