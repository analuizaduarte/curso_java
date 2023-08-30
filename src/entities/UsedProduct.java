package entities;

import java.text.SimpleDateFormat;
import java.util.Date;

public class UsedProduct extends Product {

	private Date manudactureDate;

	public UsedProduct() {

	}

	public UsedProduct(String name, double price, Date manudactureDate) {
		super(name, price);
		this.manudactureDate = manudactureDate;
	}

	public Date getManudactureDate() {
		return manudactureDate;
	}

	public void setManudactureDate(Date manudactureDate) {
		this.manudactureDate = manudactureDate;
	}

	public String priceTag() {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		return  name + " (used) $ " + 
				String.format("%.2f", price) + 
				" (Manufacture date: "+sdf.format(manudactureDate)+")";
	}
}
