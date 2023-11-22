package com.example.token2.attributes;

public class Attributes {
    private String att;
    private int amount;

    public Attributes(String att, int amount) {
        this.att = att;
        this.amount = amount;
    }

    public String getAtt() {
        return att;
    }

    public void setAtt(String att) {
        this.att = att;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }
}
