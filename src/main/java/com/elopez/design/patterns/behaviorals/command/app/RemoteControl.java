package com.elopez.design.patterns.behaviorals.command.app;

import com.elopez.design.patterns.behaviorals.command.app.command.Command;

public class RemoteControl {
    private Command command;

    public void setCommand(Command command) {
        this.command = command;
    }

    public void pressButton() {
        command.execute();
    }
}
