package com.entities;

import com.entities.TaxPayer;

public class Company extends TaxPayer {
  /*
      Pessoa Juridica: numero de funcionarios

      Pessoa jurídica: pessoas jurídicas pagam 16% de imposto. Porém, se a empresa possuir mais de 10
  funcionários, ela paga 14% de imposto.
  Exemplo: uma empresa cuja renda foi 400000.00 e possui 25 funcionários, o imposto fica:
  400000 * 14% = 56000.00
      */

  private Integer numberOfEmployees;

  public Company() {}

  public Company(String name, Double annualIncome, Integer numberOfEmployees) {
    super(name, annualIncome);
    this.numberOfEmployees = numberOfEmployees;
  }

  @Override
  public Double tax() {
    return (numberOfEmployees > 10) ? annualIncome * 0.14 : annualIncome * 0.16;
  }

  public void setNumberOfEmployees(Integer numberOfEmployees) {
    this.numberOfEmployees = numberOfEmployees;
  }

  public int getNumberOfEmployees() {
    return numberOfEmployees;
  }

  @Override
  public String toString() {
    return name + ": $ " + tax();
  }
}
