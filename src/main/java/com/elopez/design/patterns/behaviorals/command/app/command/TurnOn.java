package com.elopez.design.patterns.behaviorals.command.app.command;

import com.elopez.design.patterns.behaviorals.command.app.service.Receiver;

public class TurnOn implements Command {
    private Receiver receiver;

    public TurnOn(Receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        receiver.turnOn();
    }
}
