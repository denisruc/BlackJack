package com.netflix.interview;

public class Game {

    private Deck deck;

    public Game() {
       setup();
    }


    private void setup() {
        deck = new Deck();
        for (int i = 1; i <= 10; i++) {
            deck.addCards(new Card((char)i), 4);
        }
        deck.addCards(new Card('J'), 4);
        deck.addCards(new Card('Q'), 4);
        deck.addCards(new Card('K'), 4);

        Player player = new Player(this.deck);
        Dealer dealer = new Dealer(this.deck);

        System.out.printf("Dealer: [%c][%c]");
    }
 }
