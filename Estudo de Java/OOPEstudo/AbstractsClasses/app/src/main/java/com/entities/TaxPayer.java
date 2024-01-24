package com.entities;

import com.entities.TaxPayer;


public abstract class TaxPayer {
    protected String name;
    protected Double annualIncome;
    
    public TaxPayer(){}
    public TaxPayer(String name, Double annualIncome){
        this.name = name;
        this.annualIncome = annualIncome;
    }
    
    public abstract Double tax();
    
    public String toString(){
      return "Name: " + name +": $0";
    }
    
}
/*
Classe: PESSOA

Atributos: STRING NAME, DOUBLE ANNUALiNCOME
M´etodos: double tax()

*/