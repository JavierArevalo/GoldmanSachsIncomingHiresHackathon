package com.mkyong.hashing;

public class AssetAnalyticsDaily {

    private String assetId;
    private int tradeDayNumber;
    private double totalCost;
    private double totalRisk;
    private double cratos;
    private int clusterId;
    private String clusterLabel;

    public AssetAnalyticsDaily(
            String assetId,
            int tradeDayNumber,
            double totalCost,
            double totalRisk,
            double cratos,
            int clusterId,
            String clusterLabel
    ) {
        this.assetId = assetId;
        this.tradeDayNumber = tradeDayNumber;
        this.totalCost = totalCost;
        this.totalRisk = totalRisk;
        this.cratos = cratos;
        this.clusterId = clusterId;
        this.clusterLabel = clusterLabel;
    }

    public double getTotalRisk() {
        return totalRisk;
    }

    public double getCratos() {
        return cratos;
    }

    public double getTotalCost() {
        return totalCost;
    }

    public int getClusterId() {
        return clusterId;
    }

    public int getTradeDayNumber() {
        return tradeDayNumber;
    }

    public String getAssetId() {
        return assetId;
    }

    public String getClusterLabel() {
        return clusterLabel;
    }

    public void print() {

        System.out.println();
        System.out.println("Asset Analytics Daily: ");
        System.out.println();
        System.out.println("Asset Id: " + this.getAssetId());
        System.out.println("Trade Day Number: " + this.getTradeDayNumber());
        System.out.println("Total cost: " + this.getTotalCost());
        System.out.println("Total Risk: " + this.getTotalRisk());
        System.out.println("Cratos " + this.getCratos());
        System.out.println("Cluster Id: " + this.getClusterId());
        System.out.println("Cluster Label: " + this.getClusterLabel());
        System.out.println();
        System.out.println();


    }
}
