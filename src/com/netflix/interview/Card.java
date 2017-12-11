package com.netflix.interview;


import java.util.HashMap;
import java.util.Map;

public class Card {

    int value;
    Map<Character, Integer> nameToValue;

    public Card(char cardId) {
        nameToValue = new HashMap<Character, Integer>();
        nameToValue.put('A', 1);
        nameToValue.put('T', 10);
        nameToValue.put('J', 11);
        nameToValue.put('Q', 12);
        nameToValue.put('K', 13);
        if (nameToValue.containsKey(cardId)) {
            this.value = nameToValue.get(cardId);
        }
        else {
            this.value = cardId - '0';
        }

    }

    public int getValue() {
        return value;
    }

    public int getFaceValue() {
        if (this.value > 10) return 10;
        return this.value;
    }
}
