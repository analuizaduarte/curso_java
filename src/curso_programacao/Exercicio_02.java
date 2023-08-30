package curso_programacao;

import java.util.Scanner;

public class Exercicio_02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in) ;
		String x;
		x = sc.next();
		System.out.println("Voce digitou: " + x); 
		
		int y;
		y = sc.nextInt();
		System.out.println("Voce digitou: " + y);
		
		double z;
		z = sc.nextDouble();
		System.out.printf("Voce digitou: %n" + z);
		
		char a;
		a = sc.next().charAt(0);
		System.out.println("Voce digitou: "+ a);
		
		sc.close();
	}
}

