package com.Account;

public class Account {
  private Double saldo;
  private Integer numeroConta;
  private String titular;
  
  public Account(){
    
  }
  
  public Account(Double saldo, Integer numeroConta, String titular){
    this.saldo = saldo;
    this.numeroConta = numeroConta;
    this.titular = titular;
  }
  
  public void setNumeroConta(Integer numeroConta){
    this.numeroConta = numeroConta;
  }
  
  public Integer getNumeroConta(){
    return numeroConta;
  }
  
  public void setTitular(String titular){
    this.titular = titular;
  }
  
  public String getTitular(){
    return titular;
  }
  
  public Double getSaldo(){
    return saldo;
  }
  
  public void deposit(Double amount){
    saldo += amount;
  }
  
  public void withdraw(Double amount){
    saldo -= amount;
  }
}
