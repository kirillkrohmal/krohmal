package ru.job4j.CrudServlet;

/**
 * Created by Comp on 17.10.2018.
 */
public class UserStore {


    private final UserStore users = UserStore.getInstance();


    public static UserStore getInstance() {
        return instance;
    }
}
