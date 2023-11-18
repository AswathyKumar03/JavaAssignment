package loop;

import java.util.Scanner;

public class AmusementForLoopPark {
	Scanner sc = new Scanner(System.in);

	// this method is checked the height of the user ,if the height is between 90-200 then .
	// permission granted and counts the number.Otherwise it will give the
	// appropriate message to the user.
	
	void checkRiderCount() {
		int limit = 10;
		float userHeight;
		for (int i = 1; i <= limit; i++) {
			System.out.println("Enter your Height in cm");
			userHeight = sc.nextFloat();

			if (userHeight >= 90 && userHeight <= 200) {
				System.out.println("Permission Granted");
			} else {
				System.out.println("No Permission");
				limit++;
			}

		}

		System.out.println("Ride Capacity is  full..You have to wait for the next Turn");
	}

}
