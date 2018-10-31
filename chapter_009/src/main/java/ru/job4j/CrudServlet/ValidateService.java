package ru.job4j.CrudServlet;

import java.util.List;

/**
 * Created by Comp on 27.10.2018.
 */
public class ValidateService {
    private static final ValidateService SINGLETON_INSTANCE = new ValidateService();
    private static final MemoryStore STORE = MemoryStore.getInstance();


    public static ValidateService getInstance() {
        return SINGLETON_INSTANCE;
    }

    public List<User> findAll() {
    }
}


