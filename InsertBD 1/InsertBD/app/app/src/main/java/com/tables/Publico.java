package com.tables;

public enum Publico {
    ADULTO(1),
    INFANTOJUVENIL(2);
    
    private int indice;
    
    private Publico(int indice){
      this.indice = indice;
    }
    
}
