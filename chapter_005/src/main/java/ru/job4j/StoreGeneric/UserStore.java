package ru.job4j.StoreGeneric;

import java.util.ArrayList;

public class UserStore<T> implements Store {
    T[] user = (T[]) new Object[100];
    int index = 0;

    @Override
    public Base add(Base model) {
        user[index++] = (T) model;
        return null;
    }

    @Override
    public Base update(Base model) {
        user[index] = (T) model;
        return null;
    }

    @Override
    public boolean delete(String id) {
        user[index] = null;
        return false;
    }
}
