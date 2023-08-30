package entities;

public class OrderItem {

	private int quantity;
	
	private Produtoo produtoo;
	
	public OrderItem() {
		
	}

	public OrderItem(int quantity, Produtoo produtoo) {
		super();
		this.quantity = quantity;
		this.produtoo = produtoo;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public Produtoo getProduct() {
		return produtoo;
	}

	public void setProduct(Produtoo produtoo) {
		this.produtoo = produtoo;
	}
	
	public double subTotal() {
		return quantity * produtoo.getPrice();
	}

}