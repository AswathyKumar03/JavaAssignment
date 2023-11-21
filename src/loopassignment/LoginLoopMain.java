package loopassignment;

public class LoginLoopMain {

	public static void main(String[] args) {

		LoginLoop  loopObject = new LoginLoop();
		loopObject.userId = "pivotAdmin";
		loopObject.password = "Admin123";
		loopObject.maxAttempt = 3;
		
		loopObject.loginCheck();

	}

}
