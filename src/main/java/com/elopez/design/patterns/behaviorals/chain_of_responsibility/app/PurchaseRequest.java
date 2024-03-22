package com.elopez.design.patterns.behaviorals.chain_of_responsibility.app;

public class PurchaseRequest {
    private double amount;

    public PurchaseRequest(double amount) {
        this.amount = amount;
    }

    public double getAmount() {
        return amount;
    }
}
