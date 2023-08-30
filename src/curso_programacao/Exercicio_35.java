package curso_programacao;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.ImportedProduct;
import entities.Product;
import entities.UsedProduct;

public class Exercicio_35 {

	public static void main(String[] args) throws ParseException {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		List<Product> prd = new ArrayList<>();
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		System.out.print("Enter the number of products: ");
		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) {
			System.out.printf("Product #%d data: \n", i);
			System.out.print("Commom, used, or imported (c/u/i)? ");
			char answer = sc.next().charAt(0);
			System.out.print("Name: ");
			String name = sc.next();
			System.out.println("Price: ");
			double price = sc.nextDouble();

			if (answer == 'c') {
				prd.add(new Product(name, price));
			}

			else if (answer == 'u') {
				System.out.println("Manufacture date (DD/MM/YYYY): ");
				Date mDate = sdf.parse(sc.next());
				prd.add(new UsedProduct(name, price, mDate));
			} else if (answer == 'i') {
				System.out.print("Customs fee: ");
				double customsFee = sc.nextDouble();
				prd.add(new ImportedProduct(name, price, customsFee));
			} else {
				System.out.println("Type c or i or u");
			}
		}

		System.out.println();
		System.out.println("PRICE TAGS: ");
		for (Product p : prd) {
			System.out.println(p.priceTag());
		}

		sc.close();

	}

}
