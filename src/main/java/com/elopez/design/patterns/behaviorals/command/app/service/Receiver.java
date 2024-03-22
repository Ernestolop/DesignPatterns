package com.elopez.design.patterns.behaviorals.command.app.service;

public class Receiver {
    private String device;

    public Receiver(String device) {
        this.device = device;
    }

    public void turnOn() {
        System.out.println(device + " is turned on");
    }

    public void turnOff() {
        System.out.println(device + " is turned off");
    }
}