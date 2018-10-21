package ru.job4j.CrudServlet;

import java.util.List;

/**
 * Created by Comp on 17.10.2018.
 */

class MemoryStore implements Store {


    public MemoryStore() {
    }

    public static MemoryStore getInstance() {

        return null;
    }

    @Override
    public void add(User user) {

    }

    @Override
    public void update(User user) {

    }

    @Override
    public void delete(User user) {

    }

    @Override
    public List<User> findAll() {
        return null;
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
