package application;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

import model.entities.CarRental;
import model.entities.Vehicle;
import model.services.BrazilTaxService;
import model.services.RentalService;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Entre com os dados do modelo do carro");
		System.out.print("Car model: ");
		String model = scan.nextLine();
		
		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		
		System.out.print("Retirada (dd/MM/yyyy hh:mm) ");
		String strDataRetirada = scan.nextLine();
		LocalDateTime start = LocalDateTime.parse(strDataRetirada, fmt);
		
		System.out.print("Retirada (dd/MM/yyyy hh:mm) ");
		String strDataDevolucao = scan.nextLine();
		LocalDateTime finish = LocalDateTime.parse(strDataDevolucao, fmt);
		
		Vehicle car = new Vehicle(model);
		CarRental carRental = new CarRental(start, finish, car);
		
		BrazilTaxService taxService = new BrazilTaxService();
		
		System.out.println(taxService.tax(50.00));
		
		System.out.println("Entre com o preço por dia: ");
		double pricePerHour = scan.nextDouble();
		System.out.println("Entre com o preço por dia: ");
		double pricePerDay = scan.nextDouble();
		
		RentalService rentalService = new RentalService(pricePerHour, pricePerDay, new BrazilTaxService());
		rentalService.processInvoice(carRental);
		
		System.out.println("FATURA: ");
		System.out.println("Pagamento básico: " + String.format("%.2f", carRental.getInvoice().getBasicPayments()));
		System.out.println("Impost: " + String.format("%.2f", carRental.getInvoice().getTax()));
		System.out.println("Pagamento total: " + String.format("%.2f", carRental.getInvoice().getTotalPayment()));
		
		scan.close();
		
		
	}

}
