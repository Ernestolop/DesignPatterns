package com.elopez.design.patterns.structurals.facade.app;

import com.elopez.design.patterns.structurals.facade.library.EmailService;
import com.elopez.design.patterns.structurals.facade.library.SmsService;

public class NotificationService {
    EmailService emailService;
    SmsService smsService;

    public NotificationService() {
        emailService = new EmailService();
        smsService = new SmsService();
    }

    public void sendNotificationByEmail(String mailTo) {
        emailService.sendMail(mailTo);
    }

    public void sendNotificationBySms(String phoneNumber) {
        smsService.sendSms(phoneNumber);
    }
}
