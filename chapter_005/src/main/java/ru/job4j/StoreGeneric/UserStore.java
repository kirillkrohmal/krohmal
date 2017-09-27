package ru.job4j.StoreGeneric;

import java.util.ArrayList;

public class UserStore<T> {
    User[] user = new User[]{};
    int index = 0;
    ArrayList<T> objects;

    public T add(T model) {
        user[index++] = (User) model;
        return (T) user;
    }

    public T update(T model) {
        user[index] = (User) model;
        return (T) user;
    }

    public boolean delete(String id) {
        user[index] = null;
        return false;
    }
}
