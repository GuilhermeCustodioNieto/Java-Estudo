import java.util.Scanner;
import java.util.Locale;
import entities.Pessoas;

public class EighthEx {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);

		int quantPessoas = scan.nextInt();
		Pessoas[] pessoas = new Pessoas[quantPessoas];
		
		String nome;
		int idade;
		double altura;
		
		for (int i=0; i<quantPessoas;i++) {
			System.out.println("digite seu nome: ");
			scan.nextLine();
			nome = scan.nextLine();
			idade = scan.nextInt();
			altura = scan.nextDouble();
			pessoas[i] = new Pessoas(nome, idade, altura);
		}
		
		double alturaMedia;
		double somaMedia=0;
		int pessoasMenos16 = 0;
		
		for (int i=0; i<quantPessoas; i++) {
			somaMedia += pessoas[i].getAltura();
			if (pessoas[i].getIdade()<16) {
				pessoasMenos16 += 1;
			}
		}
		
		double percPessoasMenos16 = pessoasMenos16 * 100 / quantPessoas;
		alturaMedia = somaMedia/quantPessoas;
		
		System.out.println(percPessoasMenos16);
		System.out.println(alturaMedia);
		
		scan.close();
		
	}

}
