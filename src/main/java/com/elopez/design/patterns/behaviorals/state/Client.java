package com.elopez.design.patterns.behaviorals.state;

import com.elopez.design.patterns.behaviorals.state.app.VendingMachine;

public class Client {
    public static void main(String[] args) {
        VendingMachine machine = new VendingMachine();
        machine.deliveryProduct();
        machine.selectProduct();
        machine.insertMoney();

        machine.deliveryProduct();
        machine.insertMoney();
        machine.selectProduct();

        machine.insertMoney();
        machine.selectProduct();
        machine.deliveryProduct();

        machine.deliveryProduct();
    }
}
