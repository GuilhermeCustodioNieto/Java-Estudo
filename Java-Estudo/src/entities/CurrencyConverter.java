package entities;

public class CurrencyConverter {
	public static final double IOF = 0.06;
	
	public static double DollarExchangeRate(double exchangeRate, double dollars) {
		return (exchangeRate * dollars) + ((exchangeRate * dollars)*IOF);
	}
}
