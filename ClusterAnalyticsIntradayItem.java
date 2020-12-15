package com.mkyong.hashing;

public class ClusterAnalyticsIntradayItem {

    private int clusterId;
    private String clusterLabel;
    private double advPercentage;
    private double grossPercentage;

    public ClusterAnalyticsIntradayItem(
            int clusterId,
            String clusterLabel,
            double advPercentage,
            double grossPercentage
    ) {
        this.clusterId = clusterId;
        this.clusterLabel = clusterLabel;
        this.advPercentage = advPercentage;
        this.grossPercentage = grossPercentage;
    }

    public ClusterAnalyticsIntradayItem(
            int clusterId,
            double advPercentage,
            double grossPercentage
    ) {
        this(clusterId, "", advPercentage, grossPercentage);
    }

    public String getClusterLabel() {
        return clusterLabel;
    }

    public int getClusterId() {
        return clusterId;
    }

    public double getGrossPercentage() {
        return grossPercentage;
    }

    public double getAdvPercentage() {
        return advPercentage;
    }

    public void print() {
        System.out.println();
        System.out.println("Cluster Id: " + this.getClusterId());
        System.out.println("Adv Percentage Label: " + this.getAdvPercentage());
        System.out.println("Gross Percentage: " + this.getGrossPercentage());
        System.out.println();
    }
}
