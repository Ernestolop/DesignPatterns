package com.elopez.design.patterns.structurals.decorator.notification;

public abstract class NotificationDecorator implements Notification {
    protected Notification notification;

    public NotificationDecorator(Notification notification) {
        this.notification = notification;
    }

    @Override
    public void send() {
        notification.send();
    }
}
