import java.util.Locale;
import java.util.Scanner;
import entities.ContaBancaria;

public class FifhtEx {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter account number: ");
		int accountNum = scan.nextInt();
		System.out.print("Enter account holder: ");
		scan.nextLine();
		String accountHolder = scan.nextLine();
		System.out.print("Is there na initial deposit? ");
		char wantInitialDeposit = scan.next().charAt(0);
		
		ContaBancaria conta;
		
		if (wantInitialDeposit == 'y') {
			System.out.print("Enter initial deposit value: ");
			double initialDeposit = scan.nextDouble();
			conta = new ContaBancaria(accountNum, accountHolder, initialDeposit);
		}
		
		else {
			conta = new ContaBancaria(accountNum, accountHolder);
			
		}
		
		System.out.println("Account data: ");
		System.out.println(conta);
		
		System.out.println("---------------------------------------------");
		
		System.out.print("enter a deposit value: ");
		double deposito = scan.nextDouble();
		conta.deposito(deposito);
		System.out.println("Updated account data: ");
		System.out.println(conta);
		
		System.out.println("---------------------------------------------");
		System.out.print("Enter a withdraw value: ");
		double saque = scan.nextDouble();
		conta.saque(saque);
		System.out.println("Updated account data: ");
		System.out.println(conta);
		
		scan.close();
	}
}