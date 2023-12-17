package bankAssignment;

import java.util.Scanner;

public class BankMain {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Select the Transaction type: \nPress 1 for ATM \nPress 2 for online");
		int transactionType = sc.nextInt();
		double newBalance;
		String result;
		if (transactionType == 1) {
			ATMTransaction atm = new ATMTransaction();
			System.out.println("\nEnter your Account Number");
			String accNo = sc.next();
			System.out.println("\nEnter Your Pin");
			int pin = sc.nextInt();

			boolean validation = atm.validateDetails(accNo, pin);
			if (validation) {
				System.out.println("\nSelect Transaction\n1 for WithdrawCash\n2 for Deposit\n3 for AccountBalance");
				int transactionOperation = sc.nextInt();
				switch (transactionOperation) {
					case 1:
						System.out.println("Enter the Amount to Withdraw");
						double withdrawAmount = sc.nextDouble();
						newBalance = atm.withdrawCash(withdrawAmount);
						result = (newBalance != -1) ? "Transaction completed \nYour Account Balance is : " + newBalance : "Insufficient Balance";
						System.out.println(result);
						break;
					case 2:
						System.out.println("Enter the Amount to Deposit");
						double depositAmount = sc.nextDouble();
						newBalance = atm.depositCash(depositAmount);
						result = (newBalance != -1) ? "Transaction completed \nYour Account Balance is : " + newBalance : "Invalid Input";
						System.out.println(result);
						break;
					case 3:
						newBalance = atm.accountBalance();
						System.out.println("Your Current Balance is : " + newBalance);
						break;
					default:
						System.out.println("Transaction Failed");
				}
			} else {
				System.out.println("Incorrect AccountNumber or Pin ");
			}

		} else if (transactionType == 2) {
			OnlineTransaction online = new OnlineTransaction();
			System.out.println("Enter your Account Number");
			String accNo = sc.next();
			System.out.println("Enter your password");
			String passsword = sc.next();

			boolean validation = online.validateDetails(accNo, passsword);
			if (validation) {
				System.out.println("Select Transaction\n1 for WithdrawCash\n2 for Deposit\n3 for AccountBalance");
				int transactionOperation = sc.nextInt();
				switch (transactionOperation) {

				case 1:
					System.out.println("Enter the Amount to Withdraw");
					double withdrawAmount = sc.nextDouble();
					newBalance = online.withdrawCash(withdrawAmount);
					result = (newBalance != -1) ? "Transaction completed \nYour Account Balance is : " + newBalance : "Insufficient Balance";
					System.out.println(result);
					break;
				case 2:
					System.out.println("Enter the Amount to Deposit");
					double depositAmount = sc.nextDouble();
					newBalance = online.depositCash(depositAmount);
					result = (newBalance != -1) ? "Transaction completed \nYour Account Balance is : " + newBalance : "Invalid Input";
					System.out.println(result);
					break;
				case 3:
					newBalance = online.accountBalance();
					System.out.println("Your Current Balance is : " + newBalance);
					break;
				default:
					System.out.println("Transaction Failed");
				}
			} else {
				System.out.println("Incorrect AccountNumber or Password ");

			}
		} else {
			System.out.println("Transaction Failed");
		}sc.close();

	}

}
