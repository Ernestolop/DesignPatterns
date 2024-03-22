package com.elopez.design.patterns.behaviorals.chain_of_responsibility.app.handlers;

import com.elopez.design.patterns.behaviorals.chain_of_responsibility.app.Handler;
import com.elopez.design.patterns.behaviorals.chain_of_responsibility.app.PurchaseRequest;

public class Ceo implements Handler{
    private static final double ALLOWABLE = 3000;

    @Override
    public void handleRequest(PurchaseRequest request) {
        if (request.getAmount() < ALLOWABLE) {
            System.out.println("CEO will approve $" + request.getAmount());
        } else {
            System.out.println("Request for $" + request.getAmount() + " requires an executive meeting!");
        }
    }
}
