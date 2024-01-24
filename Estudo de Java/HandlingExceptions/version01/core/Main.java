package com.version01.core;

import com.version01.entities.GeometricForm;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import com.version01.viewsEx.Menu;

//Exception Handling

public class Main {

  public static void main(String[] args) {
    try {
      Scanner scan = new Scanner(System.in);

      List<GeometricForm> geometrics = new ArrayList<>();
      Menu menu = new Menu();

      while (true) {
        System.out.println("---------------------");
        menu.showOptions();
        int choosedOption = scan.nextInt();

        if (choosedOption == 0) {
          System.out.println("Finishing... ");
          break;
        } else if (choosedOption >= 1 && choosedOption <= 3) {
          geometrics.add(menu.chooseOptions(choosedOption));
        }
      }

      for (GeometricForm geometric : geometrics) {
        System.out.printf(geometric.toString());
      }
      scan.close();
    } catch (Exception e) {
      e.printStackTrace();
    }
    
  }
  
}
/*
Exercício: Calculadora de Área e Perímetro

1. Crie uma calculadora simples que permita calcular a área e o perímetro de diferentes formas geométricas. Utilize classes e exceções para tornar o código mais estruturado e robusto.

2. Crie uma classe FormaGeometrica com métodos para calcular a área e o perímetro. Essa classe pode ser uma classe abstrata com métodos abstratos para área e perímetro.

3. Crie subclasses para formas geométricas específicas, como Quadrado, Círculo e Triângulo. Implemente os métodos abstratos de acordo com as fórmulas apropriadas para cada forma.Utilize exceções personalizadas para lidar com situações específicas, como entrada de valores negativos para dimensões.

4. No programa principal, permita que o usuário escolha a forma geométrica desejada, entre com os dados necessários e exiba a área e o perímetro.
*/
