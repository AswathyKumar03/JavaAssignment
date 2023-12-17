package bankAssignment;

public class Bank {

	CustomerAccount[] customer = new CustomerAccount[3];

	public Bank() {
		populateAccounts();
	}
	
	public void populateAccounts() {

		CustomerAccount manu = new CustomerAccount("123456", "Manu", 1234, "manu123", 1000.0);
		customer[0] = manu;
		CustomerAccount sanu = new CustomerAccount("123457", "Sanu", 1235, "sanu123", 1500.0);
		customer[1] = sanu;
		CustomerAccount rinu = new CustomerAccount("123458", "Rinu", 1236, "rinu123", 2000.0);
		customer[2] = rinu;
	}
	
	//check the Acc.no with the Argument. if it is true then return object.else return null. 
	public CustomerAccount getAccount(String AccNo) {
		for (int i = 0; i < customer.length; i++) {
			if (AccNo.equals(customer[i].getAccountNumber())) {
				return customer[i];
			}

			
		}
		return null;

	}
}
