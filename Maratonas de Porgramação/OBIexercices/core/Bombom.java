package com.core;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Bombom {

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    
    String naipeDominante = scan.next();
    ArrayList<String> cartasLuana = new ArrayList<>();
    
    for(int i=0; i<=2; i++){
      cartasLuana.add(scan.next());
    }
    
    
    ArrayList<String> cartasEdu = new ArrayList<>();
    
    for(int i=0; i<=2; i++){
      cartasEdu.add(scan.next());
    }
    
    
    
    //--------------------------------
    
    
    
    int totalPontosLuana = totalPontos(naipeDominante, cartasLuana);
    
    int totalPontosEdu = totalPontos(naipeDominante, cartasEdu);
    
    if(totalPontosEdu > totalPontosLuana){
      System.out.println("Edu");
    } 
    else if(totalPontosEdu < totalPontosLuana){
      System.out.println("Luana");
    } 
    else{
      System.out.println("empate");
    }
       
  }
  
  public static int totalPontos(String naipeDominante, ArrayList<String> pessoa){
    int totalPontos = 0;  
    for(String carta : pessoa){

      
      if(carta.charAt(1) == naipeDominante.charAt(1)){
        totalPontos+=4;        
      }
      
      switch(carta.charAt(0)){
        case 'A':
            totalPontos+=10;
            break;
        case 'J':
            totalPontos+=11;
            break;
        case 'Q':
            totalPontos+=12;
            break;
        case 'K':
            totalPontos+=13;
            break;
      }
      
      
      
      }
      return totalPontos;
  }
  

}

