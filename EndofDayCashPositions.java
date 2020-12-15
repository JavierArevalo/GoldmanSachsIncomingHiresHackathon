package com.mkyong.hashing;

public class EndofDayCashPositions {

    private String currency;
    private EODCashPositionPerCurrency[] eodCashPositionPerCurrencies;

    public EndofDayCashPositions(
            String currency,
            EODCashPositionPerCurrency[] eodCashPositionsPerCurrencies
    ) {
        this.currency = currency;
        this.eodCashPositionPerCurrencies = eodCashPositionsPerCurrencies;
    }

    public EODCashPositionPerCurrency[] getEodCashPositionPerCurrencies() {
        return eodCashPositionPerCurrencies;
    }

    public String getCurrency() {
        return currency;
    }

    public void print() {
        System.out.println();
        System.out.println("End of Day Cash Positions: ");
        System.out.println();
        System.out.println("Currency: " + this.getCurrency());
        System.out.println("Positions: ");
        for (int i = 0; i < eodCashPositionPerCurrencies.length; i++) {
            EODCashPositionPerCurrency cur = eodCashPositionPerCurrencies[i];
            cur.print();
        }
        System.out.println();
        System.out.println();
    }
}
