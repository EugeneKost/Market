
class Product {
	private String name;
	private double price;
	
	Product(String name, double price){
		this.name = name;
		this.price = price;
		
	}
	public String getProduct(){
		return "name: "+name+"; price: "+price;
	}

}
