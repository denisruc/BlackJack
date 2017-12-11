package com.netflix.interview;

import java.util.LinkedList;
import java.util.List;

public class Dealer {
    List<Card> cards = new LinkedList<Card>();
    Deck deck;

    public Dealer(Deck deck) {
        this.deck = deck;
        draw();
        draw();
    }

    public Card getVisibleCard() {
        return cards.get(0);
    }

    public int resolve() {
        int sum = 0;
        while (getCardsTotal() <= 17) {
            draw();
        }
        return getCardsTotal();
    }

    private void draw() {
        cards.add(deck.draw());
    }

    public int getCardsTotal() {
        int total = 0;
        for (Card card: cards) {
            total += card.value;
            //TODO Ace resulution
        }
        return total;
    }
}
