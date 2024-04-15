package com.day3.lab2.entities;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Deck {
    protected List<Card> cards = new ArrayList<>();

    public Deck(List<Card> cards) {
        this.cards = cards;
    }

    public List<Card> getCards() {
        return cards;
    }

    public void setCards(List<Card> cards) {
        this.cards = cards;
    }

    public Card getCard(int index) {
        return cards.get(index);
    }

    public void addCard(Card card) {
        cards.add(card);
    }
}
