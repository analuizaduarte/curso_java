package curso_programacao;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Company;
import entities.Individual;
import entities.TaxPayer;

public class Exercicio_37 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the number of tax payers: ");
		int n = sc.nextInt();
		List<TaxPayer> taxPayer = new ArrayList<>();
		for (int i = 1; i <= n; i++) {
			System.out.printf("Tax payer #%d data: \n", i);
			System.out.print("Individual or company (i/c)? ");
			char type = sc.next().charAt(0);
			System.out.print("Name: ");
			String name = sc.next();
			System.out.print("Anual income: ");
			double anualIncome = sc.nextDouble();

			if (type == 'i') {
				System.out.print("Health expenditures: ");
				double hExpenditures = sc.nextDouble();
				taxPayer.add(new Individual(name, anualIncome, hExpenditures));
			} else {
				System.out.print("Number of employees: ");
				int nEmployees = sc.nextInt();
				taxPayer.add(new Company(name, anualIncome, nEmployees));
			}
		}

		System.out.println("TAXES PAID: ");

		for (TaxPayer tp : taxPayer) {
			System.out.printf(tp.getName() + ": $ " + String.format("%.2f", tp.tax())+"%n");
		}

		
		double sum = 0;
		for (TaxPayer tp : taxPayer) {
			sum += tp.tax();
		}
		System.out.printf("TOTAL TAXES: %.2f", sum);
		sc.close();
	}

}
