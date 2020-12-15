package com.mkyong.hashing;
public class TradePosition {

    private String name;
    private int amount;

    public TradePosition(String name, int amount) {
        this.name = name;
        this.amount = amount;
    }

    public String getAssetName() {
        return this.name;
    }

    public int getAmount() {
        return this.amount;
    }

    public void addAsset(int amountToAdd) {
        this.amount = this.amount + amountToAdd;
    }



}
