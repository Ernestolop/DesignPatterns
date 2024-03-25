package com.elopez.design.patterns.behaviorals.mediator.chat_app.mediator;

import com.elopez.design.patterns.behaviorals.mediator.chat_app.users.User;

public interface ChatMediator {
    void sendMessage(String msg, User user);
}