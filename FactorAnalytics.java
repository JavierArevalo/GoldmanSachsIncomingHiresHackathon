package com.mkyong.hashing;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


public class FactorAnalytics {

    private int periodNumber;
    private int tradeDayNumber;
    private LocalDateTime periodStartTime;
    private LocalDateTime periodEndTime;
    private LocalDateTime time;
    Factors[] factors;


    public FactorAnalytics(
            int periodNumber,
            int tradeDayNumber,
            LocalDateTime periodStartTime,
            LocalDateTime periodEndTime,
            LocalDateTime time,
            Factors[] factors
    ) {
        this.periodNumber = periodNumber;
        this.tradeDayNumber = tradeDayNumber;
        this.periodStartTime = periodStartTime;
        this.periodEndTime = periodEndTime;
        this.time = time;
        this.factors = factors;
    }


    public int getTradeDayNumber() {
        return tradeDayNumber;
    }

    public int getPeriodNumber() {
        return periodNumber;
    }

    public LocalDateTime getPeriodEndTime() {
        return periodEndTime;
    }

    public LocalDateTime getPeriodStartTime() {
        return periodStartTime;
    }

    public LocalDateTime getTime() {
        return time;
    }

    public Factors[] getFactors() {
        return factors;
    }

    public void print() {

        DateTimeFormatter formatter = DateTimeFormatter.ISO_DATE_TIME;

        System.out.println();
        System.out.println("Period Number: " + this.getPeriodNumber());
        System.out.println("Trade Day Number: " + this.getTradeDayNumber());

        LocalDateTime periodStartTime = this.getPeriodStartTime();
        String startDateAsString = periodStartTime.format(formatter);
        System.out.println("Period Start Time: " + startDateAsString);

        LocalDateTime periodEndTime = this.getPeriodEndTime();
        String endDateAsString = periodEndTime.format(formatter);
        System.out.println("Period End Time: " + endDateAsString);

        LocalDateTime time = this.getPeriodStartTime();
        String timeAsString = time.format(formatter);
        System.out.println("Time: " + timeAsString);

        System.out.println("Factors: ");
        Factors[] facts = this.getFactors();
        for (int i = 0; i < facts.length; i++) {
            Factors cur = facts[i];
            cur.print();
        }
        System.out.println();
        System.out.println();



    }
}
