import java.util.Scanner;

public class EleventhEx {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int quantDigitar = 0;
		
		do {
			System.out.print("quantos numeros você vai digitar? ");
			quantDigitar = scan.nextInt();
		} while (quantDigitar > 10);
		
		
		
		Integer[] inteiros = new Integer[quantDigitar];
		
		for (int i=0; i<inteiros.length; i++) {
			System.out.print("digite um numero: ");
			inteiros[i] = scan.nextInt();
		}
		System.out.println("negativos: ");
		
		for (int i=0; i<inteiros.length; i++) {
			if (inteiros[i] < 0) {
				System.out.println(inteiros[i]);
			}
		}
		
		scan.close();

	}

}
