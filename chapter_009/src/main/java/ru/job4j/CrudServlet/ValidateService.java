package ru.job4j.CrudServlet;

import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Comp on 27.10.2018.
 */
public class ValidateService {
    private static final ValidateService SINGLETON_INSTANCE = new ValidateService();
    private static final MemoryStore STORE = MemoryStore.getInstance();
    private String login;


    public static ValidateService getInstance() {
        return SINGLETON_INSTANCE;
    }

    public List<User> findAll() {
        return null;
    }

    public boolean add(String name, String login, String email) {
        boolean result = false;
        if (STORE.findByLogin(login) == null) {
            if (validateEmail(email)) {
                STORE.add(new User(name, login, email));
                result = true;
            }
        }
        return result;
    }

    public boolean update(int id, String name, String login, String email) {
        boolean result = false;
        if (STORE.findById(id) != null) {
            if (STORE.findByLogin(login) == null || login == null) {
                if (validateEmail(email) || email == null) {
                    STORE.update(id, new User(name, login, email));
                    result = true;
                }
            }
        }
        return result;
    }

    public boolean delete(int id) {

        boolean result =  false;

        if (STORE.findById(id) != null) {
            STORE.delete(id);
            return true;
        }


        return result;
    }

    private boolean validateEmail(String email) {
        Pattern pattern = Pattern.compile("\\A[^@]+@([^@\\.]+\\.)+[^@\\.]+\\z");
        Matcher match = pattern.matcher(email);
        return match.matches();
    }


}




