package ru.job4j.persistence;

import ru.job4j.model.User;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class UserStorage {
    private static final UserStorage INSTANCE = new UserStorage();
    private List<User> users = new CopyOnWriteArrayList<>();

    public static UserStorage getInstance() {
        return INSTANCE;
    }

    public void add(User user) {
        users.add(new User(user.getId(), user.getName(), user.getLastName(), "sex", user.getDescription()));
    }

    public List<User> getUser() {
        return users;
    }

}
