package assignment;

public class DiscountCoupon {
	
	float productPrice;
	
	int  promoCode;
	
	
	
	
	void discountCalculator() {
		
		float discountedValue;
		float finalPrice;
		
		if(promoCode==1) {
			discountedValue = (productPrice * 0.5f) * 1.05f;
			finalPrice = productPrice-discountedValue;
			System.out.println("Discount value is:- "+ finalPrice);
		}
		else if (promoCode==2) {
			discountedValue = (productPrice * 0.5f) * 1.1f;
			finalPrice = productPrice-discountedValue;
			System.out.println("Discount value is:- "+ finalPrice);
		}
		else if(promoCode==3) {
			discountedValue = (productPrice * 0.5f) * 1.2f;
			finalPrice = productPrice-discountedValue;
			System.out.println("Discount value is:- "+ finalPrice);
		}
		else if(promoCode==4) {
			discountedValue = (productPrice*50)/100;
			finalPrice = productPrice- discountedValue;
			System.out.println("Discount value is:- "+ finalPrice);
		}
		else {
			System.out.println("Invalid Entry");
		}
	}
	
	

}
