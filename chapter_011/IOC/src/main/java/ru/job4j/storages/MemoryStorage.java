package ru.job4j.storages;

import ru.job4j.storages.entity.User;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Comp on 01.11.2018.
 */


public class MemoryStorage implements Storage {
    List<User> users = new ArrayList<>();

    @Override
    public void add(User user) {
        users.add(user);
    }

    public User get(int id) {
        User result = null;

        for (User user : users) {
            if (user != null && user.getId() == id) {
                result = user;
            }
        }

        return result;
    }
}

