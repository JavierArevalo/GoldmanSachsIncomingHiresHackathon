package com.mkyong.hashing;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class AssetAnalyticsIntraday {

    private int periodNumber;
    private int tradeDayNumber;
    private LocalDateTime periodStartTime;
    private LocalDateTime periodEndTime;
    private boolean isTrading;
    private String assetId;
    private double volume;
    private double mcr;
    private String region;

    public AssetAnalyticsIntraday(
            int periodNumber,
            int tradeDayNumber,
            LocalDateTime periodStartTime,
            LocalDateTime periodEndTime,
            boolean isTrading,
            String assetId,
            double volume,
            double mcr,
            String region
    ) {
        this.periodNumber = periodNumber;
        this.tradeDayNumber = tradeDayNumber;
        this.periodStartTime = periodStartTime;
        this.periodEndTime = periodEndTime;
        this.isTrading = isTrading;
        this.assetId = assetId;
        this.volume = volume;
        this.mcr = mcr;
        this.region = region;
    }

    public LocalDateTime getPeriodStartTime() {
        return periodStartTime;
    }

    public LocalDateTime getPeriodEndTime() {
        return periodEndTime;
    }

    public int getTradeDayNumber() {
        return tradeDayNumber;
    }

    public int getPeriodNumber() {
        return periodNumber;
    }

    public String getAssetId() {
        return assetId;
    }

    public boolean isTrading() {
        return isTrading;
    }

    public double getMcr() {
        return mcr;
    }

    public double getVolume() {
        return volume;
    }

    public String getRegion() {
        return region;
    }



    public void print() {
        System.out.println();
        System.out.println("Asset Analytics Intraday entry: ");
        System.out.println();
        System.out.println("Period Number: " + this.getPeriodNumber());
        System.out.println("Trade Day Number: " + this.getTradeDayNumber());


        DateTimeFormatter formatter = DateTimeFormatter.ISO_DATE_TIME;

        LocalDateTime periodStartTime = this.getPeriodStartTime();
        String startDateAsString = periodStartTime.format(formatter);
        System.out.println("Period Start Time: " + startDateAsString);

        LocalDateTime periodEndTime = this.getPeriodEndTime();
        String endDateAsString = periodEndTime.format(formatter);
        System.out.println("Period End Time: " + endDateAsString);

        System.out.println("Is Trading: " + this.isTrading());

        System.out.println("Asset Id: " + this.getAssetId());
        System.out.println("MCR: " + this.getMcr());
        System.out.println("Volume: " + this.getVolume());
        System.out.println("Region: " + this.getRegion());
        System.out.println();

    }


}


