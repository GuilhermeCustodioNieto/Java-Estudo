import java.util.Scanner;

import entities.Funcionario;

import java.util.Locale;


public class SecondEx {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		Funcionario funcionario = new Funcionario();
		
		System.out.print("Name: ");
		funcionario.nome = scan.nextLine();
		System.out.print("Gross Salary: ");
		funcionario.grossSalary = scan.nextDouble();
		System.out.print("Tax: ");
		funcionario.tax = scan.nextDouble();
		
		System.out.println("Employee: " + funcionario.apresent());
		
		System.out.println("Which percentage to increase salary? ");
		double percentage = scan.nextDouble();
		funcionario.increaseSalary(percentage);
		
		System.out.println("Updated data: " + funcionario.apresent());
		scan.close();

	}

}
