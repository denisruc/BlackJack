package com.netflix.interview;

import java.util.ArrayList;
import java.util.List;

public class Player {
    List<Card> hand;
    Deck deck;

    public Player(Deck deck) {
        this.hand = new ArrayList<Card>() ;
        this.deck = deck;
    }


    public void addCard(Card card){
        this.hand.add(card);
    }

    public List<Card> getCards() {
        return hand;
    }
}
