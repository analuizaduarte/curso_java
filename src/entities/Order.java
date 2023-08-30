package entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import entities.enums.OrderStatus;

public class Order {

	private Date moment;
	private OrderStatus status;

	List<OrderItem> orderItem = new ArrayList<>();

	public Order() {

	}

	public Order(Date moment, OrderStatus status) {

		this.moment = moment;
		this.status = status;
	}

	public Date getMoment() {
		return moment;
	}

	public void setMoment(Date moment) {
		this.moment = moment;
	}

	public OrderStatus getStatus() {
		return status;
	}

	public void setStatus(OrderStatus status) {
		this.status = status;
	}

	public List<OrderItem> getOrderItem() {
		return orderItem;
	}

	public void addItem(OrderItem item) {
		orderItem.add(item);
	}

	public void removeItem(OrderItem item) {
		orderItem.remove(item);
	}

	public double total() {
		double sum = 0;
		for (OrderItem o : orderItem) {
			sum += o.subTotal();
		}
		return sum;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		for(OrderItem o :orderItem ) {
			sb.append(o.getProduct().getName()+", $"+
			o.getProduct().getPrice()+", Quantity: " +
			o.getQuantity()+", Subtotal: $"+
			o.subTotal()+"\n");
			
		}
		return sb.toString();
	}

	
}
