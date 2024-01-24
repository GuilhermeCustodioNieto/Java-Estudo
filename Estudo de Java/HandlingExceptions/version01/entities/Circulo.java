package com.version01.entities;

import com.version01.entities.GeometricForm;

public class Circulo implements GeometricForm {
    private static final double PI = Math.PI;
    private double raio;

    // Construtor sem argumentos
    public Circulo() {
        // inicialização padrão ou vazia
    }

    // Construtor com argumentos
    public Circulo(double raio) {
        this.raio = raio;
    }

    // Getter para PI
    public double getPI() {
        return PI;
    }

    // Getter para raio
    public double getRaio() {
        return raio;
    }

    // Setter para raio
    public void setRaio(double raio) {
        this.raio = raio;
    }

    // Implementação do método para calcular a área
    @Override
    public double calculateArea() {
        return PI * (raio * raio);
    }

    // Implementação do método para calcular o perímetro
    @Override
    public double calculatePerimeter() {
        return 2 * PI * raio;
    }

    // Método toString para representação da classe como string
    @Override
    public String toString() {
        return "Circle: \n" + "Perimeter: " + calculatePerimeter() + "\n" + "Area: " + calculateArea();
    }
}