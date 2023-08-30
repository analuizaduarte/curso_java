package curso_programacao;

import java.util.Locale;
import java.util.Scanner;

import entities.Retangulo;

public class Exercicio_10 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Retangulo retangulo = new Retangulo();
		System.out.println("Enter rectangle width and height: ");
		retangulo.height = sc.nextDouble();
		retangulo.width = sc.nextDouble();
		double area = retangulo.area();
		System.out.printf("AREA: %.2f%n", area);
		double perimeter = retangulo.perimeter();
		System.out.printf("PERIMETER: %.2f%n", perimeter);
		double diagonal = retangulo.diagonal();
		System.out.printf("DIAGONAL: %.2f%n", diagonal);
		sc.close();

	}

}
