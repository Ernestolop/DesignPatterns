package com.elopez.design.patterns.behaviorals.mediator.chat_app.users;

import com.elopez.design.patterns.behaviorals.mediator.chat_app.mediator.ChatMediator;

public abstract class User {
    protected ChatMediator mediator;
    protected String name;

    protected User(ChatMediator med, String name) {
        this.mediator = med;
        this.name = name;
    }

    public abstract void send(String msg);
    public abstract void receive(String msg);
}
