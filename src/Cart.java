
class Cart {
	Product[] products = new Product[10];

	void putProduct(Product product) {
		for (int i = 0; i < products.length; i++) {
			if (products[i] == null) {
				products[i] = product;
				break;
			}
		}
	}
	void takeProduct(Product product){
		for (int i = products.length-1; i>=0; i--){
			if (product==products[i]){
				products[i]=null;
				break;
			}
		}
	}

	void getCart() {
		boolean checkCart = true;
		for (Product product : products) {
			if (product != null) {
				System.out.println(product.getProduct());
				checkCart = false;
			}
		}
		if (checkCart)
			System.out.println("Your cart is empty");
	}

}
