package com.elopez.design.patterns.structurals.decorator.notification.concrete_decorators;

import com.elopez.design.patterns.structurals.decorator.notification.Notification;
import com.elopez.design.patterns.structurals.decorator.notification.NotificationDecorator;

public class SoundNotification extends NotificationDecorator {
    public SoundNotification(Notification notification) {
        super(notification);
    }

    @Override
    public void send() {
        super.send();
        System.out.println("Sound Notification");
    }
}
