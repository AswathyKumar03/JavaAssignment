package loopassignment;

import java.util.Scanner;

public class AmusementParkHeightCheck {
	
	float userHeight;
	int minHeight;
	int maxHeight;
	int rideCapacity;
	
	void heightCheck() {
		for(int i = 1;i<=rideCapacity; i++) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the Height");
			userHeight = sc.nextFloat();
			if(userHeight >= minHeight && userHeight <= maxHeight) {
				System.out.println("Permission Granted");
			}else {
				System.out.println("No Permission");
				rideCapacity++;
			}
		}
		System.out.println("Ride Capacity is full..Wait for your turn");
	}

}
