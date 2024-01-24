package com.version06.entities;

public class Person implements AutoCloseable {
  private String name;
  private Integer age;

  // Construtor padrão
  public Person() {}

  // Construtor com parâmetros
  public Person(String name, Integer age) {
    this.name = name;
    this.age = age;
  }

  // Getter para o nome
  public String getName() {
    return name;
  }

  // Setter para o nome
  public void setName(String name) {
    this.name = name;
  }

  // Getter para a idade
  public Integer getAge() {
    return age;
  }

  // Setter para a idade
  public void setAge(Integer age) {
    this.age = age;
  }

  // Método toString
  @Override
  public String toString() {
    return "Person{" + "name='" + name + '\'' + ", age=" + age + '}';
  }

  // Método close da interface AutoCloseable
  @Override
  public void close() throws Exception {
    System.out.println("Closed Person");
  }
}
