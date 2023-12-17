package bankAssignment;

public class CustomerAccount {
	
	private String accountNumber;
	private String userName;
	private int pin;
	private String userPassword;
	private double balance;
	
	
	
	
	public CustomerAccount(String accountNumber, String userName, int pin, String userPassword, double balance	) {
		//super();
		this.accountNumber = accountNumber;
		this.userName = userName;
		this.pin = pin;
		this.userPassword = userPassword;
		this.balance = balance;
		
	}
	
	
	
	public String getAccountNumber() {
		return accountNumber;
	}
	public String getUserName() {
		return userName;
	}
	public int getPin() {
		return pin;
	}
	public void setPin(int pin) {
		this.pin = pin;
	}
	public String getUserPassword() {
		return userPassword;
	}
	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	
	

}
