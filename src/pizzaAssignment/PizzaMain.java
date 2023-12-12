package pizzaAssignment;

import java.util.Scanner;

public class PizzaMain {

	public static void main(String[] args) {

		Pizza pizza;
		Scanner sc = new Scanner(System.in);
		boolean isValidSize = false;
		System.out.println("Welcome to Pizza Pizza");

		do {
			System.out.println("What size you want");
			String size = sc.next();
			pizza = new Pizza(size);
			isValidSize = pizza.validateSize();
			if (isValidSize) {
				int toppingPrice = pizza.validatePepperoni();
				int cheesePrice = pizza.validateCheese();
				if (toppingPrice != 0) {
					System.out.println("Topping price :" + toppingPrice);
				}
				
				if (cheesePrice != 0) {
					System.out.println("Cheese Price  :" + cheesePrice);
				}
				int finalBill = pizza.calculateFinalBill();
				System.out.println("Your final Bill is : $" + finalBill);
				System.out.println("Enjoy your pizza");
			}

		} while (!isValidSize);

	}

}
