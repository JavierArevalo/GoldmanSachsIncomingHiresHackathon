package com.mkyong.hashing;

public class EODCashPositionPerCurrency {

    private String tradeDayNum;
    private double net;

    public EODCashPositionPerCurrency(
            String tradeDayNum,
            double net
    ) {
        this.tradeDayNum = tradeDayNum;
        this.net = net;
    }

    public EODCashPositionPerCurrency(
            String tradeDayNum
    ) {
        this(tradeDayNum, 0.0);
    }

    public double getNet() {
        return net;
    }

    public String getTradeDayNum() {
        return tradeDayNum;
    }

    public void print() {
        System.out.println();
        System.out.println("Position entry: ");
        System.out.println("Trade Day Number: " + this.getTradeDayNum());
        System.out.println("Net: " + this.getNet());
        System.out.println();
    }
}
