package model.services;

public interface OnlinePaymentService {

		double paymentFee(double amount);

		double intereset(double amount, int months);
}
