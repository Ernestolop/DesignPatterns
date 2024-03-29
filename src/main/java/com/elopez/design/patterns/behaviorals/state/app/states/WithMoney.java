package com.elopez.design.patterns.behaviorals.state.app.states;

import com.elopez.design.patterns.behaviorals.state.app.VendingMachine;

public class WithMoney implements State {
    private VendingMachine machine;

    public WithMoney(VendingMachine machine) {
        this.machine = machine;
    }

    @Override
    public void insertMoney() {
        System.out.println("There is already money");
    }

    @Override
    public void selectProduct() {
        System.out.println("Selected product");
        machine.setState(new WithProduct(machine));
    }

    @Override
    public void deliveryProduct() {
        System.out.println("Please, select a product");
    }
}
