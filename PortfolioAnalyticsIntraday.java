package com.mkyong.hashing;


import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class PortfolioAnalyticsIntraday {

    private int periodNumber;
    private int tradeDayNumber;
    private LocalDateTime periodStartTime;
    private LocalDateTime periodEndTime;
    private LocalDateTime time;
    private double sell;
    private double buy;
    private double gross;
    private double net;
    private double tradeAbsolute;
    private double totalCostSpread;
    private double totalCostVolatility;
    private double totalCostPermanent;
    private double totalCost;
    private double advAveragePercentage;
    private double totalRisk;
    private double factorRisk;
    private double specificRisk;
    private double diagonalRisk;
    private double totalRiskBps;
    private double tradePercentageCumulativeSum;
    private double netPeriodPercentage;
    private double totalCostBudgetPercentage;
    private double totalRiskPercentage;

    public PortfolioAnalyticsIntraday(
            int periodNumber,
            int tradeDayNumber,
            LocalDateTime periodStartTime,
            LocalDateTime periodEndTime,
            LocalDateTime time,
            double sell,
            double buy,
            double gross,
            double net,
            double tradeAbsolute,
            double totalCostSpread,
            double totalCostVolatility,
            double totalCostPermanent,
            double totalCost,
            double advAveragePercentage,
            double totalRisk,
            double factorRisk,
            double specificRisk,
            double diagonalRisk,
            double totalRiskBps,
            double tradePercentageCumulativeSum,
            double netPeriodPercentage,
            double totalCostBudgetPercentage,
            double totalRiskPercentage
    ) {

        this.periodNumber = periodNumber;
        this.tradeDayNumber = tradeDayNumber;
        this.periodStartTime = periodStartTime;
        this.periodEndTime = periodEndTime;
        this.time = time;
        this.sell = sell;
        this.buy = buy;
        this.gross = gross;
        this.net = net;
        this.tradeAbsolute = tradeAbsolute;
        this.totalCostSpread = totalCostSpread;
        this.totalCostVolatility = totalCostVolatility;
        this.totalCostPermanent = totalCostPermanent;
        this.totalCost = totalCost;
        this.advAveragePercentage = advAveragePercentage;
        this.totalRisk = totalRisk;
        this.factorRisk = factorRisk;
        this.specificRisk = specificRisk;
        this.diagonalRisk = diagonalRisk;
        this.totalRiskBps = totalRiskBps;
        this.tradePercentageCumulativeSum = tradePercentageCumulativeSum;
        this.netPeriodPercentage = netPeriodPercentage;
        this.totalCostBudgetPercentage = totalCostBudgetPercentage;
        this.totalRiskPercentage = totalRiskPercentage;
    }

    public PortfolioAnalyticsIntraday(
            int periodNumber,
            int tradeDayNumber,
            LocalDateTime periodStartTime,
            LocalDateTime periodEndTime,
            LocalDateTime time,
            double sell,
            double buy,
            double gross,
            double net,
            double tradeAbsolute,
            double totalCostSpread,
            double totalCostVolatility,
            double totalCostPermanent,
            double totalCost,
            double advAveragePercentage,
            double totalRisk,
            double factorRisk,
            double specificRisk,
            double diagonalRisk,
            double totalRiskBps,
            double netPeriodPercentage

    ) {
        this.periodNumber = periodNumber;
        this.tradeDayNumber = tradeDayNumber;
        this.periodStartTime = periodStartTime;
        this.periodEndTime = periodEndTime;
        this.time = time;
        this.sell = sell;
        this.buy = buy;
        this.gross = gross;
        this.net = net;
        this.tradeAbsolute = tradeAbsolute;
        this.totalCostSpread = totalCostSpread;
        this.totalCostVolatility = totalCostVolatility;
        this.totalCostPermanent = totalCostPermanent;
        this.totalCost = totalCost;
        this.advAveragePercentage = advAveragePercentage;
        this.totalRisk = totalRisk;
        this.factorRisk = factorRisk;
        this.specificRisk = specificRisk;
        this.diagonalRisk = diagonalRisk;
        this.totalRiskBps = totalRiskBps;
        this.netPeriodPercentage = netPeriodPercentage;

    }

    public int getPeriodNumber() {
        return periodNumber;
    }

    public int getTradeDayNumber() {
        return tradeDayNumber;
    }

    public LocalDateTime getPeriodEndTime() {
        return periodEndTime;
    }

    public LocalDateTime getPeriodStartTime() {
        return periodStartTime;
    }

    public LocalDateTime getTime() {
        return time;
    }

    public double getTotalCost() {
        return totalCost;
    }

    public double getTotalRisk() {
        return totalRisk;
    }

    public double getTotalRiskBps() {
        return totalRiskBps;
    }

    public double getSpecificRisk() {
        return specificRisk;
    }

    public double getFactorRisk() {
        return factorRisk;
    }

    public double getDiagonalRisk() {
        return diagonalRisk;
    }

    public double getAdvAveragePercentage() {
        return advAveragePercentage;
    }

    public double getBuy() {
        return buy;
    }

    public double getGross() {
        return gross;
    }

    public double getNet() {
        return net;
    }

    public double getSell() {
        return sell;
    }

    public double getNetPeriodPercentage() {
        return netPeriodPercentage;
    }

    public double getTotalCostPermanent() {
        return totalCostPermanent;
    }

    public double getTotalCostSpread() {
        return totalCostSpread;
    }

    public double getTotalCostVolatility() {
        return totalCostVolatility;
    }

    public double getTradeAbsolute() {
        return tradeAbsolute;
    }

    public double getTotalCostBudgetPercentage() {
        return totalCostBudgetPercentage;
    }

    public double getTradePercentageCumulativeSum() {
        return tradePercentageCumulativeSum;
    }

    public double getTotalRiskPercentage() {
        return totalRiskPercentage;
    }

    public void print() {
        System.out.println();
        System.out.println("Portfolio Analytics Intraday: ");
        System.out.println();
        System.out.println("Period Number: " + this.getPeriodNumber());
        System.out.println("Trade Day Number" + this.getTradeDayNumber());

        DateTimeFormatter formatter = DateTimeFormatter.ISO_DATE_TIME;

        LocalDateTime periodStartTime = this.getPeriodStartTime();
        String startDateAsString = periodStartTime.format(formatter);
        System.out.println("Period Start Time: " + startDateAsString);

        LocalDateTime periodEndTime = this.getPeriodEndTime();
        String endDateAsString = periodEndTime.format(formatter);
        System.out.println("Period End Time: " + endDateAsString);

        LocalDateTime time = this.getTime();
        String timeAsString = time.format(formatter);
        System.out.println("Time: " + timeAsString);

        System.out.println("Sell: " + this.getSell());
        System.out.println("Buy: " + this.getBuy());
        System.out.println("Gross: " + this.getGross());
        System.out.println("Net: " + this.getNet());

        System.out.println("Trade Absolute: " + this.getTradeAbsolute());
        System.out.println("Total Cost Spread: " + this.getTotalCostSpread());
        System.out.println("Total Cost Volatility: " + this.getTotalCostVolatility());
        System.out.println("Total Cost Permanent: " + this.getTotalCostPermanent());
        System.out.println("Total Cost: " + this.getTotalCost());

        System.out.println("Adv Average Percentage: " + this.getAdvAveragePercentage());
        System.out.println("Total Risk: " + this.getTotalRisk());
        System.out.println("Factor Risk: " + this.getFactorRisk());
        System.out.println("Specific Risk: " + this.getSpecificRisk());
        System.out.println("Diagonal Risk: " + this.getDiagonalRisk());
        System.out.println("Total Risk BPS: " + this.getTotalRiskBps());
        System.out.println("Net Period Percentage: " + this.getNetPeriodPercentage());
        System.out.println();

    }


}


