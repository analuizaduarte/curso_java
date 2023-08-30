package curso_programacao;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entities.Client;
import entities.Order;
import entities.OrderItem;
import entities.Produtoo;
import entities.enums.OrderStatus;

public class Exercicio_32 {

	public static void main(String[] args) throws ParseException {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

		System.out.println("Enter client data:");
		System.out.print("Name: ");
		String name = sc.nextLine();
		System.out.print("Email: ");
		String email = sc.next();
		System.out.print("Birth Date (DD/MM/AAAA): ");
		Date birthDate = sdf.parse(sc.next());
		Client client = new Client(name, email, birthDate);

		System.out.println("Enter order data: ");
		System.out.print("Status: ");
		String status = sc.next();
		System.out.print("How many items to this order? ");
		int n = sc.nextInt();
		Date moment = new Date();
		Order order = new Order(moment, OrderStatus.valueOf(status));
		for (int i = 1; i <= n; i++) {
			System.out.printf("Enter #%d item data \n", i);
			System.out.print("Produtoo name: ");
			String productName = sc.next();
			System.out.print("Produtoo price: ");
			double productPrice = sc.nextDouble();
			System.out.print("Quantity: ");
			int quantity = sc.nextInt();
			OrderItem orderItem = new OrderItem(quantity, new Produtoo(productName, productPrice));
			order.addItem(orderItem);
			orderItem.subTotal();
		}
		System.out.println();
		System.out.println("ORDER SUMARY:");
		System.out.println("Order moment: "+sdf1.format(moment));
		System.out.println("Order Status: "+OrderStatus.valueOf(status));
		System.out.println("Client: "+client);
		System.out.println("Order Items: ");
		System.out.println(order);
		System.out.println("Total price: $"+order.total());
		
		sc.close();
	}

}
