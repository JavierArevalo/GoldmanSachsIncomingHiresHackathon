package com.mkyong.hashing;

public class Analytics {

    private PortfolioChar portfolioChar;
    private AssetAnalyticsDaily[] assetAnalyticsDailies;
    private PortfolioAnalyticsDaily[] portfolioAnalyticsDailies;

    private FactorAnalyticsIntraday factorAnalyticsIntraday;
    private AssetAnalyticsIntraday[] assetAnalyticsIntradays;
    private PortfolioAnalyticsIntraday[] portfolioAnalyticsIntradays;
    private ClusterAnalyticsIntraday[] clusterAnalyticsIntradays;
    private ClusterAnalytics[] clusterAnalytics;
    private EndofDayCashPositions[] eodCashPositions;

    public Analytics(
            PortfolioChar portfolioChar,
            AssetAnalyticsDaily[] assetAnalyticsDailies,
            PortfolioAnalyticsDaily[] portfolioAnalyticsDailies,
            FactorAnalyticsIntraday factorAnalyticsIntraday,
            AssetAnalyticsIntraday[] assetAnalyticsIntradays,

            PortfolioAnalyticsIntraday[] portfolioAnalyticsIntradays,
            ClusterAnalyticsIntraday[] clusterAnalyticsIntradays,
            ClusterAnalytics[] clusterAnalytics,
            EndofDayCashPositions[] eodCashPositions
    ) {
        this.portfolioChar = portfolioChar;
        this.assetAnalyticsDailies = assetAnalyticsDailies;
        this.portfolioAnalyticsDailies = portfolioAnalyticsDailies;
        this.factorAnalyticsIntraday = factorAnalyticsIntraday;
        this.assetAnalyticsIntradays = assetAnalyticsIntradays;

        this.portfolioAnalyticsIntradays = portfolioAnalyticsIntradays;
        this.clusterAnalyticsIntradays = clusterAnalyticsIntradays;
        this.clusterAnalytics = clusterAnalytics;
        this.eodCashPositions = eodCashPositions;
    }

    public AssetAnalyticsDaily[] getAssetAnalyticsDailies() {
        return assetAnalyticsDailies;
    }

    public AssetAnalyticsIntraday[] getAssetAnalyticsIntradays() {
        return assetAnalyticsIntradays;
    }

    public ClusterAnalytics[] getClusterAnalytics() {
        return clusterAnalytics;
    }

    public ClusterAnalyticsIntraday[] getClusterAnalyticsIntradays() {
        return clusterAnalyticsIntradays;
    }

    public EndofDayCashPositions[] getEodCashPositions() {
        return eodCashPositions;
    }

    public FactorAnalyticsIntraday getFactorAnalyticsIntraday() {
        return factorAnalyticsIntraday;
    }

    public PortfolioAnalyticsDaily[] getPortfolioAnalyticsDailies() {
        return portfolioAnalyticsDailies;
    }

    public PortfolioAnalyticsIntraday[] getPortfolioAnalyticsIntradays() {
        return portfolioAnalyticsIntradays;
    }

    public PortfolioChar getPortfolioChar() {
        return portfolioChar;
    }



    public void print() {
        System.out.println();
        System.out.println("Analytics: ");
        System.out.println();

        System.out.println("Portfolio Characteristics: ");
        portfolioChar.print();
        System.out.println();

        System.out.println();
        for (int i = 0; i < assetAnalyticsDailies.length; i++) {
            AssetAnalyticsDaily cur = assetAnalyticsDailies[i];
            cur.print();
        }
        System.out.println();

        System.out.println();
        for (int i = 0; i < portfolioAnalyticsDailies.length; i++) {
            PortfolioAnalyticsDaily cur = portfolioAnalyticsDailies[i];
            cur.print();
        }
        System.out.println();

        System.out.println("Factor Analytics Intraday: ");
        System.out.println();
        factorAnalyticsIntraday.print();
        System.out.println();

        System.out.println("Asset Analytics Intraday: ");
        for (int i = 0; i < assetAnalyticsIntradays.length; i++) {
            AssetAnalyticsIntraday cur = assetAnalyticsIntradays[i];
            cur.print();
        }
        System.out.println();

        //Consider deleting since it is empty or every entry is null?
        System.out.println();
        for (int i = 0; i < portfolioAnalyticsIntradays.length; i++) {
            PortfolioAnalyticsIntraday cur = portfolioAnalyticsIntradays[i];
            if (cur != null) {
                cur.print();
            }
        }
        System.out.println();

        System.out.println();
        for (int i = 0; i < clusterAnalyticsIntradays.length; i++) {
            ClusterAnalyticsIntraday cur = clusterAnalyticsIntradays[i];
            cur.print();
        }
        System.out.println();

        System.out.println("Cluster Analytics: ");
        for (int i = 0; i < clusterAnalytics.length; i++) {
            ClusterAnalytics cur = clusterAnalytics[i];
            cur.print();
        }
        System.out.println();


        //Consider deleting since it is empty or every entry is null?
        System.out.println();
        for (int i = 0; i < eodCashPositions.length; i++) {
            EndofDayCashPositions cur = eodCashPositions[i];
            if (cur != null) {
                cur.print();
            }
        }
        System.out.println();

    }
}
