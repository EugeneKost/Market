
class MarketMain {

	public static void main(String[] args) {
		Product product1 = new Product("Bread", 8.99);
		Product product2 = new Product("Milk", 19.99); 
		Product product3 = new Product("Sour cream", 24.99);
		Product product4 = new Product("Cheese", 199.99); 
		Product product5 = new Product("Sunflower oil", 37.49);
		Product product6 = new Product("Meat", 119.99); 
		Product product7 = new Product("Fish", 99.49);
		Product product8 = new Product("Sugar", 19.49); 
		Product product9 = new Product("Salt", 4.49);
		Product product10 = new Product("Coffee", 749.99); 
		Cart cart = new Cart();
		Customer customer = new Customer();
		customer.takeCart(cart);
		customer.putProduct(product1);
		customer.putProduct(product2);
		customer.putProduct(product3);
		customer.putProduct(product4);
		customer.putProduct(product5);
		customer.putProduct(product6);
		customer.putProduct(product7);
		customer.putProduct(product8);
		customer.putProduct(product9);
		customer.putProduct(product10);
		System.out.println("Customer has filled the cart");
		customer.getReceipt(cart);
		System.out.println("\nCustomer has canceled even positions from the receipt");
		customer.takeProduct(product2);
		customer.takeProduct(product4);
		customer.takeProduct(product6);
		customer.takeProduct(product8);
		customer.takeProduct(product10);
		customer.getReceipt(cart);
		
	}

}
