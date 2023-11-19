package loop;

import java.util.Scanner;

public class LoginMain {

	public static void main(String[] args) {
		
		Login loginObject =  new Login();
		Scanner sc = new Scanner(System.in);
		//Accepts the Username and Password from the User and checks it using Login class.
		//if it is correct then it will exit the loop otherwise it will try three times.
		//if it reaches three times then it will lock the Account . 
		for (int i = 0; i < 3; i++) {
			System.out.println("Enter your UserID");
			loginObject.userName = sc.nextLine();
			System.out.println("Enter your Password");
			loginObject.userPassword= sc.nextLine();
			loginObject.validateLogin();
			if(loginObject.isLoggedIn) {
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
        sc.close();
	}

}
