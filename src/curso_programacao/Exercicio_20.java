package curso_programacao;

import java.util.Locale;
import java.util.Scanner;

import entities.Person;

public class Exercicio_20 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantas pessoas serao digitadas? ");
		int n = sc.nextInt();
		Person[] vect = new Person[n];
		
		for(int i=0; i<vect.length; i++) {
			sc.nextLine();
			System.out.printf("Dados da %da pessoa:%n", i+1);
			System.out.print("Nome: ");
			String nome = sc.nextLine();
			System.out.print("Idade: ");
			int idade = sc.nextInt();
			System.out.print("Altura: ");
			double altura = sc.nextDouble();
			vect[i] = new Person(nome, idade, altura);
		}
		double somaAlt=0.0;
		double somaAge=0.0;
		for(int i=0; i<vect.length;i++) {
			somaAlt += vect[i].getHeight();
			if(vect[i].getAge()<16) {
				somaAge += 1;
			}
		}
		double media = somaAlt/vect.length;
		double pctgAge = somaAge/vect.length*100;
		System.out.printf("Altura media: %.2f%n", media);
		System.out.printf("Pessoas com menos de 16 anos: %.2f%%%n",pctgAge);
		for(int i=0; i<vect.length;i++) {
			if(vect[i].getAge()<16) {
				System.out.printf("%s%n", vect[i].getName());
			}
		}
		sc.close();
		
	}

}
