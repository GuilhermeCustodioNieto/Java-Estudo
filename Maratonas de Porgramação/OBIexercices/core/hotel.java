package com.core;

import java.util.Scanner;


public class hotel {

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    
    int valorDiariaDia1 = scan.nextInt();
    int aumento = scan.nextInt();
    int chegada = scan.nextInt();
    
    int total=0;
    
    if(chegada == 1){
      total = 31 * valorDiariaDia1;
    }
    
    else if(chegada >= 2 && chegada<15){
      total =(31 - (chegada-1)) * (valorDiariaDia1 + (chegada * aumento));
    }
    else{
      total = (31 - (chegada-1)) * (valorDiariaDia1 + (14 * aumento));
    }
    
    System.out.println(total);
  }

}
