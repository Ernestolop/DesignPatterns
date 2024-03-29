package com.elopez.design.patterns.behaviorals.observer.app.interfaces;

public interface Observable {
    void addObserver(Observer observer);

    void removerObserver(Observer observer);

    void notifyObservers(String message);
}
