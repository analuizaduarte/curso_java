package curso_programacao;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Department;
import entities.HourContract;
import entities.Worker;
import entities.enums.WorkerLevel;

public class Exercicio_30 {

	public static void main(String[] args) throws ParseException {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.print("Enter department's name: ");
		String dpname = sc.next();
		Department depName = new Department(dpname);
		System.out.println("Enter worker data: ");
		System.out.print("Name: ");
		String nameWorker = sc.next();
		System.out.print("Level: ");
		String desLevel = sc.next();
		WorkerLevel level = WorkerLevel.valueOf(desLevel);
		System.out.print("Base salary: ");
		double baseSalary = sc.nextDouble();
		Worker worker = new Worker(nameWorker, level, baseSalary, depName);

		System.out.println("How many contracts to this worker? ");
		int n = sc.nextInt();
		


		for (int i = 0; i < n; i++) {

			System.out.printf("Enter contract #%d data: %n", i + 1);

			System.out.print("Date (DD/MM/YYYY): ");
			Date contractDate = sdf.parse(sc.next());	
			System.out.print("Value per hour: ");
			double valuePerHour = sc.nextDouble();
			System.out.print("Duration (hours): ");
			Integer hours = sc.nextInt();
			HourContract contract = new HourContract(contractDate, valuePerHour, hours);
			worker.addContract(contract);
		}
		
		System.out.println("Enter month and year to calculate income (MM/YYYY): ");
		String dateIncome = sc.next();
		int month = Integer.parseInt(dateIncome.substring(0,2));
		int year = Integer.parseInt(dateIncome.substring(3));
		System.out.println("Name: " + worker.getName());
		System.out.println("Department: "+worker.getDepartment().getName());
		System.out.println("Income for "+dateIncome+": "+worker.income(year, month));
		sc.close();

	}

}
