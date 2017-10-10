package ru.job4j.StoreGeneric;

import java.util.ArrayList;

public class UserStore<T> extends AbstractStore {
    Base[] userT = new User[100];
    int index = 0;

    @Override
    public Base add(Base model) {
        userT[index++] = model;
        return userT[index];
    }

    @Override
    public Base update(Base model) {
        userT[index] = model;
        return userT[index];
    }

    @Override
    public boolean delete(String id) {
        User user = null;

        if (user.getId().equals(id)) {
            userT[index] = null;
            return true;
        }
        return false;
    }
}
