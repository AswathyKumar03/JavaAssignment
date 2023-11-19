package loop;

import java.util.Scanner;

public class WaterTankWhileMain {

	public static void main(String[] args) {
		WaterWhile waterObject = new WaterWhile();
		Scanner sc = new Scanner(System.in);
		// Accepts the bucket level from user and calls a method to add it to the tank level
		// until the tank becomes full.
		while (waterObject.currentTankLevel < waterObject.tankCapacity) {
			System.out.println("Enter the quantity of water in Litre");
			waterObject.currentBucketLevel = sc.nextFloat();
			if (waterObject.currentBucketLevel <= waterObject.bucketCapacity) {
				waterObject.checktankFilling();
			} else {
				System.out.println("Bucket can only hold 10L");
			}
		}
		sc.close();
	}

}
