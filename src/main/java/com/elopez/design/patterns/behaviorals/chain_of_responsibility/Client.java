package com.elopez.design.patterns.behaviorals.chain_of_responsibility;

import com.elopez.design.patterns.behaviorals.chain_of_responsibility.app.PurchaseRequest;
import com.elopez.design.patterns.behaviorals.chain_of_responsibility.app.handlers.Director;
import com.elopez.design.patterns.behaviorals.chain_of_responsibility.app.handlers.Manager;

public class Client {
    public static void main(String[] args) {
        PurchaseRequest request = new PurchaseRequest(500);

        Manager manager = new Manager();
        manager.handleRequest(request);
        request = new PurchaseRequest(1500);
        manager.handleRequest(request);
        manager.setSuccessor(new Director());
        manager.handleRequest(request);
        request = new PurchaseRequest(5000);
    }
}
