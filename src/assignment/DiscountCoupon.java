package assignment;

public class DiscountCoupon {
	
	int productPrice;
	
	int  promoCode;
	
	int discountedValue;
	
	void discountCalculator() {
		if(promoCode==1) {
			discountedValue = (productPrice*55)/100;
			System.out.println("Discount value is:- "+ discountedValue);
		}
		else if (promoCode==2) {
			discountedValue = (productPrice*60)/100;
			System.out.println("Discount value is:- "+ discountedValue);
		}
		else if(promoCode==3) {
			discountedValue = (productPrice*70)/100;
			System.out.println("Discount value is:- "+ discountedValue);
		}
		else if(promoCode==4) {
			discountedValue = (productPrice*50)/100;
			System.out.println("Discount value is:- "+ discountedValue);
		}
		else {
			System.out.println("Invalid Entry");
		}
	}
	
	

}
