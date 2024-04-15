package com.day3.lab2.entities.enums;

public enum Naipe {
    OUROS("Ouros"),
    COPAS("Copas"),
    ESPADAS( "Espadas"),
    PAUS("Paus");

    private String textNaipe;

    Naipe(String textNaipe) {
        this.textNaipe = textNaipe;
    }
}
