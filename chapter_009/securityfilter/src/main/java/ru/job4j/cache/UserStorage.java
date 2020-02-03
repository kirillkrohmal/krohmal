package ru.job4j.cache;

import ru.job4j.model.User;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class UserStorage {
    private static final UserStorage INSTANCE = new UserStorage();
    private List<User> users = new CopyOnWriteArrayList<>();

    public static UserStorage getInstance() {
        return INSTANCE;
    }

    public void add (User user) {
        users.add(new User(user.getId(), user.getLogin(), user.getPassword(), "role")) ;
    }

    public List<User> getUsers() {
        return users;
    }


    public boolean isLogin(String login, String password) {
        boolean exists = false;

        for (User user : users) {
            if (user.getLogin().equals(login) && user.getPassword().equals(password)) {
                exists = true;
                break;
            }
        }
        return exists;
    }
}
