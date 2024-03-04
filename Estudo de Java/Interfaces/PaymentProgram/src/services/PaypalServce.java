package services;

public class PaypalServce implements OnlinePaymentService{
	@Override
	public Double paymentFee(Double amount) {
		return amount * 0.2;
	}
	
	@Override
	public Double interest(Double amount, Integer months) {
		return amount / 100 * months;
	}
}
