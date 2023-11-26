package arrayAssignment;

public class BrandMain {

	public static void main(String[] args) {
		MobileBrands brands = new MobileBrands();
		brands.displayProducts();
		if(brands.isFoundBrand) {
			brands.productSelection();
		}
	}

}
