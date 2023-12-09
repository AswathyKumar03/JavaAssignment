package classDataTypeAssignment;

import java.util.Scanner;

public class PizzaMain {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		Pizza[] pizzaType = new Pizza[3];

		Pizza smallPizza = new Pizza("Small", 15, 2, 1);
		pizzaType[0] = smallPizza;

		Pizza mediumPizza = new Pizza("Medium", 20, 3, 1);
		pizzaType[1] = mediumPizza;

		Pizza largePizza = new Pizza("Large", 25, 3, 1);
		pizzaType[2] = largePizza;
		
		System.out.println("Welcome to Pizza Pizza\n");
		
		System.out.println("What size you want  (Small/Medium/Large)");

		String size = sc.nextLine();

		boolean isSizeFound = false;
		
		for(int i =0 ; i<pizzaType.length; i++) {
			if(pizzaType[i].pizzaSize.equalsIgnoreCase(size)) {
				isSizeFound = true;
				int finalBill = pizzaType[i].validateToppingAndCheese(size);
				if(finalBill != -1) {
					System.out.println("\nYour final bill is : $" + finalBill);
					System.out.println("\nEnjoy your Pizza..");
				}else {
					System.out.println("Something went wrong..Try Again");
				}
			}
		}
		if(!isSizeFound) {
			System.out.println("Sorry .. That Size is not Available");
		}
		
		sc.close();
	}

}
