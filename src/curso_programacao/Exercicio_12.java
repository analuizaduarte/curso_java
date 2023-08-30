package curso_programacao;

import java.util.Locale;
import java.util.Scanner;

import entities.Student;

public class Exercicio_12 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Student stu = new Student();
		System.out.print("Enter with name of the studente: ");
		stu.name = sc.nextLine();
		System.out.println("Enter with the three grade: ");
		stu.grade1 = sc.nextDouble();
		stu.grade2 = sc.nextDouble();
		stu.grade3 = sc.nextDouble();
		stu.finalGrade();
		stu.pass();
		
		sc.close();

	}

}
