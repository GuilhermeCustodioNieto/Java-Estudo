package com.core;

import com.core.maiorValor;
import java.util.Scanner;


public class maiorValor {

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    
    int menorValor = scan.nextInt();
    int maiorValor = scan.nextInt();
    int somaDigitos = scan.nextInt();
    
    
    int maior = 0;
    
    for(int i=menorValor; i<=maiorValor; i++){
      String valorAtual = String.valueOf(i);
      
      int somaAtual = somaValores(valorAtual);
      
      System.out.println(i);
      if(i==menorValor && somaAtual == somaDigitos){
        maior = i;
      }
      else if(somaAtual==somaDigitos && i > maior){
        maior = i;
      }
    }
    
    System.out.println("maior: "+maior);
    
    scan.close();
  }
  
  

    public static int somaValores(String valor) {
    int soma = 0;

    for (int j = 0; j < valor.length(); j++) {
        char c = valor.charAt(j);
        if (Character.isDigit(c)) {
            int unitarioInt = Character.getNumericValue(c);
            soma += unitarioInt;
        }
    }
    return soma;
}
}

/*

Logica: 

recebe o começo, o fim e o valor a ser verificado, então eu vou iterar (desde o inicio até o fim)
posteriormente eu chamo a função que faz a soma das substrings
aí eu verifico se a soma das substrings é igual ao valor de verificação passado pelo usuario.

além disso eu verifico se é a primeira vez rodando o loop, se for, consequentemenete é o maior valor. 
se não for a primeira iteração mas o valor da iteração (i) for maior que o antigo valor que era considerado o maior, o valor atual se torna o maior.

FUNÇÃO DE SOMA DE SUBSTRINGS:

ela recebe de parametros uma String contendo o valor de i
posteriormente ela vai iterar sobre essa String, pegando o valor atual e fazendo casting para inteiro para assim, somar, armazendando na variavel soma e retornando ela

uma curiosidade é que fazemos a verificação se a variavel de substring (chamada de temp) é do tipo inteiro, porque as vezes ela é um char vazio "". Então se fosse um char vazio ao inés de um inteiro, isso daria erro na hora de fazer o casting

exemplo da função:

valor = 25;

soma += 2
soma += 5

*/