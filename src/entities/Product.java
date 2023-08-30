package entities;

public class Product {
	protected String name;
	protected double price;
	
	public Product() {
		
	}

	public Product(String name, double price) {
		
		this.name = name;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public String priceTag() {
		return name+" $ "+String.format("%.2f", price);
	}
	
}
