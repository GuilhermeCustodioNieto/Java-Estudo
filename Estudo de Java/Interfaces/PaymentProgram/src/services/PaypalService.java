package services;

public class PaypalService implements OnlinePaymentService{
	@Override
	public Double paymentFee(Double amount) {
		return amount / 100 * 2;
	}
	
	@Override
	public Double interest(Double amount, Integer months) {
		return amount * 0.01 * months;
	}
}
