package com.elopez.design.patterns.structurals.facade.library;

public class EmailService {
    public void sendMail(String mailTo) {
        System.out.println("Sending an email to " + mailTo);
    }

    public void otherMethod() {
        System.out.println("Other method");
    }

    public void anotherMethod() {
        System.out.println("Another method");
    }

    public void oneMoreMethod() {
        System.out.println("One more method");
    }

    public void yetAnotherMethod() {
        System.out.println("Yet another method");
    }
}
