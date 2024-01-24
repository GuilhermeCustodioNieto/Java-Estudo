package com.core;

import java.util.Scanner;
import com.entities.*;
import java.util.List;
import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter the number of persons: ");
		int numberPersons = scan.nextInt();
		
		List<TaxPayer> taxPayers = new ArrayList<>();
		
		for(int i = 0; i<numberPersons; i++){
		    System.out.print("Enter the person type(c - Company / i - Individual): ");
		    char personType = scan.next().toLowerCase().charAt(0);
		    System.out.print("Enter the name: ");
		    String name = scan.next();
		    System.out.print("Enter the Annual Income: ");
		    double annualIncome = scan.nextDouble();
		    
		    if(personType == 'c'){
		        System.out.print("Enter the Number Of Employees: ");
		        int numberOfEmployees = scan.nextInt();
		        taxPayers.add(new Company(name, annualIncome, numberOfEmployees));
		    } else if(personType == 'i'){
		        System.out.print("Enter the Health Expeditures: ");
		        double healthExpeditures = scan.nextDouble();
		        taxPayers.add(new Individual(name, annualIncome, healthExpeditures));
		        } else{
		        System.out.println("Error: option no found! ");
		        }
		}
		
		
		double totalTaxes = 0;
		for(TaxPayer taxPayer : taxPayers){
		    System.out.println(taxPayer.toString());
		    totalTaxes += taxPayer.tax();
		}
		
		System.out.println("TOTAL TAXES: $" + totalTaxes);
		scan.close();
	}
}

/*
CLASSES: Pessoa, pessoa Fisica, pessoa Juridica

Classe: PESSOA

Atributos: STRING NAME, DOUBLE ANNUALINCOME
M´etodos: double tax()

Classe: Pessoa Fisica

Atributos: super() double gastos com saude
Métodos: double tax()
Regras especiais: 

Pessoa física: pessoas cuja renda foi abaixo de 20000.00 pagam 15% de imposto. Pessoas com 

renda de 20000.00 em diante pagam 25% de imposto. Se a pessoa teve gastos com saúde, 50% 

destes gastos são abatidos no imposto. 

Exemplo: uma pessoa cuja renda foi 50000.00 e teve 2000.00 em gastos com saúde, o imposto 

fica: (50000 * 25%) - (2000 * 50%) = 11500.00

===========================
Classe: pessoa Juridica

Atributos  super() numero de fubcuonarios
metodos: double tax()
Regras especiais:

Pessoa jurídica: pessoas jurídicas pagam 16% de imposto. Porém, se a empresa possuir mais de 10 

funcionários, ela paga 14% de imposto. 

Exemplo: uma empresa cuja renda foi 400000.00 e possui 25 funcionários, o imposto fica: 

400000 * 14% = 56000.00
===========================
*/