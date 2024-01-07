package com.version02.core;

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    StringBuilder builder = new StringBuilder();

    for (int i = 0; i <= 5; i++) {
      String str = scan.nextLine();
      builder.append(str);
    }

    System.out.println("Text: " + builder);
    builder.reverse();
    System.out.println("Reverse text: " + builder);
    builder.reverse();
    System.out.println("Substring text: " + builder.substring(3, 5));
    System.out.println("Deleted Text: " + builder.delete(0, 3));
  }
}
