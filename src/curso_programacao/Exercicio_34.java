package curso_programacao;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee;
import entities.OutsourcedEmployee;

public class Exercicio_34 {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the number of employees: ");
		int n = sc.nextInt();
		List<Employee> list = new ArrayList<>();

		for (int i = 1; i <= n; i++) {

			System.out.printf("Employee #%d data:\n", i);
			System.out.print("Outsourced (y/n)? ");
			char out = sc.next().charAt(0);
			System.out.print("Name: ");
			String name = sc.next();
			System.out.print("Hours: ");
			int hours = sc.nextInt();
			System.out.print("Value per hour: ");
			double vpHour = sc.nextDouble();

			if (out == 'n' || out == 'N') {
				list.add(new Employee(name, hours, vpHour));

			} else if (out == 'y' || out == 'Y') {
				System.out.println("Additional charge: ");
				double adtCharge = sc.nextDouble();
				Employee emp = new OutsourcedEmployee(name, hours, vpHour, adtCharge);
				list.add(emp);

			} else {
				System.out.println("Type y or n");
			}
		

		}
		System.out.println("PAYMENTS: ");
		for (Employee e : list) {
			System.out.println(e.getName() + " - $" + String.format("%.2f", e.payment()));

		}
		sc.close();
	}
}
