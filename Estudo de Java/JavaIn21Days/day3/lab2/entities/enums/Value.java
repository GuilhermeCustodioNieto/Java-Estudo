package com.day3.lab2.entities.enums;

public enum Value {
    TWO(2),
    THREE(3),
    FOUR(4),
    FIVE(5),
    SIX(6),
    SEVEN(7),
    HEIGHT(8),
    NINE(9),
    TEN(10),
    JACK(74),
    QUEEN(81),
    KING(75),
    ACE(65);



    private int value;

    Value(int value) {
        this.value = value;
    }
}
