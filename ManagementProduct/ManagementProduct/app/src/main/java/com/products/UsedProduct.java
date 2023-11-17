package com.products;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class UsedProduct extends Product{
    private LocalDate mainfacture;
    
    public UsedProduct(){
      super();
    }
    
    public UsedProduct(String name, Double price, LocalDate mainfacture){
      super(name, price);
      this.mainfacture = mainfacture;
    }
   
    public void setMainfacture(String date){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        
        mainfacture = LocalDate.parse(date, formatter);   
    }
    
    public LocalDate getMainfacture(){
      return mainfacture;
    }
   
    @Override
    public String priceTag(){
      return super.getName() + "(used)" 
       + super.getPrice()
       + "(Mainfacture date: " +
        mainfacture.toString();
    }
}
