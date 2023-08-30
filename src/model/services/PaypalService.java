package model.services;

public class PaypalService implements OnlinePaymentService {

	public PaypalService() {}

	public double paymentFee(double amount) {

		return 0.02 * amount;
	}

	public double intereset(double amount, int months) {

		return amount * 0.01 * months;

	}

}
