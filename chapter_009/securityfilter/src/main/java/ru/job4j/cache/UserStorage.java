package ru.job4j.cache;

import ru.job4j.model.User;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class UserStorage {
    private static final UserStorage INSTANCE = new UserStorage();
    private List<User> users = new CopyOnWriteArrayList<>();

    /*private UserStorage() {
        users.add(new User("login", "password"));
    }*/

    public static UserStorage getInstance() {
        return INSTANCE;
    }

    public void add (User user) {
        users.add(user);
    }

    public List<User> getUsers() {
        return users;
    }
}
