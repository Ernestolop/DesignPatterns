package com.elopez.design.patterns.structurals.facade;

import com.elopez.design.patterns.structurals.facade.app.NotificationService;

public class Client {
    public static void main(String[] args) {
        NotificationService notificationService = new NotificationService();
        notificationService.sendNotificationByEmail("correo@correo.com");
        notificationService.sendNotificationBySms("1234567890");
    }
}
