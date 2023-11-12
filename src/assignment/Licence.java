package assignment;

public class Licence {

	int age;

	int currentStatus;

	void ageValidator() {

		if (age >= 16) {
			System.out.println("You are Eligible for Licence");
		} else {
			System.out.println("You are Ineligible for Licence");
		}
	}

	void licenceCheck() {
		if (currentStatus == 1) {
			System.out.println("G1 will be issued ");
		} else if (currentStatus == 2) {
			System.out.println("G2 will be issued");
		} else if (currentStatus == 3) {
			System.out.println("G will be issued");
		} else if (currentStatus == 4) {
			System.out.println("Your experience point will be increased each year");
		} else {
			System.out.println("Invalid Entry");
		}
	}

}
