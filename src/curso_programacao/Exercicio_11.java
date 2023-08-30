package curso_programacao;

import java.util.Locale;
import java.util.Scanner;

import entities.Employeee;

public class Exercicio_11 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Employeee employeee = new Employeee();
		
		System.out.print("Name: ");
		employeee.name = sc.nextLine();
		System.out.print("Gross Salary: ");
		employeee.grossSalary = sc.nextDouble();
		System.out.print("Tax: ");
		employeee.tax = sc.nextDouble();
		
		System.out.println("Employeee: " + employeee);
		
		double percentage;
		System.out.print("Which percentage to increase the salary?");
		percentage = sc.nextDouble();		
		employeee.increaseSalary(percentage);
		
		System.out.printf("Update data: " + employeee);
		sc.close();

	}

}
