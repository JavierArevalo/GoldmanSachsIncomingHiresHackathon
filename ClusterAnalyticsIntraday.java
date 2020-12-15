package com.mkyong.hashing;


import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class ClusterAnalyticsIntraday {

    private LocalDateTime time;
    private int periodNumber;
    private int tradeDayNumber;
    private ClusterAnalyticsIntradayItem[] clusters;

    public ClusterAnalyticsIntraday(
            LocalDateTime time,
            int periodNumber,
            int tradeDayNumber,
            ClusterAnalyticsIntradayItem[] clusters
    ) {
        this.time = time;
        this.periodNumber = periodNumber;
        this.tradeDayNumber = tradeDayNumber;
        this.clusters = clusters;
    }

    public LocalDateTime getTime() {
        return time;
    }

    public int getTradeDayNumber() {
        return tradeDayNumber;
    }

    public int getPeriodNumber() {
        return periodNumber;
    }

    public ClusterAnalyticsIntradayItem[] getClusters() {
        return clusters;
    }

    public void print() {

        System.out.println();
        System.out.println("Cluster Analytics Intraday: ");
        System.out.println();
        DateTimeFormatter formatter = DateTimeFormatter.ISO_DATE_TIME;

        LocalDateTime periodStartTime = this.getTime();
        String timeAsString = periodStartTime.format(formatter);
        System.out.println("Time: " + timeAsString);

        System.out.println("Period Number: " + this.getPeriodNumber());
        System.out.println("Trade Day Number: " + this.getTradeDayNumber());

        System.out.println("Clusters: ");
        for (int i = 0; i < clusters.length; i++) {
            System.out.println();
            System.out.println("Cluster Entry: ");
            ClusterAnalyticsIntradayItem cur = clusters[i];
            cur.print();
        }
        System.out.println();
        System.out.println();

    }
}
