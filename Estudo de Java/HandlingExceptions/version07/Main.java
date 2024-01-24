package com.version07;

import com.version07.entities.LoginException;

public class Main {

  public static void main(String[] args) {

    try {
      login();
    } catch (LoginException e) {
      e.printStackTrace();
    }
  }

  public static void login() throws LoginException {
    System.out.println("Login feito");
  }
}
