package arrayAssignment;

import java.util.Scanner;

public class MobileBrands {

	String[][] mobileBrand = { 
			{ "Samsung", "S20", "S21", "Flip3", "Fold3" },
		    { "Google", "Google Pixel 6", "Google Pixel 6 Pro", "Google PixelPro", "Google Pixel 5" },
			{ "Apple", "IPhone 12", "IPhone SE", "Iphone 15", "Iphone13" } };
	
	int indexOfBrand = -1;
	boolean isFoundBrand = false;

	Scanner sc = new Scanner(System.in);

	// *this method is to check the user enter the brand name is available in the
	// list or not.
	// if the user enter the brand name in the list ,then list the products in that
	// brand.
	// if the user enter a wrong brand then gives the appropriate error message.
	void displayProducts() {
		String searchBrand;
		System.out.print("Please Enter the Brand name that you  want to search : ");
		searchBrand = sc.nextLine();
		for (int i = 0; i < mobileBrand.length; i++) {
			if (mobileBrand[i][0].equalsIgnoreCase(searchBrand)) {
				System.out.println(mobileBrand[i][0] + "Products are : ");
				for (int j = 1; j < mobileBrand[i].length; j++) {
					System.out.println(mobileBrand[i][j]);
				}
				indexOfBrand = i;
				isFoundBrand = true;
				break;
			}

		}
		if (!isFoundBrand) {
			System.out.println("\nThat Brand is not Available\n");
			System.out.print("Do you want to continue(Y/N)?");
			String choice = sc.nextLine();
			if ("Y".equalsIgnoreCase(choice)) {
				System.out.println("\nAvailable brands are Samsung ,Google ,Apple.Select a brand from this list.");
				displayProducts();
			}else {
				System.out.println("\nThank you for choosing our shopping app..\n");
			}
		}

	}

	/**
	 * This method ask the product name and if that product is available in the list
	 * then prints the selected item otherwise gives the error message
	 */
	void productSelection() {
		boolean isFoundProduct = false;
		System.out.println("Enter the Product name you want :");
		String searchProduct = sc.nextLine();
		for (int i = 1; i < mobileBrand[indexOfBrand].length; i++) {
			if (mobileBrand[indexOfBrand][i].equalsIgnoreCase(searchProduct)) {
				System.out.println("Selected Product is : " + mobileBrand[indexOfBrand][i]);
				System.out.println("\nThank you for choosing our Shopping App");
				isFoundProduct = true;
				break;
			}
		}
		if (!isFoundProduct) {
			System.out.println("Please select a product from the List");
			System.out.print("\nDo you want to continue(Y/N)");
			String choice = sc.nextLine();
			if ("Y".equalsIgnoreCase(choice)) {
				productSelection();
			} else {
				System.out.println("\nThanks for using our Shopping app.");
			}
		}
	}

}
