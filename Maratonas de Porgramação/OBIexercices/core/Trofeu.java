package com.core;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Trofeu {

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    List<Integer> pontuacoes = new ArrayList<>();

    for (int i = 0; i <= 4; i++) {
      pontuacoes.add(scan.nextInt());
    }

    int numTrofeu = 0, numPlacas = 0;

    int segundoMaior = 0;

    for (int atual : pontuacoes) {
      if (atual < pontuacoes.get(0) && atual > segundoMaior) {
        segundoMaior = atual;
      }
    }

    for (int atual : pontuacoes) {
      if (atual == pontuacoes.get(0)) {
        numTrofeu++;
      } else if (atual == segundoMaior) {
        numPlacas++;
      }
    }

    System.out.println(numTrofeu + " " + numPlacas);
    
    scan.close();
    }
}


/*
Lógica:

primeiro lemos todas as pontuações e adicionamos na lista, além disso inicializamos as variaveis de numero de trofeus e numero de placas.

posteriormente fazemos a verificação de quem é o segundo maior. No caso desse programa, o 0 semrpe é o maior valor, mas o 1 as vezes é igual ao 0, então o 1 nem sempre é o segundo maior valor, por isso a verificação.

posteriormente verificamos se cada valor é igual ao maior valor, se for, temos mais um troféu!
se não, vemos se o valor é igual ao segundo maior, se for, temos mais uma placa!

posteriormente, apresentamos os valores e finalizamos o programa.

*/