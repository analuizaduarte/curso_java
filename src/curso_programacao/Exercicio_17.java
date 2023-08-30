package curso_programacao;

import java.util.Locale;
import java.util.Scanner;

import entities.Produto;

public class Exercicio_17 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		Produto[] vect = new Produto[n];
		
		for (int i=0; i<vect.length; i++) {
			sc.nextLine();
			String name = sc.nextLine();
			double price = sc.nextDouble();
			vect[i] = new Produto(name,price);
		}
		
		double soma = 0.0;
		
		for(int i =0;i<vect.length;i++) {
			soma += vect[i].getPrice();
		}
		
		double media = soma/vect.length;
		
		System.out.printf("AVERAGE: %.2f", media);
		
		sc.close();

	}

}
