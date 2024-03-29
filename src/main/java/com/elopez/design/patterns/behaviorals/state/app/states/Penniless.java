package com.elopez.design.patterns.behaviorals.state.app.states;

import com.elopez.design.patterns.behaviorals.state.app.VendingMachine;

public class Penniless implements State {
    private VendingMachine machine;

    public Penniless(VendingMachine machine) {
        this.machine = machine;
    }

    @Override
    public void insertMoney() {
        System.out.println("Money inserted");
        machine.setState(new WithMoney(machine));
    }

    @Override
    public void selectProduct() {
        System.out.println("Please, insert money");
    }

    @Override
    public void deliveryProduct() {
        System.out.println("Please, insert money");
    }

}
