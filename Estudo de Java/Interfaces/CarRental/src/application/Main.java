package application;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

import model.entities.CarRental;
import model.entities.Vehicle;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Entre com os dados do modelo do carro");
		System.out.print("Modelo do carro: ");
		String model = scan.next();
		
		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy hh/mm");
		
		System.out.print("Retirada (dd/MM/yyyy hh:mm");
		String strDataRetirada = scan.nextLine();
		LocalDateTime start = LocalDateTime.parse(strDataRetirada, fmt);
		
		System.out.print("Retirada (dd/MM/yyyy hh:mm");
		String strDataDevolucao = scan.nextLine();
		LocalDateTime finish = LocalDateTime.parse(strDataRetirada, fmt);
		
		Vehicle car = new Vehicle(model);
		CarRental carRental = new CarRental(start, finish, car);
		
		
		
		scan.close();
	}

}
