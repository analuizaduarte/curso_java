package curso_programacao;

import java.text.ParseException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import model.entities.Contract;
import model.entities.Installment;
import model.services.ContractService;
import model.services.PaypalService;

public class Exercicio_41 {

	public static void main(String[] args) throws ParseException {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");

		System.out.println("Entre com os dados do contrato: ");
		System.out.print("Numero: ");
		int number = sc.nextInt();
		System.out.print("Data: ");
		LocalDate data =  LocalDate.parse(sc.next(), fmt);
		System.out.print("Valor do contrato: ");
		double totalValue = sc.nextDouble();
		System.out.print("Entre com o numero de parcelas: ");
		int nParcelas = sc.nextInt();
		Contract contract = new Contract(number, data, totalValue);
		 
		ContractService cs = new ContractService(new PaypalService());
		cs.processContract(contract, nParcelas);

		
		System.out.println("Parcelas: ");
		for(Installment l : contract.getInstallments()) {
			System.out.println(l);
		}
		
		sc.close();
		

	}

}
