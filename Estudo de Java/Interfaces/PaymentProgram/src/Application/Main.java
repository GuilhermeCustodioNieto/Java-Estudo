package Application;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

import entities.Contract;
import entities.Installment;
import services.ContractService;
import services.PaypalService;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Entre com os dados do contrato");
		System.out.print("Numero: ");
		int number = scan.nextInt();
		
		System.out.print("Data (dd/MM/yyyy): ");
		String dateInput = scan.next();
		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate date = LocalDate.parse(dateInput, fmt);
		
		System.out.print("Valor do contrato: ");
		double amount = scan.nextDouble();
		
		System.out.print("Entre com o número de parcelas: ");
		int installmentAmount = scan.nextInt();
		
		Contract contract = new Contract(number, date, amount);
		PaypalService paypalService = new PaypalService();
		ContractService contractService = new ContractService(paypalService);
		
		contractService.processContract(contract, installmentAmount);
		
		System.out.println("Prcelas: ");
		
		System.out.println(contract.toString());
	}

}

