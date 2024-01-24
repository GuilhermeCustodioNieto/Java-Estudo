package com.version01.entities;

import com.version01.entities.GeometricForm;

public class Triangulo implements GeometricForm {
  private double base;
  private double altura;
  private double lado;

  // Construtor sem argumentos
  public Triangulo() {
    // inicialização padrão ou vazia
  }

  // Construtor com argumentos
  public Triangulo(double base, double altura, double lado) {
    this.base = base;
    this.altura = altura;
    this.lado = lado;
  }

  // Getter para base
  public double getBase() {
    return base;
  }

  // Setter para base
  public void setBase(double base) {
    this.base = base;
  }

  // Getter para altura
  public double getAltura() {
    return altura;
  }

  // Setter para altura
  public void setAltura(double altura) {
    this.altura = altura;
  }

  // Getter para lado
  public double getLado() {
    return lado;
  }

  // Setter para lado
  public void setLado(double lado) {
    this.lado = lado;
  }

  // Implementação do método para calcular a área
  @Override
  public double calculateArea() {
    return (base * altura) / 2;
  }

  // Implementação do método para calcular o perímetro
  @Override
  public double calculatePerimeter() {
    return lado * 3;
  }

  // Método toString para representação da classe como string
  @Override
  public String toString() {
    return "Square: \n" + "Perimeter: " + calculatePerimeter() + "\n" + "Area: " + calculateArea();
  }
}
