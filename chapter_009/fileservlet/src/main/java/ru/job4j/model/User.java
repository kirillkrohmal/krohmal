package ru.job4j.model;

public class User {
    private int id;
    private String login;
    private String email;
    private String photoId;

    public User(int id, String login, String email, String photoId) {
        this.id = id;
        this.login = login;
        this.email = email;
        this.photoId = photoId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhotoId() {
        return photoId;
    }

    public void setPhotoId(String photoId) {
        this.photoId = photoId;
    }
}
