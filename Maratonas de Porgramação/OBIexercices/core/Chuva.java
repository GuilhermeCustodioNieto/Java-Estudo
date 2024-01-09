package com.core;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Chuva {

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    
    int numMedicoes = scan.nextInt();
    int somaDesejada = scan.nextInt();
    
    ArrayList<Integer> listaMedicoes = new ArrayList<>();
    
    for(int i=0; i<numMedicoes; i++){
        listaMedicoes.add(scan.nextInt());
    }
    
    int quantidadeIntervalos = 0;
    
    for(int i=0; i<=(listaMedicoes.size() - 1); i++){
          for(int j=i; j<=(listaMedicoes.size()); j++){
            List<Integer> subcadeia = new ArrayList<>();
            
            subcadeia = listaMedicoes.subList(i, j);
            
            System.out.println(subcadeia);
            
            int soma = 0;
            
            for(int numAtual : subcadeia){
              soma += numAtual;
            }
            
            if(soma == somaDesejada){
              quantidadeIntervalos++;
            }
            
          }
    }
    
    System.out.println(quantidadeIntervalos);
    
    scan.close();
  }

}

/*
Lógica:


primeiro lemos os valores de quantdade de caracteres, e o valor desejado.
após isso lemos todos os valores de chuva, que vão ser guardados numa lista.
posteriormente vamos passar sobre cada valor da lista (i)
e vamos passar depois de i até o final da lista, guardando isso em uma subcadeia,ou seja:

lista = [1,2,3,4,5]

i=2
subcadeia (na primeira iteração) = [2,3,4,5]
subcadeia (na segunda iteração) = [3,4,5]
subcadeia (na terceira iteração) = [4,5]

e assim por diante.

depois vamos passar sobre cada valor da subcadeia e fazer a soma dos valores

se a soma dos valores da subcadeia for igual ao valor desejado (lido lá em cima), vamos acrescentar 1 na nossa variavel de contagem (denominada de quantidadeIntervalos)

após isso apresentamos os valores e finalizamos o programa.
*/
