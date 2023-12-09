package classDataTypeAssignment;

import java.util.Scanner;

public class Pizza {
	
	String pizzaSize;
	
	int pizzaPrize;
	
	int pepporoniPrize;
	
	int extraCheesePrize;
	
	
	
	public Pizza(String pizzaSize,int pizzaPrize, int pepporoniPrize, int extraCheesePrize) {
		this.pizzaSize = pizzaSize;
		this.pizzaPrize = pizzaPrize;
		this.pepporoniPrize = pepporoniPrize;
		this.extraCheesePrize = extraCheesePrize;
	}
	
	//This method check the user topping input and extra cheese input.
	//if the user input is valid then invoke the calculateBill method.
	
	int validateToppingAndCheese(String size) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Do you want additional pepperoni topping");
		String topping = sc.nextLine();
		if((topping.equalsIgnoreCase("yes"))||(topping.equalsIgnoreCase("no"))){
			System.out.println("Do you want extra Cheese");
			String cheese = sc .nextLine();
			sc.close();
			if((cheese.equalsIgnoreCase("yes"))||(cheese.equalsIgnoreCase("no"))) {
				int finalBill = calculateBill(topping, cheese);
				return finalBill;
			}else {
				System.out.println("Invalid Input");
			}
		}else {
			System.out.println("Invalid Input");
		}
		
		return -1;
	}
	
	
	
	// This method calculate the final bill of the ordered pizza on the 
	// basis of the user input.
	
	int calculateBill(String topping,String cheese) {
		
		int bill = pizzaPrize;
		if(topping.equalsIgnoreCase("yes")) {
			bill = bill + pepporoniPrize;
			
		}
		if(cheese.equalsIgnoreCase("yes")) {
			bill = bill + extraCheesePrize;
		}
		return bill;
		
		
	}

	
	
}










