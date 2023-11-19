package loop;

public class WaterWhile {

	int bucketCapacity = 10;
	int tankCapacity = 100;
	float currentTankLevel;
	float currentBucketLevel;

	/** Checks the tank capacity and add the water to the tank if it reaches the 
	 * limit then it will show the message*/
	void checktankFilling() {
		float temp = currentTankLevel + currentBucketLevel;
		if (temp <= tankCapacity) {
			currentTankLevel += currentBucketLevel;
			System.out.println("Current Tank level is " + currentTankLevel);
			if(tankCapacity == currentTankLevel) {
				System.out.println("Stop filling..Tank is Full");
			} else {
				System.out.println("Tank can hold " + (tankCapacity - currentTankLevel));	
			}
		} else {
			System.out.println("Tank will overflow..Only the Tank can hold " +
		    (tankCapacity - currentTankLevel)+ "  L.\n So you can Add "
            +(tankCapacity - currentTankLevel)+" L of water");
		}

	}

}
