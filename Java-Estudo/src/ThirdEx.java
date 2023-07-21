import java.util.Scanner;

import entities.Aluno;

import java.util.Locale;


public class ThirdEx {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		Aluno aluno = new Aluno();
		
		System.out.print("Digite o seu nome: ");
		aluno.name = scan.nextLine();
		System.out.print("Agora a primeira nota: ");
		aluno.first = scan.nextDouble();
		System.out.print("a segunda: ");
		aluno.second = scan.nextDouble();
		System.out.print("a terceira: ");
		aluno.third = scan.nextDouble();
		
		System.out.println("final grade: " + aluno.finalGrade());
		System.out.println(aluno.itsApproved());

		scan.close();
	}

}
