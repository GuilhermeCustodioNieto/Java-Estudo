package com.emplooyes;


public class OutsourcedEmployee extends Employee{
    private Double additionalCharge;
    
    public OutsourcedEmployee(){
      super();
    }
    
    public OutsourcedEmployee(String name, Integer hours, Double valuePerHours, Double additionalCharge){
      super(name, hours, valuePerHours);
      this.additionalCharge = additionalCharge;
    }
    
    public void setAdditionalCharge(Double additionalCharge){
      this.additionalCharge = additionalCharge;
    }
    
    public Double getAdditionalCharge(){
      return additionalCharge;
    }
    
    @Override
    public Double payment(){
      return super.payment() + (additionalCharge * 1.1);
    }
}
