package com.mkyong.hashing;

public class FactorAnalyticsIntraday {

    private FactorAnalytics[] country;
    private FactorAnalytics[] sector;
    private FactorAnalytics[] domesticChina;
    private FactorAnalytics[] market;
    private FactorAnalytics[] currency;
    private FactorAnalytics[] industry;
    private FactorAnalytics[] risk;
    private FactorAnalytics[] clusterClassification;

    public FactorAnalyticsIntraday(
            FactorAnalytics[] country,
            FactorAnalytics[] sector,
            FactorAnalytics[] domesticChina,
            FactorAnalytics[] market,
            FactorAnalytics[] currency,
            FactorAnalytics[] industry,
            FactorAnalytics[] risk,
            FactorAnalytics[] clusterClassification
    ) {
        this.country = country;
        this.sector = sector;
        this.domesticChina = domesticChina;
        this.market = market;
        this.currency = currency;
        this.industry = industry;
        this.risk = risk;
        this.clusterClassification = clusterClassification;
    }

    public FactorAnalyticsIntraday(
            FactorAnalytics[] country,
            FactorAnalytics[] sector,
            FactorAnalytics[] market,
            FactorAnalytics[] industry,
            FactorAnalytics[] risk
    ) {
        this(country, sector, null, market, null, industry, risk, null);
    }

    public FactorAnalytics[] getClusterClassification() {
        return clusterClassification;
    }

    public FactorAnalytics[] getCountry() {
        return country;
    }

    public FactorAnalytics[] getDomesticChina() {
        return domesticChina;
    }

    public FactorAnalytics[] getCurrency() {
        return currency;
    }

    public FactorAnalytics[] getIndustry() {
        return industry;
    }

    public FactorAnalytics[] getMarket() {
        return market;
    }

    public FactorAnalytics[] getRisk() {
        return risk;
    }

    public FactorAnalytics[] getSector() {
        return sector;
    }

    public void print() {

        System.out.println("Country Factor Analytics: ");
        for (int i = 0; i < country.length; i++) {
            FactorAnalytics cur = country[i];
            cur.print();
        }

        System.out.println("Sector Factor Analytics: ");
        for (int i = 0; i < sector.length; i++) {
            FactorAnalytics cur = sector[i];
            cur.print();
        }

        System.out.println("Market Factor Analytics: ");
        for (int i = 0; i < market.length; i++) {
            FactorAnalytics cur = market[i];
            cur.print();
        }

        System.out.println("Industry Factor Analytics: ");
        for (int i = 0; i < industry.length; i++) {
            FactorAnalytics cur = industry[i];
            cur.print();
        }

        System.out.println("Risk Factor Analytics: ");
        for (int i = 0; i < risk.length; i++) {
            FactorAnalytics cur = risk[i];
            cur.print();
        }
        System.out.println();
        System.out.println();

    }
}
