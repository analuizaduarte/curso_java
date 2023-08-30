package curso_programacao;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio_19 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos numeros voce vai digitar? ");
		int n = sc.nextInt();
		double[] vect = new double[n];
		sc.nextLine();
		for(int i=0; i<vect.length; i++) {
			
			System.out.print("Digite um numero: ");
			vect[i] = sc.nextDouble();
		}
		
		System.out.print("VALORES: ");
		double soma = 0.0;
		for(int i=0; i<vect.length; i++) {
			System.out.printf("%.2f ", vect[i]);
			soma += vect[i];
		}
		double media = soma/vect.length;
		System.out.println();
		System.out.printf("SOMA: %.2f%n" ,soma);
		System.out.printf("MEDIA: %.2f",media);
		
		
		
		sc.close();
	}
	
}
