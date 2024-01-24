package com.Account;

import com.Account.Account;

public class BusinessAccount extends Account {
    private Double loanLimit;
    
    public BusinessAccount(){
      super();
    }
    
    public BusinessAccount(Integer numerConta, Double saldo, String titular, Double loanLimit){
      super(numeroConta, saldo, titular);
      this.loanLimit = loanLimit;
    }
    
    public void setLoan(Double loan){
      this.loan = loan;
    }
    
    public double getLoan(){
      return loan;
    }
    
    public void loan(double amount){
      if (amount <= loanLimit){
        deposit(amount);
      }
    }
}
