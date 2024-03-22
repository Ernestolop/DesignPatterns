package com.elopez.design.patterns.behaviorals.chain_of_responsibility.app.handlers;

import com.elopez.design.patterns.behaviorals.chain_of_responsibility.app.Handler;
import com.elopez.design.patterns.behaviorals.chain_of_responsibility.app.PurchaseRequest;

public class Manager implements Handler {
    public static final double ALLOWABLE = 1000;
    private Handler successor;

    public void setSuccessor(Handler successor) {
        this.successor = successor;
    }

    @Override
    public void handleRequest(PurchaseRequest request) {
        if (request.getAmount() < ALLOWABLE) {
            System.out.println("Manager will approve $" + request.getAmount());
        } else if (successor != null) {
            successor.handleRequest(request);
        } else {
            System.out.println("Request for $" + request.getAmount() + " requires an executive meeting!");
        }
    }
    
}
