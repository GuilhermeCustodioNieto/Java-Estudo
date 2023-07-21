import java.util.Scanner;

import entities.CurrencyConverter;

import java.util.Locale;

public class FourthEx {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		
		System.out.print("What is the dollar price? ");
		double dollarPrice = scan.nextDouble();
		System.out.print("How many dollars will be bought? ");
		double amountDollars = scan.nextDouble();
		
		System.out.println("amount to be paid in reais = " + CurrencyConverter.DollarExchangeRate(dollarPrice, amountDollars));
		scan.close();
	}

}
