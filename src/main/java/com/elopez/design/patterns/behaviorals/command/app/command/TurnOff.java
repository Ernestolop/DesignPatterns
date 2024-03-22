package com.elopez.design.patterns.behaviorals.command.app.command;

import com.elopez.design.patterns.behaviorals.command.app.service.Receiver;

public class TurnOff implements Command {

    private Receiver receiver;

    public TurnOff(Receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        receiver.turnOff();
    }
}
