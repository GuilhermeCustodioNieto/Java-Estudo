package com.core;

import com.products.*;
import com.products.Product;
import java.util.Scanner;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;


public class Main {

  public static void main(String[] args) {
    Locale.setDefault(Locale.US);
  
    Scanner scan = new Scanner(System.in);
    
    System.out.println("Enter the number of products: ");
    int quantidadeProdutos = scan.nextInt();
    
    Product[] produtos = new Product[quantidadeProdutos];
    
    for(int i=0; i<=(produtos.length-1); i++){
    
        System.out.printf("Product #%d data: %n", (i+1)); 
        
        System.out.print("Common, used or imported (c/u/i) ?");
        char typeProduct = scan.next().charAt(0);
        
        System.out.print("Name: ");
        String name = scan.next();
        
        System.out.print("Price: ");
        double price  = scan.nextDouble();
        
        if(typeProduct == 'c'){
          produtos[i] = new Product(name, price);
        }
        
        else if(typeProduct == 'i'){
          System.out.print("Customs fee: ");
          double customsFee = scan.nextDouble();
          
          produtos[i] = new ImportedProduct(name, price, customsFee);
        }
        
        else if(typeProduct == 'u'){
          System.out.print("Mainfacture date (DD/MM/YYYY): ");
          String date = scan.next();
          
          DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        
          LocalDate mainfacture = LocalDate.parse(date, formatter);   
        
          produtos[i] = new UsedProduct(name, price, mainfacture);
        }
        
    }
    
    System.out.println("PRICE TAGS: ");
    for(Product produto : produtos){
      System.out.println(produto.priceTag());
    }
    
    scan.close();
  }
}
