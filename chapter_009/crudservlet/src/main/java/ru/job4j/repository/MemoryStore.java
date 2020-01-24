package ru.job4j.repository;


import ru.job4j.model.User;
import ru.job4j.validate.ValidateService;

import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;

/**
 * в том что хранилище создай потоко безопасную коллекцию
 *
 * и имплеменнтируй интерфейс сторе
 *
 * в валидаторе нужно сделать проверки
 *
 * например перед сохранением пользователя проверить что имя и емаил уникальны и не пустые
 *
 * и потом вызвать метод добавления из хранилища и сохранить пользователя
 *
 * или вернуть ответ что логин или емаил занят
 */
public class MemoryStore implements Store {
    private static final MemoryStore SINGLETON_INSTANCE = new MemoryStore();
    private final ValidateService logic = ValidateService.getInstance();
    private final List<User> users = new CopyOnWriteArrayList<>();


    public static MemoryStore getInstance() {
        return SINGLETON_INSTANCE;
    }


    @Override
    public void add(User user) {
        this.users.add(user);
    }


    @Override
    public void update(User user) {
    }

    @Override
    public void delete(User user) {
        this.users.remove(user);
    }

    @Override
    public User findById(int id) {
        return users.get(id);
    }

    @Override
    public Map findByAll() {

        return null;
    }
}
