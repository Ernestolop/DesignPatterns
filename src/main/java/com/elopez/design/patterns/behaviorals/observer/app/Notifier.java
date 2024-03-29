package com.elopez.design.patterns.behaviorals.observer.app;

import java.util.ArrayList;
import java.util.List;

import com.elopez.design.patterns.behaviorals.observer.app.interfaces.Observable;
import com.elopez.design.patterns.behaviorals.observer.app.interfaces.Observer;

public class Notifier implements Observable {

    private final List<Observer> observers = new ArrayList<>();

    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removerObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers(String message) {
        for (Observer observer : observers) {
            observer.update(message);
        }
    }

    public void sendNotification(String mensaje) {
        System.out.println("sending notification: " + mensaje);
        notifyObservers(mensaje);
    }

}
