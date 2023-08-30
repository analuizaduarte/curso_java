package model.services;

import java.text.SimpleDateFormat;
import java.time.LocalDate;

import model.entities.Contract;
import model.entities.Installment;

public class ContractService {
	
	private OnlinePaymentService onlinePaymentService;
	
	public ContractService(OnlinePaymentService onlinePaymentService) {
		this.onlinePaymentService = onlinePaymentService;
	}

	public void processContract(Contract contract, int months) {
		
		double parcela = contract.getTotalValue()/months;
		for (int i = 1; i <= months; i++) {
			LocalDate dueDate = contract.getDate().plusMonths(i);
			double interest = onlinePaymentService.intereset(parcela, i);
			double fee = onlinePaymentService.paymentFee(parcela+interest);
			double quota = parcela + interest + fee;
			contract.getInstallments().add(new Installment(dueDate,quota));
		}

	}
}
