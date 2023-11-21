package loop;

public class AmusementHeightCheck {
	float userHeight;
	int minHeight;
	int maxHeight;
	int rideCapacity;
	boolean isPermissionGranted;
	
	
	void checkHeight() {
		if(userHeight >=minHeight && userHeight <=maxHeight) {
			System.out.println("Permission Granted");
			isPermissionGranted=true;
			
		}else {
			System.out.println("No permission");
			isPermissionGranted=false;
		}
		
	}


}
