
class Customer {
	Cart cart;

	public void putProduct(Product product) {
		this.cart.putProduct(product);

	}

	public void takeCart(Cart cart) {
		this.cart = cart;
	}

	public void takeProduct(Product product) {
		this.cart.takeProduct(product);
	}

	public void getReceipt(Cart cart) {
		this.cart = cart;
		this.cart.getCart();
	}

}
