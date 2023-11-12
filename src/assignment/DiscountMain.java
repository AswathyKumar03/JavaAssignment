package assignment;

import java.util.Scanner;

public class DiscountMain {

	public static void main(String[] args) {
		DiscountCoupon discount = new DiscountCoupon();
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Enter the Price of the product");
		
		discount.productPrice = sc.nextInt();
		
		System.out.println("Select the PromoCode which you have"+"\n1. Promo5"+
		"\n2.Promo10"+"\n3.Promo20"+"\n4.No PromoCode");
		
		discount.promoCode = sc.nextInt();
		
		discount.discountCalculator();
		
	}

}
