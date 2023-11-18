package loop;

import java.util.Scanner;

public class AmusementDoWhile {
	
	Scanner sc = new Scanner(System.in);
	
	// this method is checked the height of the user ,if  the height is between 90-200 then  .
	// permission granted and counts the number.Otherwise it will give the appropriate message 
	//to the user.
	void heightCheck() {
		int count = 0;
		do {
			System.out.println("Enter your Height in cm");
			float personHeight = sc.nextFloat();
			
			if(personHeight >= 90 && personHeight <= 200) {
				System.out.println("Permission Granted");
				count++;
			} else {
				System.out.println("No permission");
			}
		} while(count < 10);
		
		//once the method count is meet the limit print the appropriate message for the others.
		System.out.println("Ride Capacity is full, Wait for next Turn");
	}

}
