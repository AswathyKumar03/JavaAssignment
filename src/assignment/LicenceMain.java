package assignment;

import java.util.Scanner;

public class LicenceMain {

	public static void main(String[] args) {
		// object creation
		Licence licence = new Licence();
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the age");
		licence.age = sc.nextInt();
		licence.ageValidator();
		if (licence.age >= 16) {
			System.out.println("Choose the number corresponding to your current status"+ "\n1.Doesn't have a Licence"+" "
					+ "\n2.User has G1"+"\n3.User has G2"+"\n4.User has G");
			licence.currentStatus = sc.nextInt();
			
			licence.licenceCheck();	
		}
		sc.close();
	}

}
