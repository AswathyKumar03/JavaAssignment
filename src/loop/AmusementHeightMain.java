package loop;

import java.util.Scanner;

public class AmusementHeightMain {

	public static void main(String[] args) {

		AmusementHeightCheck parkObject = new AmusementHeightCheck();
		Scanner sc = new Scanner(System.in);
		parkObject.minHeight = 90;
		parkObject.maxHeight = 200;
		parkObject.rideCapacity = 10;
		
		for (int i = 1; i <= parkObject.rideCapacity; i++) {
			System.out.println("Enter the Height in cm");
			parkObject.userHeight = sc.nextFloat();
			parkObject.checkHeight();
			if (!parkObject.isPermissionGranted) {
				parkObject.rideCapacity++;
			}

		}
		System.out.println("Ride is full..Now wait for your Turn ");
		sc.close();

	}
}
