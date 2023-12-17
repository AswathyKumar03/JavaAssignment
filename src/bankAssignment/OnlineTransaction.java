
package bankAssignment;

public class OnlineTransaction extends Transaction {

	Bank bank = new Bank();
	
	
	//validate the user entered account no. and password with the list in the bank class if it is true 
	// then set the customer account object.
	public boolean validateDetails(String accountNo, String password) {
		CustomerAccount account = bank.getAccount(accountNo);
		if (account != null) {
			if (account.getUserPassword().equals(password)) {
				setAccount(account);
				return true;
			}

		}
		return false;
	}
}
