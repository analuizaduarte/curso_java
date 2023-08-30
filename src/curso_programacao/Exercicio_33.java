package curso_programacao;

import entities.Conta;
import entities.BusinessAccount;
import entities.SavingsAccount;

public class Exercicio_33 {

	public static void main(String[] args) {
		
		Conta acc = new Conta(1001, "Alex", 1000);
		BusinessAccount bacc = new BusinessAccount(1002, "Maria", 0, 500);
		
		//UPCASTING
		
		Conta acc1 = bacc;
		Conta acc2 = new BusinessAccount(1003, "Bob", 0, 200);
		Conta acc3 = new SavingsAccount(1004, "Anna", 0, 1000);
		
		//DOWNCASTING
		
		BusinessAccount acc4 = (BusinessAccount)acc2;
		acc4.loan(100.0);
		
		//BusinessAccount acc5 = (BusinessAccount)acc3;
		
		if(acc3 instanceof BusinessAccount) {
			BusinessAccount acc5 = (BusinessAccount)acc3;
			acc5.loan(200);
			//System.out.println("Loan!");
			
		}
		
		if(acc3 instanceof SavingsAccount) {
			SavingsAccount acc5 = (SavingsAccount)acc3;
			acc5.updateBalance();
			//System.out.println("Update!");
			acc5.withdraw(200);
			System.out.println(acc3.getBalance());
		}
		
		acc.withdraw(200);
		System.out.println(acc.getBalance());
		
	
	}

}
