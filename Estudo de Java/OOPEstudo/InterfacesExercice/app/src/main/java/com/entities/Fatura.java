package com.entities;

public class Fatura implements Pagavel {
  private int number;
  private String description;
  private int quantity;
  private double pricePerUnity;

  public Fatura() {}

  public Fatura(int number, String description, int quantity, double pricePerUnity) {
    this.number = number;
    this.description = description;
    this.quantity = quantity;
    this.pricePerUnity = pricePerUnity;
  }

  @Override
  public double calcularPagamento() {
    return quantity * pricePerUnity;
  }

  // Getters
  public int getNumber() {
    return number;
  }

  public String getDescription() {
    return description;
  }

  public int getQuantity() {
    return quantity;
  }

  public double getPricePerUnity() {
    return pricePerUnity;
  }

  // Setters
  public void setNumber(int number) {
    this.number = number;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public void setQuantity(int quantity) {
    this.quantity = quantity;
  }

  public void setPricePerUnity(double pricePerUnity) {
    this.pricePerUnity = pricePerUnity;
  }

  // toString method
  @Override
  public String toString() {
    return "Fatura{"
        + "number="
        + number
        + "\n"
        + "description="
        + description
        + "\n"
        + "quantity="
        + quantity
        +"\n"
        + ", pricePerUnity="
        + pricePerUnity
        + "\n"
        + "Valor pagamento="
        + calcularPagamento()
        + "\n"
        +  '}';
  }
}
