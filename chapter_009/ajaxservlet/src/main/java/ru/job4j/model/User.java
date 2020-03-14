package ru.job4j.model;

public class User {
    private int id;
    private String name;
    private String lastName;
    private Sex sex;
    private String description;


    public User(int id, String name, String lastName, String sex, String description) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.sex = new Sex(sex);
        this.description = description;
    }

    public User(String name, String lastName, String sex, String description) {
        this.name = name;
        this.lastName = lastName;
        this.sex = new Sex(sex);
        this.description = description;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Sex getSex() {
        return sex;
    }

    public void setSex(Sex sex) {
        this.sex = sex;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}


