package com.mkyong.hashing;

import java.time.LocalDateTime;

public class PreTradeOptimizationResultMock {

    private String createdById;
    private LocalDateTime createdTime;
    private Entitlements entitlements;
    private String id;
    private String lastUpdatedById;
    private LocalDateTime lastUpdatedTime;
    private String ownerId;
    private Analytics analytics;
    private String status;

    public PreTradeOptimizationResultMock(
            String createdById,
            LocalDateTime createdTime,
            Entitlements entitlements,
            String id,
            String lastUpdatedById,
            LocalDateTime lastUpdatedTime,
            String ownerId,
            Analytics analytics,
            String status) {

        this.createdById = createdById;
        this.createdTime = createdTime;
        this.entitlements = entitlements;
        this.id = id;
        this.lastUpdatedById = lastUpdatedById;
        this.lastUpdatedTime = lastUpdatedTime;
        this.ownerId = ownerId;
        this.analytics = analytics;
        this.status = status;
    }

    public PreTradeOptimizationResultMock(
            String createdById,
            Entitlements entitlements,
            String id,
            String ownerId,
            String status,
            Analytics analytics
    ) {
        this(createdById, null, entitlements, id, null, null, ownerId, analytics, status);
    }

    public void print() {
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println("Pre Trade Optimization Response: ");
        System.out.println();
        System.out.println("Created by Id: " + this.getCreatedById());
        System.out.println("Entitlements: ");
        this.getEntitlements().print();
        System.out.println("Id: " + this.getId());
        System.out.println("Owner Id: " + this.getOwnerId());
        System.out.println("Status: " + this.getStatus());
        System.out.println("Analytics: ");
        this.getAnalytics().print();
    }

    public Analytics getAnalytics() {
        return analytics;
    }

    public Entitlements getEntitlements() {
        return entitlements;
    }

    public LocalDateTime getCreatedTime() {
        return createdTime;
    }



    public LocalDateTime getLastUpddatedTime() {
        return lastUpdatedTime;
    }

    public String getCreatedById() {
        return createdById;
    }

    public String getLastUpdatedById() {
        return lastUpdatedById;
    }

    public String getId() {
        return id;
    }

    public String getOwnerId() {
        return ownerId;
    }

    public String getStatus() {
        return status;
    }


}
