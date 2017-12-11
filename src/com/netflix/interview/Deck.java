package com.netflix.interview;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Deck {
    List<Card> cards;

    public Deck() {
        this.cards = new LinkedList<>();
    }

    public List<Card> getCards() {
        return cards;
    }

    public void addCards(Card card, int n) {
        for (int i = 0; i < n; i++) {
            this.cards.add(card);
        }
    }


    public void shuffle() {
        Collections.shuffle(cards);
    }

    public Card draw() {
        Card card = cards.get(cards.size() - 1);
        cards.remove(cards.size() - 1);
        return card;
    }
 }
