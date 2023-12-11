package loopassignment;

import java.util.Scanner;

public class AmusementParkHeightCheck {
	
	float userHeight;
	int minHeight;
	int maxHeight;
	int rideCapacity;
	
	/** this method is checked the height of the user ,if  the height is between 90-200 then  .
		permission granted .Otherwise it will give the appropriate message 
		to the user and increase the ridecapacity by 1.*/
	
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
