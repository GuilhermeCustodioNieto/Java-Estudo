package com.entities;

import com.entities.TaxPayer;

public class Individual extends TaxPayer {
  private Double healthExpeditures;

  public Individual() {}

  public Individual(String name, double annualIncome, double healthExpeditures) {
    super(name, annualIncome);
    this.healthExpeditures = healthExpeditures;
  }

  @Override
  public Double tax() {
    double basicTax = (annualIncome < 20000) ? annualIncome * 0.15 : annualIncome * 0.25;
    double healthTaxReduction = (healthExpeditures != null) ? healthExpeditures * 0.5 : 0.0;
    return basicTax - healthTaxReduction;
  }

  public void setHealthExpeditures(double healthExpeditures) {
    this.healthExpeditures = healthExpeditures;
  }

  public Double getHealthExpeditures() {
    return healthExpeditures;
  }

  @Override
  public String toString() {
    return name + ": $ " + tax();
  }
}

/*
Classe: Pessoa Fisica

Atributos: super() double gastos com saude
Métodos: double tax()
Regras especiais:

Pessoa física: pessoas cuja renda foi abaixo de 20000.00 pagam 15% de imposto. Pessoas com renda de 20000.00 em diante pagam 25% de imposto. Se a pessoa teve gastos com saúde, 50% destes gastos são abatidos no imposto.

Exemplo: uma pessoa cuja renda foi 50000.00 e teve 2000.00 em gastos com saúde, o imposto

fica: (50000 * 25%) - (2000 * 50%) = 11500.00
*/
