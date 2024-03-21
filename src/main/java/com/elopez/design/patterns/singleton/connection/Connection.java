package com.elopez.design.patterns.singleton.connection;

public class Connection {
    private static Connection instance;
    private String url;
    private String user;
    private String password;

    private Connection(String url, String user, String password) {
        this.url = url;
        this.user = user;
        this.password = password;
    }

    public static Connection getConnection(String url, String user, String password) {
        if (instance == null) {
            instance = new Connection(url, user, password);
        }
        return instance;
    }

    public String getUrl() {
        return url;
    }

    public String getUser() {
        return user;
    }

    public String getPassword() {
        return password;
    }
}
