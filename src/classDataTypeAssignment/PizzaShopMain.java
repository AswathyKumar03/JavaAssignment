package classDataTypeAssignment;

import java.util.Scanner;

public class PizzaShopMain {

	public static void main(String[] args) {

		PizzaShop[] pizza = new PizzaShop[3];

		PizzaShop small = new PizzaShop("Small", 15, 2, 1);
		pizza[0] = small;

		PizzaShop medium = new PizzaShop("Medium", 20, 3, 1);
		pizza[1] = medium;

		PizzaShop large = new PizzaShop("Large", 25, 3, 1);
		pizza[2] = large;
		Scanner sc = new Scanner(System.in);

		System.out.println("Welcome to Pizza Pizza");

		boolean isValidSize = false;
		do {
			System.out.println("\nWhat size you want (Small /Medium/Large)\n");
			String size = sc.next();
			for (int i = 0; i < pizza.length; i++) {
				isValidSize = pizza[i].validatePizzaSize(size);
				if (isValidSize) {
					int toppingPrice = pizza[i].pepperoniChoice();
					if (toppingPrice == -1) {
						System.out.println("Have a nice day");
						return;
					}

					int cheesePrice = pizza[i].cheeseChoice();
					if (cheesePrice == -1) {
						System.out.println("have a nice day");
						return;
					}

					int finalBill = pizza[i].calculateFinalBill(toppingPrice, cheesePrice);
					System.out.println("\nYour order is confirmed\n");
					System.out.println("your final bill is : $" + finalBill);
					return;
				}

			}
			if (!isValidSize) {
				System.out.println("it's a invalid entry");

			}

		} while (!isValidSize);

		
		sc.close();
	}

}
