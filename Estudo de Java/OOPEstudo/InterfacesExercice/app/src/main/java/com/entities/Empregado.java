package com.entities;

public class Empregado implements Pagavel{
  private String name;
  private String lastName;
  private double monthlySalary;

  // Construtor
  public Empregado() {}

  public Empregado(String name, String lastName, double monthlySalary) {
    this.name = name;
    this.lastName = lastName;
    this.monthlySalary = monthlySalary;
  }

  @Override
  public double calcularPagamento() {
    return monthlySalary * 12;
  }

  // Getters
  public String getName() {
    return name; 
  }

  public String getLastName() {
    return lastName;
  }

  public double getMonthlySalary() {
    return monthlySalary;
  }

  // Setters
  public void setName(String name) {
    this.name = name;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public void setMonthlySalary(double monthlySalary) {
    this.monthlySalary = monthlySalary;
  }

  // toString method
  @Override
  public String toString() {
    return "Empregado{"
        + "name='"
        + name
        + "\n"
        + ", lastName='"
        + lastName
        + "\n"
        + ", monthlySalary="
        + monthlySalary
        + "\n"
        + "Valor pagamento="
        + calcularPagamento()
        + "\n"
        + "}";
  }
}
