package loop;

public class Login {

	String userId = "pivotAdmin" ;
	String password = "Admin123";
	String userName;
	String userPassword;
	boolean isLoggedIn = false;
	
	/** This method compares the userID  and password with User provided Username and password
	 * and assigns the result to the boolean variable*/
	void validateLogin() {
			if (userName.equals(userId) && userPassword.equals(password)) {
				isLoggedIn = true;
			} else {
				isLoggedIn = false;
			}

	}
}
