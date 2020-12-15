package com.mkyong.hashing;

public class ClusterAnalytics {

    private int clusterId;
    private String clusterLabel;
    private double gross;
    private double totalCostBps;
    private double totalRiskBps;

    public ClusterAnalytics(
            int clusterId,
            String clusterLabel,
            double gross,
            double totalCostBps,
            double totalRiskBps
    ) {
        this.clusterId = clusterId;
        this.clusterLabel = clusterLabel;
        this.gross = gross;
        this.totalCostBps = totalCostBps;
        this.totalRiskBps = totalRiskBps;
    }

    public int getClusterId() {
        return clusterId;
    }

    public String getClusterLabel() {
        return clusterLabel;
    }

    public double getGross() {
        return gross;
    }

    public double getTotalRiskBps() {
        return totalRiskBps;
    }

    public double getTotalCostBps() {
        return totalCostBps;
    }

    public void print() {
        System.out.println();
        System.out.println("Cluster Analytics Entry: ");
        System.out.println();
        System.out.println("Cluster Id: " + this.getClusterId());
        System.out.println("Cluster Label: " + this.getClusterLabel());
        System.out.println("Gross: " + this.getGross());
        System.out.println("Total Cost BPS: " + this.getTotalCostBps());
        System.out.println("Total Risk BPS: " + this.getTotalRiskBps());
        System.out.println();
    }
}
