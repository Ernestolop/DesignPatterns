package com.elopez.design.patterns.behaviorals.mediator.chat_app.mediator;

import java.util.ArrayList;
import java.util.List;

import com.elopez.design.patterns.behaviorals.mediator.chat_app.users.User;

public class ChatRoom implements ChatMediator {
    List<User> users;

    public ChatRoom() {
        users = new ArrayList<>();
    }

    public void addUser(User user) {
        users.add(user);
    }

    @Override
    public void sendMessage(String msg, User user) {
        for (User u : users) {
            if (u != user) {
                u.receive(msg);
            }
        }
    }
}
