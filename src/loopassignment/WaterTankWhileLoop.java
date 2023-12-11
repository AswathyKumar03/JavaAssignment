package loopassignment;

import java.util.Scanner;

public class WaterTankWhileLoop {
	
	int bucketCapacity;
	int tankCapacity;
	float currentTankLevel;
	float currentBucketLevel;
	
	Scanner sc = new Scanner(System.in);
	/** Accepts the bucket level from user and add it to the current tank level
	    until the tank becomes full. Checks the tank capacity and add the water to the tank if it reaches the 
	    limit then it will show the message*/
	void tankFilling() {
		while (currentTankLevel < tankCapacity) {
			System.out.println("Enter the quantity of water in Litre");
			currentBucketLevel = sc.nextFloat();
			if (currentBucketLevel <=  bucketCapacity) {
				if ((currentTankLevel + currentBucketLevel) <= tankCapacity) {
					currentTankLevel += currentBucketLevel;
					System.out.println("Current Tank level is " + currentTankLevel +"L");
					if(tankCapacity == currentTankLevel) {
						System.out.println("Stop filling..Tank is Full");
					} else {
						System.out.println("Tank can hold " + (tankCapacity - currentTankLevel));	
					}
				} else {
					System.out.println("Tank will overflow..Now the Tank can only hold " +
				    (tankCapacity - currentTankLevel)+ "  L.\n So you can Add "
		            +(tankCapacity - currentTankLevel)+" L of water");
				}
			} else {
				System.out.println("Bucket can only hold 10L");
			}
		}
	}


}
