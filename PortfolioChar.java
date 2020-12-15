package com.mkyong.hashing;

public class PortfolioChar {

    private Sell sell;
    private Buy buy;
    private Net net;
    private Gross gross;

    public PortfolioChar(
            Sell sell,
            Buy buy,
            Net net,
            Gross gross
    ) {
        this.sell = sell;
        this.buy = buy;
        this.net = net;
        this.gross = gross;
    }

    public Buy getBuy() {
        return buy;
    }

    public Gross getGross() {
        return gross;
    }

    public Net getNet() {
        return net;
    }

    public Sell getSell() {
        return sell;
    }

    public void print() {

        System.out.println();

        this.getSell().print();
        System.out.println();

        this.getBuy().print();
        System.out.println();

        this.getNet().print();
        System.out.println();

        this.getGross().print();
        System.out.println();

    }
}
