package com.version01.entities;

import com.version01.entities.GeometricForm;

public class Quadrado implements GeometricForm {
  private double ladoQuadrado;

  // Construtor sem argumentos
  public Quadrado() {
    // inicialização padrão ou vazia
  }

  // Construtor com argumentos
  public Quadrado(double ladoQuadrado) {
    this.ladoQuadrado = ladoQuadrado;
  }

  // Getter para ladoQuadrado
  public double getLadoQuadrado() {
    return ladoQuadrado;
  }

  // Setter para ladoQuadrado
  public void setLadoQuadrado(double ladoQuadrado) {
    this.ladoQuadrado = ladoQuadrado;
  }

  // Implementação do método para calcular a área
  @Override
  public double calculateArea() {
    return ladoQuadrado * ladoQuadrado;
  }

  // Implementação do método para calcular o perímetro
  @Override
  public double calculatePerimeter() {
    return ladoQuadrado * 4;
  }

  // Método toString para representação da classe como string
  @Override
  public String toString() {
    return "Square: \n" + "Perimeter: " + calculatePerimeter() + "\n" + "Area: " + calculateArea();
  }
}
