package ru.job4j.CrudServlet;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/**
 * Created by Comp on 17.10.2018.
 */

class MemoryStore implements Store {
    private static final MemoryStore SINGLETON_INSTANCE = new MemoryStore();
    private final ValidateService logic = ValidateService.getInstance();
    private final List<User> users = new CopyOnWriteArrayList<>();

    public MemoryStore() {
    }

    public static MemoryStore getInstance() {
        return SINGLETON_INSTANCE;
    }

    @Override
    public void add(User user) {
        users.add(user);
    }

    @Override
    public void update(int id, User user) {

    }

    @Override
    public void delete(User user) {
        users.remove(user);
    }

    @Override
    public List<User> findAll() {
        return users;
    }

    @Override
    public User findById() {
        return null;
    }

    @Override
    public User findByLogin() {
        return null;
    }
}
