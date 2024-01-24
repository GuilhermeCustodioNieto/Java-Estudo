package com.version03;

// Bloco Finally

public class Main {

  public static void main(String[] args) {
    login();
  }

  public static void login() {
    try {
      System.out.println("Login feito...");
    } catch (Exception e) {
      e.printStackTrace();
    } finally {
      System.out.println("Processo finalizado");
    }
  }
}
