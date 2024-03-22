package com.elopez.design.patterns.behaviorals.command;

import com.elopez.design.patterns.behaviorals.command.app.RemoteControl;
import com.elopez.design.patterns.behaviorals.command.app.command.Command;
import com.elopez.design.patterns.behaviorals.command.app.command.TurnOn;
import com.elopez.design.patterns.behaviorals.command.app.service.Receiver;

public class Client {
    public static void main(String[] args) {
        // Create a receiver
        Receiver receiver = new Receiver("TV");

        // Create a command and pass the receiver to it
        Command turnOn = new TurnOn(receiver);

        // Create a invoker
        RemoteControl remoteControl = new RemoteControl();

        // Set the command to the invoker
        remoteControl.setCommand(turnOn);

        // Execute the command
        remoteControl.pressButton();
    }
}
