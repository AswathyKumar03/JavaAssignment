package bankAssignment;

public class Transaction {
	
	CustomerAccount account = null;
	//get withdraw amount from the user and if the user has suffifient balance in his account then show the newbalance
	public double withdrawCash(double withdrawAmount) {
		if(account.getBalance() >= withdrawAmount) {
		 double newBalance = account.getBalance() - withdrawAmount;
		 account.setBalance(newBalance);
		 return account.getBalance();
		}return -1;
	}
	//get  the deposit amount from the user which is greater than 0 then add that amount to the balance and shoe mew balance.
	public double depositCash( double depositAmount) {
		if(depositAmount > 0) {
			double newBalance = account.getBalance() + depositAmount ;
			 account.setBalance(newBalance);
			return account.getBalance();
		}return -1;
		
	}
	//Show thw Account balance
	public double accountBalance() {
		return account.getBalance();	
	}
	//setter for Account variable
	public void setAccount(CustomerAccount account) {
		this.account = account;
	}

}
