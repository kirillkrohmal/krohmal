package ru.job4j.model;

public class User {
    private int id;
    private String username;
    private String phone;

    public User() {
    }

    public User(int id, String username, String phone) {
        this.id = id;
        this.username = username;
        this.phone = phone;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

}


