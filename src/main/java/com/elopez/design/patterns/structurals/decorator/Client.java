package com.elopez.design.patterns.structurals.decorator;

import com.elopez.design.patterns.structurals.decorator.notification.Notification;
import com.elopez.design.patterns.structurals.decorator.notification.TextNotification;
import com.elopez.design.patterns.structurals.decorator.notification.concrete_decorators.ColorNotification;
import com.elopez.design.patterns.structurals.decorator.notification.concrete_decorators.SoundNotification;

public class Client {
    public static void main(String[] args) {
        System.out.println("====== Basic Notification ======");

        Notification basicNotification = new TextNotification("Hello World");
        basicNotification.send();

        System.out.println("====== Decorated Notifications ======");

        Notification decoratedNotification = new SoundNotification(new ColorNotification(basicNotification));
        decoratedNotification.send();
    }
}
