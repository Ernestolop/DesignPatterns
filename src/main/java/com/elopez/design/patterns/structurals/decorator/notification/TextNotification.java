package com.elopez.design.patterns.structurals.decorator.notification;

public class TextNotification implements Notification {
    private String message;

    public TextNotification(String message) {
        this.message = message;
    }

    @Override
    public void send() {
        System.out.println("Sending text notification: " + message);
    }
}
