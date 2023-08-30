package curso_programacao;

import java.util.Locale;
import java.util.Scanner;

import entities.DadosBancarios;

public class Exercicio_15 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		DadosBancarios dadosBancarios;
		
		System.out.print("Enter account number: ");
		int account = sc.nextInt();
		System.out.print("Enter account holder: ");
		sc.nextLine();
		String name = sc.nextLine();
		System.out.println();
		
		System.out.print("Is there an initial deposit? (y/n) ");
		char option = sc.next().charAt(0);
		if (option == 'y') {
			System.out.print("Enter initial deposit value: ");
			double iniDeposit = sc.nextDouble();
			dadosBancarios = new DadosBancarios(name, account, iniDeposit);
			System.out.println();
		}
		else {
			dadosBancarios = new DadosBancarios(name, account);
		}
		
		System.out.printf("Account data: %n" + dadosBancarios);
		System.out.println();
		System.out.print("Enter a deposit value: ");
		double deposito = sc.nextDouble();
		dadosBancarios.deposito(deposito);
		System.out.printf("Updated account data: %n" + dadosBancarios );
		System.out.println();
		System.out.print("Enter a withdraw value: ");
		double saque = sc.nextDouble();
		dadosBancarios.saque(saque);
		System.out.printf("Updated account data: %n" + dadosBancarios );
		
		sc.close();

	}

}
