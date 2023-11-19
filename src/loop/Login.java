package loop;

public class Login {

	String userId = "pivotAdmin" ;
	String password = "Admin123";
	String userName;
	String userPassword;
	boolean isLoggedIn = false;

	void validateLogin() {
			if (userName.equals(userId) && userPassword.equals(password)) {
				isLoggedIn = true;
			} else {
				isLoggedIn = false;
			}

	}
}
