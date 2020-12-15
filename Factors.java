package com.mkyong.hashing;

public class Factors {

    private String factorName;
    private double exposure;
    private double grossPercentage;

    public Factors(
            String factorName,
            double exposure,
            double grossPercentage
    ) {
        this.factorName = factorName;
        this.exposure = exposure;
        this.grossPercentage = grossPercentage;
    }

    public double getGrossPercentage() {
        return grossPercentage;
    }

    public double getExposure() {
        return exposure;
    }

    public String getFactorName() {
        return factorName;
    }

    public void print() {
        System.out.println();
        System.out.println("Factor name: " + this.getFactorName());
        System.out.println("Exposure: " + this.getExposure());
        System.out.println("Gross Percentage: " + this.getGrossPercentage());
        System.out.println();

    }
}
