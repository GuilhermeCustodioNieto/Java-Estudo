package com.core;

import java.util.Scanner;

public class Subcadeias {

  public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);

        System.out.print("Digite uma string: ");
        String inputString = scanner.nextLine();

        System.out.println("Substrings da string:");
        for (int i = 0; i < inputString.length(); i++) {
            for (int j = i + 1; j <= inputString.length(); j++) {
                String substring = inputString.substring(i, j);
                System.out.println(substring);
            }
        }

        scanner.close();
  }

}
