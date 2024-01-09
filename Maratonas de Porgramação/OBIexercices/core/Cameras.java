package com.core;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Cameras {

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    
    int numColunas, numLinhas, numCameras;
    
    numColunas = scan.nextInt();
    numLinhas = scan.nextInt();
    numCameras = scan.nextInt();
    
    List<Integer>[] colunasCameras = new ArrayList[numColunas];
    
    for(int i=0; i<=numColunas-1; i++){
      colunasCameras[i] = new ArrayList<>();
    }
    
    for(int i=0; i<=numCameras-1; i++){
      int colunaCameraAtual = scan.nextInt();
      int linhaCameraAtual = scan.nextInt();
    }
    
    
    
  }

}
