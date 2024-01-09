package com.version01.core;

import com.version01.entities.Person;

public class Main {

  public static void main(String[] args) {
  Person person = new Person("Guilherme", 16, 1.75, 65.0);
  System.out.println(person.toString());
  }

}
