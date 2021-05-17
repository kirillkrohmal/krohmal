package ru.job4j.storages;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import ru.job4j.storages.entity.User;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Comp on 01.11.2018.
 */

@Component
public class MemoryStorage implements Storage {
    private List<User> users;

    @Autowired
    public MemoryStorage(List<User> users) {
        this.users = users;
    }

    public MemoryStorage() {

    }

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

