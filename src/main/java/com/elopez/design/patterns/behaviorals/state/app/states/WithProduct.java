package com.elopez.design.patterns.behaviorals.state.app.states;

import com.elopez.design.patterns.behaviorals.state.app.VendingMachine;

public class WithProduct implements State {
    private VendingMachine machine;

    public WithProduct(VendingMachine machine) {
        this.machine = machine;
    }

    @Override
    public void insertMoney() {
        System.out.println("There is already a selected product");
    }

    @Override
    public void selectProduct() {
        System.out.println("There is already a selected product");
    }

    @Override
    public void deliveryProduct() {
        System.out.println("Delivered product");
        machine.setState(new Penniless(machine));

    }
}
