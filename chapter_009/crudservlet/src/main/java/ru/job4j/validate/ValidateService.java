package ru.job4j.validate;

import ru.job4j.repository.MemoryStore;
import ru.job4j.repository.Store;
import ru.job4j.model.User;

import java.util.List;
import java.util.regex.Pattern;

/**
 * Created by Comp on 27.10.2018.
 */
public class ValidateService {
    private static final ValidateService SINGLETON_INSTANCE = new ValidateService();
    private final Store logic = MemoryStore.getInstance();    private String login;
    private User user;


    public static ValidateService getInstance() {
        return SINGLETON_INSTANCE;
    }

    public List<User> findAll() {
        return null;
    }

    public boolean add(User user) {
        boolean result = false;
        if (validateEmail(user)) {
            result = true;
        }

        return result;
    }

    public boolean update(String email) {
        boolean result = false;
        if (validateEmail(user) || email == null) {
            result = true;
        }
        return result;
    }

    public boolean delete(int id) {

        boolean result = false;
/*
        if (STORE.findById() != null) {
            STORE.delete();
            return true;
        }*/


        return result;
    }

    private boolean validateEmail(User email) {
        Pattern pattern = Pattern.compile("\\A[^@]+@([^@\\.]+\\.)+[^@\\.]+\\z");
        //Matcher match = pattern.matcher(email);
        //return match.matches();
        return false;
    }


}




