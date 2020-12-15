package com.mkyong.hashing;

public class Gross {

    private double position;
    private int numberOfAssets;
    private double diagonalRisk;
    private double totalRisk;
    private double factorRisk;
    private double specificRisk;
    private double historicalBeta;
    private double spread;
    private double totalRiskBps;
    private double advAveragePercentage;
    private double advMaxPercentage;

    public Gross (
            double position,
            int numberOfAssets,
            double diagonalRisk,
            double totalRisk,
            double factorRisk,
            double specificRisk,
            double historicalBeta,
            double spread,
            double totalRiskBps,
            double advAveragePercentage,
            double advMaxPercentage
    ) {
        this.position = position;
        this.numberOfAssets = numberOfAssets;
        this.diagonalRisk = diagonalRisk;
        this.totalRisk = totalRisk;
        this.factorRisk = factorRisk;
        this.specificRisk = specificRisk;
        this.historicalBeta = historicalBeta;
        this.spread = spread;
        this.totalRiskBps = totalRiskBps;
        this.advAveragePercentage = advAveragePercentage;
        this.advMaxPercentage = advMaxPercentage;
    }

    public Gross (
            double position,
            int numberOfAssets,
            double historicalBeta,
            double spread,
            double advAveragePercentage,
            double advMaxPercentage
    ) {
        this(
                position,
                numberOfAssets,
                0.0,
                0.0,
                0.0,
                0.0,
                historicalBeta,
                spread,
                0.0,
                advAveragePercentage,
                advMaxPercentage
        );

    }

    public double getAdvAveragePercentage() {
        return advAveragePercentage;
    }

    public double getAdvMaxPercentage() {
        return advMaxPercentage;
    }

    public double getDiagonalRisk() {
        return diagonalRisk;
    }

    public double getFactorRisk() {
        return factorRisk;
    }

    public double getHistoricalBeta() {
        return historicalBeta;
    }

    public double getPosition() {
        return position;
    }

    public double getSpecificRisk() {
        return specificRisk;
    }

    public double getTotalRisk() {
        return totalRisk;
    }

    public double getSpread() {
        return spread;
    }

    public double getTotalRiskBps() {
        return totalRiskBps;
    }

    public int getNumberOfAssets() {
        return numberOfAssets;
    }

    public void print() {
        System.out.println();
        System.out.println("Gross: ");
        System.out.println();
        System.out.println("Position: " + this.getPosition());
        System.out.println("Number of Assets: " + this.getNumberOfAssets());
        System.out.println("Historical Beta : " + this.getHistoricalBeta());
        System.out.println("Spread: " + this.getSpread());
        System.out.println("Adv Average Percentage: " + this.getAdvAveragePercentage());
        System.out.println("Adv Max Percentage: " + this.getAdvMaxPercentage());
        System.out.println();
    }

}

