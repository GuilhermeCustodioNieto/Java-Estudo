package com.emplooyes;

public class Employee {
  private String name;
  private Integer hours;
  private Double valuePerHours;

  public Employee() {}

  public Employee(String name, Integer hours, Double valuePerHours) {
    this.name = name;
    this.hours = hours;
    this.valuePerHours = valuePerHours;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }

  public void setHours(Integer hours) {
    this.hours = hours;
  }

  public Integer getHours() {
    return hours;
  }

  public void setValuePerHours(Double valuePerHours) {
    this.valuePerHours = valuePerHours;
  }

  public Double getValuePerHours() {
    return valuePerHours;
  }
  
  //Funções
  
  public Double payment(){
    return hours * valuePerHours;
  }
}
