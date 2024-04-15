package com.day3.lab2.entities;

import com.day3.lab2.entities.enums.Naipe;
import com.day3.lab2.entities.enums.Value;

public class Card {
    private Naipe naipe;
    private Value value;
    private boolean isFacingDown;

    public Card(Naipe naipe, Value value, boolean isFacingDown) {
        this.naipe = naipe;
        this.value = value;
        this.isFacingDown = isFacingDown;
    }

    public Naipe getNaipe() {
        return naipe;
    }

    public void setNaipe(Naipe naipe) {
        this.naipe = naipe;
    }

    public Value getValue() {
        return value;
    }

    public void setValue(Value value) {
        this.value = value;
    }

    public boolean isFacingDown() {
        return isFacingDown;
    }

    public void setFacingDown(boolean facingDown) {
        isFacingDown = facingDown;
    }
}
