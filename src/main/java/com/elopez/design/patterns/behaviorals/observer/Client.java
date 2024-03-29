package com.elopez.design.patterns.behaviorals.observer;

import com.elopez.design.patterns.behaviorals.observer.app.Notifier;
import com.elopez.design.patterns.behaviorals.observer.app.User;

public class Client {
    public static void main(String[] args) {
        Notifier notifier = new Notifier();

        User user1 = new User("Ernesto");
        User user2 = new User("Daniel");

        notifier.addObserver(user1);
        notifier.addObserver(user2);

        notifier.sendNotification("Product disponible");
    }
}
