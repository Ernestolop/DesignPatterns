package com.elopez.design.patterns.structurals.decorator.notification.concrete_decorators;

import com.elopez.design.patterns.structurals.decorator.notification.Notification;
import com.elopez.design.patterns.structurals.decorator.notification.NotificationDecorator;

public class ColorNotification extends NotificationDecorator {
    public ColorNotification(Notification notification) {
        super(notification);
    }

    @Override
    public void send() {
        super.send();
        System.out.println("Color Notification");
    }
}
