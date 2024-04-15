package com.day3.lab2.entities;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Shuffle {
    private Deck deck;

    public Shuffle(Deck deck) {
        this.deck = deck;
    }

    public Deck getDeck() {
        return deck;
    }

    public void setDeck(Deck deck) {
        this.deck = deck;
    }

    public void shuffleDeck() {
        Collections.shuffle(deck.cards);
    }

    public Card getCard() {
        return deck.getCard(deck.getCards().size() - 1);

    }

    public String mostrarBaralho(){
        String deckUpdated = "";

        List<Card> cards = deck.getCards();

        for(Card card : cards) {
            deckUpdated = deckUpdated.concat(card.toString());
            deckUpdated = deckUpdated.concat("\n");
        }

        return  deckUpdated;
    }
}
