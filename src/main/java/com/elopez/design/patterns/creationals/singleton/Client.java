package com.elopez.design.patterns.creationals.singleton;

import com.elopez.design.patterns.creationals.singleton.connection.Connection;

public class Client {
    public static void main(String[] args) {
        Connection connection = Connection.getConnection("url", "user", "password");
        Connection connection2 = Connection.getConnection("url2", "user2", "password2");
        System.out.println(connection.toString());
        System.out.println(connection2.toString());
        System.out.println(connection == connection2);
    }
}
