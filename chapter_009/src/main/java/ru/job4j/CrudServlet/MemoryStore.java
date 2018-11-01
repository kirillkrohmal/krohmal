package ru.job4j.CrudServlet;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/**
 * Created by Comp on 01.11.2018.
 */
public class MemoryStore implements Store{
    private static final MemoryStore SINGLETON_INSTANCE = new MemoryStore();
    private final ValidateService logic = ValidateService.getInstance();
    private final List<User> users = new CopyOnWriteArrayList<>();

    public static MemoryStore getInstance() {
        return SINGLETON_INSTANCE;
    }


    @Override
    public void add(User user) {

    }

    @Override
    public void update(int id, User user) {

    }

    @Override
    public void delete(int id) {

    }

    @Override
    public List<User> findAll() {
        return null;
    }

    @Override
    public User findById(int id) {
        return null;
    }

    @Override
    public User findByLogin(String login) {
        return null;
    }
}
