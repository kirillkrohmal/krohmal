package ru.job4j.servlets;

/**
 * Created by Comp on 23.01.2019.
 */
public class User {
    String login;
    String email;

    public User(String login, String email) {
        this.login = login;
        this.email = email;
    }

    public String getLogin() {
        return login;
    }

    public String getEmail() {
        return email;
    }
}
