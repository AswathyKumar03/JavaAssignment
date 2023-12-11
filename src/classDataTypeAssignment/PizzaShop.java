package classDataTypeAssignment;

import java.util.Scanner;

public class PizzaShop {

	String pizzaSIze;
	int pizzaPrice;
	int pepperoniPrice;
	int cheesePrice;
	int finalPrice;

	public PizzaShop(String pizzaSIze, int pizzaPrice, int pepperoniPrice, int cheese) {
		// super();
		this.pizzaSIze = pizzaSIze;
		this.pizzaPrice = pizzaPrice;
		this.pepperoniPrice = pepperoniPrice;
		this.cheesePrice = cheese;
		this.finalPrice = pizzaPrice;
	}

	ArrayUtility arrayUtility = new ArrayUtility();

	boolean validatePizzaSize(String sizeChoice) {

		boolean isValideSize = false;
		if (pizzaSIze.equalsIgnoreCase(sizeChoice)) {

			isValideSize = true;
		}
		return isValideSize;
	}

	Scanner sc = new Scanner(System.in);
	
	int pepperoniChoice() {
		System.out.println("Do you need extra pepperoni(yes/no)");
		String pepperoniChoice = sc.next();
		int isPepperoniChoice = arrayUtility.checkYesOrNo(pepperoniChoice);
		if (isPepperoniChoice == 1) {
			return pepperoniPrice;
		} else if (isPepperoniChoice == -1) {
			System.out.println("Do you want to continue(yes/no)");
			String choice = sc .next();
			if("yes".equalsIgnoreCase(choice)) {
			pepperoniChoice();
			}else {
				return -1;
			}
		}return 0;

	}

	int cheeseChoice() {
		System.out.println("Do you need extra cheese(yes/no)");
		String cheeseChoice = sc.next();
		int ischeeseChoice = arrayUtility.checkYesOrNo(cheeseChoice);
		if (ischeeseChoice == 1) {
			return cheesePrice;
		} else if (ischeeseChoice == -1) {
			System.out.println("Do you want to continue(yes/no)");
			String choice = sc .next();
			if("yes".equalsIgnoreCase(choice)) {
			cheeseChoice();
			}else {
				return -1;
			}
		  
		}return 0;
	}

	int calculateFinalBill(int toppingPrice , int cheesePrice) {
		
		finalPrice = finalPrice + toppingPrice + cheesePrice;
		return finalPrice;
	}



	
	
}
