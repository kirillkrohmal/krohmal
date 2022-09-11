package ru.job4j.storage;

import ru.job4j.model.User;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class CinemaStorage {
    private static final CinemaStorage INSTANCE = new CinemaStorage();
    private List<User> users = new CopyOnWriteArrayList<>();

    public static CinemaStorage getInstance() {
        return INSTANCE;
    }

    public void add(User user) {
        users.add(new User(user.getId(), user.getUsername(), user.getPhone()));
    }

    public List<User> getUser() {
        return users;
    }

}
