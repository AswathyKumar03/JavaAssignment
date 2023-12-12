package pizzaAssignment;

import java.util.Scanner;

public class Pizza {

	int pizzaPrice;
	int pepperoniPrice;
	int cheese;
	String pizzaSize = "";
	int finalPrice;
	boolean isValidInput = true;

	public Pizza(String pizzaSize) {
		this.pizzaSize = pizzaSize;
		addPizzPrice();
	}

	Scanner sc = new Scanner(System.in);
	
	//This method check the user input with the Pizza size
	//then assign the values to the variables on the basis of size.
	void addPizzPrice() {
		if ("small".equalsIgnoreCase(pizzaSize)) {
			pizzaPrice = 15;
			pepperoniPrice = 2;
		} else if ("medium".equalsIgnoreCase(pizzaSize)) {
			pizzaPrice = 20;
			pepperoniPrice = 3;
		} else if ("large".equalsIgnoreCase(pizzaSize)) {
			pizzaPrice = 25;
			pepperoniPrice = 3;
		} else {
			System.out.println("Invalid Input");
			isValidInput = false;
		}
	}
	//return the validate result of pizza size with the Available size
	boolean validateSize() {
		return isValidInput;
	}
	
	//validate the userinput of topping and adding the price pepperoni to the pizza price
	//on the basis of user input
	
	int validatePepperoni() {
		while (isValidInput) {
			System.out.println("Do you need additional pepperoni(yes/no)");
			String userChoice = sc.next();
			if ("yes".equalsIgnoreCase(userChoice)) {
				finalPrice = pizzaPrice + pepperoniPrice;
				return pepperoniPrice;
				} else if ("no".equalsIgnoreCase(userChoice)) {
				finalPrice = pizzaPrice;
				break;
			} else {
				System.out.println("Invalid input");
				isValidInput = false;
			}
		}return 0;
	}
	
	//validate the userinput of extra cheese and adding price on the basis of input
	int validateCheese() {
		while (isValidInput) {
			System.out.println("Do you need extra cheese(yes/no)");
			String userChoice = sc.next();
			if ("yes".equalsIgnoreCase(userChoice)) {
				finalPrice = pizzaPrice + pepperoniPrice + 1;
				return 1;
			} else if ("no".equalsIgnoreCase(userChoice)) {
				break;
			} else {
				System.out.println("Invalid input");
			}
		}return 0;
	}
	//calculate the final bill and return that final price to the main class
	
	int calculateFinalBill() {
		System.out.println("Pizza price  :" + pizzaPrice);
		return finalPrice;
	}
}
