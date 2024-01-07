package com.version01.entities;

public class Person {
    private String name;
    private Integer age;
    private Double height;
    private Double weight;

    // Construtores
    public Person() {
    }

    public Person(String name, Integer age, Double height, Double weight) {
        this.name = name;
        this.age = age;
        this.height = height;
        this.weight = weight;
    }

    // Getters
    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    public Double getHeight() {
        return height;
    }

    public Double getWeight() {
        return weight;
    }

    // Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public void setHeight(Double height) {
        this.height = height;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    // toString
    @Override
    public String toString() {
        return "Person{" +
                "name=" + name +
                ", age=" + age +
                ", height=" + height +
                ", weight=" + weight +
                '}';
    }
}