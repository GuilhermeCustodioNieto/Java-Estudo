package com.core;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;


public class Caravana {

  public static void main(String[] args) {
     Scanner scan = new Scanner(System.in);
     
     int quantidadeCamelos = scan.nextInt();
     ArrayList<Integer> pesosCamelos = new ArrayList<>();
     
     
     for(int i=0; i<quantidadeCamelos; i++){
       pesosCamelos.add(scan.nextInt());
     }
     
     int mediaPesos = 0;
     
     for(int atual : pesosCamelos){
       mediaPesos += atual;
     }
     
     mediaPesos /= quantidadeCamelos;
     
     for(int i=0; i<quantidadeCamelos; i++){
       pesosCamelos.set(i, (mediaPesos - pesosCamelos.get(i)));
       
     }
     
     for(int i=0; i<quantidadeCamelos; i++){
       System.out.println(pesosCamelos.get(i));
     }
  }

}
/*
eu pego o todos os pesos dos camelos e depois faço a média aritmética deles

para cada peso dos camelos, eu subtraio a média e substituo pelo peso anterior.
*/