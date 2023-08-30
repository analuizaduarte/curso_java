package curso_programacao;

import java.util.Locale;
import java.util.Scanner;

import entities.Triangle;

public class Exercicio_08 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Triangle x = new Triangle();
		Triangle y = new Triangle();

		System.out.println("Enter the measures of triangle x: ");

		x.a = sc.nextDouble();
		x.b = sc.nextDouble();
		x.c = sc.nextDouble();

		System.out.println("Enter the measures of triangle y: ");

		y.a = sc.nextDouble();
		y.b = sc.nextDouble();
		y.c = sc.nextDouble();

		double areaX = x.area();
		double areaY = y.area();
		
		System.out.printf("Triangle X area: %.4f%n",areaX);
		System.out.printf("Triangle Y area: %.4f%n",areaY);

		double higher = max(areaX, areaY);

		showResult(higher);

		sc.close();
	}

	
	public static double max(double x, double y) {

		double aux;
		if (x > y) {
			aux = x;
		} else {
			aux = y;
		}

		return aux;
	}

	public static void showResult(double value) {
		System.out.printf("Higher: %.4f%n", value);
	}

}
