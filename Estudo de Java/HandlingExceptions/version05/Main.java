package com.version05;

//Múltiplos tratamentos em uma única linha

public class Main {
  public static void main(String[] args) {
    calculator(2, 5);
  }

  public static void calculator(int num1, int num2) {
    try {
      System.out.println(num1 + num2);
    } catch (ArithmeticException | NullPointerException | NumberFormatException e) {
      e.printStackTrace();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
