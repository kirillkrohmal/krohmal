package ru.job4j.storages;

import ru.job4j.storages.entity.User;

public interface Storage {
    void add(User user);

    User get(int id);
}
