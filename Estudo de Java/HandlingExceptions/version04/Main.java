package com.version04;

// tratamento de Múltiplas Excessões 


public class Main {

  public static void main(String[] args) {
    calculator(1, 5);
  }

  public static void calculator(int num1, int num2) {
    try {
      System.out.println(num1 + num2);
    } catch (ArithmeticException e) {
      e.printStackTrace();
    } catch (NullPointerException e) {
      e.printStackTrace();
    } catch (NumberFormatException e) {
      e.printStackTrace();
    } catch (RuntimeException e) {
      e.printStackTrace();
    }
  }
}
