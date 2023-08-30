package entities;

public class Produtoo {
	
	private String name;
	private double price;
	
	public Produtoo() {
		
	}

	public Produtoo(String name, double price) {
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

}
