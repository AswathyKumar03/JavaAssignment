package loopassignment;

import java.util.Scanner;

public class LoginLoop {
	String userId ;
	String password;
	String userName;
	String userPassword;
	int maxAttempt;
	Scanner sc = new Scanner (System.in);
	
	void loginCheck() {
		for(int i = 0;i<maxAttempt;i++) {
			System.out.println("Enter your UserId");
			userName = sc.nextLine();
			System.out.println("Enter your Password");
			userPassword = sc.nextLine();
			if (userName.equals(userId) && userPassword.equals(password)) {
				System.out.println("You are logged in to the Application");
				break;
			} else {
				System.err.println("Incorrect UserId or Password");
				if(i<2) {
					System.out.println("Try Again");
				}else {
					System.err.println("Account Locked");
				}
			}

		}
	}
}
