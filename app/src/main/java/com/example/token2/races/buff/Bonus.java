package com.example.token2.races.buff;

public class Bonus {
    private final String attribute;
    private final int amount;

    public Bonus(String attribute, int amount) {
        this.attribute = attribute;
        this.amount = amount;
    }

    public String getAttribute() {
        return attribute;
    }

    public int getAmount() {
        return amount;
    }
}
