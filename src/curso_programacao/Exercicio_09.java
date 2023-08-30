package curso_programacao;

import java.util.Locale;
import java.util.Scanner;

import entities.Produto;

public class Exercicio_09 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
			
		System.out.println("Enter product data ");
		System.out.print("Name: ");
		String name= sc.nextLine();
		System.out.print("Price: ");
		double price = sc.nextDouble();
	
		Produto produto= new Produto(name, price);
		
		produto.setName("Computer");
		System.out.println("Updated data: " + produto.getName());
		
		produto.setPrice(1200.00);
		System.out.println("Udpdated data: " +produto.getPrice());
		
		
		System.out.println();
		System.out.println("Produto data: " + produto); //Chamada implicita do toString() System.out.println(product.toString())
		System.out.println();
		

		System.out.print("Enter the number of products to be added in stock: ");
		int quantity = sc.nextInt();
		produto.AddProducts(quantity);
		
		System.out.println();
		System.out.println("Updated data: " + produto);
		System.out.println();
		
		System.out.print("Enter the number of products to be removed from stock: ");
		quantity = sc.nextInt();
		produto.RemoveProducts(quantity);
		System.out.println();
		System.out.println("Updated data: " + produto);
		sc.close();
	}

}
