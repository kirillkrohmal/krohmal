package ru.job4j.validate;

import ru.job4j.model.User;
import ru.job4j.repository.MemoryStore;

import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Comp on 27.10.2018.
 */
public class ValidateService {
    private static final ValidateService SINGLETON_INSTANCE = new ValidateService();
    private MemoryStore STORE = MemoryStore.getInstance();

    public ValidateService() {
    }

    public static ValidateService getInstance() {
        return SINGLETON_INSTANCE;
    }

    public List<User> findAll() {
        return null;
    }


    public List<User> findById() {

        return null;
    }

    public boolean add(int id, String email) {
        boolean result = false;

        if (STORE.findById(id) == null) {
            if (validateEmail(email) || email == null) {
                result = true;
            }
        }

        return result;
    }

    public boolean update(int id, String name, String email, String login) {
        boolean result = false;

        if (STORE.findById(id) == null) {
            if (validateEmail(email) || email == null) {
                result = true;
            }
        }
        return result;
    }

    public boolean delete(int id, String name, String email, String login) {

        boolean result = false;

        if (STORE.findById(id) != null) {
            if (validateEmail(email) || email == null) {
                result = true;
            }
        }


        return result;
    }

    private boolean validateEmail(String email) {
        Pattern pattern = Pattern.compile("\\A[^@]+@([^@\\.]+\\.)+[^@\\.]+\\z");
        Matcher match = pattern.matcher(email);
        return match.matches();
    }

}




