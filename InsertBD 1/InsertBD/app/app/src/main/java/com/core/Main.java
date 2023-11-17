package com.core;

import com.tables.Publico;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import com.tables.Book;

public class Main {

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    System.out.print("digite a quantidade mínima a serem lidos: ");
    int quantLivros = scan.nextInt();

    List<Book> livros = new ArrayList<>();

    for (int i = 0; i < quantLivros; i++) {

      System.out.print("digite o ranking do livro: ");
      String ranking = scan.next();

      System.out.print("digite a quantidade de empréstimos: ");
      int emprestimos = scan.nextInt();
      
      scan.nextLine();

      System.out.print("Digite o nome da obra: ");
      String obras = scan.nextLine();

      System.out.print("Digite os autores da obra: ");
      String autores = scan.nextLine();

      System.out.print("Digite o tipo de publico (1- adulto / 2- InfantoJuvenil)");
      int publicoIndice = scan.nextInt();

      Publico enumPublico = Publico.ADULTO;
      
      switch(publicoIndice){
        case 1:
            enumPublico = Publico.ADULTO;
            break;
        case 2:
            enumPublico = Publico.INFANTOJUVENIL;
            break;
            
        default:
            System.out.println("Erro, valor digtado está incorreto. por padrão,sua entrada vai ser ADULTO. ");
        
      }
      
      

      livros.add(new Book(ranking, emprestimos, obras, autores, enumPublico));
      
      System.out.println("---------------------------");
    }

    // formatar a variável para apresentação
    StringBuilder strLivrosFinal = new StringBuilder();

    for (Book livro : livros) {
      strLivrosFinal.append(livro.toString());
    }

    System.out.println(strLivrosFinal.toString());
  }
}

// programa: vai ler n entradas do usuário
// cada entrada vai ser uma classe, que vai receber 3
                                          // dados do livro
// a saída do programa vai ser um insert totalmente definido

// valpres: int, int, varchar(150), varchar(100) e varchar(20)
