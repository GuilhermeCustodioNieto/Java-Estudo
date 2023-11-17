package com.Account;

public class SavingsAccount extends Account {
  Double intestRate;
  
  public SavingsAccount(){}
  
  public SavingsAccount(Integer numerConta, Double saldo, String titular, Double intestRate){
    super(numeroConta, saldo, titular)
    this.interestRate = intestRate;
  }
  
  public double getInterestRate(){
    return intestRate;
  }
  
  public void setInterestRate(double interestRate){
    this.interestRate = interestRate;
  }
}
