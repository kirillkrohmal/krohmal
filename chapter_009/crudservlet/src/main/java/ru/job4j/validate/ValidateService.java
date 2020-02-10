package ru.job4j.validate;

import ru.job4j.model.User;
import ru.job4j.repository.MemoryStore;
import ru.job4j.repository.Store;

import java.sql.Timestamp;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Comp on 27.10.2018.
 */
public class ValidateService {
    private static final ValidateService SINGLETON_INSTANCE = new ValidateService();
    private final Store logic = MemoryStore.getInstance();

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

    public boolean add(String name, String email, String login, Timestamp createDate) {
        boolean result = false;

        if (logic.findLogin(login) == null) {
            if (validateEmail(email) || email == null) {
                logic.add(new User(name, login, email, createDate));
                result = true;
            }
        }

        return result;
    }

    public boolean update(String name, String email, String login, Timestamp createDate) {
        boolean result = false;

        if (logic.findLogin(login) == null) {
            if (validateEmail(email) || email == null) {
                logic.update(new User(name, login, email, createDate));
                result = true;
            }
        }
        return result;
    }

    public boolean delete(int id) {

        boolean result = false;

        if (logic.findById(id) != null) {
            logic.delete(id);
            result = true;
        }

        return result;
    }

    private boolean validateEmail(String email) {
        Pattern pattern = Pattern.compile("\\A[^@]+@([^@\\.]+\\.)+[^@\\.]+\\z");
        Matcher match = pattern.matcher(email);
        return match.matches();
    }


}




