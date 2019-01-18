package ru.job4j.CrudServlet;

import sun.font.FontRunIterator;

import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;

/**
 * Created by Comp on 01.11.2018.
 */
public class MemoryStore implements Store{
    private static final MemoryStore SINGLETON_INSTANCE = new MemoryStore();
    private final ValidateService logic = ValidateService.getInstance();
    public final Map<id, User> users;

    public static MemoryStore getInstance() {
        return SINGLETON_INSTANCE;
    }


    @Override
    public void add(User user) {
        for (User user1 : users) {
            //user.
        }
    }

    @Override
    public void update(User user) {

    }

    @Override
    public void delete(User user) {

    }

    @Override
    public User findById(User user) {
        return null;
    }

    @Override
    public Map findByAll() {
        return null;
    }
}
