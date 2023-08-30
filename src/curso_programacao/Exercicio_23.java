package curso_programacao;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Funcionario;

public class Exercicio_23 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		System.out.print("How many employees will be registered? ");
		int n = sc.nextInt();
		
		List<Funcionario> list = new ArrayList<>();

		for(int i=0; i<n; i++){
			System.out.printf("Employeee #%d %n", i+1);
			System.out.print("Id: ");
			int id = sc.nextInt();
			System.out.print("Name: ");
			String name = sc.next();
			sc.next();
			System.out.print("Salary:" );
			double salary = sc.nextDouble();
			list.add(new Funcionario(id,name,salary));
		}
		System.out.println();
		System.out.println("Enter the employee id that will have the salary increase: ");
		int id = sc.nextInt();
		Funcionario func = list.stream().filter(x -> x.getId()==id).findFirst().orElse(null);
		if(func == null) {
			System.out.println("This id does not exist!");
		}
		else {
			System.out.println("Enter the percentage");
			double percentage = sc.nextDouble();
			func.increaseSalary(percentage);
			
		}
		System.out.println();
		System.out.println("List of employees: ");
		for(Funcionario obj : list) {
		System.out.println(obj);
		}
		sc.close();

	}

}
