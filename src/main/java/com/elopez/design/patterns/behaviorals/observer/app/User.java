package com.elopez.design.patterns.behaviorals.observer.app;

import com.elopez.design.patterns.behaviorals.observer.app.interfaces.Observer;

public class User implements Observer {
    String name;

    public User(String name) {
        this.name = name;
    }

    @Override
    public void update(String message) {
        System.out.println(name.concat(" received notification message: ").concat(message));
    }

}
