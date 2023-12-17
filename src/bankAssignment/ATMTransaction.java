package bankAssignment;

public class ATMTransaction extends Transaction {

	Bank bank = new Bank();
	
	//validate the user entered account no. and pin with the list in the bank class if it is true 
	// then set the customer account object.
	public boolean validateDetails(String accountNo, int pin) {
		CustomerAccount account = bank.getAccount(accountNo);
		if (account != null) {
			if (pin == account.getPin()) {
				setAccount(account);
				return true;
			}

		}
		return false;
	}
}
