package com.elopez.design.patterns.behaviorals.state.app;

import com.elopez.design.patterns.behaviorals.state.app.states.Penniless;
import com.elopez.design.patterns.behaviorals.state.app.states.State;

public class VendingMachine {
    private State state;

    public VendingMachine() {
        state = new Penniless(this);
    }

    public void setState(State state) {
        this.state = state;
    }

    public void insertMoney() {
        state.insertMoney();
    }

    public void selectProduct() {
        state.selectProduct();
    }

    public void deliveryProduct() {
        state.deliveryProduct();
    }

}
