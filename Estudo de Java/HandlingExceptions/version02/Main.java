package com.version02;

import java.io.File;
import java.io.IOException;

//Lançamento de excessões 

public class Main {

  public static void main(String[] args) throws IOException {
    createNewFile();
  }

  public static void createNewFile() throws IOException {
    File file = new File("teste.txt");
    try {
      System.out.println("File created");
    } catch (Exception e) {
      e.printStackTrace();
      throw e;
    }
  }
}
