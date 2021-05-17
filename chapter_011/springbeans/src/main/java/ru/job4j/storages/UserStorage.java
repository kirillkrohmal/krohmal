package ru.job4j.storages;

import ru.job4j.storages.entity.User;

public class UserStorage {

    public final Storage storage;

    public UserStorage(Storage storage) {
        this.storage = storage;
    }

    public void add(User user) {
        this.storage.add(user);
    }

    public User get(int id) {
        return this.storage.get(id);
    }
}
