package loop;

import java.util.Scanner;

public class WaterTank {
	Scanner sc = new Scanner(System.in);
	
	//This method fills the water tank and make sure that the water tank does'nt over flow.
	void checkwaterTankFilling() {
		int bucketCapacity = 10;
		int tankCapacity = 100;
		int currentTankWaterLevel = 0;
		for (int i = 10; i <= tankCapacity; i += bucketCapacity) {
			currentTankWaterLevel += 10;
			System.out.println("Bucket number " + (i / 10) + ": Now " + currentTankWaterLevel + 
					" Litre of water.");
			if (currentTankWaterLevel == tankCapacity) {
				System.out.println("Stop Filling ..Tank is Full");
			}
		}
	}
}
