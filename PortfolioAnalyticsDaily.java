package com.mkyong.hashing;

public class PortfolioAnalyticsDaily {

    private int tradeDayNumber;
    private double estimatedCostBps;
    private double completionRatePercent;
    private double meanExpectedCostVersusBenchmark;

    public PortfolioAnalyticsDaily(
            int tradeDayNumber,
            double estimatedCostBps,
            double completionRatePercent,
            double meanExpectedCostVersusBenchmark
    ) {
        this.tradeDayNumber = tradeDayNumber;
        this.estimatedCostBps = estimatedCostBps;
        this.completionRatePercent = completionRatePercent;
        this.meanExpectedCostVersusBenchmark = meanExpectedCostVersusBenchmark;
    }

    public PortfolioAnalyticsDaily(
            int tradeDayNumber,
            double estimatedCostBps,
            double completionRatePercent
    ) {
        this(tradeDayNumber, estimatedCostBps, completionRatePercent, 0.0);
    }

    public int getTradeDayNumber() {
        return tradeDayNumber;
    }

    public double getCompletionRatePercent() {
        return completionRatePercent;
    }

    public double getEstimatedCostBps() {
        return estimatedCostBps;
    }

    public double getMeanExpectedCostVersusBenchmark() {
        return meanExpectedCostVersusBenchmark;
    }

    public void print() {

        System.out.println();
        System.out.println("Portfolio Analytics Daily: ");
        System.out.println();
        System.out.println("Trade Day Number: " + tradeDayNumber);
        System.out.println("Estimated Cost BPS: " + this.getEstimatedCostBps());
        System.out.println("Completion Rate Percent: " + this.getCompletionRatePercent());
        System.out.println();
    }
}
