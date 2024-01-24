package com.core;

import com.entities.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    System.out.print("Entre com o número de faturas: ");
    int faturas = scan.nextInt();

    List<Pagavel> payments = new ArrayList<>();

    for (int i = 0; i < faturas; i++) {
      System.out.println("============================");
      System.out.print("Enter the payment type (e - empregado/ f - fatura): ");
      char typePayment = scan.next().toLowerCase().charAt(0);

      if (typePayment == 'e') {
        System.out.print("Enter with yout name: ");
        String name = scan.next();

        System.out.print("Enter with your last name: ");
        String lastName = scan.next();

        System.out.println("Enter yout monthly salary: ");
        double monthlySalary = scan.nextDouble();

        payments.add(new Empregado(name, lastName, monthlySalary));

      } else if (typePayment == 'f') {
        System.out.print("Enter your number: ");
        int number = scan.nextInt();
        scan.nextLine();
        System.out.print("Enter with the description: ");
        String description = scan.nextLine();
        System.out.print("Enter the quantity: ");
        int quantity = scan.nextInt();

        System.out.println("Enter the price per unity: ");
        double pricePerUnity = scan.nextDouble();

        payments.add(new Fatura(number, description, quantity, pricePerUnity));
      } else {
        System.out.println("Error: option no found!");
      }
    }

    
    System.out.println("The payments prices: ");
    for (Pagavel pagavel : payments) {
      System.out.println("--------------------------");
      System.out.println(pagavel.toString());
    }
  }
}
/*
Exercício: Sistema de Pagamento

1- Crie uma interface chamada Pagavel que contenha o método calcularPagamento().

2- Implemente a interface Pagavel em duas classes diferentes: Fatura e Empregado.

3- Na classe Fatura, defina atributos como número, descrição, quantidade e preço por unidade. Implemente o método calcularPagamento() para calcular o valor total da fatura (quantidade * preço por unidade).

4- Na classe Empregado, defina atributos como nome, sobrenome e salário mensal. Implemente o método calcularPagamento() para calcular o salário anual (salário mensal * 12).

5- Crie uma classe principal chamada SistemaPagamento com um método main que demonstre a utilização das classes Fatura e Empregado. Crie instâncias de ambas as classes, chame o método calcularPagamento() e exiba os resultados.
*/
