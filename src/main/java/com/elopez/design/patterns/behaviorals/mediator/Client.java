package com.elopez.design.patterns.behaviorals.mediator;

import com.elopez.design.patterns.behaviorals.mediator.chat_app.mediator.ChatRoom;
import com.elopez.design.patterns.behaviorals.mediator.chat_app.users.BasicUser;
import com.elopez.design.patterns.behaviorals.mediator.chat_app.users.User;

public class Client {
    public static void main(String[] args) {
        ChatRoom mediator = new ChatRoom();

        User user1 = new BasicUser(mediator, "User 1");
        User user2 = new BasicUser(mediator, "User 2");
        User user3 = new BasicUser(mediator, "User 3");

        mediator.addUser(user1);
        mediator.addUser(user2);
        mediator.addUser(user3);

        user1.send("Hola a todos");
    }
}
