package com.version06;

import com.version06.entities.Person;

//Try-With-Recources (implementado na classe Person)

public class Main {

  public static void main(String[] args) {
    try (Person person = new Person("Gui", 16)) {
      System.out.println(person.toString());
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
