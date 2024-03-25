package com.elopez.design.patterns.behaviorals.mediator.chat_app.users;

import com.elopez.design.patterns.behaviorals.mediator.chat_app.mediator.ChatMediator;

public class BasicUser extends User{
    public BasicUser(ChatMediator med, String name) {
        super(med, name);
    }

    @Override
    public void send(String msg) {
        System.out.println("Enviando mensaje: " + msg);
        mediator.sendMessage(msg, this);
    }

    @Override
    public void receive(String msg) {
        System.out.println(name + " recibió el mensaje: " + msg);
    }

}
