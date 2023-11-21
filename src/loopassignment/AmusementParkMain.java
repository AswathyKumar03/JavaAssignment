package loopassignment;

public class AmusementParkMain {

	public static void main(String[] args) {

		AmusementParkHeightCheck parkObject = new AmusementParkHeightCheck();
		parkObject.rideCapacity = 10;
		parkObject.minHeight = 90;
		parkObject.maxHeight = 200;
		
		parkObject.heightCheck();
		

	}

}
