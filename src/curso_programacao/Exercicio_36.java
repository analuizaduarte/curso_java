package curso_programacao;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Circle;
import entities.Rectangle;
import entities.Shape;
import entities.enums.Color;

public class Exercicio_36 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the number of shapes: ");
		int n = sc.nextInt();
		List<Double> sp = new ArrayList<>();
		for (int i = 1; i <= n; i++) {
		
			System.out.printf("Shape #%d data: \n", i);
			System.out.print("Rectangle or Circle (r/c)? ");
			char answer = sc.next().charAt(0);
			System.out.print("Color (BLACK/BLUE/RED): ");
			String color = sc.next();

			if (answer == 'r') {
				System.out.print("Widht: ");
				double widht = sc.nextDouble();
				System.out.print("Height: ");
				double height = sc.nextDouble();
				Shape sp1 = new Rectangle(Color.valueOf(color), widht, height);
				sp.add(sp1.area());
			} else if (answer == 'c') {
				System.out.print("Radius: ");
				double radius = sc.nextDouble();
				Shape sp1 = new Circle(Color.valueOf(color), radius);
				sp.add(sp1.area());
			} else {
				System.out.println("Type c or r");
			}

		}
		System.out.println();
		System.out.println("SHAPE AREAS");
		for (double d : sp) {
			System.out.printf("%.2f %n", d);
		}
		sc.close();

	}

}
