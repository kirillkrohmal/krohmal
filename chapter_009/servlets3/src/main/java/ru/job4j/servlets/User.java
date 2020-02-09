package ru.job4j.servlets;

/**
 * Created by Comp on 23.01.2019.
 */
public class User {
    private String login;
    private String email;

    User(String login, String email) {
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
